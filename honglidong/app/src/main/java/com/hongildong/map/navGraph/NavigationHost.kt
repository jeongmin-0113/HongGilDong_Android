package com.hongildong.map.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hongildong.map.ui.home.BookmarkScreen
import com.hongildong.map.ui.home.NearbyScreen
import com.hongildong.map.ui.home.ProfileScreen
import com.hongildong.map.ui.home.SearchScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Nearby.route
    ) {
        composable(route = NavRoute.Nearby.route) {
            NearbyScreen(navController)
        }
        composable(route = NavRoute.Bookmark.route) {
            BookmarkScreen()
        }
        composable(route = NavRoute.Profile.route) {
            ProfileScreen()
        }
        composable(route = NavRoute.Search.route) {
            SearchScreen(navController)
        }
    }
}

sealed class NavRoute(val route: String) {
    object Nearby : NavRoute("nearby")
    object Bookmark : NavRoute("bookmark")
    object Profile : NavRoute("profile")
    object Search : NavRoute("search")
}
