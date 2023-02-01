package com.example.instagramdesign.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramdesign.R
import com.example.instagramdesign.ui.theme.InstagramDesignTheme


data class Profile(@DrawableRes val image: Int, val name: String)

@Composable
fun ProfileList(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,


        ) {
        item {
            arrayOf(
                Profile(R.drawable.mask_group1, name = "Gadget"),
                Profile(R.drawable.mask_group, name = "Design pills"),
                Profile(R.drawable.img_0989, name = "Challenge"),
                Profile(R.drawable.img_09891, name = "Illustrazioni")
            ).map {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(end = 33.dp)
                ) {


                    Image(
                        painter = painterResource(id = it.image),
                        contentDescription = null,
                        modifier = Modifier
                            .size(61.7.dp)
                            .clip(CircleShape)
                            .border(
                                width = 0.8.dp,
                                shape = CircleShape,
                                color = Color.White
                            )

                    )
                    Spacer(modifier = Modifier.height(5.7.dp))
                    Text(text = it.name, style = MaterialTheme.typography.titleSmall)
                }
            }
        }

    }
}


@Composable
fun ImageAndMediaIcons(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        arrayOf(R.drawable.icona_griglia, R.drawable.icona_reel, R.drawable.icona_tag).map {
            Icon(
                painter = painterResource(id = it),
                contentDescription = null,
                modifier = Modifier.height(24.36.dp)
            )
        }

    }
}

@Preview
@Composable
fun ImageAndMediaIconsPreview() {
    InstagramDesignTheme {
        ImageAndMediaIcons()
    }
}


@Preview
@Composable
fun ProfileListPreview() {
    InstagramDesignTheme {
        ProfileList()
    }
}


@Composable
fun GalleryImage(@DrawableRes image: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = modifier.height(154.2.dp), contentScale = ContentScale.Crop
    )
}

@Composable
fun GalleryScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxWidth()) {
        item {
            Row(modifier = Modifier.fillMaxWidth()) {
                GalleryImage(image = R.drawable.list1, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list_2, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list4, modifier = Modifier.weight(1f))
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                GalleryImage(image = R.drawable.list3, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list7, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list6, modifier = Modifier.weight(1f))
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                GalleryImage(image = R.drawable.list9, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list5, modifier = Modifier.weight(1f))
                GalleryImage(image = R.drawable.list8, modifier = Modifier.weight(1f))
            }
        }

    }
}

@Preview
@Composable
fun GalleryScreenPreview() {
    InstagramDesignTheme {
        GalleryScreen()
    }
}