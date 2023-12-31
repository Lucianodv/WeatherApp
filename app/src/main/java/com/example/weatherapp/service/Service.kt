package com.example.weatherapp.service

import com.example.weatherapp.Utils
import com.example.weatherapp.model.City
import com.example.weatherapp.model.ForeCast
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("forecast?")
    fun getCurrentWeather(
        @Query("lat")
        lat: String,
        @Query("lon")
        lon: String,
        @Query("appid")
        appid: String = Utils.API_KEY
    ): Call<ForeCast>



    @GET("forecast?")
    fun getCurrentCity(
        @Query("q")
        city: String ,
        @Query("appid")
        appid: String = Utils.API_KEY
    ): Call<ForeCast>





}