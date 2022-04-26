package Dia12

import Dia12.Abstract.Caballo
import Dia12.Abstract.Perro

/**
 * Teoria sobre clases abstractas y interficies
 */

fun main(){
    var perroAbstracto = Perro("Dalsi")
    perroAbstracto.queSoyPerro()
    perroAbstracto.sonido()

    println(perroAbstracto.nombre)

    println("\n")
    var caballoAbstracto = Caballo("Bojack Horseman")
    caballoAbstracto.queSoyCaballo()
    caballoAbstracto.sonido()

    println(caballoAbstracto.nombre)


    println("\n----------------------------------------------------\n")

    var perroInterificie = Dia12.Interficie.Perro("Ibuprofeno", 5)
    perroInterificie.queSoy()
    perroInterificie.sonido()

    println(perroInterificie.nombre)
    println(perroInterificie.peso)

    println("\n")
    var caballoInterficie = Dia12.Interficie.Caballo("Jack Horseman", 50)
    caballoInterficie.queSoy()
    caballoInterficie.sonido()

    println(caballoInterficie.nombre)
    println(caballoInterficie.peso)
}