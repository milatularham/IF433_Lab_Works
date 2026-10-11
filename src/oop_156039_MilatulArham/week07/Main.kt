package oop_156039_MilatulArham.week07

fun main() {
    println(" === TEST SINGLETON === ")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT === ")
    val client = NetworkClient.createClient()
    client.connect()
}