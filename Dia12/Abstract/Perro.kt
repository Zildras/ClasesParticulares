package Dia12.Abstract

class Perro(nombre : String) : Animal() {
    override var nombre: String = nombre

    override fun sonido() {
        println("Guau guau")
    }

    fun queSoyPerro(){
        println("Soy un perro")
    }
}