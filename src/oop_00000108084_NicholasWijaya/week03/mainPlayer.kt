package oop_00000108084_NicholasWijaya.week03

fun main() {
    println("\n=== TEST PLAYER ===")

    val player = Player("Phainon")

    // player.xp = 100 // HARUS ERROR karena xp private

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}