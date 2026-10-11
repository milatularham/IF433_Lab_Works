package UTS_OOP_156039_MilatulArham

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double

    fun printMenuDetails(quantity: Int)
}