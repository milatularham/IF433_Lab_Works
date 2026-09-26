package oop_156039_MilatulArham.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
    private var performaceRating: Int = 3

    fun increasePerformance() {
        performaceRating++
        println("Kinerja $name meningkat! Rating: $performaceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performaceRating")
    }

    val tax: Double
        get() = salary * 0.1
}