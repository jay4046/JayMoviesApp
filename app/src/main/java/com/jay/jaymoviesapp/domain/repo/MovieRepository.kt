package com.jay.jaymoviesapp.domain.repo


import com.jay.jaymoviesapp.data.model.Movie
import com.jay.jaymoviesapp.data.model.toMovie
import com.jay.jaymoviesapp.domain.di.remote.source.MovieService
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieService: MovieService) {

    suspend fun getPopularMovies(): List<Movie> {
        return movieService.getPopularMovies().map {
            it.toMovie()
        }
    }

    suspend fun getTopRatedMovies(): List<Movie> {
        return movieService.getTopRatedMovies().map {
            it.toMovie()
        }
    }
}