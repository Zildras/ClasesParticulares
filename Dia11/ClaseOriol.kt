package Dia11

open class ClaseOriol {

    public fun contarNum(list: List<Int>){
        var contador = 0
        for (num in list){
            if (num>100){
                contador++
            }
        }
        println(contador)
    }
}