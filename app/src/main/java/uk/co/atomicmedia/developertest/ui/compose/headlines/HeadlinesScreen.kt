package uk.co.atomicmedia.developertest.ui.compose.headlines

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import uk.co.atomicmedia.developertest.domain.entities.Headline
import uk.co.atomicmedia.developertest.ui.compose.general.LoadingScreen
import uk.co.atomicmedia.developertest.ui.intents.HeadlineIntent

@Composable
fun HeadlinesScreen(
    modifier: Modifier = Modifier,
    headlinesViewModel: HeadlinesViewModel = hiltViewModel(),
    onHeadlineClick: (id: String) -> Unit,
) {
    Surface(modifier) {
        val uiState by headlinesViewModel.uiState.collectAsStateWithLifecycle()

        LaunchedEffect("") {
            headlinesViewModel.onIntent(HeadlineIntent.FetchHeadlines)
        }

        Box {
            LazyColumn {
                uiState.errorMessage?.let {
                    item {
                        AnimatedVisibility(true) {
                            Text(
                                text = it, modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(Color.Red)
                                    .padding(16.dp)
                            )
                        }
                    }
                }
                item {
                    Text("Headlines")
                }

                items(uiState.headlines) {
                    HeadlineItem(it, onHeadlineClick)
                }
            }
            if (uiState.isLoading) {
                LoadingScreen()
            }
        }
    }
}

@Composable
fun HeadlineItem(headline: Headline, onHeadlineClick: (id: String) -> Unit) {
    Column(modifier = Modifier.clickable { onHeadlineClick(headline.id) }) {
        Text(headline.title, modifier = Modifier.padding(8.dp))
        Text("Author: ${headline.author}", modifier = Modifier.padding(8.dp))
        HorizontalDivider()
    }
}