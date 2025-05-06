package org.example.lesson_5

fun main() {
    println("Введите год рождения: ")
    val userYear = readln().toInt()
    val userAge: Int = 2025 - userYear
    val resultText = if (userAge >= AGE_18)
        "Показать экран со скрытым контентом"
    else
        "Контент недоступен"
    println(resultText)
}
const val AGE_18: Int = 18