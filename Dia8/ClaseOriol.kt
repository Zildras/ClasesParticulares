package Dia8

class ClaseOriol(list: List<Int>) {

    init {
        check(list != emptyList<Int>()) { println("ERROR")}
    }

    fun recorrerLista(lista: List<Int>) {

        for (num in lista){
            if (num == 5){
                println("EXITO")
            }
        }
    }
}
