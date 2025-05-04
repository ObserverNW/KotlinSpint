package org.example.lesson_4

fun main() {
    val minWeightAverage: Int = 35
    val maxWeightAverage: Int = 100
    val maxVolumeAverage: Int = 100

    val weightFirstItem: Int = 20
    val volumeFirstItem: Int = 80

    val weightSecondItem: Int = 50
    val volumeSecondItem: Int = 100

    println("Груз с весом $weightFirstItem кг и объемом $volumeFirstItem л соответствует категории 'Average':" +
            " ${minWeightAverage < weightFirstItem && maxWeightAverage >= weightFirstItem && maxVolumeAverage > volumeFirstItem}")
    println("Груз с весом $weightSecondItem кг и объемом $volumeSecondItem л соответствует категории 'Average':" +
            " ${minWeightAverage < weightSecondItem && maxWeightAverage >= weightSecondItem && maxVolumeAverage > volumeSecondItem}")
}