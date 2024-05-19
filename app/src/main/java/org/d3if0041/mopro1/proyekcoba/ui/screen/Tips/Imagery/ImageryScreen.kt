package org.d3if0041.mopro1.proyekcoba.ui.screen

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
fun ImageryScreen(navController: NavHostController) {
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
                            modifier = Modifier.size(24.dp),
                            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF4ECB71))
                        )
                    }
                    Text(
                        text = "Jalan Kaki Tips",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                val tips = listOf(
                    "1. Buat diri kamu nyaman. Posisi duduk adalah yang terbaik dan tutup mata kamu",
                    "2. Ambil napas dalam-dalam dan perlahan",
                    "3. Dengan menggunakan banyak detail sensorik, ciptakan pemandangan yang menenangkan di pikiran kamu. Coba pikirkan sesuatu yang memberi kamu kedamaian, apakah itu tepi danau di rumah masa kecil kamu, jalan setapak yang dilalui di taman favorit kamu atau suasana rindang dan sejuk",
                    "4. Kembangkan pandangan yang kamu buat sepenuhnya dengan menyertakan suara, bau, dan nuansa udara di kulit kamu",
                    "5. Bayangkan diri kamu mengembara melalui adegan yang kamu buat, dengan penuh perhatian memperhatikan sekeliling kamu dan memperhatikan setiap detail",
                    "6. Teruslah bernapas dengan perlahan, biarkan suasana tenang membanjiri kamu dan membantu kamu rileks",
                    "7. Luangkan 10 hingga 15 menit untuk menikmati gambaran itu",
                    "8. Akhiri latihan dengan beberapa napas dalam dan buka mata kamu"
                )

                tips.forEach { tip ->
                    Text(
                        text = tip,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Spacer(modifier = Modifier.height(32.dp))
                VideoJogging(videoUri = videoUri)
            }
        }

    }
}