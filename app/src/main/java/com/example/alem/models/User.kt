package com.example.alem.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class User (
    @PrimaryKey val uuid: UUID = UUID.randomUUID(),
    val polisList: List<Polis> = mutableListOf(),
    var cash: Double = 0.0,
    var id: Int,
    var name: String,
    var surname: String,
    var patronymic: String,
    var login: String,
    var password: String)