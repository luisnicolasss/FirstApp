package com.example.androidmaster

val age: Int = 30 //Variable global

fun main() {
    showMyName() //Funcion vacia
    showMyAge(28) //Funcion con parametro de entrada
    add(25, 76)
    val mySubtract = subtract(10, 5) //Funcion con parametro de salida
    println(mySubtract)
}

fun showMyName() {
    println("Me llamo Luis")
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber



fun variablesAlfanumericas() {

    /**
     * Variables Alfanuméricas
     */

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "Luis"
    val stringExample2 = "Luis"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample y tengo $age años"
    println(stringConcatenada)
    var example123: String = age.toString()

}

fun variablesBooleanas() {
    /**
     * Variables Booleanas
     */

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
}

fun variablesNumericas() {
    /**
     * Variables Numéricas
     */


    //Int -2,147,483,647 a 2,147,483,647

    var age2: Int = 30
    age2 = 29


    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.32313123

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Division:")
    println(age / age2)

    println("Modulo:")
    println(age % age2)

}