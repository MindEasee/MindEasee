package org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.Jogging

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxWidth


@Composable
fun JoggingScreen(navController: NavHostController) {
    val videoUri = Uri.parse("android.resource://org.d3if0041.mopro1.proyekcoba/res/raw/jogging")
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.padding(16.dp)
        ) {
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    IconButton(
                        onClick = { navController.navigate(Screen.Tips.route) }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "Back",
                            modifier = Modifier.size(24.dp), // Adjust the size as needed
                            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF4ECB71))
                            // Set the color here
                        )
                    }
                    Text(
                        text = "Jogging Tips",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "1. Lakukan pemanasan sebelum jogging",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Pemanasan sebelum jogging sangat penting dilakukan untuk mengurangi risiko cedera, keseleo, dan kram otot. Sebelum melakukan jogging, coba lakukan pemanasan selama 5-10 menit. Beberapa contoh pemanasan sebelum jogging yang bisa Anda lakukan adalah:",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "   - Berdiri dengan satu kaki, sambil mengayunkan kaki yang satunya ke depan dan ke belakang selama beberapa menit, lalu ganti dengan kaki yang lain. Setelah itu, gerakkan kaki memutar, sebagai peregangan untuk pergelangan kaki.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "   - Berjalan santai, lalu setiap 10 langkah, lompat di tempat dari kaki ke kaki hingga lutut setinggi pinggang. Lakukan lompatan ini selama 5-10 detik, kemudian lanjutkan berjalan santai kembali. Ulangi gerakan ini hingga 4 kali.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "   - Berjalan dengan mengangkat lutut hingga setinggi pinggang. Lakukan hingga 10 kali pada masing-masing tungkai.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text("2. Teknik jogging", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Jika Anda pemula, disarankan untuk melakukan jogging dengan cara mengombinasikan berlari dan berjalan. Metode ini bertujuan agar tubuh dapat menyesuaikan diri, tidak cepat kehabisan energi, dan mencegah cedera otot dan sendi.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "   - Awali dengan berjalan kaki selama beberapa menit, kemudian mulailah berlari santai dengan jarak dan durasi yang pendek. Misalnya, rasio durasi yang digunakan adalah 1:7, yaitu 1 menit berlari dan 7 menit berjalan kaki.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "3. Postur tubuh dan teknik bernapas saat jogging",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Condongkan tubuh sedikit ke depan dengan tangan mengepal. Posisi kepala harus selalu tegak saat berlari, tidak menunduk atau mendongak.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Selama jogging, gunakan teknik pernapasan dengan cara menarik napas melalui hidung dan mulut, kemudian hembuskan melalui mulut. Hal ini berguna untuk mencukupi kebutuhan oksigen tubuh saat jogging dan mengurangi risiko terjadinya kram pada otot perut.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text("4. Pendinginan", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Seperti halnya pemanasan, gerakan pendinginan juga perlu dilakukan setelah jogging. Caranya adalah dengan berjalan santai selama 5-10 menit, lalu lakukan peregangan pada beberapa bagian tubuh, seperti kaki, tangan, dan leher.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Setelah pendinginan, tubuh Anda akan merasa lebih nyaman, detak jantung dan pernapasan Anda juga akan kembali normal. Untuk mengganti cairan tubuh yang hilang saat jogging, minumlah air putih secukupnya setelah melakukan pendinginan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "5. Frekuensi dan durasi waktu ideal jogging",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Jogging tidak harus dilakukan setiap hari. Penting juga untuk mengistirahatkan tubuh di sela jadwal jogging. Frekuensi jogging yang disarankan adalah 2-3 kali per minggu dengan total durasi jogging kurang lebih 1-2,5 jam per minggunya.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            item {
                Spacer(modifier = Modifier.height(32.dp))
                VideoJogging(videoUri = videoUri)
            }
        }

    }
}