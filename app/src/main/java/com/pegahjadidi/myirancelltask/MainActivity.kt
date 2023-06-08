package com.pegahjadidi.myirancelltask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.pegahjadidi.myirancelltask.screen.MyIrancellScreen
import com.pegahjadidi.myirancelltask.ui.theme.MyIrancellTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIrancellTaskTheme {
                // A surface container using the 'background' color from the theme
                CompositionLocalProvider(
                    LocalLayoutDirection provides androidx.compose.ui.unit.LayoutDirection.Rtl) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        val systemUiController = rememberSystemUiController()
                        SideEffect {
                            systemUiController.setStatusBarColor(
                                color = Color(0XFFffbe1a),
                            )
                    }
                        MyIrancellScreen()
                }
            }

        }
    }
}}

