package Dia12.Abstract

class Caballo(nombre : String) : Animal() {
    override var nombre: String = nombre

    override fun sonido() {
        println("hii hii")
    }

    fun queSoyCaballo() {
        println("Soy un caballo")
    }
}