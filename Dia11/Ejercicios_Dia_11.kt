package Dia11

/**
 *
 *
 * Ejercicios a resolver sobre varias cosas
 *
 * Ejercicios de clases y listas
 */

fun main() {
    println("Ejercicio 1:")
    println("Crea una clase donde tengamos un metodo que cuente cuantos numeros son mayores que 100 y lo imprima por pantalla")
    val listaNums1 = listOf(1..200 step 2)
    val listaNums2 = listOf(50..150)

    val ejercicio1 = ClaseOriol()

    //ejercicio1.contarNum(listaNums1)
    //ejercicio1.contarNum(listaNums2)

    println("Ejercicio 2:")
    println("Haz una clase hija de la clase creada anteriormente.")
    println("Esta clase tendrá otro metodo más donde mirará en la lista que le pasemos por parametro cuantos numeros son menores de 100")
    val listaNums3 = listOf(200 downTo 1 step 2)
    val listaNums4 = listOf(150 downTo 50)

    val ejercicio2 = ClaseHijaDeOriol()

    //ejercicio2.menoresDe100(listaNums3)
    //ejercicio2.menoresDe100(listaNums4)
}