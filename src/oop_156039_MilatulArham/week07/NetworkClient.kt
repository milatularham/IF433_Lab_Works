package oop_156039_MilatulArham.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url ... ")
    }
}