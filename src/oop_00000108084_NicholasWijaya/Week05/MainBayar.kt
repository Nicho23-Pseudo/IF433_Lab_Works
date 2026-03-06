package oop_00000108084_NicholasWijaya.Week05

fun main() {

    val wallet = EWallet("Philia", 50000.0)
    val creditCard = CreditCard("Philia", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in payments) {
        payment.proccessPayment(75000.0)

        if (payment is EWallet) {
            println("Saldo tidak cukup, melakukan top up...")
            payment.topUp(50000.0)
            payment.proccessPayment(75000.0)
        }

        println()
    }
}