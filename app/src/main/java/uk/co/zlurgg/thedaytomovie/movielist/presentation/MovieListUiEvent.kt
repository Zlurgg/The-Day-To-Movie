package uk.co.zlurgg.thedaytomovie.movielist.presentation

sealed interface MovieListUiEvent {
    data class Paginate(val category: String) : MovieListUiEvent
    data object Navigate: MovieListUiEvent
}