package org.example.lesson_3

fun main() {
    val userName: String = "TestUser"
    var greeting: String = ""

    greeting = "Доброе утро, $userName!"
    println(greeting)

    greeting = "Добрый вечер, $userName!"
    println(greeting)
}