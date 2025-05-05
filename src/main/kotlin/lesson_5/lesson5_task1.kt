package org.example.lesson_5

fun main() {
    println("Введите результат сложения: 999 + 1001 = ?")
    val isUserResponse: Int = readln().toInt()
    val resultText = if (isUserResponse == TRUE_NUMBER)
        "Добро пожаловать!"
    else
        "Доступ запрещен."
    println(resultText)
}
const val TRUE_NUMBER: Int = 2000