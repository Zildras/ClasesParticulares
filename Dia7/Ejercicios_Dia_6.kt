package Dia7

/*
 * Ejercicios a resolver sobre varias cosas
 *
 * Ejercicios de bucles y clases
 */

fun main() {
    val numeros = (1..100).toList()

    println("Ejercicio 1:")
    println("Escribe una función a la cual se le pasará por parametro una lista de números.")
    println("su objetivo es que lea cada caracter, lo multiplique por 10 y lo meta en otra lista que será el return")
    println(multiplicarLista(numeros))

    println("Ejercicio 2:")
    println("Implementa lo del ejercicio 1 pero en la clase 'Clase_Aux_Ejercicios_Dia_6', quiero que se pueda usar la función en este main")

    val claseMultiplicacio = Clase_Aux_Ejercicios_Dia_6()

    println(claseMultiplicacio.multiplicarLista(numeros))

    println("Ejercicio 3")
    println("Quiero que crees otra clase llamada Clase_Hija y que esta herede de su clase padre (Clase_Aux_Ejercicios_Dia_6) sus funciones")
    println("Quiero que despues de todo esto llames a la funcion implementada anteriormente desde la clase hija")
    //prinln(funcion(numeros))

    val claseHija = Clase_Hija()

    println(claseHija.multiplicarLista(numeros))
}

private fun multiplicarLista(listaNumeros: List<Int>) : List<Int>{
    // Acuerdate de la estructura cuando empezamos a hacer una función nueva.

   val listaAuxiliar = mutableListOf<Int>()

    for (num in listaNumeros){
        listaAuxiliar.add(num*10)
    }

    return listaAuxiliar
}

