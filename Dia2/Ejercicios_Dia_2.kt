package Dia2

/*
 * Ejercicios a resolver sobre bucles
 */

fun main() {
    var texto = "En un lugar de la Mancha, de cuyo nombre no " +
            "quiero acordarme, no ha mucho tiempo que vivía " +
            "un hidalgo de los de lanza en astillero, adarga " +
            "antigua, rocín flaco y galgo corredor. Una olla " +
            "de algo más vaca que carnero, salpicón las más " +
            "noches, duelos y quebrantos los sábados, lantejas " +
            "los viernes, algún palomino de añadidura los domingos, " +
            "consumían las tres cuartas partes de su hacienda."

    println("Ejercicio 1:")
    println("Dado un texto (texto) como harias para imprimir cada palabra por separado (\\n) con un bucle for:")
    imprimirPalabras(texto)

    println("Ejercicio 2:")
    println("Dado un texto (texto) como harias para imprimir las 10 primeras palabras por separado (\\n) con un bucle for:")
    imprimirPalabras2(texto, 10)

    println("Ejercicio 3:")
    println("Como harias lo mismo con un bucle while (2):")
    imprimirPalabras3(texto, 10)
}

private fun imprimirPalabras(texto: String){

    val transicion = texto.split( " ")
    for (caracter in transicion){
        println(caracter)
    }
}

private fun imprimirPalabras2(texto: String, numeroPalabras: Int){
    // Creamos una lista de 10 posiciones la llenamos con las 10 primeras palabras
    // Hacemos le mismo bucle que el ej 1, pero con un contador y cuando el contador llegue al mismo valor que numPalbras salga

    /*var listaPalabras = texto.split(' ')
    var contador = 0

    for (i in numeroPalabras){
        println(listaPalabras[contador])
        contador++
    }*/
}

private fun imprimirPalabras3(texto: String, numeroPalabras: Int){

    var listaPalabras = texto.split(' ')
    var contador = 0

    while (contador != numeroPalabras){
        println(listaPalabras[contador])
        contador++
    }
}