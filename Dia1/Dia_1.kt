package Dia1

/*
 *
 * Comentarios
 *
 */

fun main() {
    var i = 0

    while (i != 10) {
        println(i)

        if (i % 2 == 0) {
            println("Par")
            //break
        }
        else
            println("Impar")

        i++  // = i = i + 1
    }
}