package Dia7

class Clase_Aux_Ejercicios_Dia_6 {

    public fun multiplicarLista(listaNumeros: List<Int>): List<Int> {

        val listaAuxiliar = mutableListOf<Int>()

        for (num in listaNumeros) {
            listaAuxiliar.add(num * 10)
        }

        return listaAuxiliar
    }

    var mutableList: MutableList<Int> = arrayListOf()

    fun setLista(Lista: List<Int>) {
        this.mutableList = Lista.toMutableList()
    }

    fun getLista(): List<Int> {
        return mutableList
    }

}

