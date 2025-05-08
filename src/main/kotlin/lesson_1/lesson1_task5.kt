package org.example.lesson_1

fun main() {
    val allSeconds: Int = 6480

    val hoursInSpace: Int = allSeconds / 3600
    val remainingSeconds: Int = allSeconds % 3600

    val minutesInSpace: Int = remainingSeconds / 60
    val secondsInSpace: Int = remainingSeconds % 60

    val formatHours: String = String.format("%02d", hoursInSpace)
    val formatMinutes: String = String.format("%02d", minutesInSpace)
    val formatSeconds: String = String.format("%02d", secondsInSpace)

    println("[$formatHours:$formatMinutes:$formatSeconds]")
}