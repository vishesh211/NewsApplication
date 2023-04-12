package com.example.newsapplication.repository

import com.example.newsapplication.api.NewsApi
import com.example.newsapplication.dataclasses.GetTopNewsHeadlines
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepository @Inject constructor(private val newsApi: NewsApi) {

    suspend fun getTopNewsHeadlines(): Response<GetTopNewsHeadlines> {
         return newsApi.getTopNewsHeadlines()
    }
}