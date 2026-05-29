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

        File("orders.csv").appendText(
            "$customerType,$finalPrice,$email\n"
        )
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

// OCP Fix
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        customerType: String,
        amount: Double,
        email: String,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(amount)

        repo.saveOrder(customerType, finalPrice, email)

        notifier.sendNotification(email, finalPrice)
    }
}

fun main() {

    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notifier)

    val vipPricing = VipPricing()
    val regularPricing = RegularPricing()

    processor.processOrder(
        "VIP",
        500000.0,
        "vip@gmail.com",
        vipPricing
    )

    processor.processOrder(
        "Regular",
        300000.0,
        "regular@gmail.com",
        regularPricing
    )
}