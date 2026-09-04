package oop_156039_MilatulArham.week01

fun main(){
    val gameTittle: String = "FC 27"
    val price: Int = 800000
    printReceipt(title = gameTittle, priceAwal = price, finalprice = calculateDiscount(price))

}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReceipt(title: String, priceAwal: Int, finalprice: Int) {
    println("Judul: $title, HargaAwal: $priceAwal, HargaAkhir: $finalprice")
}