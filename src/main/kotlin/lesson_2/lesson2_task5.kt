package org.example.lesson_2

import java.util.*

fun main() {

    val deposit: Int = 70000
    val percent: Double = 0.167
    val years: Int = 20;

    val finalDeposit = (deposit * Math.pow(1+percent, years.toDouble()))
//    Долго разбирался, почему не через точку выводится
    println("%.3f".format(Locale.US, finalDeposit))

}