package org.example.KS_2

fun main(){

    var midPointer: Float = 0f
    val students: Byte = 4
    val pointStud_1: Byte = 3
    val pointStud_2: Byte = 4
    val pointStud_3: Byte = 3
    val pointStud_4: Byte = 5
    val sumPoints: Short = (pointStud_1 + pointStud_2 + pointStud_3 + pointStud_4).toShort()

    midPointer = sumPoints.toFloat() / students

    print("Среднее арифметическое: $midPointer")

}