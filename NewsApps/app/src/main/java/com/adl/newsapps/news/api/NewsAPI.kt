package com.adl.newsapps.news.api

import com.adl.newsapps.news.model.NewsResponse
import com.adl.newsapps.news.utils.constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadlines(
        @Query("country")
        countryCode:String= "us",
        @Query("category")
        categoryCode:String,
        @Query("search")
        searchQuery:String,
        @Query("apikey")
        apikeyCode:String= API_KEY
    ): Response<NewsResponse>

}