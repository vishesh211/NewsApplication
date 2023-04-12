package com.example.newsapplication.dataclasses

data class GetTopNewsHeadlines(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)