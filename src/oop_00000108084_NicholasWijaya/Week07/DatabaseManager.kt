package oop_00000108084_NicholasWijaya.Week07

object DatabaseManager {
    var connectionStatus: String = "Dissconnected"

    fun connect() {
        connectionStatus  = "Connected to Server"
        println("Database is ready")
    }
}