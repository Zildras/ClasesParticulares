package Dia10

class Jugador (velocidad: Float, salto: Int){
    private var velocidad: Float = 0F
    private var salto: Int = 0

    init {
        check(velocidad > 0 ){ println("VELOCIDAD INCORRECTA") }
        check(salto > 0){ println("SALTO INCORRECTO") }

        this.velocidad = velocidad
        this.salto = salto
    }

    fun setVelocidad(velocidad: Float){
        this.velocidad = velocidad
    }

    fun getVelocidad() : Float {
        return this.velocidad
    }
}