package oop_156039_MilatulArham.week07

package oop_00000156039_milatul_arham.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )

            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem(
                name = "Pedang Legendaris",
                damage = 100,
                rarity = ItemRarity.EPIC
            )

            return Weapon(item, 100)
        }
    }
}