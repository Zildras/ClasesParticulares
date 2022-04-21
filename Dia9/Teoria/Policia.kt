package Dia9.Teoria

// Un padre no puede usar las funciones del hijo
class Policia(private var nombre: String) : Persona(nombre, "a"){
    init {
        assert(nombre == null) {println("ERROR")}
    }

    var cargo_en_la_policia = "comandante"

    fun getCargo() : String {
        return cargo_en_la_policia
    }
}