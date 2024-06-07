package com.jay.jaymoviesapp.domain.repo

import com.jay.jaymoviesapp.data.model.Actors
import com.jay.jaymoviesapp.data.model.Reviews
import com.jay.jaymoviesapp.data.model.toActors
import com.jay.jaymoviesapp.data.model.toReviews
import com.jay.jaymoviesapp.domain.di.remote.source.CastReviewService
import javax.inject.Inject

class MovieActorRepository @Inject constructor(private val castReviewService: CastReviewService) {

    suspend fun getMovieCasts(movie_id: String): List<Actors> {
        return castReviewService.getMovieCredits(movie_id).map {
            it.toActors()
        }
    }

    suspend fun getMovieReviews(movie_id: String): List<Reviews> {
        return castReviewService.getMovieReviews(movie_id).map {
            it.toReviews()
        }
    }
}