package Dia9.Teoria

/*
 * Clase con un main para testear la teoria
 *
 * APUNTES:
 * Enumeraciones y como se usan
 * Funciones sobre esas enumeraciones
 * Herencia y polimorfismo
 *
 */


fun main(){
    println("ENUM: ")
    println(Colores.BLUE)
    println(Colores.BLUE.nombre)
    println(Colores.BLUE.valor)


    println("\nFUNCIONES SOBRE LOS ENUMS: ")
    println(elColorEstaEnElEnum("blue"))
    println(elColorEstaEnElEnum("amarillo"))


    println("\nHERENCIA Y POLIMORFISMO: ")
    val variable = Policia("asdad")

    val personaPolicia : Persona = Policia("Pedro")              // Un padre puede ser del tipo hijo

    println(personaPolicia.getAge())
    println(personaPolicia.getName())

    //personaPolicia.getCargo()                                         // Al hacer polimorfismo no puedes usar las funciones del hijo

    //val policiaPersona : Policia = Persona("Pedro", "Martinez")       // Un hijo no puede ser del tipo padre
}


private fun elColorEstaEnElEnum(nombre: String) : Boolean {
    for (enum in Colores.values()) {
        if (nombre.uppercase() == enum.name)
            return true
    }
    return false
}