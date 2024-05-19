package org.d3if0041.mopro1.proyekcoba.ui.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import org.d3if0041.mopro1.proyekcoba.model.Note



class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

    fun addNote(note: Note) {
        _notes.add(note)
    }
}