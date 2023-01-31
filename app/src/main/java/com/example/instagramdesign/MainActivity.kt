package com.example.instagramdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramdesign.ui.GalleryScreen
import com.example.instagramdesign.ui.ImageAndMediaIcons
import com.example.instagramdesign.ui.ProfileCard
import com.example.instagramdesign.ui.ProfileList
import com.example.instagramdesign.ui.theme.InstagramDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramDesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InstagramApp()
                }
            }
        }
    }
}

@Composable
fun InstagramApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxWidth()
       ) {
        ProfileCard(modifier = modifier.padding(start = 10.66.dp,end = 10.66.dp))
        ProfileList(modifier = Modifier.padding(13.7.dp))
        ImageAndMediaIcons()
        Spacer(modifier = Modifier.height(19.8.dp))
        GalleryScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramDesignTheme {
        InstagramApp()
    }
}