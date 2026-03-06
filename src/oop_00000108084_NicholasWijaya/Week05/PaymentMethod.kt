package oop_00000108084_NicholasWijaya.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun proccessPayment(amount: Double)
}