package uk.co.atomicmedia.developertest.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.co.atomicmedia.developertest.data.api.coroutines.CoroutineNewsApi
import uk.co.atomicmedia.developertest.data.api.coroutines.ICoroutineNewsApi
import uk.co.atomicmedia.developertest.data.repository.NewsRepository
import uk.co.atomicmedia.developertest.data.repository.NewsRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun provideCoroutineNewsApi(
        coroutineNewsApi: CoroutineNewsApi
    ): ICoroutineNewsApi

    @Binds
    abstract fun provideNewsRepository(
        newsRepositoryImpl: NewsRepositoryImpl
    ): NewsRepository
}