package com.lewishr.valuemart.repository

import com.lewishr.valuemart.data.UserDao
import com.lewishr.valuemart.model.User


class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
