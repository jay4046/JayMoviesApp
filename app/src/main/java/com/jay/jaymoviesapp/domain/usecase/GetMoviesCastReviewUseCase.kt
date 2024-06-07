package com.jay.jaymoviesapp.domain.usecase

import com.jay.jaymoviesapp.data.model.Actors
import com.jay.jaymoviesapp.data.model.Reviews
import com.jay.jaymoviesapp.domain.repo.MovieActorRepository
import javax.inject.Inject

class GetMoviesCastReviewUseCase @Inject constructor(private val movieActorRepository: MovieActorRepository) {

    suspend fun getMovieActors(movie_id: String): List<Actors> {
        return movieActorRepository.getMovieCasts(movie_id = movie_id)
    }

    suspend fun getMovieReviews(movie_id: String): List<Reviews> {
        return movieActorRepository.getMovieReviews(movie_id = movie_id)
    }
}