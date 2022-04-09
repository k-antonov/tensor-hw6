package com.example.tensorhw6

data class Employee(
    val name: String,
    val photoImageId: Int,
    val experience: String,
    val position: String,
    val location: String,
    val dateOfBirth: String,
    val phone: String,
    val email: String
) {
    var isOnline = false
}
