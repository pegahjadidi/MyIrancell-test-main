package com.pegahjadidi.myirancelltask.screen.topSection

import androidx.compose.foundation.Image
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

@Composable
fun MiddleCardRuncell(){
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .fillMaxWidth()
            .padding(top = 4.dp, bottom = 4.dp)
            .background(Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(4.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.wallet) ,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = digitByLocale("رانسل رو بازی کنید و جایزه بگیرید!"),
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(4.dp),
                textAlign = TextAlign.Center
            )
        }

    }
}