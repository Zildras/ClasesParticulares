package Dia12.Abstract

abstract class Animal {
    abstract var nombre : String
    private var peso = 10

    abstract fun sonido()

    private fun queSoy(){
        println("Soy un animal")
    }
}