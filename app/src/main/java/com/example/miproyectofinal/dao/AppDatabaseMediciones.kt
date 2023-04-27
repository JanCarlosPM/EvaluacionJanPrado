package com.example.miproyectofinal.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.miproyectofinal.entidades.Mediciones

@Database(entities = [Mediciones::class], version = 1, exportSchema = false)
abstract class AppDatabaseMediciones : RoomDatabase() {

    abstract fun MedicionesDao(): MedicionesDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabaseMediciones? = null

        fun getInstance(context: Context): AppDatabaseMediciones {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabaseMediciones::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}