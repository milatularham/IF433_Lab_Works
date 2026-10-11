package oop_156039_MilatulArham.week07

package oop_00000156039_milatul_arham.week07

sealed class BattleState {
    data class MonsterEncounter(
        val monsterName: String
    ) : BattleState()

    data class LootDropped(
        val item: GameItem
    ) : BattleState()

    data class GameOver(
        val reason: String
    ) : BattleState()

    object SafeZone : BattleState()
}