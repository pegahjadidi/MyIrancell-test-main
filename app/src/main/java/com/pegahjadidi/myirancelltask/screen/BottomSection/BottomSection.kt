package com.pegahjadidi.myirancelltask.screen.BottomSection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.pegahjadidi.myirancelltask.screen.BottomSection.tabLayout.TabLayout

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BottomSection(){
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        TabLayout()
    }
}