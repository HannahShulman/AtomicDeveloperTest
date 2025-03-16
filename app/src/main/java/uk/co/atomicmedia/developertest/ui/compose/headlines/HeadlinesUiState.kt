package uk.co.atomicmedia.developertest.ui.compose.headlines

import uk.co.atomicmedia.developertest.domain.entities.Headline

data class HeadlinesUiState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val headlines: List<Headline> = emptyList()
)