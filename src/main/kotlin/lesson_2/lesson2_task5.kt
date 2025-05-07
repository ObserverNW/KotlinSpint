package org.example.lesson_2

import java.util.*

fun main() {

    val deposit: Int = 70000
    val percent: Double = 16.7
    val years: Int = 20;

    val finalDeposit = deposit * Math.pow(1 + percent / 100, years.toDouble())

    println("%.3f".format(Locale.US, finalDeposit))
}