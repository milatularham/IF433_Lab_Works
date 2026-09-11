package oop_156039_MilatulArham.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler,2. Umum):")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {

            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {

            println("Pilihan ngawur, pendaftaran batal!")
        }
 println()
 println("---LIBRARY FINE SYSTEM---")

 print("Masukkan Judul Buku: ")
 val bookTitle = scanner.nextLine()

 print("Masukkan Nama Peminjam: ")
 val borrower = scanner.nextLine()

 print("Masukkan Lama Pinjam (hari): ")
 var loanDuration = scanner.nextInt()

 if(loanDuration<0) {
     loanDuration = 1
     println("Lama pinjam tidak boleh minus. Diubah menjadi 1 hari.")
 }
 val loan = Loan(bookTitle, borrower, loanDuration)

 println()
 println("---DETAIL PEMINJAMAN---")
 println("Judul Buku :${loan.bookTitle}")
 println("Peminjam :${loan.borrower}")
 println("Lama Pinjam :${loan.loanDuration}hari")
 println("Total Denda :Rp${loan.calculateFine()}")
 scanner.nextLine()
    }
    println()
    println("=== MINI RPG BATTLE ===")

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(
        name = heroName,
        baseDamage = baseDamage
    )

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println()
        println("--- MENU BATTLE ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih menu: ")

        val pilihan = scanner.nextInt()

        if (pilihan == 1) {

            // Hero menyerang musuh
            hero.attack("Musuh")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Musuh terkena ${hero.baseDamage} damage!")
            println("Sisa HP Musuh: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {

                val damage = (10..20).random()

                println("Musuh membalas!")
                hero.takeDamage(damage)

                println("Hero terkena $damage damage!")
                println("Sisa HP Hero: ${hero.hp}")
            }

        } else if (pilihan == 2) {

            println("${hero.name} memilih untuk kabur!")
            break

        } else {

            println("Pilihan tidak valid!")
        }
    }

    println()
    println("=== HASIL PERTANDINGAN ===")

    if (!hero.isAlive()) {
        println("Hero kalah!")
    } else if (enemyHp <= 0) {
        println("${hero.name} menang!")
    } else {
        println("Hero kabur dari pertarungan.")
    }

    println("Sisa HP Hero  : ${hero.hp}")
    println("Sisa HP Musuh : $enemyHp")

}