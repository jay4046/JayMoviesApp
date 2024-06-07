package com.jay.jaymoviesapp.domain.usecase

import com.jay.jaymoviesapp.domain.repo.MovieRepository
import com.jay.jaymoviesapp.data.model.Movie
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val movieRepository: MovieRepository) {
    suspend fun getPopular(): List<Movie> {
        return movieRepository.getPopularMovies()
    }

    suspend fun getTopRated(): List<Movie> {
        return movieRepository.getTopRatedMovies()
    }
}