package com.example.miproyectofinal.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblpersona")
data class Persona(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombres: String,
    val apellidos: String,
    val peso: Double,
    val edad: Int,
    val altura: Double,
)