package Dia4

import java.util.*


fun main(){
    ejercicioClases()
}

private fun ejercicioClases() {
    var alumnos = Array(2) { Array<String?>(7) { null } }

    for (i in (0 until 7)) {
        println("Nombre del alumno para la clase A ${i + 1}")
        alumnos[0][i] = readLine()
        println("Nombre del alumno para la clase B ${i + 1}")
        alumnos[1][i] = readLine()
    }
    println("¿De que clase quieres ver los alumnos? (0 o 1)")

    val scanner = Scanner(System.`in`)
    val clase = scanner.nextInt()
    for (alumno in alumnos[clase]){
        print("$alumno | ")
    }
}