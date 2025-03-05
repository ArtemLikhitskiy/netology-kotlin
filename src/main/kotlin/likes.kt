package com.likhitskiy.netologykotlin

fun main() {
    print("Введите количество лайков цифрами: ")
    val likes: Int = readln().toInt()
    val printLikes =
        if (likes == 1 || likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    print("Понравилось $likes $printLikes")
}