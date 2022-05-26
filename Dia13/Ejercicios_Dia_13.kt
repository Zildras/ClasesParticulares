package Dia13

/**
 * Ejercicios para practicas clases abstractas y interficies.
 *
 * Apuntes:
 * Documentación: Oriol/app/build/dokka/html/index.html
 * Test: Oriol/app/src/test/java/com.macarronesc.oriol/dia13.Teoria/OperacionesTest
 *
 * To make docu: ./gradlew dokkaHtml dokkaHtmlMultiModule
 */

fun main() {
    println("Ejercicio 1:")
    println("Crea una clase abstracta que tenga 2 metodos.")
    println("Metodo 1: Nos permite leer una lista de Strings y buscar una palabra.")
    println("fun metodo1(palabra: String, listaPalabras: List<String>){}")

    println("Metodo 2 (abstracto): Nos permite añadir una palabra a una lista de Strings")
    println("fun metodo2(palabra: String, listaPalabras: List<String>)")

    println("Crea una clase hija que here de la clase abstracta y utilice esos 2 metodos.")

    val lista = listOf<String>("agua, jabon, perro, silla, ventana, cielo")
    val palabra = "silla"



    println("Ejercicio 2:")
    println("Haz lo mismo que el ejercicio anterior pero con interficies.")
    val listaInterficie = listOf<String>("baño, carretera, universidad, manzana, unicornio")
    val palabraInterficie = "carretera"
}