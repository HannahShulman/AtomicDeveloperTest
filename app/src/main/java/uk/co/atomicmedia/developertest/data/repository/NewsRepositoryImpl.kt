package uk.co.atomicmedia.developertest.data.repository

import uk.co.atomicmedia.developertest.data.api.coroutines.ICoroutineNewsApi
import uk.co.atomicmedia.developertest.data.mappers.toHeadline
import uk.co.atomicmedia.developertest.data.mappers.toStory
import uk.co.atomicmedia.developertest.domain.entities.Headline
import uk.co.atomicmedia.developertest.domain.entities.Story
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: ICoroutineNewsApi
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