package com.pegahjadidi.myirancelltask.screen.BottomSection.tabLayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    val list = listOf(
        "داغ" to painterResource(id = R.drawable.fire),
        "طلایی" to painterResource(id = R.drawable.medal),
        "مالی" to painterResource(id = R.drawable.money_bag)
    )
    val scope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.White,
        contentColor = Color.Black,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = MaterialTheme.colors.DarkYellow
            )
        }
    ) {
        list.forEachIndexed { index, _ ->
            Tab(
                text = {
                    Row() {
                        Text(
                            list[index].first,
                            color = if (pagerState.currentPage == index) Color.Black else Color.DarkGray
                        )
                        Image(painter = list[index].second,
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                    }

                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}