package org.d3if0041.mopro1.proyekcoba.model

import java.time.LocalDate
import java.time.LocalTime

data class Note(
    val id: Int,
<<<<<<< HEAD
    var uid: String,
=======
    var uid: String?, // Menambahkan properti uid
>>>>>>> ab26ce03b8aa18293fab0fb3a59fb840a315b202
    val date: LocalDate,
    val time: LocalTime,
    val masalah: String,
    val pikiran: String,
<<<<<<< HEAD
    val solusi: String,
    val emoticonResourceId: Int // Properti ini untuk menyimpan ID sumber daya emotikon
)

=======
    val solusi: String
)
>>>>>>> ab26ce03b8aa18293fab0fb3a59fb840a315b202
