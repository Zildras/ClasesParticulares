package Dia12.Interficie

class Caballo(nombre : String, peso : Int) : Animal {
    override var nombre: String = nombre
    override var peso: Int = peso

    override fun queSoy() {
        println("Soy un animal y un caballo")
    }

    override fun sonido() {
        println("Hii hii")
    }
}