package UTS_OOP_156039_MilatulArham

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(
        quantity: Int
    ): Double {
        val finalPrice = if (isLargeSize) {
            basePrice + 5000.0
        } else {
            basePrice
        }

        return finalPrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val size = if (isLargeSize) "Large" else "Regular"
        val subtotal = calculateSubtotal(quantity)

        println(
            "[DRINK] $menuCode - $name ($size)"
        )
        println(
            "  Qty: $quantity cups | Subtotal: ${formatRupiah(subtotal)}"
        )
    }
}