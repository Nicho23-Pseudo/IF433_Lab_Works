package oop_00000108084_NicholasWijaya.week01

fun main() {

    val gameTitle = "Persona 3 Reload"
    val price = 579000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 80) / 100
    else (price * 90) / 100
