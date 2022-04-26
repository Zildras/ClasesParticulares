package Dia11.Teoria

class HijoAbstracto(numero : Int) : Abstracta() {
    override val atributAbstracte: Int = numero

    override fun printAbstracto() {
        println("Este metodo en la clase hijo es abstracto")
    }
}