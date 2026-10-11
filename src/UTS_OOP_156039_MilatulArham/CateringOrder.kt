package UTS_OOP_156039_MilatulArham

import java.text.NumberFormat
import java.util.Locale

fun formatRupiah(amount: Double): String {
    val formatter = NumberFormat.getNumberInstance(
        Locale("id", "ID")
    )
    formatter.maximumFractionDigits = 0
    formatter.minimumFractionDigits = 0

    return "Rp ${formatter.format(amount)}"
}

class CateringOrder(
    val customer: Customer
) {
    var status: OrderStatus = OrderStatus.WAITING_LIST

    private val orderItems:
            MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        if (qty > 0) {
            orderItems.add(Pair(menu, qty))
        } else {
            println("[Error] Quantity must be greater than 0!")
        }
    }

    fun printInvoice() {
        println()
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")
        println()

        var grandTotal = 0.0

        orderItems.forEachIndexed { index, orderItem ->
            val menu = orderItem.first
            val quantity = orderItem.second

            println("${index + 1}.")
            menu.printMenuDetails(quantity)

            grandTotal += menu.calculateSubtotal(quantity)
        }

        println("-----------------------------------------")
        println("GRAND TOTAL: ${formatRupiah(grandTotal)}")
        println("=========================================")
    }
}