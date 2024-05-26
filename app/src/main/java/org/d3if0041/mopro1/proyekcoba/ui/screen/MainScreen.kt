import android.os.Build
import androidx.annotation.RequiresApi
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import org.d3if0041.mopro1.proyekcoba.model.Note
import org.d3if0041.mopro1.proyekcoba.view.NoteViewModel
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController,
               noteViewModel: NoteViewModel
) {

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
                            modifier = Modifier.size(28.dp)
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
                            modifier = Modifier.size(28.dp)
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
            LazyColumn(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
            ) {
                item {
                    if (noteViewModel.notes.isEmpty()) {
                        GambarBawah()
                    } else {
                        val currentUserUid = noteViewModel.currentUserUid
                        noteViewModel.notes.filter { it.uid == currentUserUid }.forEachIndexed { index, note ->
                            val emoticonColor = Color(0xFF4ECB71)
                            NoteItem(
                                note = note,
                                onEditClick = {
                                    navController.navigate("${Screen.Entri.route}/$index")
                                },
                                onDeleteClick = {
                                    noteViewModel.deleteNoteById(index)
                                },
                                emoticonColor = emoticonColor,
                                noteViewModel = noteViewModel
                            )
                        }
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
                                    overflow = TextOverflow.Visible,
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
                                Text(
                                    text = stringResource(R.string.lain),
                                    fontSize = 9.sp,
                                    color = Color.Black,
                                    overflow = TextOverflow.Visible,
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

@Composable
fun GambarBawah() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
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
}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NoteItem(note: Note, onEditClick: () -> Unit,
             onDeleteClick: () -> Unit,
             emoticonColor: Color,
             noteViewModel: NoteViewModel,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = note.time.format(DateTimeFormatter.ofPattern("HH:mm")),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = "-",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Text(
                text = note.date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.weight(1f) // This makes the text take up the available space
            )
            Spacer(modifier = Modifier.width(8.dp)) // Space between text and icons

            // Moved edit box here
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.White, CircleShape)
                    .border(1.dp, Color.Gray, CircleShape)
                    .clickable {
                        // Handle box click event
                    },
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = onEditClick) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit",
                        tint = Color(0xFF4ECB71), // #4ECB71 dalam format hex
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp)) // Space between edit and delete icons

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.White, CircleShape)
                    .border(1.dp, Color.Gray, CircleShape)
                    .clickable {
                        // Handle box click event
                    },
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = onDeleteClick) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete",
                        tint = Color.Red
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Tambahkan gambar emotikon di sini
            Image(
                painter = painterResource(note.emoticonResourceId),
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                colorFilter = ColorFilter.tint(noteViewModel.getEmoticonColor())
            )

            Spacer(modifier = Modifier.height(8.dp)) // Space between emoticon and text
        }

        Column {
            Text("Masalah: ${note.masalah}")
            Text("Pikiran: ${note.pikiran}")
            Text("Solusi: ${note.solusi}")
        }
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
        MainScreen(navController = navController, noteViewModel = noteViewModel)
    }
}

