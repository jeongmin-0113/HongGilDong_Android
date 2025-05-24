package com.hongildong.map.ui.util

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hongildong.map.ui.theme.Gray200
import com.hongildong.map.ui.theme.White

@Composable
@Preview
fun FlexibleBottomScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .shadow(6.dp)
            .background(color = White, shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
            .height(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
        // todo: 제스처로 크기 조정 가능하게 만들기
    ) {
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .width(60.dp)
                .background(color = Gray200, shape = RoundedCornerShape(size = 10.dp))
                .height(5.dp)
        )
    }
}
