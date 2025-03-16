package uk.co.atomicmedia.developertest.ui.compose.headlines

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HeadlinesScreen(
    modifier: Modifier = Modifier,
    headlinesViewModel: HeadlinesViewModel = viewModel(),
    onHeadlineClick: (id: String) -> Unit,
) {
    Surface(modifier) {
        // This button is here to demonstrate navigation only, this needs to be replaced with a list of headlines
        Button(
            { onHeadlineClick("123") },
            Modifier.wrapContentSize(Alignment.Center),
        ) {
            Text("Headline 123")
        }
    }
}