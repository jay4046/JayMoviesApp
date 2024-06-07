package com.jay.jaymoviesapp.util

import android.content.Context
import android.content.SharedPreferences
import com.jay.jaymoviesapp.data.model.Movie
import com.jay.jaymoviesapp.util.Constants.Companion.SHARED_MOVIE_POPULAR
import com.google.gson.Gson


class PreferencesManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    fun saveMoviesData(value: Movie) {
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(value)
        editor.putString(SHARED_MOVIE_POPULAR, json)
        editor.apply()
    }

    fun getMoviesData(): Movie {
        val moviestring = sharedPreferences.getString(SHARED_MOVIE_POPULAR, null)
        return Gson().fromJson(moviestring, Movie::class.java)
    }
}