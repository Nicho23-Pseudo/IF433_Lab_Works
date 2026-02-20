package oop_00000108084_NicholasWijaya.week03

fun main() {
    println("=== TEST WEAPON ===")

    val weapon = Weapon("Dawnmaker", 300)

    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    println("Tier senjata: ${weapon.tier}")
}