package Dia14.Teoria

import java.io.File
import kotlin.io.path.Path

/**
 * @author macarronesc
 *
 * Clase de prueba para probar el funcionamiento de la clase File
 * y la escritura de un fichero
 */
fun main() {

    val path = Path("./app/src/main/java/com/macarronesc/oriol/dia14/Teoria/texto")
    val file : File = path.toFile()


    val content = "\n\nHoy es un día muy bonito"
    //file.writeText(content)
    file.appendText(content)


    File("./app/src/main/java/com/oriol/dia14/texto").bufferedWriter().use { escribir ->
        database.values().forEach {
            escribir.write(it.nombre + " = " + it.valor + ",\n")
        }
    }
}