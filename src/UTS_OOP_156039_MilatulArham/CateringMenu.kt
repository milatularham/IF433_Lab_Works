package UTS_OOP_156039_MilatulArham

abstract class CateringMenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : IBillable {

    var menuCode: String = menuCode
        get() = "UMN-$field"
        set(value) {
            field = value.uppercase()
        }

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.basePrice = basePrice
    }

    abstract override fun calculateSubtotal(
        quantity: Int
    ): Double

    abstract override fun printMenuDetails(
        quantity: Int
    )
}