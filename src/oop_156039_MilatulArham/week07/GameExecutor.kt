package oop_156039_MilatulArham.week07

package oop_00000156039_milatul_arham.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Item didapat: ${event.item.name}")
            println("Damage: ${event.item.damage}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}