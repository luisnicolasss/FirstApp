package com.example.androidmaster

fun main() {


    //Indice: 0-6
    //Tamaño: 7
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(weekDays[2])
    println(weekDays.size)

    //Modificar valores
    weekDays[0] = "Hola"
    println(weekDays[0])

    //Bucles para Array
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        println("La posición $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}