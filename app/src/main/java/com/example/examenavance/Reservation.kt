package com.example.examenavance

data class Reservation(
    val id: String = "",
    val userId: String = "",
    val deviceId: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
