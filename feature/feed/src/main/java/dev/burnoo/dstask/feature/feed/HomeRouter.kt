package dev.burnoo.dstask.feature.feed

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.feedRouter() {
    navigation(startDestination = "main", route = "feed") {
        composable("main") { MainScreen() }
    }
}