package Dia14

import java.util.*
import kotlin.io.path.Path

/**
 * @author macarronesc
 *
 * Ejercicios sobre lectura de ficheros de texto y clases.
 */
fun main(){
    println("Ejercicio 1:")
    println("Crea un metodo en este main que haga la lectura del fichero de texto y muestra el contenido en pantalla")
    println("Quiero que busques una palabra y devuelva el número de veces que aparece")


    println("Ejercicio 2:")
    println("Quiero que hagas un testing de ese metodo")
    println("Quiero que al menos 1 test esté bien y al menos 1 mal")

    println("Ejercicio 3:")
    println("Quiero que hagas una clase que tenga un metodo que:")
    println("Haga la lectura del fichero de texto y devuelva una lista de palabras")
}

fun ejercicio1(){
    val scanner = Scanner(Path("./app/src/main/java/com/oriol/dia14/texto"))

    while (scanner.hasNextLine()){
        val linia = scanner.nextLine()
        println(linia)

    }
}