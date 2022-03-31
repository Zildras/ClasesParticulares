package Dia5

fun main(){
    val persona_alba = Persona("Alba", "Abella")
    val persona_juan = Persona("Juan", "Sanchez")
    val persona_alba2 = Persona("Alba", "Abella")

    println(persona_alba == persona_alba2)


    println(persona_alba.getAge())


    val policia = Policia("kajshgdksa")


    val persona = Persona("Alba", "Abella")
    val persona2 = Persona("Alba", "Abella")
    val persona3 = Persona("Alba", "Abella")
    println(persona == persona2)
    persona.setAge(15)
}