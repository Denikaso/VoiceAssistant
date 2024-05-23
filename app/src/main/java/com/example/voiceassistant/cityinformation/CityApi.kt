package com.example.voiceassistent.cityinformation

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CityApi {
    @GET("xml/geo/search?api_key=97c15b9b633bd804ae711144615a6e1b")
    fun getCurrentCity(@Query("search") city: String?) : Call<CityInformation?>?
}