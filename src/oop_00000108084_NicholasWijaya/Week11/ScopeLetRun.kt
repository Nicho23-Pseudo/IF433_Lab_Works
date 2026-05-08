package oop_00000108084_NicholasWijaya.Week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val lenght = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nolai expression terakhir
    }
    print("Panjang nama: $lenght")
}