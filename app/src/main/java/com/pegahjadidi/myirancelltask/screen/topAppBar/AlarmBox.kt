package com.pegahjadidi.myirancelltask.screen.topAppBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.digitByLocale
import com.pegahjadidi.myirancelltask.ui.theme.LightYellow

@Composable
fun AlarmBox() {
    Box(
        modifier = Modifier
            .width(60.dp)
            .height(60.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colors.LightYellow)
            .fillMaxWidth(0.15F)
            .padding(4.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.bell),
            contentDescription = "bell",
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.Center)
        )

        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(60.dp))
                .background(MaterialTheme.colors.LightYellow)
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = digitByLocale("18"),
                modifier = Modifier
                    .background(color = Color.Red)
                    .height(16.dp)
                    .padding(horizontal = 4.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h2
            )
        }


    }

}