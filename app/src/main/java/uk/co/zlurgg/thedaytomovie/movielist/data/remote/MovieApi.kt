package uk.co.zlurgg.thedaytomovie.movielist.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import uk.co.zlurgg.thedaytomovie.movielist.data.remote.response.MovieListDto
import uk.co.zlurgg.thedaytomovie.movielist.domain.model.movie.Movie

interface MovieApi {

    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    ): MovieListDto

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
        const val API_KEY = "56ff18e88b3000e0d8e1b1af3e78cd48"
    }
}