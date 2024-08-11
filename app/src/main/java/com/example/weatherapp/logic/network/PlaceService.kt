package com.example.weatherapp.logic.network

import com.example.weatherapp.WeatherApplication
import com.example.weatherapp.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${WeatherApplication.TOKEN}")
    fun searchPlaces(@Query("query") query:String): Call<PlaceResponse>
}