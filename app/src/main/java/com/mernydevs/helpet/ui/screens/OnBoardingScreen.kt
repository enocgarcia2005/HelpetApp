package com.mernydevs.helpet.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun OnBoardingScreen(navigation: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "On Boarding Screen",
            modifier = Modifier
                .align(Alignment.Center)
        )
        Button(onClick = {navigation.navigate("Login")}) {
            Text(text = "Next")
        }
    }
}