package com.mernydevs.helpet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mernydevs.helpet.ui.screens.ForgotPasswordScreen
import com.mernydevs.helpet.ui.screens.HomeScreen
import com.mernydevs.helpet.ui.screens.LoginScreen
import com.mernydevs.helpet.ui.screens.OnBoardingScreen
import com.mernydevs.helpet.ui.screens.RegisterScreen

@Composable
fun MainNavigation(navController: NavHostController, isLogged: Boolean) {
    val startDestination = if (!isLogged) "anonymous" else "authenticated"
    NavHost(navController = navController, startDestination = startDestination) {
        navigation(startDestination = "OnBoarding", route = "anonymous") {
            composable("OnBoarding") {
                OnBoardingScreen(navController)
            }
            composable("Login") {
                LoginScreen(navController)
            }
            composable("Register") {
                RegisterScreen(navController)
            }
            composable("ForgotPassword") {
                ForgotPasswordScreen(navController)
            }
        }
        navigation(startDestination = "Home", route = "authenticated") {
            composable("Home") {
                HomeScreen(navController)
            }
        }
    }
}