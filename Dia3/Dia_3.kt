package Dia3

/*
 * Ejercicios de ejemplo sobre recursividad
 */

fun multiplica(a: Int, b: Int): Int{
    print("A = $a , B = $b\n")
    if ( b == 0)
        return 0
    else {
        val multi = multiplica(a, b - 1)
        println("Multi = $multi")
        return a + multi
    }
}

fun main() {
    println("Resultado: " + multiplica(2,5))

    print("Resultado: " + 2*5)
}