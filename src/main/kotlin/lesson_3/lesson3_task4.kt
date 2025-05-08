package org.example.lesson_3

fun main() {
    var startPoint: String = "E2"
    var finishPoint: String = "E4"
    var numMove: Int = 1

    val moveString: String = "[$startPoint-$finishPoint;$numMove]"
    println(moveString)

    startPoint = "D2"
    finishPoint = "D3"
    numMove++

    val newMoveString: String = "[$startPoint-$finishPoint;$numMove]"
    println(newMoveString)
}