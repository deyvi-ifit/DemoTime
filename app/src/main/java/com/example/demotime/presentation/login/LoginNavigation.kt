package com.example.demotime.presentation.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.demotime.Screen

fun NavGraphBuilder.loginScreen(
    onSuccessfulLogin: (name: String) -> Unit
) {
    composable(Screen.Login.route) {
        Login(
           onSuccessfulLogin = {
               onSuccessfulLogin(it)
           }
        )
    }
}

fun NavController.navigateToLogin() {
    this.navigate(Screen.Login.route)
}