package org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.Butterfly

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
import org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.Jogging.VideoJogging


@Composable
fun ButterflyScreen(navController: NavHostController) {
    val videoUri = Uri.parse("")
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
                        text = "Butterfly Hug Tips",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing
                Text(
                    "Teknik Butterfly Hug adalah metode sederhana yang dapat membantu mengurangi kecemasan, stres, dan perasaan kewalahan dengan cara menggabungkan gerakan fisik dan fokus pada pernapasan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(4.dp)) // Spacer added for spacing

                Text(
                    "berikut langkah-langkah melakukan butterfly hug:",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "1. Silangkan kedua tangan di dada.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Ini adalah posisi awal dari teknik Butterfly Hug. Silangkan tangan kanan di atas dada kiri dan tangan kiri di atas dada kanan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text("2. Tarik nafas panjang dan dalam, lalu keluarkan perlahan-lahan.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Setelah posisi tangan terbentuk, tarik napas panjang dan dalam melalui hidung, kemudian keluarkan secara perlahan-lahan melalui mulut. Fokuslah pada pernapasan yang lambat dan dalam untuk merasakan ketenangan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing


                Text(
                    "3. Tepuk pelan-pelan tangan kanan dan kiri bergantian.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Dengan tangan masih bersilangan di dada, tepuklah perlahan-lahan tangan kanan ke dada kiri dan tangan kiri ke dada kanan secara bergantian. Ini adalah gerakan pelan yang menenangkan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing


                Text("4. Terus lakukan tepukan sambil menarik nafas",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Lanjutkan gerakan tepukan tangan sambil terus melakukan pernapasan yang dalam dan teratur. Tepukkan tangan dengan ritme yang nyaman bagi Anda.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "5. Katakan kalimat afirmasi",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Saat Anda melakukan gerakan Butterfly Hug, ucapkan kalimat afirmatif atau kalimat-kalimat yang memberikan kekuatan dan kepercayaan pada diri sendiri. Misalnya, \"Saya aman dan tenang\", atau kalimat-kalimat positif lainnya sesuai dengan kebutuhan Anda.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "6. Ulangi sampai tenang",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Terus ulangi langkah-langkah ini sampai Anda merasa lebih tenang dan rileks. Fokuslah pada perasaan ketenangan dan keamanan yang muncul saat Anda melakukan teknik Butterfly Hug.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

            }
            item {
                Spacer(modifier = Modifier.height(32.dp))
                VideoJogging(videoUri = videoUri)
            }
        }

    }
}