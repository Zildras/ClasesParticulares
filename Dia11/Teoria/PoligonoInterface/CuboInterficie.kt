package Dia11.Teoria.PoligonoInterface

class CuboInterficie : PoligonoInterficie {
    override var anchura: Int = 20
    override var longitud: Int = 50

    override fun area(): Int = anchura*longitud

    override fun getLongitudInterficie(): Int = longitud

}