package com.example.newsapplication.api

import com.example.newsapplication.dataclasses.GetTopNewsHeadlines
import com.example.newsapplication.utils.Constants.API_KEY
import com.example.newsapplication.utils.Constants.COUNTRY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getTopNewsHeadlines(
        @Query("country") country: String = COUNTRY,
        @Query("apiKey") api_key: String = API_KEY
    ): Response<GetTopNewsHeadlines>
}
