package oop_00000108084_NicholasWijaya.Week09

import javax.swing.text.Position

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)