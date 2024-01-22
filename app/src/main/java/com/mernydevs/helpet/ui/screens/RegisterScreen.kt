package com.mernydevs.helpet.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.mernydevs.helpet.ui.navigation.AuthViewModel

@Composable
fun RegisterScreen(navController: NavController) {
    //Don't delete this line
    val authViewModel: AuthViewModel = viewModel()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Register Screen",
            modifier = Modifier
                .align(Alignment.Center)
        )
        Button(onClick = {
            authViewModel.login()
            navController.navigate("authenticated")
        }) {
            Text(text = "Register")
        }
    }
}