package Dia5

class Policia(private var nombre: String) : Persona(nombre, "a"){

    var cargo_en_la_policia = "comandante"

    fun getCargo() : String {
        return cargo_en_la_policia
    }
}
