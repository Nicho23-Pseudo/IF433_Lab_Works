package oop_00000108084_NicholasWijaya.week04

fun main() {
    val manager = Manager("Endmin", 10_000_000)
    val developer = Developer("Perlica", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}