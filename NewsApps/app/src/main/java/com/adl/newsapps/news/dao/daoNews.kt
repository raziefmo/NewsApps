package com.adl.newsapps.news.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.adl.newsapps.news.model.Article


@Dao
interface daoNews {
    @Query("SELECT * FROM articles")
    fun getArticles() : LiveData<List<Article>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article) : Long

    @Delete
    suspend fun delete(article: Article)

    @Query("DELETE FROM articles")
    suspend fun deleteAllArticles()
}