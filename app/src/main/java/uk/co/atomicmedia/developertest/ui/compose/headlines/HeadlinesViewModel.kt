package uk.co.atomicmedia.developertest.ui.compose.headlines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uk.co.atomicmedia.developertest.data.repository.NewsRepository
import uk.co.atomicmedia.developertest.data.repository.NewsRepositoryImpl
import uk.co.atomicmedia.developertest.domain.usecases.GetHeadlinesUseCase
import uk.co.atomicmedia.developertest.ui.intents.HeadlineIntent

class HeadlinesViewModel : ViewModel() {

    private val newsRepository: NewsRepository = NewsRepositoryImpl()

    val getHeadlinesUseCase = GetHeadlinesUseCase(newsRepository)

    private val _uiState = MutableStateFlow(HeadlinesUiState())
    val uiState: StateFlow<HeadlinesUiState> = _uiState

    fun onIntent(intent: HeadlineIntent) {
        when (intent) {
            HeadlineIntent.FetchHeadlines -> fetchHeadlines()
        }
    }

    private fun fetchHeadlines() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(isLoading = true)
            }
            val headlines = getHeadlinesUseCase()
            _uiState.update {
                it.copy(isLoading = false, errorMessage = headlines.exceptionOrNull()?.message, headlines = headlines.getOrDefault(emptyList()))
            }
        }
    }
}