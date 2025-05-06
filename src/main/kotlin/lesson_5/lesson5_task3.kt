package org.example.lesson_5

fun main() {
    println("Введите первое число: ")
    val firstNumber = readln().toInt()
    println("Введите второе число: ")
    val secondNumber = readln().toInt()

    val resultText = if ((firstNumber == FIRST_NUMBER || firstNumber == SECOND_NUMBER) &&
        (secondNumber == FIRST_NUMBER || secondNumber == SECOND_NUMBER))
    {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((firstNumber == FIRST_NUMBER || firstNumber == SECOND_NUMBER) ||
        (secondNumber == FIRST_NUMBER || secondNumber == SECOND_NUMBER))
    {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(resultText)
}

const val FIRST_NUMBER: Int = 40
const val SECOND_NUMBER: Int = 41