package org.d3if0041.mopro1.proyekcoba.view

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.model.Note

class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes
    private val auth = FirebaseAuth.getInstance()

    private var nextId = 0

    val currentUserUid: String?
        get() = auth.currentUser?.uid

    var selectedEmoticon = mutableStateOf(R.drawable.casual) // Default image
    var selectedEmoticonText = mutableStateOf("Biasa") // Default text

    private val emoticonColorMap = mapOf(
        R.drawable.a to Color(0xFF009688), // Sesuaikan dengan warna emoticon di AddScreen
        R.drawable.b to Color(0xFF4CAF50),
        R.drawable.c to Color(0xFF2196F3),
        R.drawable.d to Color(0xFFFF5900),
        R.drawable.e to Color(0xD2FF0000)
    )

    private val db = FirebaseFirestore.getInstance()

    init {
        loadNotesFromFirestore()
    }

    fun addNote(note: Note) {
        val uid = currentUserUid
        uid?.let { currentUid ->
            note.uid = currentUid
            note.id = nextId++
            note.emoticonColor = emoticonColorMap[note.emoticonResourceId] ?: Color.Black // Set the emoticon color
            _notes.add(note)
            saveNoteToFirestore(note)
        }
    }


    fun getNoteById(id: Int): Note? {
        return _notes.getOrNull(id)
    }

    fun updateNote(updatedNote: Note) {
        val uid = currentUserUid
        uid?.let {
            updatedNote.uid = uid
            val index = _notes.indexOfFirst { it.id == updatedNote.id }
            if (index != -1) {
                _notes[index] = updatedNote
                updateNoteInFirestore(updatedNote)
            }
        }
    }


    fun deleteNoteById(id: Int) {
        val uid = currentUserUid
        uid?.let {
            val index = _notes.indexOfFirst { it.id == id }
            if (index != -1) {
                val note = _notes.removeAt(index)
                if (note.uid == uid) {
                    deleteNoteFromFirestore(note)
                }
            }
        }
    }


    fun getEmoticonColor(): Color {
        return emoticonColorMap[selectedEmoticon.value] ?: Color.Black
    }

    private fun saveNoteToFirestore(note: Note) {
        val uid = note.uid
        uid?.let {
            viewModelScope.launch {
                try {
                    db.collection("users").document(uid).collection("notes").add(note).await()
                } catch (e: Exception) {
                    // Handle exception
                }
            }
        }
    }

    private fun loadNotesFromFirestore() {
        val uid = currentUserUid
        uid?.let {
            viewModelScope.launch {
                try {
                    val snapshot =
                        db.collection("users").document(uid).collection("notes").get().await()
                    val notesList = snapshot.documents.mapNotNull { it.toObject(Note::class.java) }
                    _notes.clear() // Bersihkan catatan sebelum menambahkan yang baru
                    _notes.addAll(notesList)
                } catch (e: Exception) {
                    // Handle exception
                }
            }
        }
    }



    private fun updateNoteInFirestore(note: Note) {
        val uid = currentUserUid
        uid?.let {
            viewModelScope.launch {
                try {
                    val snapshot = db.collection("users").document(uid).collection("notes")
                        .whereEqualTo("id", note.id).get().await()
                    for (document in snapshot.documents) {
                        db.collection("users").document(uid).collection("notes")
                            .document(document.id).set(note).await()
                    }
                } catch (e: Exception) {
                    // Handle exception
                }
            }
        }
    }

    private fun deleteNoteFromFirestore(note: Note) {
        val uid = currentUserUid
        uid?.let {
            viewModelScope.launch {
                try {
                    val snapshot = db.collection("users").document(uid).collection("notes")
                        .whereEqualTo("id", note.id).get().await()
                    for (document in snapshot.documents) {
                        db.collection("users").document(uid).collection("notes")
                            .document(document.id).delete().await()
                    }
                } catch (e: Exception) {
                    // Handle exception
                }
            }
        }
    }
}