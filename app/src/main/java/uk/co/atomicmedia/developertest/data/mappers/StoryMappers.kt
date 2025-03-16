package uk.co.atomicmedia.developertest.data.mappers

import uk.co.atomicmedia.developertest.data.api.dto.StoryDto
import uk.co.atomicmedia.developertest.domain.entities.Story
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun StoryDto.toStory(): Story {
    val dateFormatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return Story(id, title, author, content, dateFormatter.format(Date.from(publishedAt)))
}