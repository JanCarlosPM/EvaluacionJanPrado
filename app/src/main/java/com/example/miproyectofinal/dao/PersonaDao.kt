package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entidades.Persona

@Dao
interface PersonaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(Persona: Persona): Long

    @Update
    fun actualizar(Persona: Persona): Int

    @Delete
    fun eliminar(Persona: Persona): Int

    @Query("SELECT * FROM tblpersona")
    fun obtenerTodos(): LiveData<List<Persona>>
}