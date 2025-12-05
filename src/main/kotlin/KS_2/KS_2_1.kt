package org.example.KS_2

fun main(){

    var midPointer: Float = 0f
    val students: Byte = 4
    val sumPoints: Short = (3 + 4 + 3 + 5).toShort()

    midPointer = sumPoints.toFloat() / students

    print("Среднее арифметическое: $midPointer")

}