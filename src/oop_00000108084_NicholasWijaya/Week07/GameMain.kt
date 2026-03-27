package oop_00000108084_NicholasWijaya.Week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("========================")

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, " +
            "Damage: ${starterWeapon.item.damage}, " +
            "Durability: ${starterWeapon.durability}")

    println("==========================")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}