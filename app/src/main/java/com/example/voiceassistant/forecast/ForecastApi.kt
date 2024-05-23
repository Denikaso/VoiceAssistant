package com.example.voiceassistent.forecast

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ForecastApi {
    @GET("/data/2.5/weather?appid=fd609f364b2f11f8b72dd4fc545f70e1&lang=ru&units=metric&mode=xml")
    fun getCurrentWeather(@Query("q") city: String?) : Call<Forecast?>?
}