package com.hongildong.map.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hongildong.map.R
import com.hongildong.map.ui.theme.Gray600
import com.hongildong.map.ui.theme.HongildongTheme
import com.hongildong.map.ui.theme.White
import com.hongildong.map.ui.util.CustomTextField

@Composable
fun SearchScreen(navController: NavHostController) {
    var textState by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.background(White).fillMaxSize().padding(vertical = 20.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().systemBarsPadding(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_back),
                contentDescription = "go back button",
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            CustomTextField(
                placeholderMessage = "홍익대학교에서 길을 찾아보세요.",
                textState = textState,
                onTextChange = { textState = it },
                maxLength = 15
            )
        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "최근 검색",
                style = MaterialTheme.typography.titleSmall
            )

            Text(
                text = "전체 삭제",
                style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Normal),
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp)
                    .clickable {
                        // 최근 검색 기록 전체 삭제
                    }
            )
        }

        // todo: 검색기록 없을 때는 검색기록이 없다 문구 / 검색기록 있을 때는 검색기록 보여주기

    }
}

@Preview
@Composable
fun SearchScreenPreview() {
    val navController = rememberNavController()
    HongildongTheme {
        SearchScreen(navController)
    }
}
