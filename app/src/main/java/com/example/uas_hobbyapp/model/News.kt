package com.example.uas_hobbyapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class News(
    @ColumnInfo(name="id")
    var id:Int = 0,
    @ColumnInfo(name="jdul")
    var judul:String,
    @ColumnInfo(name="deskripsi")
    var deskripsi:String,
    @ColumnInfo(name="kategori")
    var kategori:String,
    @ColumnInfo(name="pengarang")
    var pengarang:String
)
