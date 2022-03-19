package Dia3

/*
 * Ejercicios a resolver sobre bucles
 */

fun main() {
    val listaDeNums = listOf(1,65,83294,12,3,245,34,1,6,999,420,60)
    val listaDeTexto = "Me gusta ir por el campo y observar los caballos como andan por la hierba alta.".split(' ')

    println("Ejercicio 1:")
    println("Suma los números números naturales con un while.")
    sumaRecursiva(listaDeNums)

    println("Ejercicio 2:")
    println("Suma los números números naturales de forma recursiva.")
    sumaFor(listaDeNums)

    println("Ejercicio 3:")
    println("Busca la palabra caballo dentro de listaDeTexto de forma recursiva:")
    buscarPalabra("caballo", listaDeTexto)
}

private fun sumaRecursiva(texto: List<Int>){

}

private fun sumaFor(texto: List<Int>){

}

private fun buscarPalabra(palabra: String, texto: List<String>){

}