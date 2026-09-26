package oop_156039_MilatulArham.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil melakukan pembayaran Rp$amount")
            println("Sisa saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName melakukan top up Rp$amount")
        println("Saldo sekarang: Rp$balance")
    }
}