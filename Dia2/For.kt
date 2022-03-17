package Dia2

import kotlin.collections.HashMap

/*
 * CÓDIGO MORSE
 */

fun main() {
    var diccionary = loadHashMap()

    println(translate(diccionary, "Hola"))
    println(translate(diccionary, "Como estas Oriol"))
}

private fun translate(dictionary: HashMap<String, String>, word: String) : String {
    var finalTranslate = ""

    for (character in word.lowercase()) {
        finalTranslate += dictionary[character.toString()] + " "
    }

    return finalTranslate
}



fun loadHashMap() : HashMap<String, String>{
    val map = hashMapOf<String, String>()

    map["a"] = ".-"
    map["b"] = "-..."
    map["c"] = "-.-."
    map["d"] = "-.."
    map["e"] = "."
    map["f"] = "..-."
    map["g"] = "--."
    map["h"] = "...."
    map["i"] = ".."
    map["j"] = ".---"
    map["k"] = "-.-"
    map["l"] = ".-.."
    map["m"] = "--"
    map["n"] = "-."
    map["o"] = "---"
    map["p"] = ".--."
    map["q"] = "--.-"
    map["r"] = ".-."
    map["s"] = "..."
    map["t"] = "-"
    map["u"] = "..-"
    map["v"] = "...-"
    map["w"] = ".--"
    map["x"] = "-..-"
    map["y"] = "-.--"
    map["z"] = "--.."
    map["1"] = ".----"
    map["2"] = "..---"
    map["3"] = "...--"
    map["4"] = "....-"
    map["5"] = "....."
    map["6"] = "-...."
    map["7"] = "--..."
    map["8"] = "---.."
    map["9"] = "----."
    map["0"] = "-----"
    return map
}
