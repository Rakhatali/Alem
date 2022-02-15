package com.example.alem.models

import java.util.*

data class Polis (
        var uuid: UUID,
        var date: Date,
        var user_id: Int,
        var car: String
        )