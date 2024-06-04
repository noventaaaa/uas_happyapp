package com.example.uas_hobbyapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name = "username")
    var username:String,
    @ColumnInfo(name = "first_name")
    var first_name:String,
    @ColumnInfo(name = "last_name")
    var last_name:String,
    @ColumnInfo(name = "password")
    var password:String,
){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int = 0
}

@Entity
data class News(
    @ColumnInfo(name = "title")
    var title:String,
    @ColumnInfo(name = "description")
    var description:String,
    @ColumnInfo(name = "category")
    var category:String,
    @ColumnInfo(name = "author")
    var author:String,
){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int = 0
}
