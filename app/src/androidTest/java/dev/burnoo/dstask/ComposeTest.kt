package dev.burnoo.dstask

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import dev.burnoo.dstask.composable.AppRouter
import dev.burnoo.dstask.ui.theme.AppTheme
import org.junit.Rule
import org.junit.Test

class ComposeTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun shouldDisplayHelloText() {
        val text = "Hello @burnoo"
        composeRule.setContent {
            AppTheme {
                AppRouter()
            }
        }

        composeRule.onNode(hasText(text)).assertExists()
    }
}