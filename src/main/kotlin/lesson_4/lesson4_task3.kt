package org.example.lesson_4

fun main() {
    val isWeatherSunny: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val currentTime: String = "winter"

    val checkAllPoints = isWeatherSunny == WEATHER && isTentOpen == OPEN_TENT
                            && airHumidity == HUMIDITY && currentTime != NOT_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $checkAllPoints")
}

const val WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val HUMIDITY: Int = 20
const val NOT_SEASON: String = "winter"