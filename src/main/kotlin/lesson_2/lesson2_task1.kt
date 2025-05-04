package org.example.lesson_2

fun main() {
    val firstMark: Int = 3
    val secondMark: Int = 4
    val thirdMark: Int = 3
    val fourthMark: Int = 5

    val orderStudents: Int = 4

    val averageNum: Float = (firstMark + secondMark + thirdMark + fourthMark) / orderStudents.toFloat()

    print(averageNum)
}