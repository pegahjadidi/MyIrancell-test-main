package com.pegahjadidi.myirancelltask.screen.topAppBar

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.digitByLocale
import com.pegahjadidi.myirancelltask.ui.theme.LightYellow

@Composable
fun ProfileBox() {

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colors.LightYellow)
            .width(250.dp)
            .height(60.dp)
            .padding(4.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentHeight()
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.irancell),
                contentDescription = "myIrancell",
                modifier = Modifier
                    .size(80.dp)
                    .weight(0.1F),
            )

            Spacer(modifier = Modifier.width(4.dp))

            Column(modifier = Modifier.weight(0.8F)) {
                Text(text = "پگاه جدیدی", style = MaterialTheme.typography.h1)
                Text(text = digitByLocale("09114193494"), style = MaterialTheme.typography.h1)
            }

            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "arrow",
                modifier = Modifier.weight(0.1F)
            )

        }
    }

}