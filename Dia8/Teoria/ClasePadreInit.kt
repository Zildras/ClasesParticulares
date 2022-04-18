package Dia8.Teoria

class ClasePadreInit(nombre: String, id: Int){

    var nombre : String = ""
    var id : Int = 0

    init {
        if ((!nombre.equals(null)) && (id > 0)){
            this.nombre = nombre
            this.id = id

            println("Hecho")
        } else {
            println("Error")
        }
    }
}