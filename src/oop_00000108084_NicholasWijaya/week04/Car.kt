package oop_00000108084_NicholasWijaya.week04

import javax.print.attribute.standard.NumberOfDocuments

// Car "Is-A" Vehicle. Paramater brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int ) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}