package net.holosen.socialmedia.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import net.holosen.socialmedia.ui.theme.AppGray
import net.holosen.socialmedia.ui.theme.Dark
import net.holosen.socialmedia.ui.theme.RedColor
import net.holosen.socialmedia.ui.utils.NavigationItem

@Composable
fun BottomNavigationView(navController: NavController) {
    var selectedRoute by remember { mutableStateOf("home") }
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Add,
        NavigationItem.Activities,
        NavigationItem.Profile
    )
    BottomAppBar(
        backgroundColor = if (isSystemInDarkTheme()) Dark else Color.White,
        contentColor = AppGray
    ) {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(painter = painterResource(id = it.icon), contentDescription = it.title)
                },
                selected = selectedRoute == it.route,
                selectedContentColor = RedColor,
                unselectedContentColor = AppGray,
                onClick = {
                    navController.navigate(it.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            selectedRoute = route
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
