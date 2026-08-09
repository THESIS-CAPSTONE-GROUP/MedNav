package com.example.genericsmarthospitallocatormobileapplication.data.model

data class Hospital(
    val hid: String = "",
    val name: String = "",
    val address: String = "",
    val contactNumber: String = "",
    val services: List<String> = emptyList(),
    val equipment: List<String> = emptyList(),
    val specializedDoctors: List<String> = emptyList(),
    val bedCapacity: Int = 0,
    val credentialsUrl: String = "",
    val profileImageUrl: String = "",
    val isVerified: Boolean = false
)
