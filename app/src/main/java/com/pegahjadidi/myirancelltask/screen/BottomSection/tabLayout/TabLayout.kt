package com.pegahjadidi.myirancelltask.screen.BottomSection.tabLayout


import androidx.compose.ui.res.painterResource
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.google.accompanist.pager.*
import com.pegahjadidi.myirancelltask.screen.RoundedIconBox
import com.pegahjadidi.myirancelltask.screen.topSection.CircularProgressBar
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun TabLayout() {

    val pagerState = rememberPagerState(pageCount = 3)

    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)
    }
}








