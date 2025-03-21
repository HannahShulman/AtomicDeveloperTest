package uk.co.atomicmedia.developertest.domain.usecases

import uk.co.atomicmedia.developertest.data.repository.NewsRepository
import uk.co.atomicmedia.developertest.domain.entities.Story
import javax.inject.Inject

class GetStoryByIdUseCase @Inject constructor(private val newsRepository: NewsRepository) {

    suspend operator fun invoke(id: String): Result<Story> {
        return newsRepository.fetchStoryById(id)
    }
}