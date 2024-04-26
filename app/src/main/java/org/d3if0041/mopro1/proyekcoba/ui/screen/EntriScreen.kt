package org.d3if0041.mopro1.proyekcoba.ui.screen

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme
import java.time.LocalDate
import java.time.LocalTime
import java.util.Calendar

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun EntriScreen(navController: NavHostController) {
    var showDatePicker by remember { mutableStateOf(false) }
    var showTimePicker by remember { mutableStateOf(false) }
    val context = LocalContext.current
    var selectedDate by remember { mutableStateOf(LocalDate.now()) }  // Default to the current date
    var selectedTime by remember { mutableStateOf(LocalTime.now()) }  // Default to the current time

    Scaffold { padding ->
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
                    Spacer(modifier = Modifier.weight(1f)) // Use weight to push the icon to the left
                }
                // Box placed here, directly after the Row containing the IconButton
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(16.dp)
                        )
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
                        Image(
                            painter = painterResource(R.drawable.casual),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                                .offset(y = 9.dp)

                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = stringResource(R.string.teks_entri),
                            fontSize = 20.sp,
                            color = Color.Black,
                            modifier = Modifier.align(Alignment.CenterVertically)
                                .offset(y = 9.dp)

                        )
                    }
                }
                // Row for "Tanggal" and "Jam" buttons with displays directly below each
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
                            modifier = Modifier.width(140.dp).height(35.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(text = "Tanggal", color = Color.Black)
                        }
                        // Display the selected date directly below the "Tanggal" button
                        if (selectedDate != null) {
                            Text(
                                text = "${selectedDate.format(java.time.format.DateTimeFormatter.ofPattern("dd MMMM yyyy"))}",
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(
                            onClick = { showTimePicker = true },
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
                            modifier = Modifier.width(140.dp).height(35.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(text = "Jam", color = Color.Black)
                        }
                        // Display the selected time directly below the "Jam" button
                        if (selectedTime != null) {
                            Text(
                                text = "${selectedTime.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"))}",
                                fontSize = 16.sp,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }

                // Date Picker Dialog
                if (showDatePicker) {
                    val calendar = Calendar.getInstance()
                    val year = calendar.get(Calendar.YEAR)
                    val month = calendar.get(Calendar.MONTH)
                    val day = calendar.get(Calendar.DAY_OF_MONTH)

                    DatePickerDialog(context, { _, year, monthOfYear, dayOfMonth ->
                        selectedDate = LocalDate.of(year, monthOfYear + 1, dayOfMonth)
                        showDatePicker = false
                    }, year, month, day).show()
                }

                // Time Picker Dialog
                if (showTimePicker) {
                    val hour = selectedTime.hour
                    val minute = selectedTime.minute

                    TimePickerDialog(context, { _, hourOfDay, minute ->
                        selectedTime = LocalTime.of(hourOfDay, minute)
                        showTimePicker = false
                    }, hour, minute, true).show()
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
        EntriScreen(rememberNavController())
    }
}
