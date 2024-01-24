package uk.co.zlurgg.thedaytomovie.details.presentation

import uk.co.zlurgg.thedaytomovie.movielist.domain.model.movie.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
