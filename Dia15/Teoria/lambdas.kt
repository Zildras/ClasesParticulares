package Dia15.Teoria

/**
 * @author macarronesc
 *
 * Clase para probar las lambdas
 */
fun main(){

    val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val eCount = "Hello World!".count { char -> char == 'l' }
    println(eCount)

    printLineas()

    items.map { it * it }.forEach { println(it) }
    printLineas()

    items.map { elemento -> elemento % 2 == 0 }.forEach { println(it) }
    printLineas()

    items.filter { it % 3 == 0 }.forEach { println(it) }
    printLineas()

    print(items.last { it % 2 == 0 })
    printLineas()

    print(items.maxOf { maximo -> maximo % 5})
}

fun printLineas() {
    println("\n\n--------------------------------------------------------------\n\n")
}