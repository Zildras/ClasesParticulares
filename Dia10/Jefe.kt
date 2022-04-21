package Dia10

class Jefe : Jugadora {

    constructor(velocidad: Float) : super(velocidad) {
        super.setVelocidad(velocidad)
    }

    fun setVelocidadJefe(nueva_velocidad: Float){
        super.setVelocidad(nueva_velocidad)
    }

    fun getVelocidadJefe() : Float {
        return super.getVelocidad()
    }
}