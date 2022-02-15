package com.example.alem.room_database

import androidx.lifecycle.LiveData
import com.example.alem.models.User

class UserRepository(private val userDao: UserDao) {
    val readAllData: LiveData<List<User>> = userDao.getAll()

    suspend fun addUser(user:User) {
        userDao.insertAll(user)
    }
}