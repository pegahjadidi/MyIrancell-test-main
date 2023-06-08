package com.pegahjadidi.myirancelltask.screen.topAppBar


import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.ui.theme.DarkYellow

@Composable
fun TopAppBar() {
    androidx.compose.material.TopAppBar(
        backgroundColor = MaterialTheme.colors.DarkYellow,
        modifier = Modifier.height(80.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ProfileBox()
            Spacer(Modifier.weight(1f))
            AlarmBox()
        }

    }
}




