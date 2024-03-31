package kr.co.kit452.android.baseballquizencyclopedia.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.kit452.android.baseballquizencyclopedia.data.WordRepositoryImpl
import kr.co.kit452.android.baseballquizencyclopedia.domain.repository.WordRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindWordRepository(
        repositoryImpl: WordRepositoryImpl
    ): WordRepository
}