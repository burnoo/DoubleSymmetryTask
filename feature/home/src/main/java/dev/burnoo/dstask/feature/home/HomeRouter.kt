package dev.burnoo.dstask.feature.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.homeRouter() {
    navigation(startDestination = "main", route = "home") {
        composable("main") { MainScreen() }
    }
}