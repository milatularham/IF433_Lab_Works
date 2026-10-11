package oop_156039_MilatulArham.week07

fun main() {
    println(" === TEST SINGLETON === ")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT === ")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n === TEST REGULAR CLASS === ")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n === TEST DATA CLASS === ")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n === TEST SEALED CLASS === ")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }

    println("=== GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== ITEM RARITY ===")
    println(
        "Legendary Drop Chance: " +
                "${ItemRarity.LEGENDARY.dropChance}%"
    )

    println("\n=== WEAPON FACTORY ===")
    val starterSword = Weapon.forgeStarterSword()

    println("Nama Senjata: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Durability: ${starterSword.durability}")

    val epicSword = Weapon.forgeEpicSword()

    println("\nNama Senjata Epic: ${epicSword.item.name}")
    println("Damage: ${epicSword.item.damage}")
    println("Rarity: ${epicSword.item.rarity}")

    println("\n=== WEAPON UPGRADE ===")
    val upgradedItem = starterSword.item.copy(
        damage = 25
    )

    println("Senjata Awal: ${starterSword.item}")
    println("Senjata Upgrade: $upgradedItem")

    println("\n=== BATTLE EVENTS ===")

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )

}
