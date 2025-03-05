package com.likhitskiy.netologykotlin

import kotlin.math.max

fun main() {
    print("Введите цифрами сумму перевода в рублях: ")
    val amount: Int = readln().toInt()

    val commission = max((amount * 0.0075), 35.0);

    print("Размер комиссии: ")
    print(commission)
    println()
}