package oop_00000108084_NicholasWijaya.Week14
import java.io.File

interface OrderRepository {
    fun saveOrder(customerType: String, finalPrice: Double, email: String)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(
        customerType: String,
        finalPrice: Double,
        email: String
    ) {

        File("orders.csv").bufferedWriter().use { writer ->
            writer.append("$customerType,$finalPrice,$email\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(email: String, finalPrice: Double)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(email: String, finalPrice: Double) {
        println("Sending email to $email for total payment: $finalPrice")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        customerType: String,
        finalPrice: Double,
        email: String
    ) {

        repo.saveOrder(customerType, finalPrice, email)
        notifier.sendNotification(email, finalPrice)
    }
}

fun main() {

    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notifier)

    processor.processOrder(
        "VIP",
        400000.0,
        "customer@gmail.com"
    )
}