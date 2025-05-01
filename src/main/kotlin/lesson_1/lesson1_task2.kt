package org.example.lesson_1

fun main() {
    var countOrders: Int = 75
    val thankMessage: String = "Спасибо, что приобрели товар именно у нас!"

    println("Количество заказов: $countOrders." + " $thankMessage")

    var countEmploees: Int = 2000
//    println("Количество участников: $countEmploees")

    countEmploees = 1999
    println("Обновленное количество участников: $countEmploees")
}