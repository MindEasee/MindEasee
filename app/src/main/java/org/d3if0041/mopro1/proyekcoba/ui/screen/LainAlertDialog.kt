import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.d3if0041.mopro1.proyekcoba.R
import org.d3if0041.mopro1.proyekcoba.ui.theme.ProyekCobaTheme

@Composable
fun LainAlertDialog(
    openDialog: Boolean,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit
) {
    if (openDialog) {
        AlertDialog(
            text = {
                Text(
                    text = stringResource(R.string.pesan_keluar),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center)
                )
            },
            onDismissRequest = { onDismissRequest() },
            dismissButton = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(16.dp)
                            ),
                        contentAlignment = Alignment.Center // Mengatur posisi ikon di tengah kotak
                    ) {
                        IconButtonWithText(
                            icon = ImageVector.vectorResource(id = R.drawable.baseline_check_24),
                            onClick = { onConfirmation() },
                            iconSize = 60.dp,

                        )
                    }
                    Spacer(modifier = Modifier.width(30.dp))

                    Box(
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(16.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButtonWithText(
                            icon = ImageVector.vectorResource(id = R.drawable.baseline_close_24),
                            onClick = { onDismissRequest() },
                            iconSize = 120.dp
                        )
                    }
                }
            },
            confirmButton = {}
        )
    }
}


@Composable
fun CustomText(text: String) {
    Text(text = text)
}

@Composable
fun IconButtonWithText(
    icon: ImageVector,
    onClick: () -> Unit,
    iconSize: Dp
) {
    TextButton(
        onClick = onClick,
        modifier = Modifier.padding(8.dp)
    ) {
        val iconTint = when (icon) {
            ImageVector.vectorResource(id = R.drawable.baseline_check_24) ->  Color(0xFF4ECB71)
            ImageVector.vectorResource(id = R.drawable.baseline_close_24) -> Color.Red
            else -> Color.Unspecified // Biarkan warna ikon yang lain menggunakan warna aslinya
        }
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(iconSize),
            tint = iconTint
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DialogPreview() {
    ProyekCobaTheme {
        LainAlertDialog(
            openDialog = true,
            onDismissRequest = {},
            onConfirmation = {}
        )
    }
}
