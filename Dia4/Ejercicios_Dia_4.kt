package Dia4

/*
 * Ejercicios a resolver sobre varias cosas
 *
 * Libre elección de bucles, puede ser con while, do while, for o recursividad
 */

fun main() {
    val listaChars = listOf('k', 'o', 't', 'l', 'i', 'n')
    val listaDeNums = listOf(1,2,3,4,5,6,7,8,9,10)

    println("Ejercicio 1:")
    println("Concatena todos los chars formando una palabra final (libre elección).")
    formarPalabras(listaChars)

    println("Ejercicio 2:")
    println("Devuelveme una lista con los numeros invertidos (el 1º en la última posición, el 2º en la penúltima...).")
    println(listaInvertida(listaDeNums))

    println("Ejercicio 3:")
    println("Comprueba si la palabra pasada por parametro es palindroma.")
    println("**Una palabra palindroma es aquella que se puede leer de izquierda a derecha y de derecha a izquierda y se lee igual.")
    esPalindroma("caballo")
    esPalindroma("reconocer")
    esPalindroma("cuc")
}

private fun formarPalabras(llistaChars: List<Char>){
    // Tendrás que ir leyendo toda la lista y ir añadiendo todos los caracteres leidos en un String que tendrás

    val charList = charArrayOf('o','r','i','o','l')
    val string = String(charList)
    println(string)

}

private fun listaInvertida(llistaDeNums: List<Int>): List<Int>{
    // Tendras que crear una nueva lista y ir añadiendo en esa nueva lista desde la última posición a la primera
    // Necesitaras un bucle (o no) para recorrer la lista de nums

    return llistaDeNums.reversed()
}

private fun esPalindroma(palabra: String){
    // Necesitaras convertir tu palabra en una lista y comprobar si tu 1ª posición es igual que la última, la 2º con la penúltima, ...
    var string  = palabra.toList()
}