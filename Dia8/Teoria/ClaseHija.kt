package Dia8.Teoria

class ClaseHija: ClasePadre {
    constructor(nombre: String, id: Int): super(nombre,id){
        println("3º")
        println("Nombre introducido: ${nombre}")
        println("ID introducido: ${id}")
    }

    constructor(nombre: String, id: Int,contraseña: String):super(nombre,id,contraseña){
        println("4º")
        println("Nombre introducido: ${nombre}")
        println("ID introducido: ${id}")
        println("Contraseña introducida: ${contraseña}")
    }
}