package com.example.demotime

sealed class Screen(val route: String) {
    object Login: Screen("login")
    object Home: Screen("home")
}
