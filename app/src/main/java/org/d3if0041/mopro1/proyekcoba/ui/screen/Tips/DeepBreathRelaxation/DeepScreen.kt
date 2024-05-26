package org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.DeepBreathRelaxation

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
fun DeepScreen(navController: NavHostController) {
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
                        text = "Deep Breath Relaxation Tips",
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
                    "berikut langkah-langkah melakukan Deep Breath Relaxation :",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "1. Cari tempat yang tenang & bebas gangguan.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Sebelum memulai teknik Deep Breath Relaxation, pastikan Anda berada di lingkungan yang tenang dan tidak terganggu. Ini membantu Anda untuk fokus sepenuhnya pada proses relaksasi.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text("2. Letakkan 1 tangan di dada, 1 tangan di perut.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Setelah menemukan lingkungan yang tenang, posisikan salah satu tangan Anda di atas dada dan tangan yang lainnya di atas perut. Ini membantu Anda untuk lebih menyadari gerakan pernapasan, karena Anda dapat merasakan pergerakan dada dan perut.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing


                Text(
                    "3. Tepuk pelan-pelan tangan kanan dan kiri bergantian.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Dengan tangan masih dalam posisi yang sama (salah satu di dada dan yang lainnya di perut), tepukkan perlahan-lahan tangan kanan ke dada kiri dan tangan kiri ke dada kanan secara bergantian. Ini adalah gerakan yang menenangkan dan dapat membantu mengurangi ketegangan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing


                Text("4. Hembuskan nafas 3 detik, kamu akan merasakan perut turun.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Setelah melakukan gerakan tepuk-tepuk, hembuskan napas secara perlahan-lahan selama 3 detik. Rasakan bagaimana perut Anda turun saat mengeluarkan napas ini. Ini membantu Anda untuk lebih memperdalam pernapasan dan merasakan sensasi relaksasi.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "5. Katakan tenang",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Saat Anda melakukan teknik Deep Breath Relaxation, ucapkan kata-kata yang menenangkan atau kalimat afirmatif seperti \"tenang\" atau \"santai\". Ini membantu memperkuat perasaan ketenangan dan relaksasi.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "6. Lanjutkan 5-10 menit",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "TTerus ulangi langkah-langkah ini selama 5 hingga 10 menit atau sesuai dengan kebutuhan Anda. Fokuslah pada perasaan ketenangan dan relaksasi yang muncul selama proses ini.",
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