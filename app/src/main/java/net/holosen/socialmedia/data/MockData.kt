package net.holosen.socialmedia.data

import net.holosen.socialmedia.models.Post
import net.holosen.socialmedia.models.Story
import net.holosen.socialmedia.models.User
import java.util.ArrayList

object MockData {
    val stories = ArrayList<Story>()
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()

    init {
        stories.add(Story("John Smith","https://holosen.net/wp-content/uploads/2021/09/story-01.jpg",true))
        stories.add(Story("Mehrad","https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg",false))
        stories.add(Story("Lucy Baker","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",false))
        stories.add(Story("Tony","https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg",false))
        stories.add(Story("Anna Stark","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",false))
        stories.add(Story("Brayan","https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",false))

        users.add(User("NullDevelopr","Hossein Badrnezhad","https://holosen.net/wp-content/uploads/2021/09/Hossein.jpeg"))
        users.add(User("Anna","Anna Stark","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg"))
        users.add(User("Lucy","Lucy Baker","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg"))

        posts.add(Post(users[0],"Tehran, Iran","https://holosen.net/wp-content/uploads/2021/09/violet.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[1],"Los Angeles","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[2],"NewYork City","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
    }
}