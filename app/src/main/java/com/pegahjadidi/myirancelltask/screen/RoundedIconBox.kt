package com.pegahjadidi.myirancelltask.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow

@Composable
fun RoundedIconBox(
    title: String,
    iconSize : Dp,
    image: Painter,
    spacerHeight: Dp = 8.dp,
    color: Color = MaterialTheme.colors.DarkYellow,

    ) {

    Column(
        modifier = Modifier
            .width(90.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(color)
        ) {
            Image(painter = image,
                contentDescription = "",
                modifier = Modifier
                    .size(iconSize)
                    .padding(6.dp)
            )
        }
        Spacer(modifier = Modifier.height(spacerHeight))

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
//                            .width(45.dp)
                .wrapContentWidth()
                .background(color)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(4.dp),
                textAlign = TextAlign.Center
            )
        }


    }

}