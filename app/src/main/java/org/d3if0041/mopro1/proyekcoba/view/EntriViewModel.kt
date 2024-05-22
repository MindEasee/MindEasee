package org.d3if0041.mopro1.proyekcoba.view

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import org.d3if0041.mopro1.proyekcoba.model.Note

class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

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
}
