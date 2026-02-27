package oop_00000108084_NicholasWijaya.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Lamborghini", numberOfDoors = 2)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk()      // Memanggil method yang sudah di-override
    myCar.accelerate()// Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("Tesla", numberOfDoors = 4, 85)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}