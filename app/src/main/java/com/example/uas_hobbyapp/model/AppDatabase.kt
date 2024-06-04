package com.example.uas_hobbyapp.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class, News::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
    abstract fun newsDao():NewsDao

    companion object {
        @Volatile private var instance: AppDatabase ?= null
        private val LOCK = Any()

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "happyapp")
                .addMigrations()
                .build()

        operator fun invoke(context: Context) {
            if(instance!=null) {
                synchronized(LOCK) {
                    instance ?: buildDatabase(context).also {
                        instance = it
                    }
                }
            }
        }

    }
}