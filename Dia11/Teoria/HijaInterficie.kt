package Dia11.Teoria

class HijaInterficie : Interficie{
    override val atributAbstracte: Int = 0
    override val atribut: Boolean = true

    override fun metodeAbstracte() {
        println("Metodo abstracto de una Interficie")
    }

    override fun metode() {
        println("Metodo abstracto tambien de una Interficie")
    }
}