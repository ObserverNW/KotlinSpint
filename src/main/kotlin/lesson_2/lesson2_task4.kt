package org.example.lesson_2

fun main() {

    val crystalMining: Int = 7
    val ironMining: Int = 11
    val miningBuff: Float = 0.20f

    val crystalBonus = (crystalMining * miningBuff).toInt()
    val ironBonus = (ironMining * miningBuff).toInt()

    println("Кристаллы с баффом: $crystalBonus")
    println("Желелезо с баффом: $ironBonus")
}