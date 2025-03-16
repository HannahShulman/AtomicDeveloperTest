package uk.co.atomicmedia.developertest.ui.view.stories

import androidx.lifecycle.ViewModel
import uk.co.atomicmedia.developertest.data.repository.NewsRepository

class StoryViewModel(): ViewModel() {
    val newsRepository = NewsRepository()
}