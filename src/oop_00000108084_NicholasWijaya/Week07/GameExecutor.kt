package oop_00000108084_NicholasWijaya.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game over! Alasan: ${event.reason}")
        }

        is BattleState.SafeZone -> {
            println("Berada di Safe Zone. Aman...")
        }
    }
}