package oop_00000108084_NicholasWijaya.Week06

interface Clickable {
    val name: String // Abstract property, tidakj ada nilai default
    fun click()
}

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}