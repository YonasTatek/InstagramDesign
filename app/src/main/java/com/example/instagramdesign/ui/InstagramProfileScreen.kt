package com.example.instagramdesign.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramdesign.R
import com.example.instagramdesign.ui.theme.InstagramDesignTheme

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {


    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfilePictureAndFollowerCount(modifier: Modifier = Modifier) {

    Row(modifier = modifier.fillMaxWidth())
    {
        Card() {
            Image(
                painter = painterResource(id = R.drawable.bianca_con_sfumatura_1),
                contentDescription = null
            )   
        }
        
        Spacer(modifier = Modifier.weight(1f))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "30,2 MILA")
            Text(text = "follower")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProfilePictureAndFollowerCountPreview() {
    InstagramDesignTheme {
        ProfilePictureAndFollowerCount()
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    InstagramDesignTheme {
        ProfileCard()
    }
}