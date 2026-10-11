package oop_156039_MilatulArham.week07

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE URL: $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }
    fun connect() {
        println("Connecting to $url ... ")
    }
}