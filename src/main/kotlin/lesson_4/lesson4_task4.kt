package org.example.lesson_4

fun main() {

    val dayTraining: Int = 5
    val evenDay: Boolean = (dayTraining % 2) == 1

    println("Упражнения для рук: $evenDay \n" +
            "Упражнения для ног: ${!evenDay} \n" +
            "Упражнения для спины: ${!evenDay} \n" +
            "Упражнения для пресса: $evenDay \n")
}