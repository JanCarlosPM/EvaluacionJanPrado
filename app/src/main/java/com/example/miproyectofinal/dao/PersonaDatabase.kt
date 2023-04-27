package com.example.miproyectofinal.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.entidades.Persona

@Database(entities = [Persona::class], version = 1)
abstract class PersonaDatabase : RoomDatabase () {
    abstract fun PersonaDao(): PersonaDao
}