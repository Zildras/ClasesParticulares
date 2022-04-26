package Dia11.Teoria

abstract class Abstracta {
    val atribut: Int = 0
    abstract val atributAbstracte: Int

    abstract fun printAbstracto()

    fun printNoAbstracto() {
        println("Este metodo no es abstracto")
    }
}