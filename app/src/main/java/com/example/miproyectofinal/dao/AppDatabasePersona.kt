package com.example.miproyectofinal.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.miproyectofinal.entidades.Persona

@Database(entities = [Persona::class], version = 1, exportSchema = false)
abstract class AppDatabasePersona : RoomDatabase() {

    abstract fun PersonaDao(): PersonaDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabasePersona? = null

        fun getInstance(context: Context): AppDatabasePersona {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabasePersona::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}