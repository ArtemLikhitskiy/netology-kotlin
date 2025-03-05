package com.likhitskiy.netologykotlin

fun main() {
    print("Введите сумму покупок: ")
    val amount: Double = readln().toDouble()

    print("Это постоянный покупатель? ")
    val isRegularCustomer: Boolean = readln().toBoolean()

    val discountedAmount = applyDiscount(amount, isRegularCustomer)

    println("Сумма с учетом скидки: $discountedAmount рублей")

}

fun applyDiscount(purchaseAmount: Double, isRegularCustomer: Boolean): Double {
    val REGULAR_CUSTOMER_DISCOUNT = 0.01 // 1% скидка для постоянных клиентов

    var amountAfterDiscount = when {
        purchaseAmount <= 1000 ->  purchaseAmount // Скидка не предоставляется
        purchaseAmount in 1001.0..10000.0 -> purchaseAmount - 100 // Скидка 100 рублей
        else -> {
            purchaseAmount - purchaseAmount * 0.05 // скидка 5%
        }
    }
    if (isRegularCustomer) {
        amountAfterDiscount -= amountAfterDiscount * REGULAR_CUSTOMER_DISCOUNT
    }
    return amountAfterDiscount
}