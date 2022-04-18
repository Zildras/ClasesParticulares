package Dia6

/*
 * Ejercicios a resolver sobre varias cosas
 *
 * Ejercicios de bucles y clases
 */

fun main() {
    val numeros = (1..100).toList()

    println("Ejercicio 1:")
    println("Escribe una función a la cual se le pasará por parametro una lista de números.")
    println("Su objetivo es que cuando encuentre un numero par (divisible entre 2) imprima por pantalla la palabra 'par'")
    imprimirPares(numeros)

    println("Ejercicio 2:")
    println("Implementa lo del ejercicio 1 pero en la clase 'Clase_Aux_Ejercicios_Dia_5', quiero que se pueda usar la función en este main")

    val claseNumeros = Clase_Aux_Ejercicios_Dia_5()

    claseNumeros.imprimirPares(numeros)

    println("Ejercicio 3")
    println("Quiero poder pasarle a esa clase la lista de los numeros pares y luego leerlo desde este main")

    val claseListas = Clase_Aux_Ejercicios_Dia_5()

    claseListas.setLista(numeros)
    println(claseListas.getLista())
}

private fun imprimirPares(listaNumeros: List<Int>){
    // Acuerdate de la estructura cuando empezamos a hacer una función nueva.

    for (num in listaNumeros){
        if (num % 2 == 0){
            println("$num es par")
        }
        else{
            println("$num es impar")
        }
    }
}
