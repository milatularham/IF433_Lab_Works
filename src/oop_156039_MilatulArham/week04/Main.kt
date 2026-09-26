package oop_156039_MilatulArham.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val electricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 90
    )

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()


    val manager = Manager(
        name = "Budi",
        baseSalary = 10000000
    )

    val developer = Developer(
        name = "Andi",
        baseSalary = 8000000,
        programmingLanguage = "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")}