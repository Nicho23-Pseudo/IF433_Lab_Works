package oop_00000108084_NicholasWijaya.Week05

class EWallet(accountname: String, var balance: Double) : PaymentMethod(accountname) {
    override fun proccessPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar $amount, Sisa saldo: $balance")
        } else {
            println("$accountName: Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName top up sebesar $amount, Saldo sekarang: $balance")
    }
}