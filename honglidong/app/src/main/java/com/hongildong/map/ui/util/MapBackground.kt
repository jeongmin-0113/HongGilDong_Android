package com.hongildong.map.ui.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.NaverMap

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun MapBackground() {
    NaverMap(
        modifier = Modifier.fillMaxSize()
    ) {
        //ArrowheadPathOverlay(coords = )
    }
}