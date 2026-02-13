package oop_00000108084_NicholasWijaya.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name hit $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {

    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("HP $heroName: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("$heroName kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("$heroName MENANG!")
    } else if (!hero.isAlive()) {
        println("$heroName KALAH...")
    } else {
        println("Pertarungan dihentikan.")
    }
}