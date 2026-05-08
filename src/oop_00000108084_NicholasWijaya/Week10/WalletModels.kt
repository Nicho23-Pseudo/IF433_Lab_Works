package oop_00000108084_NicholasWijaya.Week10

data class Coin(
    override val name: String,
    val balance: Double
) : NamedEntity

data class Transaction(
    val id: String,
    val amount: Double
)