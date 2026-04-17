package oop_00000108084_NicholasWijaya.Week08

sealed class Product

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonth: Int
) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product()