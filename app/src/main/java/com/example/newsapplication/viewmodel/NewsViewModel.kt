package com.example.newsapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapplication.dataclasses.Article
import com.example.newsapplication.dataclasses.GetTopNewsHeadlines
import com.example.newsapplication.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepository: NewsRepository): ViewModel() {

    private val _topArticles: MutableLiveData<List<Article>> = MutableLiveData()
    val topArticles: LiveData<List<Article>>
        get() = _topArticles

    fun getTopArticles() {
        viewModelScope.launch{

        }
    }
}