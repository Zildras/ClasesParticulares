package Dia8.Teoria

open class ClasePadre{

    constructor(nombre: String, id: Int){
        println("1º")
        println("Nombre introducido: ${nombre}")
        println("ID introducido: ${id}")
    }

    constructor(nombre: String, id: Int,contraseña: String){
        println("2º")
        println("Nombre introducido: ${nombre}")
        println("ID introducido: ${id}")
        println("Contraseña introducida: ${contraseña}")
    }
}