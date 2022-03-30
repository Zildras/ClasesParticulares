package Dia3

/*
 * Ejercicios a resolver sobre bucles
 */

fun main() {
    var listaDeNums = listOf(1,65,83294,12,3,245,34,1,6,999,420,60)
    var listaDeTexto = "Me gusta ir por el campo y observar los caballos como andan por la hierba alta.".split(' ')

    println("Ejercicio 1:")
    println("Suma los números naturales con un while.")
    sumaWhile(listaDeNums)

    println("Ejercicio 2:")
    println("Suma los números números naturales de forma recursiva.")
    println(sumaRecursiva(listaDeNums))

    println("Ejercicio 3:")
    println("Busca la palabra caballo dentro de listaDeTexto con while:")
    // Tienes que tener en cuenta que puedo poner una palabra que no esté en el texto
    buscarPalabraWhile("caballo", listaDeTexto)

    println("Ejercicio 4:")
    println("Busca la palabra caballo dentro de listaDeTexto con un for:")
    buscarPalabraFor("caballo", listaDeTexto)

    println("Ejercicio 5:")
    println("Busca la palabra caballo dentro de listaDeTexto de forma recursiva:")
    //buscarPalabraRecursivo("caballo", listaDeTexto)
}

private fun sumaWhile(lista: List<Int>){
    // i = posicion de la lista en la que estamos
    var i = 0
    // suma = donde vamos haciendo la suma
    var suma = 0

    // 1. Recorremos la lista
    // 2. Cogemos el cada elemento de la lista en la posicion "i"
    // 3. Hacemos la suma por cada valor de la lista
    // 4. Imprimimos el valor
    while (i != lista.size){
        suma += lista[i]
        i++
    }
    println(suma)
}

private fun sumaRecursiva(lista: List<Int>): Int{
    if (lista.isEmpty())
        return 0

    val primerElemento = lista[0]
    // lista.lastIndex + 1 = es porque si no hicieramos el + 1 cogeria el
    // penultimo elemento y no el ultimo que es lo que queremos
    val listaAuxilar = lista.subList(1, lista.lastIndex+1)

    return primerElemento + sumaRecursiva(listaAuxilar)
}

/*fun imprimirCançoPomesRecursivo(pomes: Int): Int{
    if(pomes==0)
        return 0
    return pomes + imprimirCançoPomes(pomes - 1)
}
fun imprimirCançoPomes(pomes: Int): Int {
    var pomesAux = pomes
    while (pomesAux != 0) {
        imprimirEstrofa(pomesAux);
        pomesAux--
    }
    return pomesAux
}*/

private fun buscarPalabraWhile(palabra: String, texto: List<String>){

    var contador = 0

    while (palabra != texto[contador] && contador +1 != texto.size){
        contador++
    }

    if (contador +1 == texto.size){
        println("Ya no hay mas información en la lista")
    } else{
        println("palabra encontrada: $palabra")
    }
}

private fun buscarPalabraFor(palabra: String, texto: List<String>){

    var verdadero = true

    for (i in texto){
        if (i == palabra){
            verdadero = false
        }
    }

    if (verdadero == true){
        println("palabra no encontrada")
    } else{
        println("palabra encontrada: $palabra")
    }

}

private fun buscarPalabraRecursivo(palabra: String, texto: List<String>){
//preguntar en clase si hay que hacer recursividad.
}