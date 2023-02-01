package com.example.instagramdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramdesign.ui.GalleryScreen
import com.example.instagramdesign.ui.ImageAndMediaIcons
import com.example.instagramdesign.ui.ProfileCard
import com.example.instagramdesign.ui.ProfileList
import com.example.instagramdesign.ui.theme.BottomAppBarWithIconAndProfile
import com.example.instagramdesign.ui.theme.InstagramDesignTheme
import com.example.instagramdesign.ui.theme.TopAppBarWithTextAndIcons

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramDesignTheme {


                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    topBar = {
                        TopAppBarWithTextAndIcons(
                            modifier = Modifier.padding(
                                top = 10.dp,
                                start = 10.66.dp,
                                end = 10.66.dp
                            )
                        )
                    },
                    bottomBar = {
                        BottomAppBarWithIconAndProfile(
                            modifier = Modifier.padding(
                                top = 12.dp,
                                bottom = 10.dp
                            )
                        )
                    }
                ) {
                    InstagramApp(modifier = Modifier.padding(it))
                }

            }
        }
    }
}

@Composable
fun InstagramApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {

        ProfileCard(modifier = Modifier.padding(start = 10.66.dp, end = 10.66.dp))
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