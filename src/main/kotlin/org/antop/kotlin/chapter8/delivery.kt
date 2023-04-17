package org.antop.kotlin.chapter8

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    return when (delivery) {
        Delivery.STANDARD -> { order -> (21 * order.itemCount) / 10.0 }
        Delivery.EXPEDITED -> { order -> (60 + (21 * order.itemCount)) / 10.0 }
    }
}

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}") // 12.3
}
