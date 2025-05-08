package com.lewishr.valuemart.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.lewishr.valuemart.model.Bakes


@Dao
interface BakesDao {
    @Query("SELECT * FROM bakes")
    fun getAllBakes(): LiveData<List<Bakes>>

    @Insert
    suspend fun insertBakes(bakes: Bakes)

    @Update
    suspend fun updateBakes(bakes: Bakes)

    @Delete
    suspend fun deleteBakes(bakes: Bakes)
}