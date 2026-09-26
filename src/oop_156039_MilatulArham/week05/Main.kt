package oop_156039_MilatulArham.week05

fun main() {
    val dosen1 = Dosen(nama = "Pal Alex", nidn = "0123456")
    val admin = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin)

    println("=== AKTIVASI PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }


    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(10)
    val luasPersegiPanjang = mathHelper.hitungLuas(10, 20)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("=== TUGAS 1: MATH HELPER ===")
    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")



    println()
    println("=== TUGAS 2: SISTEM PEMBAYARAN ===")

    val eWallet = EWallet(
        accountName = "Milatul Arham",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Milatul Arham",
        limit = 100000.0
    )

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )}