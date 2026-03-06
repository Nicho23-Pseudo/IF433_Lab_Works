package oop_00000108084_NicholasWijaya.Week05

fun main() {

    val wallet = EWallet("Philia", 50000.0)
    val creditCard = CreditCard("Philia", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in payments) {
        payment.proccessPayment(75000.0)
    }
}