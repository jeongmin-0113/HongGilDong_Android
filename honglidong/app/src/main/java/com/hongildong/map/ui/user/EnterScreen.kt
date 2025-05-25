package com.hongildong.map.ui.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.hongildong.map.R
import com.hongildong.map.ui.theme.Black
import com.hongildong.map.ui.theme.Gray500
import com.hongildong.map.ui.theme.PrimaryMid
import com.hongildong.map.ui.theme.White

@Composable
fun EnterScreen(
    onStrangerClick: () -> Unit,
    onLoginClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_logo),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(Modifier.height(20.dp))
        Text(
            "홍대의 길잃은 동문들 위한 지도",
            style = MaterialTheme.typography.titleLarge.copy(color = Black)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            "내 강의실부터 학교 이벤트까지,\n지금 길을 바로 찾아보세요!",
            style = MaterialTheme.typography.labelLarge.copy(color = Black),
            textAlign = TextAlign.Center
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonColors(
                containerColor = PrimaryMid,
                disabledContainerColor = PrimaryMid,
                contentColor = White,
                disabledContentColor = White
            ),
            onClick = { onLoginClick() }
        ) {
            Text(
                "홍대생으로 시작하기",
                style = MaterialTheme.typography.titleMedium.copy(color = White)
            )
        }
        Spacer(Modifier.height(10.dp))
        Text(
            "비회원으로 계속하기",
            style = MaterialTheme.typography.labelLarge.copy(color = Gray500),
            modifier = Modifier
                .clickable { onStrangerClick() }
        )
    }
}