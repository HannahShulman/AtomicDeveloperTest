package uk.co.atomicmedia.developertest.data.mappers

import uk.co.atomicmedia.developertest.data.api.dto.HeadlineDto
import uk.co.atomicmedia.developertest.domain.entities.Headline

fun HeadlineDto.toHeadline(): Headline {
    return Headline(id = this.id, title = this.title, author = this.author)
}