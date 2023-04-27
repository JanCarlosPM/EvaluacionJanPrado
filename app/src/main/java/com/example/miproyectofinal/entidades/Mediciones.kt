package com.example.miproyectofinal.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblmediciones")
data class Mediciones(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val bicep: Double,
    val pantorilla: Double,
    val antebrazo: Double,
    val pectoral: Double,
    val cuadricep: Double,
)