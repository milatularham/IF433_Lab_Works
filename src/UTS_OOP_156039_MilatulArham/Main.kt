package UTS_OOP_156039_MilatulArham

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== UMN CATERING MANAGER SYSTEM ===")
    println()


    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu(
        name = "Nasi Goreng Spesial",
        menuCode = "nsg01",
        basePrice = 0.0
    )

    nasiGoreng.basePrice = -15000.0
    nasiGoreng.basePrice = 25000.0

    println("[Database Setup] Price updated to ${formatRupiah(nasiGoreng.basePrice)}")
    println()

    val ayamBakar = FoodMenu(
        name = "Ayam Bakar Madu",
        menuCode = "aym02",
        basePrice = 35000.0
    )

    val esTehLemon = DrinkMenu(
        name = "Es Teh Lemon",
        menuCode = "lem01",
        basePrice = 8000.0,
        isLargeSize = true
    )

    val menuCatalog: List<CateringMenu> = listOf(
        nasiGoreng,
        ayamBakar,
        esTehLemon
    )


    println("--- CUSTOMER DATA INPUT ---")

    print("Enter Customer Name: ")
    val customerName = scanner.nextLine()

    print("Enter Phone Number: ")
    val customerPhone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val customerAddress = scanner.nextLine()

    val customer = Customer(
        name = customerName,
        phone = customerPhone,
        deliveryAddress = customerAddress
    )

    val order = CateringOrder(customer)


    while (true) {
        println()
        println("--- MENU CATALOG ---")

        menuCatalog.forEachIndexed { index, menu ->
            println("${index + 1}. ${menu.name}")
        }

        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuNumber = scanner.nextLine().toIntOrNull()

        if (menuNumber == null) {
            println("[Error] Please enter a valid number!")
            continue
        }

        if (menuNumber == 0) {
            break
        }

        if (menuNumber !in 1..menuCatalog.size) {
            println("[Error] Menu number is not available!")
            continue
        }

        print("Enter Quantity: ")
        val quantity = scanner.nextLine().toIntOrNull()

        if (quantity == null || quantity <= 0) {
            println("[Error] Quantity must be greater than 0!")
            continue
        }

        val selectedMenu = menuCatalog[menuNumber - 1]

        order.addMenuToOrder(selectedMenu, quantity)

        println("Order successfully added!")
    }


    println()
    println("Processing Checkout...")

    order.status = OrderStatus.COOKING
    order.printInvoice()

    scanner.close()
}