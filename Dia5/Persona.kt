package Dia5

open class Persona (private var name: String, private var apellido: String) {

    private var age: Int = 0

    fun setAge(age: Int) {
        this.age = age
    }

    fun getName(): String {
        return name
    }

    fun getSurnames(): String {
        return apellido
    }

    fun getAge(): Int {
        return age
    }

    // MAL, SE TIENE QUE HACER CON GETTER
    fun fullName():String{
        return "$name $apellido"
    }
}