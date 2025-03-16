package uk.co.atomicmedia.developertest.data.repository

import uk.co.atomicmedia.developertest.domain.entities.Headline
import uk.co.atomicmedia.developertest.domain.entities.Story

interface NewsRepository {

    suspend fun fetchHeadlines(): Result<List<Headline>>
    suspend fun fetchStoryById(id: String): Result<Story>

}