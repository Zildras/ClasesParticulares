package Dia11

class ClaseHijaDeOriol : ClaseOriol() {

    public fun menoresDe100(list: List<Int>) {
        var contador = 0
        for (num in list) {
            if (num < 100) {
                contador++
            }
        }
        println(contador)
    }
}