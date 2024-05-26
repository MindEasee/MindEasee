package org.d3if0041.mopro1.proyekcoba.model

import androidx.compose.ui.graphics.Color
import org.d3if0041.mopro1.proyekcoba.R
import java.time.LocalDate
import java.time.LocalTime

data class Note(
    var id: Int = 0,
    var uid: String? = null,
    var date: LocalDate = LocalDate.now(),
    var time: LocalTime = LocalTime.now(),
    var masalah: String = "",
    var pikiran: String = "",
    var solusi: String = "",
    var emoticonResourceId: Int = R.drawable.casual, // Add this line
    var emoticonColor: Color = Color.Black // Add this line
)

