package uk.co.atomicmedia.developertest.domain.entities

import java.util.Date


data class Story(
    val id: String,
    val title: String,
    val author: String,
    val content: String,
    val formattedPublishedAt: String,
)