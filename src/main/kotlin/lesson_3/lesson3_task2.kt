package org.example.lesson_3

fun main() {
    var surName: String = "Андреева"
    val name: String = "Татьяна"
    val lastName: String = "Сергеевна"
    var age: Int = 20

    println("[$surName $name $lastName, $age]")

    surName = "Сидорова"
    age = 22

    println("[$surName $name $lastName, $age]")
}