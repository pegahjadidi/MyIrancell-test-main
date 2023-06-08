package com.pegahjadidi.myirancelltask.screen.topSection

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.digitByLocale
import com.pegahjadidi.myirancelltask.ui.theme.CyanGreen
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow

@Composable
fun CircularProgressBar(title: String, size: Dp, color: Color = MaterialTheme.colors.DarkYellow) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Box(contentAlignment = Alignment.Center) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = digitByLocale("548") + "مگ",
                    style = MaterialTheme.typography.h3,
                    modifier = Modifier.padding(4.dp),
                    textAlign = TextAlign.Center,
                    color = Color.DarkGray
                )
            }
            CircularChart()

        }
        Spacer(modifier = Modifier.height(6.dp))

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
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

@Composable
fun CircularChart(
    value: Float = 55f,
    color: Color = MaterialTheme.colors.CyanGreen,
    backgroundCircleColor: Color = Color.LightGray.copy(alpha = 0.2f),
    size: Dp = 40.dp,
    thickness: Dp = 4.dp,
    gapBetweenCircles: Dp = 1.dp
) {

    val sweepAngles = 360 * value / 100

    Canvas(
        modifier = Modifier.size(size)
    ) {

        var arcRadius = size.toPx()



        arcRadius -= gapBetweenCircles.toPx()

        drawCircle(
            color = backgroundCircleColor,
            radius = arcRadius / 2,
            style = Stroke(width = thickness.toPx(), cap = StrokeCap.Butt)
        )

        drawArc(
            color = color,
            startAngle = -90f,
            sweepAngle = sweepAngles.toFloat(),
            useCenter = false,
            style = Stroke(width = thickness.toPx(), cap = StrokeCap.Round),
            size = Size(arcRadius, arcRadius),
            topLeft = Offset(
                x = (size.toPx() - arcRadius) / 2, y = (size.toPx() - arcRadius) / 2
            )
        )
    }

}