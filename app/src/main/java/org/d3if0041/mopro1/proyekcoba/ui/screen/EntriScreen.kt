package org.d3if0041.mopro1.proyekcoba.ui.screen

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Build
import android.widget.DatePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import org.d3if0041.mopro1.proyekcoba.model.Note
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme
import org.d3if0041.mopro1.proyekcoba.view.NoteViewModel
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntriScreen(
    navController: NavHostController,
    noteViewModel: NoteViewModel,
    noteId: Int? = null
) {
    var showDatePicker by remember { mutableStateOf(false) }
    var showTimePicker by remember { mutableStateOf(false) }
    val context = LocalContext.current
    var selectedDate by remember { mutableStateOf(LocalDate.now()) }
    var selectedTime by remember { mutableStateOf(LocalTime.now()) }
    var masalahSaatIni by remember { mutableStateOf("") }
    var pikiran by remember { mutableStateOf("") }
    var solusi by remember { mutableStateOf("") }

    noteId?.let {
        val note = noteViewModel.getNoteById(it)
        note?.let {
            selectedDate = it.date
            selectedTime = it.time
            masalahSaatIni = it.masalah
            pikiran = it.pikiran
            solusi = it.solusi
        }
    }

    Scaffold { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 12.dp)
                        ) {
                            IconButton(
                                onClick = { navController.popBackStack() },
                                modifier = Modifier.size(48.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.back),
                                    contentDescription = "Back",
                                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                                .padding(16.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.Gray,
                                    shape = RoundedCornerShape(16.dp)
                                )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Spacer(modifier = Modifier.width(12.dp))
                                Spacer(modifier = Modifier.height(12.dp))

                                Image(
                                    painter = painterResource(id = noteViewModel.selectedEmoticon.value),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(50.dp)
                                        .offset(y = 9.dp),
                                    colorFilter = ColorFilter.tint(noteViewModel.getEmoticonColor()) // Menggunakan warna yang sesuai
                                )
                                Spacer(modifier = Modifier.width(30.dp))
                                Column(
                                    verticalArrangement = Arrangement.Center,
                                ) {
                                    Spacer(modifier = Modifier.height(8.dp))

                                    Text(
                                        text = "Kabar hari ini,",
                                        fontSize = 18.sp,
                                        color = Color.Black,
                                    )
                                    Spacer(modifier = Modifier.height(4.dp)) // Spacer untuk jarak antara teks
                                    Text(
                                        text = noteViewModel.selectedEmoticonText.value, // Menggunakan teks yang dipilih
                                        fontSize = 18.sp,
                                        color = Color.Black,
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp)) //

                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Button(
                                    onClick = { showDatePicker = true },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
                                    modifier = Modifier
                                        .width(140.dp)
                                        .height(35.dp),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text(text = "Tanggal", color = Color.Black)
                                }
                                if (selectedDate != null) {
                                    Text(
                                        text = "${selectedDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))}",
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(top = 8.dp)
                                    )
                                }
                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Button(
                                    onClick = { showTimePicker = true },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
                                    modifier = Modifier
                                        .width(140.dp)
                                        .height(35.dp),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text(text = "Jam", color = Color.Black)
                                }
                                if (selectedTime != null) {
                                    Text(
                                        text = "${selectedTime.format(DateTimeFormatter.ofPattern("HH:mm"))}",
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(top = 8.dp)
                                    )
                                }
                            }
                        }
                        Box(
                            modifier = Modifier
                                .width(330.dp)
                                .height(180.dp)
                                .padding(2.dp) // Padding eksternal untuk keseluruhan Box
                                .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
                                .background(Color.White, RoundedCornerShape(8.dp))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(horizontal = 16.dp, vertical = 12.dp),
                                verticalArrangement = Arrangement.Top
                            ) {
                                Text(
                                    "Deskripsikan masalah dan situasi saat ini.",
                                    modifier = Modifier.padding(bottom = 16.dp),
                                    style = MaterialTheme.typography.titleMedium,
                                    fontSize = 12.sp,
                                )

                                // TextField untuk memasukkan teks
                                OutlinedTextField(
                                    value = masalahSaatIni, // Gunakan nilai yang diinginkan
                                    onValueChange = { masalahSaatIni = it },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .width(50.dp)
                                        .height(130.dp),
                                    colors = TextFieldDefaults.outlinedTextFieldColors(
                                        focusedBorderColor = Color.LightGray,
                                    )
                                )
                            }
                        }


                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(330.dp) // Mengubah ketinggian Box karena akan memuat dua komponen (teks dan OutlinedTextField)
                                .padding(16.dp)
                                .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
                                .background(Color.White, RoundedCornerShape(8.dp))
                        ) {
                            Column(
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                                verticalArrangement = Arrangement.Top
                            ) {
                                Text(
                                    "Apa yang sedang kamu pikirkan?",
                                    modifier = Modifier.padding(bottom = 16.dp),
                                    style = MaterialTheme.typography.titleMedium,
                                    fontSize = 12.sp,
                                )

                                // CustomTextArea untuk "Apa yang sedang kamu pikirkan?"
                                OutlinedTextField(
                                    value = pikiran, // Gunakan nilai yang diinginkan
                                    onValueChange = { pikiran = it },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .width(50.dp)
                                        .height(100.dp),
                                    colors = TextFieldDefaults.outlinedTextFieldColors(
                                        focusedBorderColor = Color.LightGray,
                                    )
                                )

                                Spacer(modifier = Modifier.height(16.dp)) // Jarak antara dua komponen
                                Text(
                                    "Bagaimana rencana solusinya?",
                                    modifier = Modifier.padding(bottom = 16.dp),
                                    style = MaterialTheme.typography.titleMedium,
                                    fontSize = 12.sp,
                                )

                                // CustomTextArea untuk "Bagaimana rencana solusinya?"
                                OutlinedTextField(
                                    value = solusi, // Gunakan nilai yang diinginkan
                                    onValueChange = { solusi = it },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .width(50.dp)
                                        .height(100.dp),
                                    colors = TextFieldDefaults.outlinedTextFieldColors(
                                        focusedBorderColor = Color.LightGray,
                                    )
                                )
                            }
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Button(
                                onClick = {
                                    if (masalahSaatIni.isEmpty() || pikiran.isEmpty() || solusi.isEmpty()) {
                                        Toast.makeText(
                                            context,
                                            "Tidak boleh kosong",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else {
                                        // Proses simpan data ke ViewModel
                                        val note = Note(
                                            id = noteId ?: 0,
                                            date = selectedDate,
                                            time = selectedTime,
                                            masalah = masalahSaatIni,
                                            pikiran = pikiran,
                                            solusi = solusi
                                        )
                                        if (noteId == null) {
                                            noteViewModel.addNote(note)
                                        } else {
                                            noteViewModel.updateNote(note)
                                        }
                                        navController.navigate(Screen.Home.route)
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
                                modifier = Modifier
                                    .width(180.dp)
                                    .padding(top = 16.dp)
                                    .height(48.dp),
                                shape = RoundedCornerShape(24.dp)
                            ) {
                                Text("Simpan", fontSize = 16.sp,
                                    color = Color.Black
                                )
                            }
                        }
                    }
                }
                if (showDatePicker) {
                    val currentDate = LocalDate.now()
                    val datePickerDialog = DatePickerDialog(
                        context,
                        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                            selectedDate = LocalDate.of(year, month + 1, dayOfMonth)
                            showDatePicker = false
                        },
                        currentDate.year,
                        currentDate.monthValue - 1,
                        currentDate.dayOfMonth
                    )
                    datePickerDialog.setOnCancelListener {
                        showDatePicker = false
                    }
                    datePickerDialog.show()
                }

                if (showTimePicker) {
                    val currentTime = LocalTime.now()
                    val timePickerDialog = TimePickerDialog(
                        context,
                        { _, hour: Int, minute: Int ->
                            selectedTime = LocalTime.of(hour, minute)
                            showTimePicker = false
                        },
                        currentTime.hour,
                        currentTime.minute,
                        true
                    )
                    timePickerDialog.setOnCancelListener {
                        showTimePicker = false
                    }
                    timePickerDialog.show()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun EntriScreenPreview() {
    ProyekCobaTheme {
        val navController = rememberNavController()
        val noteViewModel: NoteViewModel = viewModel()
        EntriScreen(navController, noteViewModel)
    }
}
