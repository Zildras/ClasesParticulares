package Dia9

import Dia9.Teoria.Colores

/*
 * Ejercicios a resolver sobre varias cosas
 *
 * Ejercicios de clases y enumeraciones
 */

fun main() {
    println("Ejercicio 1:")
    println("Una enumeracion donde tenga una lista con las 10 primeras letras del diccionario")
    println("Ejemplo: (letra, posicion_en_el_diccionario) --> (a, 1), (b,2), ...")

    println("Ejercicio 2:")
    println("Crea una funcion que haga lo siguiente: ")
    println("Introduce la posición de la letra y que obtenga la letra correspondiente, utilizando la enum anterior")
    posicionLetra(2)
    posicionLetra(9)

    println("Ejercicio 3")
    println("Crea una clase padre con la funcion HelloWord y una clase hija con la funcion HelloBarcelona")
    println("Haz pruebas con el polimorfismo y como funciona")

    //De especifico a general se puede.
    val ejercicio3 = ClaseHija()

    ejercicio3.HelloBarcelona()
    ejercicio3.HelloWorld()

    //De general a especifico no se puede.
    val general : ClasePadre = ClaseHija()

    general.HelloWorld()

}

private fun posicionLetra(posicion_en_el_diccionario: Int){
    for (enum in Letras.values()) {
       if (enum.numero == posicion_en_el_diccionario){
           println(enum.letra)
       }
    }
}