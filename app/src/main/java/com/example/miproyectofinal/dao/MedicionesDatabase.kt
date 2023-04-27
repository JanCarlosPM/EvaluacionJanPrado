package com.example.miproyectofinal.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.entidades.Mediciones

@Database(entities = [Mediciones::class], version = 1)
abstract class MedicionesDatabase : RoomDatabase() {
    abstract fun MedicionesDao(): MedicionesDao
}