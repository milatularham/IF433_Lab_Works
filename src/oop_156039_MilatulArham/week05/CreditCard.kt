package oop_156039_MilatulArham.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil melakukan pembayaran Rp$amount")
            println("Total penggunaan kartu: Rp$usedAmount")
        } else {
            println("Transaksi ditolak. Limit kartu tidak mencukupi")
        }
    }
}