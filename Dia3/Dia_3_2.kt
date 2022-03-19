package Dia3

/*
 * Ejercicios de ejemplo sobre recursividad
 */

fun imprimirCançoPomesRecursivo(pomes: Int): Int{
    //println(pomes)

    if(pomes==0)
        return 0
    imprimirEstrofa(pomes)
    return imprimirCançoPomesRecursivo(pomes-1)
    //return pomes + imprimirCançoPomes(pomes - 1)
}

fun imprimirEstrofa(pomas: Int) {
    println("Estrofa $pomas")
}

fun imprimirCançoPomes(pomes: Int): Int {
    var pomesAux = pomes
    while (pomesAux != 0) {
        imprimirEstrofa(pomesAux);
        pomesAux--
    }
    return pomesAux
}

fun main() {
    println("Recursividad: " + imprimirCançoPomesRecursivo(10) + "\n")
    print("While: " + imprimirCançoPomes(10))
}