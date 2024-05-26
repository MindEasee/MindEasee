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
fun JalanScreen(navController: NavHostController) {
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
                        text = "Jalan Kaki Tips",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "1. Berdiri tegak",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Jalan kaki dengan posisi tubuh membungkuk akan membuat Anda sulit bernapas. Kebiasaan ini juga rentan menyebabkan sakit punggung.\n" +
                            "\n" +
                            "Postur berjalan yang tepat yaitu berdiri tegak dengan merentangkan tulang belakang Anda.\n" +
                            "\n" +
                            "Untuk mengetahui apakah tulang belakang telah terentang, Anda dapat meletakkan ibu jari pada tulang rusuk bagian bawah dan ujung jari kelingking pada pinggul atau pangkal paha.\n" +
                            "\n" +
                            "Saat berdiri tegak, jarak antara kedua bagian ini akan bertambah. Cobalah untuk mempertahankan postur ini saat berjalan.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text("2. Mengangkat kepala", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Posisi kepala juga perlu Anda perhatikan dalam mempraktikkan cara berjalan yang baik dan benar.\n" +
                            "\n" +
                            "Mengangkat kepala dengan pandangan lurus ke depan bisa mengurangi tekanan yang memicu nyeri punggung atas dan leher Anda.\n" +
                            "\n" +
                            "Sambil menegakkan posisi kepala, fokuskan pandangan setidaknya 3–6 meter ke depan untuk mewaspadai adanya rintangan saat berjalan kaki.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "3. Merilekskan leher, bahu, dan punggung",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Meski diharuskan berdiri tegak, bukan berarti tubuh Anda harus lebih tegang. Cobalah untuk menjaga leher, bahu, dan punggung tetap rileks selama berjalan.\n" +
                            "\n" +
                            "Pasalnya, bahu yang tegang atau membungkuk ke depan bisa membuat otot dan persendian di sekitarnya mendapatkan lebih banyak tekanan.\n" +
                            "\n" +
                            "Untuk memastikan tubuh cukup rileks, Anda bisa mengangkat bahu setinggi-tingginya. Lalu, putar bahu Anda ke belakang dan biarkan jatuh dengan santai.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text("4. Melangkah ringan", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Langkah kaki merupakan bagian terpenting dalam menerapkan cara berjalan yang benar. Saat melangkah, pastikan tumit Anda dulu yang mendarat.\n" +
                            "\n" +
                            "Bila Anda melangkah dengan benar, telapak kaki Anda akan mengikuti dengan sendirinya sehingga ujung kaki menyentuh tanah.\n" +
                            "\n" +
                            "Hindari mendarat dengan telapak kaki atau melangkah terlalu jauh, sebab hal ini bisa memicu nyeri sendi dan memperlambat langkah Anda.\n" +
                            "\n" +
                            "Cobalah untuk melangkahkan kaki secara ringan dan tenang untuk mengurangi risiko cedera.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp)) // Spacer added for spacing

                Text(
                    "5. Mengayunkan lengan",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer added for spacing
                Text(
                    "Anda sebaiknya membiarkan lengan berayun bebas pada kedua sisi tubuh saat berjalan. Akan tetapi, banyak orang masih sering lupa melakukan cara berjalan yang benar ini.\n" +
                            "\n" +
                            "Cobalah membiasakan diri untuk mengayunkan lengan ke depan dan ke belakang. Gunakan bahu sebagai poros ayunan lengan, bukan pada siku Anda.\n" +
                            "\n" +
                            "Hindari juga mengayunkan lengan terlalu tinggi. Cukup lakukan pada bagian tengah tubuh atau pada bagian sekitar pinggul.",
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