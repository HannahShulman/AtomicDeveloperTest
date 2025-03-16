package uk.co.atomicmedia.developertest.ui.compose.headlines

import androidx.lifecycle.ViewModel
import uk.co.atomicmedia.developertest.data.repository.NewsRepository

class HeadlinesViewModel : ViewModel() {

    val newsRepository = NewsRepository()
}