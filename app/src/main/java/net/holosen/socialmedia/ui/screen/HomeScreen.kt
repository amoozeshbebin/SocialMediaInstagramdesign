package net.holosen.socialmedia.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import net.holosen.socialmedia.data.MockData
import net.holosen.socialmedia.ui.components.PostsView
import net.holosen.socialmedia.ui.components.StoriesView
import net.holosen.socialmedia.ui.theme.LightGray

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        StoriesView(MockData.stories, navController)
        Spacer(modifier = Modifier.height(7.dp))
        Divider(color = LightGray, thickness = 1.dp, modifier = Modifier.padding(15.dp, 0.dp))
        Spacer(modifier = Modifier.height(7.dp))
        PostsView(MockData.posts)
    }
}