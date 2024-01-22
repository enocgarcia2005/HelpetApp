package com.mernydevs.helpet.ui.navigation

import android.app.Application
import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel

class AuthViewModel(application: Application) : AndroidViewModel(application) {
    private val sharedPreferences = getApplication<Application>().getSharedPreferences(
        "auth_pref", Context.MODE_PRIVATE
    )

    private val _isLogged = mutableStateOf(sharedPreferences.getBoolean("isLoggedIn", false))
    val isLogged: State<Boolean> = _isLogged

    fun login() = updateAuthState(true)

    fun logout() = updateAuthState(false)

    private fun updateAuthState(isLogged: Boolean) {
        _isLogged.value = isLogged
        saveAuthState(isLogged)
    }

    private fun saveAuthState(isLogged: Boolean) {
        with(sharedPreferences.edit()) {
            putBoolean("isLoggedIn", isLogged)
            apply()
        }
    }
}
