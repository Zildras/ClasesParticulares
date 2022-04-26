package Dia11.Teoria.PoligonoAbstracto

class Cubo : Poligono() {
    override var anchura: Int = 20
    override var longitud: Int = 50

    override fun area(): Int {
        return anchura*longitud
    }
}