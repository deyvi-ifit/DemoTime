package com.example.demotime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.demotime.Helpers.NAME_ID
import com.example.demotime.presentation.home.Home
import com.example.demotime.presentation.home.homeScreen
import com.example.demotime.presentation.home.navigateToHome
import com.example.demotime.presentation.login.Login
import com.example.demotime.presentation.login.loginScreen
import com.example.demotime.presentation.login.navigateToLogin
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen.Login.route) {
                    loginScreen { name ->
                        navController.navigateToHome(name)
                        // hello
                    }
                    
                    homeScreen {
                        navController.navigateToLogin()
                    }
                }
            }
        }
    }
}
