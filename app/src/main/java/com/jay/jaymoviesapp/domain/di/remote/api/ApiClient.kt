package com.jay.jaymoviesapp.domain.di.remote.api

import com.jay.jaymoviesapp.data.actors.MovieActors
import com.jay.jaymoviesapp.data.movies.GetMovies
import com.jay.jaymoviesapp.data.reviews.MovieReviews
import com.jay.jaymoviesapp.util.Constants.Companion.MOVIE_CREDITS
import com.jay.jaymoviesapp.util.Constants.Companion.MOVIE_ID
import com.jay.jaymoviesapp.util.Constants.Companion.MOVIE_POPULAR
import com.jay.jaymoviesapp.util.Constants.Companion.MOVIE_REVIEWS
import com.jay.jaymoviesapp.util.Constants.Companion.MOVIE_TOP_RATED
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET(MOVIE_POPULAR)
    suspend fun getPopularMovies(): Response<GetMovies>

    @GET(MOVIE_TOP_RATED)
    suspend fun getTopRatedMovies(): Response<GetMovies>

    @GET(MOVIE_CREDITS)
    suspend fun getMovieCredits(@Path(MOVIE_ID) movie_id: String): Response<MovieActors>

    @GET(MOVIE_REVIEWS)
    suspend fun getMovieReviews(@Path(MOVIE_ID) movie_id: String): Response<MovieReviews>
}