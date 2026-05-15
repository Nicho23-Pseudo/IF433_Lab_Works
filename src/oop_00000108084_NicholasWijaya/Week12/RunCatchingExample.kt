package oop_00000108084_NicholasWijaya.Week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (bisa mengubah tipe kegagalan jadi sukses)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil di konversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}