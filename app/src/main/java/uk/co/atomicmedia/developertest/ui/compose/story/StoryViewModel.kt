package uk.co.atomicmedia.developertest.ui.compose.story

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import uk.co.atomicmedia.developertest.data.repository.NewsRepository
import uk.co.atomicmedia.developertest.data.repository.NewsRepositoryImpl
import uk.co.atomicmedia.developertest.domain.usecases.GetStoryByIdUseCase

class StoryViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val newsRepository: NewsRepository = NewsRepositoryImpl()

    val id: String = checkNotNull(savedStateHandle["id"])

    val getStoryById = GetStoryByIdUseCase(newsRepository)

}