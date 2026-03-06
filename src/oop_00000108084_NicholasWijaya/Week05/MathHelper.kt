package oop_00000108084_NicholasWijaya.Week05

class MathHelper {

    // Untuk hitung Luas Persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Untuk hitung Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Untuk hitung Luas Lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}