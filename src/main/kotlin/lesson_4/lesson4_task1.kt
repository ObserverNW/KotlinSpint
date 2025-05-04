package org.example.lesson_4

fun main() {
    val bookingTableToday: Int = 13
    val bookingTableTomorrow: Int = 9

    println("[Доступность столиков на сегодня: ${ALL_TABLE > bookingTableToday}]," +
            "\n[Доступность столиков на завтра: ${ALL_TABLE  > bookingTableTomorrow}].")
}

const val ALL_TABLE: Int = 13