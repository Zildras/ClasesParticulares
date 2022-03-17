package Dia2

import java.util.*

/*
 * Ejercicios de ejemplo sobre bucles y scanners
 */

fun main() {
    val scanner = Scanner(System.`in`)

    var palabra = scanner.nextLine()

    while (palabra != "exit") {
        println("La palabra es: $palabra")

        palabra = scanner.nextLine()
    }

    println("La palabra es exit, adios.\n")

    //imprimir_for()
}

private fun imprimir_for(){
    for (i in 4 downTo 1) println(i)
    println("\n")

    for (i in 1..8 step 2) println(i)
    println("\n")

    for (i in 8 downTo 1 step 2) println(i)
    println("\n")

    for (i in 1 until 10) {
        println(i)
    }
    // No tenemos que poner return ni especificar el tipo de dato nada porque no devolvemos nada
}

/*fun main() {
    val scanner = Scanner(System.`in`)
    //imprimir_for()
    println("Introduce un numero: ")
    var numero = scanner.nextInt()

    while (numero != 10) {
        println("El numero es: $numero")
        println("¿Qué valor quieres sumarle?")

        numero += scanner.nextInt()
    }

    println("Es el numero 10, adios.")
}*/