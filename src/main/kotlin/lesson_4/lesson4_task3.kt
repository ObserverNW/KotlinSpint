package org.example.lesson_4

fun main() {

    val sunWeather: Boolean = true
    val openTent: Boolean = true
    val airHumidity: Int = 20
    val currentTime: String = "winter"

    val checkAllPoints = sunWeather && openTent && airHumidity == 20 && currentTime != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? $checkAllPoints")



}