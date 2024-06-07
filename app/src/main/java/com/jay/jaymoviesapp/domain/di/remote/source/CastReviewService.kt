package com.jay.jaymoviesapp.domain.di.remote.source

import com.jay.jaymoviesapp.data.actors.Cast
import com.jay.jaymoviesapp.data.reviews.Result
import com.jay.jaymoviesapp.domain.di.remote.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CastReviewService @Inject constructor(private val apiClient: ApiClient) {

    suspend fun getMovieCredits(movie_id: String): List<Cast> {
        return withContext(Dispatchers.IO) {
            val actors = apiClient.getMovieCredits(movie_id = movie_id)
            actors.body()!!.cast
        }
    }

    suspend fun getMovieReviews(movie_id: String): List<Result> {
        return withContext(Dispatchers.IO) {
            val actors = apiClient.getMovieReviews(movie_id = movie_id)
            actors.body()!!.results
        }
    }

}