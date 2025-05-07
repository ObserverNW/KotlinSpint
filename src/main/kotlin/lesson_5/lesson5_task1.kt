package org.example.lesson_5

fun main() {
    println("Введите результат сложения: $FIRST_NUMBER + $SECOND_NUMBER = ?")
    val isUserResponse: Int = readln().toInt()
    val resultText = if (isUserResponse == (FIRST_NUMBER + SECOND_NUMBER))
        "Добро пожаловать!"
    else
        "Доступ запрещен."
    println(resultText)
}
const val FIRST_NUMBER: Int = 999
const val SECOND_NUMBER: Int = 1001