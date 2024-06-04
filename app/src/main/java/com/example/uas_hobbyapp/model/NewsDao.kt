package com.example.uas_hobbyapp.model

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg news: News)

    @Query("SELECT * FROM news")
    fun selectAllNews(): List<News>

    @Delete
    fun deleteNews(news:News)
}