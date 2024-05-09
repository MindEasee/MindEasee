package org.d3if0041.mopro1.proyekcoba.ui.screen

import androidx.compose.runtime.Composable
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VideoJogging(
    videoUri: Uri
){
    AndroidView(
        factory = { context->
            VideoView(context).apply {
                setVideoURI(videoUri)

                val myController = MediaController(context)
                myController.setAnchorView(this)
                setMediaController(myController)

                setOnPreparedListener{
                    start()
                }
            }
        })
}