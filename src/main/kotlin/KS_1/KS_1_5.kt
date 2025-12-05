package org.example.KS_1

fun main(){
    var second: Short
    var hour: Byte
    var minute: Byte
    val TIME_UNIT: Byte = 60

    second = 6480
    hour = (second / (TIME_UNIT*TIME_UNIT)).toByte()
    minute = ((second % (TIME_UNIT*TIME_UNIT)) / TIME_UNIT).toByte()
    second = (second % TIME_UNIT).toShort()
    print("%02d:%02d:%02d".format(hour, minute, second))

}