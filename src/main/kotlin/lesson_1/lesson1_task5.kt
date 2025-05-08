package org.example.lesson_1

fun main() {
    val allSeconds: Int = 6480

    val hoursInSpace: Int = allSeconds / (secInMin * secInMin)
    val remainingSeconds: Int = allSeconds % (secInMin * secInMin)

    val minutesInSpace: Int = remainingSeconds / secInMin
    val secondsInSpace: Int = remainingSeconds % secInMin


    println("[%02d:%02d:%02d]".format(hoursInSpace, minutesInSpace, secondsInSpace))

}
const val secInMin = 60