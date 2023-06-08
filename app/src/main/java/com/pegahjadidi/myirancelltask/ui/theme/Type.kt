package com.pegahjadidi.myirancelltask.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pegahjadidi.myirancelltask.R

val font_standard = FontFamily(
    Font(R.font.sans)
)


val Typography.standardRegular : TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = font_standard,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    )

val Typography.standardBold : TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = font_standard,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    )

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = font_standard,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    ),
    h2 = TextStyle(
        fontFamily = font_standard,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),
    h3 = TextStyle(
        fontFamily = font_standard,
        fontWeight = FontWeight.Bold,
        fontSize = 8.sp,
    )
)