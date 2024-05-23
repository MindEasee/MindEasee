package org.d3if0041.mopro1.proyekcoba.view

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.model.Note

class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

    var selectedEmoticon = mutableStateOf(R.drawable.casual) // Default image
    private val emoticonColorMap = mapOf(
        R.drawable.a to Color(0xFF009688), // Sesuaikan dengan warna emoticon di AddScreen
        R.drawable.b to Color(0xFF4CAF50),
        R.drawable.c to Color(0xFF2196F3),
        R.drawable.d to Color(0xFFFF5900),
        R.drawable.e to Color(0xD2FF0000)
    )

    fun addNote(note: Note) {
        _notes.add(note)
    }

    fun getNoteById(id: Int): Note? {
        return _notes.getOrNull(id)
    }

    fun updateNote(updatedNote: Note) {
        val index = _notes.indexOfFirst { it.id == updatedNote.id }
        if (index != -1) {
            _notes[index] = updatedNote
        }
    }

    fun deleteNoteById(id: Int) {
        _notes.removeAt(id)
    }

    // Fungsi untuk mendapatkan warna berdasarkan emotikon yang dipilih
    fun getEmoticonColor(): Color {
        return emoticonColorMap[selectedEmoticon.value] ?: Color.Black
    }
}
