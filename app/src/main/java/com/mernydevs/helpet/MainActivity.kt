package com.mernydevs.helpet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.mernydevs.helpet.ui.navigation.AuthViewModel
import com.mernydevs.helpet.ui.navigation.MainNavigation
import com.mernydevs.helpet.ui.theme.HelpetTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HelpetTheme {
                val navController = rememberNavController()
                val authViewModel: AuthViewModel = viewModel()
                val isLogged by remember { authViewModel.isLogged }


                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    MainNavigation(
                        navController = navController,
                        isLogged = isLogged
                    )
                }
            }
        }
    }
}
