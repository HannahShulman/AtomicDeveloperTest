package uk.co.atomicmedia.developertest.ui.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.co.atomicmedia.developertest.ui.compose.headlines.HeadlinesScreen
import uk.co.atomicmedia.developertest.ui.compose.story.StoryScreen
import uk.co.atomicmedia.developertest.ui.compose.ui.theme.AtomicTheme

@Composable
fun NewsApp() {
    val navController = rememberNavController()

    AtomicTheme {
        NavHost(
            navController,
            "/"
        ) {
            composable(route = "/") {
                HeadlinesScreen(
                    Modifier.fillMaxSize(),
                    onHeadlineClick = { id ->
                        navController.navigate("/story/$id")
                    })
            }

            composable(
                route = "/story/{id}",
            ) {
                StoryScreen(
                    Modifier.fillMaxSize()
                )
            }
        }
    }
}