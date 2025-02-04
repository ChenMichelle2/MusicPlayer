package com.example.musicplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicplayer.ui.theme.MusicPlayerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicPlayerTheme {
                Screen()
                }
            }
        }
    }


@Composable
fun Screen(){
    Box(
        modifier = Modifier
            .fillMaxSize()

    ){
        //Album Cover
        Image(
            painter = painterResource(id = R.drawable.cover),
            contentDescription = "Cover",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop

        )
        //Songtitle, artist, controls
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Enchanted (Taylor's Version)",
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Taylor Swift"
            )

            Spacer(modifier = Modifier.height(32.dp))

            //controls
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                //back button
                Button(
                    onClick = {} //doesn't do anything
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowLeft,
                        contentDescription = "back"
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                //Play Button
                Button(
                    onClick = {} //doesn't do anything
                ){
                    Icon(
                        imageVector = Icons.Filled.PlayArrow,
                        contentDescription = "Play"
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                //pause button
                Button(
                    onClick = {} //doesn't do anything
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_pause_circle_filled_24),
                        contentDescription = "Pause"
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                //skip button
                Button(
                    onClick = {} //doesn't do anything
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowRight,
                        contentDescription = "skip"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MusicPlayerTheme {
        Screen()
    }
}