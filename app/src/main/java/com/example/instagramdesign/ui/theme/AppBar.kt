package com.example.instagramdesign.ui.theme


import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramdesign.R

@Composable
fun TopAppBarWithTextAndIcons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.vector_7), contentDescription = null,
            modifier = Modifier.width(10.dp)
        )
        Text(text = "breccia.riccardo", style = MaterialTheme.typography.titleMedium)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.group_2), contentDescription = null,
                modifier = Modifier.width(29.dp))
            Spacer(modifier = modifier.width(10.9.dp))
            Icon(painter = painterResource(id = R.drawable.puntini), contentDescription = null)

        }

    }
}

@Preview
@Composable
fun TopAppBarWithTextAndIconsPreview() {
    InstagramDesignTheme {
        TopAppBarWithTextAndIcons()
    }
}

@Composable
fun BottomBarContent(@DrawableRes image: Int, modifier: Modifier = Modifier) {

    Icon(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = modifier.size(23.dp)
    )
}

@Composable
fun BottomAppBarWithIconAndProfile(modifier: Modifier = Modifier) {

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomBarContent(image = R.drawable.vector_20)
        BottomBarContent(image = R.drawable.cerca)
        BottomBarContent(image = R.drawable.aggiungi)
        BottomBarContent(image = R.drawable.icona_reel)
        Image(
            painter = painterResource(id = R.drawable.bianca_con_sfumatura_1),
            contentDescription = null,
            modifier = Modifier
                .size(23.dp)
                .clip(CircleShape)


        )

    }

}

@Preview
@Composable
fun BottomAppBarWithIconAndProfilePreview() {
    InstagramDesignTheme {
        BottomAppBarWithIconAndProfile()
    }
}