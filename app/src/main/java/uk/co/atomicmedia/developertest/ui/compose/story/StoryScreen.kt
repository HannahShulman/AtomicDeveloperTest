package uk.co.atomicmedia.developertest.ui.compose.story

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import uk.co.atomicmedia.developertest.ui.compose.general.LoadingScreen
import uk.co.atomicmedia.developertest.ui.intents.StoryIntent

@Composable
fun StoryScreen(
    modifier: Modifier = Modifier,
    storyViewModel: StoryViewModel = hiltViewModel(),
) {
    val uiState by storyViewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect("") {
        storyViewModel.onIntent(StoryIntent.FetchStory)
    }
    Box(contentAlignment = Alignment.Center) {
        Column(modifier = modifier.padding(16.dp)) {
            uiState.errorMessage?.let {
                AnimatedVisibility(true) {
                    Text(
                        text = it, modifier = Modifier
                            .padding(16.dp)
                            .wrapContentHeight()
                            .fillMaxWidth()
                            .background(Color.Red)
                    )
                }
            }
            uiState.story?.let {
                Text(text = it.title, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(16.dp))
                HorizontalDivider()
                Text(it.content)
                Spacer(modifier = Modifier.weight(1f))
                Text("Published At: ${it.formattedPublishedAt}")
            }

            if (uiState.isLoading) {
                LoadingScreen()
            }
        }
    }
}