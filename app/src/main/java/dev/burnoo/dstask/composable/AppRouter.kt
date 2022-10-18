package dev.burnoo.dstask.composable

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dev.burnoo.dstask.feature.home.homeRouter

@Composable
fun AppRouter() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        homeRouter()
    }
}