package uk.co.atomicmedia.developertest.ui.intents

sealed interface StoryIntent {
    data object FetchStory : StoryIntent
}