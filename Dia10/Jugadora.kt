package Dia10

open class Jugadora {
    private var velocidad: Float = 0F
    private var salto: Int = 0

    constructor(velocidad: Float){
        check(velocidad > 0 ){ println("VELOCIDAD INCORRECTA") }

        this.velocidad = velocidad
    }

    constructor(salto: Int){
        check(salto > 0){ println("SALTO INCORRECTO") }

        this.salto = salto
    }

    constructor(velocidad: Float, salto: Int){
        check(velocidad > 0 ){ println("VELOCIDAD INCORRECTA") }
        check(salto > 0){ println("SALTO INCORRECTO") }

        this.velocidad = velocidad
        this.salto = salto
    }

    fun setVelocidad(nueva_velocidad: Float){
        this.velocidad = nueva_velocidad
    }

    fun getVelocidad() : Float {
        return this.velocidad
    }
}