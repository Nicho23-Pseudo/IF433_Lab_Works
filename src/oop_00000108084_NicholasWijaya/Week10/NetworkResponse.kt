package oop_00000108084_NicholasWijaya.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)