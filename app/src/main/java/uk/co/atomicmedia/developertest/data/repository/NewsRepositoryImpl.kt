package uk.co.atomicmedia.developertest.data.repository

import uk.co.atomicmedia.developertest.data.api.coroutines.CoroutineNewsApi
import uk.co.atomicmedia.developertest.data.api.coroutines.ICoroutineNewsApi
import uk.co.atomicmedia.developertest.data.mappers.toHeadline
import uk.co.atomicmedia.developertest.data.mappers.toStory
import uk.co.atomicmedia.developertest.domain.entities.Headline
import uk.co.atomicmedia.developertest.domain.entities.Story

class NewsRepositoryImpl(
    private val newsApi: ICoroutineNewsApi = CoroutineNewsApi()
) : NewsRepository {
    override suspend fun fetchHeadlines(): Result<List<Headline>> {
        return kotlin.runCatching {
            newsApi.getNewsHeadlines().map {
                it.toHeadline()
            }
        }
    }

    override suspend fun fetchStoryById(id: String): Result<Story> {
        return kotlin.runCatching {
            newsApi.getNewsStory(id).toStory()
        }
    }
}