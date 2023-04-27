package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entidades.Mediciones

@Dao
interface MedicionesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(mediciones: Mediciones): Long

    @Update
    fun actualizar(mediciones: Mediciones): Int

    @Delete
    fun eliminar(mediciones: Mediciones): Int

    @Query("SELECT * FROM tblmediciones")
    fun obtenerTodos(): LiveData<List<Mediciones>>
}