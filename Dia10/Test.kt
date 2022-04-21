package Dia10

/*
 * Clase con un main para testear la teoria
 *
 * APUNTES:
 * Constructores y this, super
 */


fun main(){

    println("Jugadores (Constructores)")
    val jugador1 = Jugador(1.7F, 10)

    val jugadora1 = Jugadora(2.85F)

    val jugadora2 = Jugadora(2)

    val jugadora3 = Jugadora(2.85F, 2)

    println("\nJefe")
    val jefe1 = Jefe(2.85F)

    println(jefe1.getVelocidadJefe())

    jefe1.setVelocidadJefe(3F)

    println(jefe1.getVelocidadJefe())
}