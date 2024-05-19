package org.d3if0041.mopro1.proyekcoba.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen

@Composable
fun YogaScreen(navController: NavHostController) {

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
                            colorFilter = ColorFilter.tint(Color(0xFF4ECB71))
                        )
                    }
                    Text(
                        text = "Yoga",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "1. Latihan Pernapasan",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Pernapasan adalah kunci dalam yoga untuk mengatur sistem saraf dan menenangkan pikiran. Beberapa teknik pernapasan yang bisa membantu meredakan emosi adalah:",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   a. Skull Shining Breath ",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Mulailah dari posisi duduk tegak. Letakkan kedua tangan di bagian bawah perut. Jika duduk di kursi, pastikan kedua kaki menapak di lantai. Tarik napas dalam-dalam melalui hidung hingga perut terasa penuh udara. Kemudian, hembuskan napas dengan cepat sambil menarik otot perut ke dalam. Setelah itu, bernapaslah secara alami hingga perut kembali ke posisi semula. Ulangi teknik ini hingga 10 kali. Jika merasa pusing, segera hentikan teknik pernapasan ini.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   b. Lion's Breath",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Mulailah dari posisi duduk bersimpuh dengan kedua kaki disilangkan. Letakkan kedua telapak tangan di atas paha. Tarik napas melalui hidung, lalu hembuskan napas dengan kuat melalui mulut sambil mengeluarkan suara \"ha\". Saat menghembuskan napas, julurkan lidah sejauh mungkin ke arah dagu. Tarik napas kembali dan kembalikan raut wajah seperti biasa. Ulangi latihan ini sebanyak 5 kali.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   c. Bee Breath",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Duduklah dengan tegak dan sedikit tersenyum. Pejamkan mata dan letakkan kedua jari telunjuk di antara tulang pipi dan telinga di sisi kiri dan kanan. Tarik napas dalam-dalam, lalu tekan kedua telunjuk saat menghembuskan napas sambil mengeluarkan suara dengungan seperti lebah. Ulangi latihan ini sebanyak 5 kali.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   d. Ocean Breath",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Duduklah bersila dengan kedua tangan di atas lutut. Tarik napas melalui hidung dan hembuskan napas melalui mulut sambil membuat suara \"ha\" panjang. Ulangi beberapa kali. Selanjutnya, tarik napas panjang melalui hidung dan dengan mulut tertutup, hembuskan napas melalui hidung. Meski mulut tertutup, tetap buat suara \"ha\" panjang saat menghembuskan napas. Napas Anda akan terdengar seperti suara ombak di lautan. Ulangi latihan ini sebanyak 5 kali.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   e. Breath Retention",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Caranya, keluarkan seluruh udara dari mulut lalu rapatkan bibir. Tarik napas perlahan melalui hidung selama 5 hitungan. Setelah itu, tahan napas selama 5 hitungan, kemudian hembuskan napas perlahan melalui hidung selama 5 hitungan, seolah-olah udara keluar dari balon. Setelah seluruh udara keluar dari paru-paru, tahan napas lagi selama 5 hitungan. Ulangi latihan ini hingga 10 kali, dengan fokus pada setiap jeda saat menarik dan menghembuskan napas.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   f. Sitkari",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Mulailah dari posisi duduk tegak. Tarik dan hembuskan napas secara alami beberapa kali. Kemudian, rapatkan gigi atas dan bawah dengan bibir terbuka lebar. Tarik napas melalui sela-sela gigi sehingga terdengar suara mendesis. Tutup mulut dan hembuskan napas melalui hidung. Ulangi latihan ini sebanyak 5 kali.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    "2. Gerakan dan Posisi Yoga",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Beberapa gerakan dan posisi yoga dapat membantu mengurangi ketegangan dan menenangkan emosi:",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   a. Shavasana",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Untuk melaksanakan pose ini, mulailah dengan berbaring telentang di atas matras. Letakkan tangan di samping tubuh dengan telapak tangan menghadap ke atas. Pastikan kedua kaki Anda sedikit terpisah dan biarkan ujung kaki mengarah keluar. Tempatkan tangan dengan jarak yang cukup dari tubuh, lalu rilekskan. Tutup mata, fokus pada pernapasan dalam, dan pertahankan pose ini selama 4 hingga 5 menit.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   b. Balasana",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Awali dengan berada dalam posisi merangkak. Hembuskan napas perlahan sambil mendorong tubuh ke belakang. Pastikan tangan tetap sejajar dengan tubuh dan mengarah ke depan, sementara kepala menghadap ke bawah. Biarkan pantat mengendur dan jatuh di atas tumit, lalu rileks sepenuhnya.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   c. Bridge Pose",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Berbaringlah telentang dan tekuk lutut hingga sejajar dengan lebar pinggul. Letakkan tangan di samping tubuh dengan telapak menghadap ke bawah, menyentuh matras. Tarik napas dalam-dalam, angkat pinggul ke atas dengan menggunakan bahu, lengan, dan telapak kaki sebagai dukungan. Pertahankan pose selama 4-6 kali pernapasan, lalu turunkan pinggul perlahan sambil menghembuskan napas.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "   d. Uttanasana",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "       Mulailah dengan berdiri tegak dengan kaki selebar pinggul. Hembuskan napas perlahan dan tekuk tubuh ke depan dari pinggang. Letakkan tangan di tulang kering atau matras untuk menopang postur. Tahan pose ini selama 5-6 kali pernapasan, sambil merasakan perpanjangan leher dan punggung. Lepaskan pose perlahan, tarik napas dalam saat kembali berdiri. Fokus pada pernapasan dan kesadaran tubuh untuk mendapatkan manfaat maksimal dari uttanasana.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    "3. Meditasi",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Fokuslah pada pernapasan dan menyadari setiap pikiran dan perasaan tanpa menghakimi dapat membantu mengelola emosi dengan lebih baik.",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    "4. Konsistensi dan Rutin",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Latihan yoga yang konsisten sangat penting untuk mendapatkan manfaat maksimal. Membangun rutinitas harian yang mencakup pernapasan, asana, dan meditasi dapat membantu mengelola emosi secara efektif.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}