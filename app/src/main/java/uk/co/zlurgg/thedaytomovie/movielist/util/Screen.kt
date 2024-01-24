package uk.co.zlurgg.thedaytomovie.movielist.util

sealed class Screen(val route: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
}