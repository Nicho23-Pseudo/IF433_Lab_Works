package oop_00000108084_NicholasWijaya.Week14
import java.io.File

class BadOrderProcessor {

    fun processOrder(customerType: String, amount: Double, email: String) {

        // OCP Violation
        val finalPrice = when (customerType) {
            "VIP" -> amount * 0.8
            "Regular" -> amount
            else -> amount
        }

        // DIP + SRP Violation
        File("orders.csv").appendText("$customerType,$finalPrice,$email\n")

        // SRP Violation
        println("Sending email to $email for total payment: $finalPrice")
    }
}

fun main() {
    val processor = BadOrderProcessor()
    processor.processOrder("VIP", 500000.0, "customer@gmail.com")
}