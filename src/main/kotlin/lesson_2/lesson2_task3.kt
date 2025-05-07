package org.example.lesson_2

fun main() {
    val startHours: Int = 9
    val startMinutes: Int = 39
    val minutesInWay: Int = 457

    val allMinutes: Int = startMinutes + minutesInWay

    val finishHours: Int = startHours + (allMinutes / 60)
    val finishMinutes: Int = allMinutes % 60

    println("Поезд прибудет в $finishHours:$finishMinutes")
}
