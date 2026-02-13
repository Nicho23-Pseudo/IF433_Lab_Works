package oop_00000108084_NicholasWijaya.week02

class Student(val name: String, val nim: String, var gpa: Double = 0.0, var major: String) {
    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5){
            println("WARNING: Objek tercipta dengan NIMN ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }


    }
    // Secondary Constructor
    // Wajib memanggil Primary Constructor menggunakan 'this()'
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}