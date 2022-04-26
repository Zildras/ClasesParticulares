package Dia12.Interficie

class Perro(nombre : String, peso : Int) : Animal, Caninos{
    override var nombre: String = nombre
    override var peso: Int = peso

    override fun queSoy() {
        println("Soy un animal y un perro")
    }

    override fun sonido() {
        println("Guau guau")
    }

    override fun queSoyCanino() {
        println("Soy un canino")
    }
}