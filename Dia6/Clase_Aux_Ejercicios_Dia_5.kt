package Dia6

class Clase_Aux_Ejercicios_Dia_5 {

    public fun imprimirPares(listaNumeros: List<Int>){
        // Acuerdate de la estructura cuando empezamos a hacer una función nueva.

        for (num in listaNumeros){
            if (num % 2 == 0){
                println("$num es par")
            }
            else{
                println("$num es impar")
            }
        }
    }

    var mutableList : MutableList<Int> = arrayListOf()

    fun setLista(Lista : List<Int>){
        this.mutableList = Lista.toMutableList()
    }

    fun getLista(): List<Int>{
        return mutableList
    }

}