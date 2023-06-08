package com.pegahjadidi.myirancelltask.screen.topSection

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.screen.RoundedIconBox
import com.pegahjadidi.myirancelltask.ui.theme.CyanGreen
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow

@Composable
fun BuyCase() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 10.dp,
                vertical = 10.dp
            )
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RoundedIconBox(
                "خرید بسته چند کاره",
                40.dp,
                painterResource(id = R.drawable.people),
            )
            RoundedIconBox(
                "خرید بسته پیشنهادی",
                40.dp,
                painterResource(id = R.drawable.percent),
            )
            RoundedIconBox(
                "خرید بسته مکالمه",
                40.dp,
                painterResource(id = R.drawable.phone_call),
            )
            CircularProgressBar(title = "خرید بسته اینترنت",48.dp)
            

        }
    }
}




