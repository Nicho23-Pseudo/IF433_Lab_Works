package oop_00000108084_NicholasWijaya.Week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicity Abstract)
    fun click()
}