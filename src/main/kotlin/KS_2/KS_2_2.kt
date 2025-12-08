package org.example.KS_2

fun main() {

    val employeeCount = 50
    val employeeSalary = 30_000

    val junCount = 30
    val junSalary = 20_000

    val totalSalaryEmployees = employeeCount * employeeSalary
    val totalSalaryTrainees = junCount * junSalary
    val totalSalaryAllEmployees = totalSalaryEmployees + totalSalaryTrainees

    val totalEmployeeCount = employeeCount + junCount
    val averageSalaryPerEmployee = totalSalaryAllEmployees.toDouble() / totalEmployeeCount

    println(
        "Расходы на постоянных сотрудников: ${totalSalaryEmployees} ₽\n" +
        "Общие расходы по зарплате: ${totalSalaryAllEmployees} ₽\n" +
        "Средняя зарплата на сотрудника: ${averageSalaryPerEmployee.toInt()} ₽"
    )
}