package org.d3if0041.mopro1.proyekcoba.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.halaman.Screen
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme
import org.d3if0041.mopro1.proyekcoba.view.NoteViewModel

class NoteViewModel : ViewModel() {
    val selectedEmoticon = mutableStateOf(R.drawable.a) // Default value for preview
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen(navController: NavHostController, noteViewModel: org.d3if0041.mopro1.proyekcoba.view.NoteViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "Back",
                            modifier = Modifier.size(40.dp),
                            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface)
                        )
                    }
                },
                title = { Text("") }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .wrapContentSize(Alignment.Center),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.weight(0.4f))  // Adjust the weight to shift the box upwards
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                        .padding(10.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
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
                        EmoticoonRow(navController, noteViewModel) // Pass the noteViewModel here
                    }
                }
                Spacer(modifier = Modifier.weight(0.6f))  // Remaining space is more, pushing content up
            }
        }
    }
}


@Composable
fun EmoticoonRow(navController: NavController, noteViewModel: NoteViewModel) {
    val emoticonResIds = listOf(
        Pair(R.drawable.a, stringResource(id = R.string.sangat_baik)),
        Pair(R.drawable.b, stringResource(id = R.string.baik)),
        Pair(R.drawable.c, stringResource(id = R.string.biasa)),
        Pair(R.drawable.d, stringResource(id = R.string.buruk)),
        Pair(R.drawable.e, stringResource(id = R.string.sangat_buruk))
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
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
                modifier = Modifier.clickable {
                    noteViewModel.selectedEmoticon.value = emoticonResId
                    noteViewModel.selectedEmoticonText.value = text
                    navController.navigate(Screen.Entri.route)
                }
            ) {
                Image(
                    painter = painterResource(id = emoticonResId),
                    contentDescription = null,
                    modifier = Modifier.size(46.dp),
                    colorFilter = colorFilter
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = text,
                    fontSize = 10.sp,
                    color = Color.Black,
                    lineHeight = 11.sp
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun AddScreenPreview() {
    val noteViewModel = org.d3if0041.mopro1.proyekcoba.view.NoteViewModel() // Create an instance of NoteViewModel from the view package
    ProyekCobaTheme {
        AddScreen(rememberNavController(), noteViewModel )
    }
}
