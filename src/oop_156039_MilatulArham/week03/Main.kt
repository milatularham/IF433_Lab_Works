package oop_156039_MilatulArham.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

        val weapon = Weapon("Dragon Sword", 500)

        println("Nama Weapon: ${weapon.name}")
        println("Damage awal: ${weapon.damage}")
        println("Tier awal: ${weapon.tier}")

        println("\nCoba set damage -50:")
        weapon.damage = -50
        println("Damage sekarang: ${weapon.damage}")

        println("\nCoba set damage 9999:")
        weapon.damage = 9999
        println("Damage sekarang: ${weapon.damage}")
        println("Tier: ${weapon.tier}")
    }


