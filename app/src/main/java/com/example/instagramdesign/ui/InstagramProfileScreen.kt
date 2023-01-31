package com.example.instagramdesign.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramdesign.R
import com.example.instagramdesign.ui.theme.InstagramDesignTheme

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        ProfilePictureAndFollowerCounter()
        Spacer(modifier = Modifier.height(2.73.dp))
        ProfileDetail()
        Spacer(modifier = Modifier.height(27.dp))
        ProfileMessageAndEmailButton()

    }

}


@Composable
fun ProfilePictureAndFollowerCounter(modifier: Modifier = Modifier) {

    Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically)
    {

        Image(
            painter = painterResource(id = R.drawable.bianca_con_sfumatura_1),
            contentDescription = null,
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
                .border(
                    width = 0.8.dp,
                    shape = CircleShape,
                    color = Color.White
                )
        )

        Spacer(modifier = Modifier.weight(1f))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "30,2 MILA", style = MaterialTheme.typography.bodyLarge)
            Text(text = "follower", style = MaterialTheme.typography.bodySmall)
        }
    }
}


@Composable
fun ProfileDetail(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Riccardo Cambò | Designer",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.W700
        )
        Text(
            text = "Designer",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF00376B)
        )
        Row(horizontalArrangement = Arrangement.spacedBy(3.7.dp)) {
            Text(text = "Host di", style = MaterialTheme.typography.bodyMedium)
            Text(
                text = "@caffè_design",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF00376B)
            )
        }
        Text(text = "Designer freelance", style = MaterialTheme.typography.bodyMedium)
        Text(
            text = "Progetto, rido, fallisco e documento tutto qui.",
            style = MaterialTheme.typography.bodyMedium
        )
    }

}

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFFEFEFEF),
    contentColor: Color = Color(0xFF000000),
    content: @Composable () -> Unit
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier.height(37.12.dp),
        shape = RoundedCornerShape(8.5.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color, contentColor = contentColor)
    ) {
        content()

    }

}


@Composable
fun ProfileMessageAndEmailButton(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.19.dp)) {
        CustomButton(
            modifier = Modifier.weight(1f),
            color = Color(0xFF0098FD),
            contentColor = Color(0xFFFFFFFF)
        ) {
            Text(text = "Segui", style = MaterialTheme.typography.labelLarge)
        }
        CustomButton(modifier = Modifier.weight(1f)) {
            Text(text = "Messaggio", style = MaterialTheme.typography.labelLarge)
        }
        CustomButton(modifier = Modifier.weight(1f)) {
            Text(text = "E-mail", style = MaterialTheme.typography.labelLarge)
        }
        CustomButton(modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_person_add_24),
                contentDescription = null,
                modifier = Modifier.width(15.8.dp)
            )
        }
    }

}


@Preview
@Composable
fun ProfileDetailPreview() {
    InstagramDesignTheme {
        ProfileDetail()
    }
}


@Preview
@Composable
fun ProfilePictureAndFollowerCounterPreview() {
    InstagramDesignTheme {
        ProfilePictureAndFollowerCounter()
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    InstagramDesignTheme {
        ProfileCard()
    }
}