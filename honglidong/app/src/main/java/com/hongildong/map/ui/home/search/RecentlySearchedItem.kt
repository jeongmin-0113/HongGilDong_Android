package com.hongildong.map.ui.home.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hongildong.map.R
import com.hongildong.map.ui.theme.HongildongTheme

@Composable
fun RecentlySearchedItem(
    itemName: String,
    onClickItem: (String) -> Unit,
    onDeleteItem: (String) -> Unit
) {
    Row (
        modifier = Modifier.fillMaxWidth().padding(3.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row (
            modifier = Modifier.weight(1f)
                .clickable {
                    onDeleteItem(itemName)
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.ic_location),
                contentDescription = "",
                modifier = Modifier.padding(end = 6.dp)
            )
            // 최근 검색된 검색어
            Text(
                text = itemName,
                style = MaterialTheme.typography.labelMedium
            )
        }
        // 삭제 버튼
        Image(
            painter = painterResource(R.drawable.ic_close),
            contentDescription = "",
            modifier = Modifier.padding(4.dp).clickable {
                onClickItem(itemName)
            }
        )
    }
}

@Preview
@Composable
fun RecentlySearchedItemPreview() {
    HongildongTheme {
        RecentlySearchedItem(
            itemName = "아이템1",
            onClickItem = {},
            onDeleteItem = {}
        )
    }
}