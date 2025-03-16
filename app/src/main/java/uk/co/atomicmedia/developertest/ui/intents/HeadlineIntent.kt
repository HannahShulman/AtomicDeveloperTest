package uk.co.atomicmedia.developertest.ui.intents

sealed interface HeadlineIntent {
    data object FetchHeadlines : HeadlineIntent
}