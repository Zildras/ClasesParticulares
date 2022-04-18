package Dia8.Teoria

import Dia8.Teoria.ClaseHija
import Dia8.Teoria.ClasePadre
import Dia8.Teoria.ClasePadreInit
import Dia8.Teoria.ClasePadreInitAssert

/*
 * Clase con un main para testear la teoria
 *
 * APUNTES:
 * Puede haber un init y un constructor en la misma clase
 * Pero siempre se ejecutará primero el init (el constructor primario) y luego el resto de constructores (constructores secundarios)
 */


fun main(){

    val padre1 = ClasePadre("Alfredo", 101)
    println("Construido primer padre\n")

    val padre2 = ClasePadre("Juan", 102, "contraseñaJuan")
    println("Construido segundo padre\n")

    val hijo1 = ClaseHija("Alfredo Junior", 103)
    println("Construido primer hijo\n")

    val hijo2 = ClaseHija("Juan Junior", 104, "contraseñaJuanJunior")
    println("Construido segundo hijo\n")


    val padreInit = ClasePadreInit("Alfredo", -1)
    println("Construido tercer padre\n")

    val padreInit2 = ClasePadreInitAssert("null", -1)
    println("Construido cuarto padre\n")
}