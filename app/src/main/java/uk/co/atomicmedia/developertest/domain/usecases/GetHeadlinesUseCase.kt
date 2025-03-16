package uk.co.atomicmedia.developertest.domain.usecases

import uk.co.atomicmedia.developertest.data.repository.NewsRepository
import uk.co.atomicmedia.developertest.domain.entities.Headline
import javax.inject.Inject

class GetHeadlinesUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend operator fun invoke(): Result<List<Headline>> {
        return newsRepository.fetchHeadlines()
    }
}