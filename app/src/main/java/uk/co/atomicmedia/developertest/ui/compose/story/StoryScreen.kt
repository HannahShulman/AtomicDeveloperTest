package uk.co.atomicmedia.developertest.ui.compose.story

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StoryScreen(
    modifier: Modifier = Modifier,
    storyViewModel: StoryViewModel = viewModel(),
) {
    Surface(modifier) {
        Text(storyViewModel.id)
    }
}