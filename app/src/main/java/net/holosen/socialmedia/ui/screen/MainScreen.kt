package net.holosen.socialmedia.ui.screen

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import net.holosen.socialmedia.ui.components.BottomNavigationView
import net.holosen.socialmedia.ui.components.TopAppView

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var fullScreen by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            if (!fullScreen) TopAppView()
        },
        bottomBar = {
            if (!fullScreen) BottomNavigationView(navController)
            //@NullDevelopr
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = "home",
        ) {
            composable("home") {
                fullScreen = false
                HomeScreen(navController)
            }
            composable("search") {
                fullScreen = false
                SearchScreen()
            }
            composable("add") {
                fullScreen = false
                AddPostScreen()
            }
            composable("activities") {
                fullScreen = false
                ActivitiesScreen()
            }
            composable("profile") {
                fullScreen = false
                ProfileScreen()
            }
            composable(
                "showStory/{index}",
                arguments = listOf(navArgument("index") { type = NavType.IntType })
            ) { backStack ->
                fullScreen = true
                ShowStoryScreen(backStack.arguments?.get("index") as Int)
            }
        }
    }
}