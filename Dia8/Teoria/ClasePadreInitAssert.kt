package Dia8.Teoria

class ClasePadreInitAssert(nombre: String, id: Int){

    var nombre : String = ""
    var id : Int = 0

    init {
        println("ID : $id")
        check(!nombre.equals("null")) { println("ERROR nombre")}
        check(id > 0) { println("ERROR id")}

        this.nombre = nombre
        this.id = id

        println("Hecho")
    }
}