package net.holosen.socialmedia.ui.utils

import net.holosen.socialmedia.R


open class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_baseline_home_24,"Home")
    object Search : NavigationItem("search",R.drawable.ic_baseline_search_24,"Search")
    object Add : NavigationItem("add",R.drawable.ic_outline_add_box_24,"Add")
    object Activities : NavigationItem("activities",R.drawable.ic_baseline_favorite_border_24,"Activities")
    object Profile : NavigationItem("profile",R.drawable.ic_outline_person_pin_24,"Profile")
}