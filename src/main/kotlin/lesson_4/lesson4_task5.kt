package org.example.lesson_4

fun main() {
    print("Корабль поврежден: ")
    val isDamageShip: Boolean = readln().toBoolean()
    print("Количество пассажиров: ")
    val orderPassenger: Int = readln().toInt()
    print("Количество провизии: ")
    val boxOfProvisions: Int = readln().toInt()
    print("Благоприятная погода: ")
    val isGoodWeather: Boolean = readln().toBoolean()

    val checkShipForSea: Boolean = (IS_DAMAGE_SHIP == isDamageShip &&
            orderPassenger in MIN_ORDER_PASSENGER.. MAX_ORDER_PASSENGER &&
            boxOfProvisions > BOX_OF_PROVISIONS) ||
            (ALT_ORDER_PASSENGER == orderPassenger &&
             ALT_BOX_OF_PROVISIONS <= boxOfProvisions &&
            GOOD_WEATHER == isGoodWeather)

    println("Готовность корабля отправиться в плавание: $checkShipForSea")

}
const val IS_DAMAGE_SHIP: Boolean = false
const val MIN_ORDER_PASSENGER: Int = 55
const val MAX_ORDER_PASSENGER: Int = 70
const val BOX_OF_PROVISIONS: Int = 50

const val ALT_ORDER_PASSENGER: Int = 70
const val ALT_BOX_OF_PROVISIONS: Int = 50
const val GOOD_WEATHER: Boolean = true