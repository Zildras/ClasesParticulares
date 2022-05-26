package Dia14.Teoria

import java.util.*
import kotlin.io.path.Path

/**
 * @author macarronesc
 *
 * Clase para probar la lectura de un fichero a traves del scanner
 */
fun main(){

    val path = Path("./app/src/main/java/com/oriol/dia14/texto")


    var scanner = Scanner(path)
    while (scanner.hasNextLine()){
        val linea = scanner.nextLine()

        if(scanner.findInLine("not") != null){
            println("Found")
        }

        println("Linea: $linea")
    }

    println("\n")
    scanner = Scanner(path)
    while (scanner.hasNextLine()){
        if(scanner.hasNextInt()){
            println("Int: ${scanner.nextInt()}")
        }
        else{
            println("String: ${scanner.next()}")
        }
    }

    println("\n")
    scanner = Scanner(path).useDelimiter("=")
    while (scanner.hasNext()){
        println(scanner.next())
    }

    scanner.close()
}