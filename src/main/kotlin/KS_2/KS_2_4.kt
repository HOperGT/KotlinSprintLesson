package org.example.KS_2

//В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса), который дает +20% к добытым материалам.
// Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.
//
//Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных” (то есть тех материалов, которые даются “сверху” баффом).
// По одной строке на материал с его названием.
//
//Если получается нецелое число, то дробная часть должна отбрасываться.

const val BAFF_EFFECT:Float = 0.2f

fun main(){

    var cristalOre: Byte = 7
    var ironOre: Byte = 11

    var baffCristalOre: Float = cristalOre * BAFF_EFFECT
    var baffIronOre: Float = ironOre * BAFF_EFFECT

    println("BAFF for iron ore: ${baffIronOre.toInt()}\n" +
            "BAFF for cristal ore: ${baffCristalOre.toInt()}")

}