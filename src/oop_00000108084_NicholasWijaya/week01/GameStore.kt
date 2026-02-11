package oop_00000108084_NicholasWijaya.week01

fun main() {

    val gameTitle = "Persona 3 Reload"
    val price = 579000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 80) / 100
    else (price * 90) / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String?
) {
    println("=== SteamKW Receipt ===")
    println("Title: $title")
    println("Original Price: Rp $originalPrice")
    println("Final Price: Rp $finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}