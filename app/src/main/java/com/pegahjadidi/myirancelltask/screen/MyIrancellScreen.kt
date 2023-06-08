package com.pegahjadidi.myirancelltask.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.pegahjadidi.myirancelltask.screen.BottomSection.BottomSection
import com.pegahjadidi.myirancelltask.screen.topAppBar.TopAppBar
import com.pegahjadidi.myirancelltask.screen.topSection.MiddleCardRuncell
import com.pegahjadidi.myirancelltask.screen.topSection.TopSection
import com.pegahjadidi.myirancelltask.ui.theme.ExteremeLightGray

@Composable
fun MyIrancellScreen(){
    Column(modifier = Modifier.fillMaxSize()
        .background(MaterialTheme.colors.ExteremeLightGray)) {
        TopAppBar()
        TopSection()
        MiddleCardRuncell()
        BottomSection()
    }
}