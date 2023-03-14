package com.example.demotime.presentation.home

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.demotime.Helpers.NAME_ID
import com.example.demotime.Screen

// Adds home screen to `this` NavGraphBuilder
fun NavGraphBuilder.homeScreen(
    // Navigation events are exposed to the caller to be handled at a higher level
    onLogout: () -> Unit
) {
    composable(Screen.Home.route + "/{$NAME_ID}") {
        // The ViewModel as a screen level state holder produces the screen
        // UI state and handles business logic for the ConversationScreen
        val viewModel: HomeViewModel = hiltViewModel()

        Home(
            name = viewModel.name,
            onLogout = { onLogout() }
        )
    }
}

fun NavController.navigateToHome(name: String) {
    this.navigate(Screen.Home.route + "/$name")
}