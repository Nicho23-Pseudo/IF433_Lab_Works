package oop_00000108084_NicholasWijaya.Week13
import java.io.File


fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi databse...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA: jika terjadi Exception di baris ini (misalnya pembagian dengan nol atau error tak terduga),
    // program akan crash dan metode writer.close() di bawahnya TIDAK AKAN TEREKSEKUSI!
    // File akan terus terkunci oleh OS

    // Wajib dipanggil secara manual jika tidak memakai blok 'use'
    writer.close()
    println("Proses penulisan unsafe selesai.")
}