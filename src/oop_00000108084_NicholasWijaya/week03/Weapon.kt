package oop_00000108084_NicholasWijaya.week03

class Weapon (val name: String, damage: Int) {
    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif! Nilai tidak diubah.")
                return
            }
            if (value > 1000) {
                println("Damage terlalu besar! Diset menjadi 1000.")
                field = 1000
                return
            }
            field = value
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}