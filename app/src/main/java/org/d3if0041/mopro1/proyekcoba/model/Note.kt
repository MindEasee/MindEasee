package org.d3if0041.mopro1.proyekcoba.model

import java.time.LocalDate
import java.time.LocalTime

data class Note(
    val id: Int,
    var uid: String?, // Menambahkan properti uid
    val date: LocalDate,
    val time: LocalTime,
    val masalah: String,
    val pikiran: String,
    val solusi: String
)
