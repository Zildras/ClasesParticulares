package Dia11.Teoria.PoligonoAbstracto

abstract class Poligono {
    abstract var longitud : Int
    abstract var anchura : Int
    private var radio : Int = 2

    abstract fun area() : Int


    fun getLongitudPoligono() : Int{
        return longitud
    }
}