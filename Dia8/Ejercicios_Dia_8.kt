package Dia8

/*
 * Ejercicios a resolver sobre varias cosas
 *
 * Ejercicios de clases, init, y herencia
 */

fun main() {
    val numeros = (1..100).toList()

    println("Ejercicio 1:")
    println("Crea una clase donde se le puedan pasar 1 lista y compruebe si está vacia")
    println("Si está vacia salte error y detenga la ejecución")
    val listaVacia = emptyList<Int>()

    val claseOriol = ClaseOriol(listaVacia)

    val claseOriolNum = ClaseOriol(numeros)

    println("Ejercicio 2:")
    println("Si no está vacia quiero que la recorras y busques el valor 5, si existe que imprima por pantalla 'EXITO'")
    val lista2 = (1..100).toList()

    val ejercicio2 = ClaseOriol(numeros)

    ejercicio2.recorrerLista(numeros)

    println("Ejercicio 3")
    println("Haz que una clase hija herede de esa clase padre y ejecute la funcion (Lo mismo que el anterior dia)")
    //val claseHijaCreadaPorTi = ClaseHijaCreadaPorTi(lista)
    //claseHijaCreadaPorTi.funcionCreadaPorTi(lista2)

    val ejercicio3 = ClaseOriolHija(numeros)

    ejercicio3.recorrerLista(numeros)
}