package uk.co.atomicmedia.developertest.ui.compose.story

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uk.co.atomicmedia.developertest.domain.usecases.GetStoryByIdUseCase
import uk.co.atomicmedia.developertest.ui.intents.StoryIntent
import javax.inject.Inject

@HiltViewModel
class StoryViewModel @Inject constructor(val getStoryById: GetStoryByIdUseCase, savedStateHandle: SavedStateHandle) : ViewModel() {

    val id: String = checkNotNull(savedStateHandle["id"])

    private val _uiState = MutableStateFlow(StoryUiState())
    val uiState: StateFlow<StoryUiState> = _uiState


    fun onIntent(intent: StoryIntent) {
        when (intent) {
            StoryIntent.FetchStory -> fetchStory(id)
        }
    }

    private fun fetchStory(id: String) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(isLoading = true)
            }
            val story = getStoryById(id)

            _uiState.update {
                it.copy(isLoading = false, errorMessage = story.exceptionOrNull()?.message, story = story.getOrNull())
            }
        }
    }

}