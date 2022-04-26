package Dia11.Teoria

class HijaAbstracta(numero : Int) : Abstracta() {
    override val atributAbstracte: Int = numero

    override fun printAbstracto() {
        println("Este metodo en la clase hija es abstracto")
    }
}