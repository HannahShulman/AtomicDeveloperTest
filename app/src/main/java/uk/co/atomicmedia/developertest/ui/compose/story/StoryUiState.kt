package uk.co.atomicmedia.developertest.ui.compose.story

import uk.co.atomicmedia.developertest.domain.entities.Story


data class StoryUiState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val story: Story? = null
)