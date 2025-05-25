package com.hongildong.map.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.hongildong.map.R
import com.hongildong.map.navGraph.NavRoute
import com.hongildong.map.ui.theme.Black
import com.hongildong.map.ui.theme.Gray400
import com.hongildong.map.ui.theme.White
import com.hongildong.map.ui.util.FlexibleBottomSheet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NearbyScreen(
    navController: NavHostController,
    sheetScaffoldState: BottomSheetScaffoldState
) {



    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        contentAlignment = Alignment.TopCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .shadow(6.dp)
                    .clickable {
                        navController.navigate(NavRoute.Search.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    .background(color = White, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 15.dp)
            ) {
                Text(
                    "홍익대학교에서 길을 찾아보세요.",
                    style = MaterialTheme.typography.labelMedium.copy(color = Gray400)
                )
            }
            Spacer(Modifier.width(10.dp))
            Image(
                painter = painterResource(R.drawable.ic_search_route),
                contentDescription = "search route",
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(56.dp)
                    .shadow(6.dp)
                    .clickable {
                        navController.navigate(NavRoute.Search.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
            )
        }

        FlexibleBottomSheet(
            sheetScaffoldState = sheetScaffoldState
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                Text("여기는 어때요?", style = MaterialTheme.typography.titleMedium.copy(Black))
                Spacer(Modifier.height(6000.dp))
            }
        }

    }
}

@Composable
fun RecommendPlaces() {
    Text("bookmark screen", style = MaterialTheme.typography.labelLarge)
}
