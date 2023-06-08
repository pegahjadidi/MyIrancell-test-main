package com.pegahjadidi.myirancelltask.screen.topSection

import androidx.compose.foundation.BorderStroke
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
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow
import com.pegahjadidi.myirancelltask.ui.theme.ExteremeLightGray

@Composable
fun TotalFunction() {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(110.dp)
                .padding(8.dp),
            border = BorderStroke(0.5.dp, Color.LightGray),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "کارکرد کل",
                    style = MaterialTheme.typography.h1,
                    color = Color.LightGray
                )
                Text(
                    text = digitByLocale(digitByLocale("422/040") + "ریال"),
                    style = MaterialTheme.typography.h2
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(15.dp))
//                            .width(45.dp)
                            .wrapContentWidth()
                            .background(MaterialTheme.colors.DarkYellow)
                    ) {
                        Text(
                            text = digitByLocale("پرداخت میان دوره"),
                            style = MaterialTheme.typography.h3,
                            modifier = Modifier.padding(4.dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(Modifier.width(16.dp))

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(100.dp))
                            .background(MaterialTheme.colors.ExteremeLightGray)
                            .size(20.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                        )
                    }


                }
            }


        }

}