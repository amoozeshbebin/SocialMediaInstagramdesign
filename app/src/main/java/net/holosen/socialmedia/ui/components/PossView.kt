package net.holosen.socialmedia.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage
import net.holosen.socialmedia.models.Post
import net.holosen.socialmedia.ui.theme.AppGray
import net.holosen.socialmedia.ui.theme.RedColor
import java.util.ArrayList

@Composable
fun PostsView(posts: ArrayList<Post>) {
    LazyColumn {
        items(posts.size) { index ->
            PostItem(posts[index])
        }
    }
}

@Composable
fun PostItem(post: Post) {
    var liked by remember { mutableStateOf(false) }
    Column(Modifier.padding(10.dp)) {
        Row {
            Card(
                modifier = Modifier.size(40.dp),
                shape = RoundedCornerShape(15),
                elevation = 8.dp
            ) {
                GlideImage(
                    imageModel = post.user.image,
                    loading = {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                        }
                    },
                    contentScale = ContentScale.Crop,
                    failure = {
                        Text(text = "image request failed.")
                    })
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(Modifier.weight(1f)) {
                Text(
                    text = post.user.fullName,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = post.location,
                    fontSize = 12.sp,
                    color = AppGray
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Filled.MoreVert, contentDescription = "",
                    Modifier
                        .size(26.dp)
                        .align(CenterVertically)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(15),
            elevation = 8.dp
        ) {
            GlideImage(
                modifier = Modifier.fillMaxSize(),
                imageModel = post.image,
                loading = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                    }
                },
                contentScale = ContentScale.Crop,
                failure = {
                    Text(text = "image request failed.")
                })
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            IconButton(onClick = { liked = !liked }) {
                Icon(
                    if (liked) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "",
                    Modifier.size(28.dp),
                    tint = if (liked) RedColor else AppGray
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Outlined.Send,
                    contentDescription = "",
                    Modifier.size(28.dp),
                    tint = AppGray
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = post.caption, fontSize = 12.sp, textAlign = TextAlign.Justify, color = AppGray)
        Spacer(modifier = Modifier.height(8.dp))
    }
}