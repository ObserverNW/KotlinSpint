package org.example.lesson_2

fun main() {

    val employees: Int = 50
    val wageEmploy: Int = 30000

    val interns: Int = 30
    val wageIntern: Int = 20000

    val employeeExpenses: Int = employees*wageEmploy
    println("Расходы на выплату зарплаты постоянных сотрудников: $employeeExpenses")

    val generalExpenses: Int = employeeExpenses + (interns*wageIntern)
    println("Общие расходы по ЗП после прихода стажеров: $generalExpenses")

    val averageWage: Int = generalExpenses/(employees+interns)
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageWage")
}