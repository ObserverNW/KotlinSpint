package org.example.lesson_2

fun main() {
    val startHours: Int = 9
    val startMinutes: Int = 39
    val minutesInWay: Int = 457

    val allMinutes: Int = startMinutes + minutesInWay

    val finishHours: Int = startHours + (allMinutes / SEC_IN_MIN)
    val finishMinutes: Int = allMinutes % SEC_IN_MIN

    println("Поезд прибудет в $finishHours:$finishMinutes")
}

const val SEC_IN_MIN: Int = 60
