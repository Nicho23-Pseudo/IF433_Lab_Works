package oop_00000108084_NicholasWijaya.Week09

fun main() {
    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada
    println("Active Users: $activeUsers")
}