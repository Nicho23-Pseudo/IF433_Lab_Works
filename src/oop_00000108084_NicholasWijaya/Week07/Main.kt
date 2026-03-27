package oop_00000108084_NicholasWijaya.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 23)
    println(data1) // Otomatis readable format
    println("sama? ${data1 == data2}") // True (Structural Equality)
}