package oop_00000108084_NicholasWijaya.Week13
import java.io.File

fun main () {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil di buat dan ditulis")

    file.appendText("Line 2: MEnambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append")
}