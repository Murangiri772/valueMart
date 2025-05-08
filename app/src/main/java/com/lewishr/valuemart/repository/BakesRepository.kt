package com.lewishr.valuemart.repository

import android.content.Context
import com.lewishr.valuemart.data.BakesDatabase
import com.lewishr.valuemart.model.Bakes


class BakesRepository(context: Context) {
    private val bakesDao = BakesDatabase.getDatabase(context).bakesDao()

    suspend fun insertBakes(bakes: Bakes) {
        bakesDao.insertBakes(bakes)
    }

    fun getAllBakes() = bakesDao.getAllBakes()

    suspend fun deleteBakes(bakes: Bakes) = bakesDao.deleteBakes(bakes)
}