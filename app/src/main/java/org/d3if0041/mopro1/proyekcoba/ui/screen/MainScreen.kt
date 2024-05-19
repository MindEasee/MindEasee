import android.os.Build
import androidx.annotation.RequiresApi
import org.d3if0041.mopro1.proyekcoba.ui.screen.EntriScreen
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import org.d3if0041.mopro1.proyekcoba.model.Note
import org.d3if0041.mopro1.proyekcoba.ui.screen.NoteViewModel
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController, noteViewModel: NoteViewModel) {
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
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(16.dp)
                        ) // Add border
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
                        EmoticonRow(navController)
                    }
                }
                GambarBawah()
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
                            onClick = {},
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
                            onClick = { navController.navigate(Screen.Chart.route)},
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
                        IconButton(
                            onClick = {
                                navController.navigate(Screen.Tips.route)
                            },
                            modifier = Modifier.width(60.dp)
                        ) {
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
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Screen.Add.route)
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

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NoteItem(note: Note) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text("Tanggal: ${note.date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))}")
        Text("Jam: ${note.time.format(DateTimeFormatter.ofPattern("HH:mm"))}")
        Text("Masalah: ${note.masalah}")
        Text("Pikiran: ${note.pikiran}")
        Text("Solusi: ${note.solusi}")
    }
}

@Composable
fun EmoticonRow(navController: NavController) {
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
        emoticonResIds.forEach { (emoticonResId, text) ->
            val colorFilter = when (emoticonResId) {
                R.drawable.a -> ColorFilter.tint(Color(0xFF009688))
                R.drawable.b -> ColorFilter.tint(Color(0xFF4CAF50))
                R.drawable.c -> ColorFilter.tint(Color(0xFF2196F3))
                R.drawable.d -> ColorFilter.tint(Color(0xFFFF5900))
                R.drawable.e -> ColorFilter.tint(Color(0xD2FF0000))
                else -> null
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {  // Menambahkan aksi onClick
                    navController.navigate(Screen.Entri.route)
                }
            ) {
                Image(
                    painter = painterResource(id = emoticonResId),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    colorFilter = colorFilter
                )
                Text(
                    text = text,
                    fontSize = 11.sp,
                    color = Color.Black,
                    lineHeight = 12.sp
                )
            }
        }
    }
}

@Composable
fun SomeOtherComposable(navController: NavController) {
    EmoticonRow(navController = navController)
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

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    val noteViewModel: NoteViewModel = viewModel()

    ProyekCobaTheme {
        EntriScreen(navController = navController, noteViewModel = noteViewModel)
    }
}
