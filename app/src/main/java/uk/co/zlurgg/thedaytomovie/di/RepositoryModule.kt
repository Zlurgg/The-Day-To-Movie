package uk.co.zlurgg.thedaytomovie.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.co.zlurgg.thedaytomovie.movielist.data.repository.MovieListRepositoryImpl
import uk.co.zlurgg.thedaytomovie.movielist.domain.repository.MovieListRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMoviesRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository
}