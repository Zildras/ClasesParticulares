package Dia11.Teoria

/**
 * Clase con un main para testear la teoria
 *
 * APUNTES:
 * Clases abstractas y interficies
 */


fun main(){

    println("Clase abstracta:")
    println("Nos permite tener metodos implementados (hechos) y metodos no implementados")
    println("Estos metodos no implementados, serán los hijos los que tendrán que implementarlos")
    println("Si pones una clase abstracta, tendrás que implementar MINIMO 1 metodo abstracto")

    println("Interfaces:")
    println("Es una clase abstracta pura, no tiene implementado nada (aunque podria)")

    println("Interfaces vs Clases abstractas:")
    println("Una clase solamente puede heredar de 1 clase abstracta, de infinitas interfaces")
    println("Una clase abstracta puede implementar metodos, una interficie solo los define")
    println("Los metodos y variables de la clase abstracta pueden ser privados, publicos, estaticos, etc.\n" +
            "En una interficie siempre serán publicos estaticos y finales")
}