package org.example.lesson_2

fun main() {
    val crystalMining: Int = 7
    val ironMining: Int = 11
    val miningBuff: Int = 20

    val crystalBonus = (crystalMining * miningBuff / 100).toInt()
    val ironBonus = (ironMining * miningBuff / 100).toInt()

    println("Кристаллы с баффом: $crystalBonus")
    println("Желелезо с баффом: $ironBonus")
}