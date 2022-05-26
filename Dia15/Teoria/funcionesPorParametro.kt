package Dia15.Teoria

/**
 * @author macarronesc
 *
 * Clase para probar las funciones por parametro
 */
fun main(){
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call


    print("\n\n--------------------------------------------------------------\n\n")


    fun principal(texto: String, funcion:(String) -> Unit) {
        funcion(texto)
    }

    fun textoNormal(texto: String) {
        println("El texto es: $texto")
    }

    fun textoReverso(texto: String) {
        println("El texto reverso es: ${texto.reversed()}")
    }

    principal("Hello World!", ::textoNormal)
    principal("Hello World!", ::textoReverso)

}