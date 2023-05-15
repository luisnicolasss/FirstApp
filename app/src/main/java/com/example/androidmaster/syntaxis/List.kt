package com.example.androidmaster

fun main() {
  inmutableList()
  mutableList()
}

fun mutableList() {
    val weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(0,"AristiDay")
    println(weekDays)

    if (weekDays.isEmpty()){
        //No voy a pintar nada
    } else {
        weekDays.forEach { it }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { it }
    }

    weekDays.last()
}

fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }

}