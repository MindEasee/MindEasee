package org.d3if0041.mopro1.proyekcoba.ui.screen


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource(R.drawable.back),
                            contentDescription = "Back",
                            colorFilter = ColorFilter.tint(Color.Gray),
                            modifier = Modifier
                                .size(28.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "April 2024",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 22.sp
                            ),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 0.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painter = painterResource(R.drawable.next),
                            contentDescription = "Next",
                            colorFilter = ColorFilter.tint(Color.Gray),
                            modifier = Modifier
                                .size(28.dp)
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {
                            // Handle search icon click
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Search,
                            contentDescription = "Search",
                            tint = Color.LightGray,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp)) // Add border
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Bagaimana kabarmu sekarang?",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp
                            )
                        )
                        EmoticonRow()
                    }
                }
                GambarBawah()
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.background(color = MaterialTheme.colorScheme.tertiary),
                contentColor = Color.White,
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = {
                                navController.navigate(Screen.List.route)
                            }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Image(
                                    painter = painterResource(R.drawable.book),
                                    contentDescription = null,
                                    colorFilter = ColorFilter.tint(Color.Gray),
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = stringResource(R.string.entri),
                                    fontSize = 9.sp,
                                    color = Color.Black,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 1
                                )
                            }
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(R.drawable.chart),
                                contentDescription = null,
                                colorFilter = ColorFilter.tint(Color.Gray),
                                modifier = Modifier.size(20.dp)
                            )
                            Text(
                                text = stringResource(R.string.statistik),
                                fontSize = 9.sp,
                                color = Color.Black,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(R.drawable.lampu),
                                contentDescription = null,
                                colorFilter = ColorFilter.tint(Color.Gray),
                                modifier = Modifier.size(24.dp)
                            )
                            Text(
                                text = stringResource(R.string.tips),
                                fontSize = 9.sp,
                                color = Color.Black,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1
                            )
                        }
                        IconButton(
                            onClick = {
                                // Navigasi ke layar lain saat ikon "More" diklik
                                navController.navigate(Screen.Lain.route)
                            }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Image(
                                    painter = painterResource(R.drawable.more),
                                    contentDescription = null,
                                    colorFilter = ColorFilter.tint(Color.Gray),
                                    modifier = Modifier.size(20.dp)
                                )
                                // Menggunakan string dari resource
                                Text(
                                    text = stringResource(R.string.lain), // Menggunakan resource string
                                    fontSize = 9.sp,
                                    color = Color.Black,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 1
                                )
                            }
                        }
                    }

                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                },
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .offset(x = 4.dp),
                content = {
                    Icon(
                        imageVector = Icons.Outlined.Add,
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                containerColor = MaterialTheme.colorScheme.tertiary
            )
        }
    )
}

@Composable
fun EmoticonRow() {
    val emoticonResIds = listOf(
        Pair(R.drawable.a, stringResource(id = R.string.sangat_baik)),
        Pair(R.drawable.b, stringResource(id = R.string.baik)),
        Pair(R.drawable.c, stringResource(id = R.string.biasa)),
        Pair(R.drawable.d, stringResource(id = R.string.buruk)),
        Pair(R.drawable.e, stringResource(id = R.string.sangat_buruk))
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        emoticonResIds.forEach { (emoticonResId, text) -> // Destructuring the Pair
            val colorFilter = when (emoticonResId) {
                R.drawable.a -> ColorFilter.tint(Color(0xFF009688)) // Hijau untuk gambar smiling
                R.drawable.b -> ColorFilter.tint(Color(0xFF4CAF50)) // Tertiary untuk gambar happy
                R.drawable.c -> ColorFilter.tint(Color(0xFF2196F3)) // Biru untuk gambar neutral
                R.drawable.d -> ColorFilter.tint(Color(0xFFFF5900)) // Orange untuk gambar sad
                R.drawable.e -> ColorFilter.tint(Color(0xD2FF0000)) // Merah untuk gambar crying
                else -> null
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = emoticonResId),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    colorFilter = colorFilter // Mengatur colorFilter sesuai dengan warna yang diinginkan
                )
                Text(
                    text = text,
                    fontSize = 11.sp,
                    color = Color.Black,
                    lineHeight = 12.sp // Mengatur tinggi baris menjadi lebih rendah
                )
            }
        }
    }
}

@Composable
fun GambarBawah() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        Image(
            painter = painterResource(id = R.drawable.imgnotes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun GreetingPreview() {
    ProyekCobaTheme {
        MainScreen(rememberNavController())
    }
}
