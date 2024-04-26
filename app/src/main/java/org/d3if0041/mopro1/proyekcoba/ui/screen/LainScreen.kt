package org.d3if0041.mopro1.proyekcoba.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
fun LainScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Lainnya",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 28.sp
                            ),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(70.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(16.dp)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Spacer(modifier = Modifier.height(12.dp))

                        Image(
                            painter = painterResource(R.drawable.casual),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .offset(y = 9.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(vertical = 12.dp)
                        ) {
                            Text(
                                text = "Email",
                                fontSize = 18.sp,
                                color = Color.Black,
                                modifier = Modifier.offset(y = 10.dp)  // Menggeser teks ke bawah sebesar 110 dp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(2.dp)) //
                // Box Password
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(16.dp)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                        .clickable { navController.navigate("passwordScreen") }

                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.weight(1f)
                        ) {
                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = stringResource(R.string.ganti_password),
                                fontSize = 18.sp,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))

                        Spacer(modifier = Modifier.height(60.dp))

                        Image(
                            painter = painterResource(R.drawable.password),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                    }
                }
                Spacer(modifier = Modifier.height(2.dp)) // Spacer untuk jarak yang lebih dekat
                // Box Tentang Kami
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(16.dp)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                        .clickable { navController.navigate("infoScreen") }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.weight(1f)
                        ) {
                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = stringResource(R.string.tentang_kami),
                                fontSize = 18.sp,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))

                        Spacer(modifier = Modifier.height(60.dp))

                        Image(
                            painter = painterResource(R.drawable.tentang_kami),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                    }
                }
                Spacer(modifier = Modifier.height(2.dp)) // Spacer untuk jarak yang lebih dekat
                // Box Keluar
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(16.dp)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                        .clickable { navController.navigate("loginScreen") { popUpTo(0) } } // Menggunakan navigate dan popUpTo untuk menghapus stack
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.weight(1f)
                        ) {
                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = stringResource(R.string.keluar),
                                fontSize = 18.sp,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))

                        Spacer(modifier = Modifier.height(60.dp))

                        Image(
                            painter = painterResource(R.drawable.keluar),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                    }
                }
            }
        },

        bottomBar = {
            BottomAppBar(
                modifier = Modifier.background(color = MaterialTheme.colorScheme.primaryContainer),
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = { navController.navigate(Screen.Home.route)},
                            modifier = Modifier.width(60.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
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
                                    maxLines = 1,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        IconButton(
                            onClick = {
                                navController.navigate(Screen.Chart.route)
                            },
                            modifier = Modifier.width(60.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.chart),
                                    contentDescription = null,
                                    colorFilter = ColorFilter.tint(Color.Gray),
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = stringResource(R.string.statistik),
                                    fontSize = 9.sp,
                                    color = Color.Black,
                                    overflow = TextOverflow.Visible,  // Biarkan teks terlihat sepenuhnya
                                    maxLines = 1,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
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
                                maxLines = 1,
                                textAlign = TextAlign.Center
                            )
                        }
                        IconButton(
                            onClick = {
                                navController.navigate(Screen.Lain.route)
                            },
                            modifier = Modifier.width(60.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.more),
                                    contentDescription = null,
                                    colorFilter = ColorFilter.tint(Color.Gray),
                                    modifier = Modifier.size(20.dp)
                                )
                                // Menggunakan string dari resource
                                Text(
                                    text = stringResource(R.string.lain),
                                    fontSize = 9.sp,
                                    color = Color.Black,
                                    overflow = TextOverflow.Visible,  // Biarkan teks terlihat sepenuhnya
                                    maxLines = 1,
                                    textAlign = TextAlign.Center
                                )

                            }
                        }
                    }

                }
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
fun LainScreenPreview() {
    ProyekCobaTheme {
        LainScreen(rememberNavController())
    }
}