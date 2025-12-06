package org.example.KS_2

const val UNIT_TIME = 60

fun main() {
    val startHour = 9
    val startMinute = 39
    val journeyTimeInMinutes = 457


    val totalMinutes = startHour * UNIT_TIME + startMinute + journeyTimeInMinutes


    val arrivalHour = totalMinutes / UNIT_TIME
    val arrivalMinute = totalMinutes % UNIT_TIME


    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}