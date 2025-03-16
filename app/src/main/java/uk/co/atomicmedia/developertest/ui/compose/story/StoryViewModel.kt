package uk.co.atomicmedia.developertest.ui.compose.story

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import uk.co.atomicmedia.developertest.data.repository.NewsRepository

class StoryViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    val newsRepository = NewsRepository()

    val id: String = checkNotNull(savedStateHandle["id"])

}