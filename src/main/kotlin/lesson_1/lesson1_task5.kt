package org.example.lesson_1

fun main() {
    val allSeconds: Int = 6480

    val hoursInSpace: Int = allSeconds / (SEC_IN_MIN * SEC_IN_MIN)
    val remainingSeconds: Int = allSeconds % (SEC_IN_MIN * SEC_IN_MIN)

    val minutesInSpace: Int = remainingSeconds / SEC_IN_MIN
    val secondsInSpace: Int = remainingSeconds % SEC_IN_MIN


    println("[%02d:%02d:%02d]".format(hoursInSpace, minutesInSpace, secondsInSpace))

}
const val SEC_IN_MIN = 60