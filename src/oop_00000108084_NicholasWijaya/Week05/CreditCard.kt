package oop_00000108084_NicholasWijaya.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun proccessPayment(amount: Double) {
        if (amount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil membayar $amount menggunakan credit card")
        } else {
            println("$accountName Transaksi ditolak, melebihi limit")
        }
    }
}