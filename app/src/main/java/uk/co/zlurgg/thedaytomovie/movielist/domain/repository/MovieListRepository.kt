package uk.co.zlurgg.thedaytomovie.movielist.domain.repository

import kotlinx.coroutines.flow.Flow
import uk.co.zlurgg.thedaytomovie.movielist.domain.model.movie.Movie
import uk.co.zlurgg.thedaytomovie.movielist.util.Resource

interface MovieListRepository {

    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(
        id: Int
    ): Flow<Resource<Movie>>
}