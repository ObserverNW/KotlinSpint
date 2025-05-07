package org.example.lesson_5

fun main() {
    println("Введите первое число: ")
    val firstNumber = readln().toInt()
    println("Введите второе число: ")
    val secondNumber = readln().toInt()

    val resultText = if ((firstNumber == FIRST_NUMBER_1 || firstNumber == SECOND_NUMBER_1) &&
        (secondNumber == FIRST_NUMBER_1 || secondNumber == SECOND_NUMBER_1))
    {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((firstNumber == FIRST_NUMBER_1 || firstNumber == SECOND_NUMBER_1) ||
        (secondNumber == FIRST_NUMBER_1 || secondNumber == SECOND_NUMBER_1))
    {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(resultText)
}
const val FIRST_NUMBER_1: Int = 40
const val SECOND_NUMBER_1: Int = 41