package com.pegahjadidi.myirancelltask.screen.BottomSection

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pegahjadidi.myirancelltask.R
import com.pegahjadidi.myirancelltask.screen.RoundedIconBox

@Composable
fun BottomCase(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 5.dp,
                vertical = 5.dp
            )
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RoundedIconBox(
                "اسنپ",
                80.dp,
                painterResource(id = R.drawable.snapp),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "اسنپ فود",
                80.dp,
                painterResource(id = R.drawable.snap_food),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "جاجیگا",
                80.dp,
                painterResource(id = R.drawable.jajiga),
                0.dp,
                color = Color.White
            )

            RoundedIconBox(
                "علی دَدی",
                80.dp,
                painterResource(id = R.drawable.alibaba),
                0.dp,
                color = Color.White
            )


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RoundedIconBox(
                "ترنج",
                80.dp,
                painterResource(id = R.drawable.toranj),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "تُربچه",
                80.dp,
                painterResource(id = R.drawable.torob),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "روبیکا",
                80.dp,
                painterResource(id = R.drawable.robika),
                0.dp,
                color = Color.White
            )

            RoundedIconBox(
                "مفید",
                80.dp,
                painterResource(id = R.drawable.mofid),
                0.dp,
                color = Color.White
            )


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RoundedIconBox(
                "خانومی",
                80.dp,
                painterResource(id = R.drawable.khanomi),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "ایتا",
                80.dp,
                painterResource(id = R.drawable.ita),
                0.dp,
                color = Color.White
            )
            RoundedIconBox(
                "بازار",
                80.dp,
                painterResource(id = R.drawable.bazar),
                0.dp,
                color = Color.White
            )

            RoundedIconBox(
                "جاباما",
                80.dp,
                painterResource(id = R.drawable.jabama),
                0.dp,
                color = Color.White
            )


        }
    }
}