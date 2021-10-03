package eje1

import kotlin.random.Random

/*
fun main() {
    //val digi = 0..9
    val char = '!'..'~'
    var caracteres: String = ""
    //for (d in digi) caracteres += d
    for (c in char) caracteres += c
    println(caracteres)
}
*/

class Genpass(val tama:Int) {

    private val letras="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val numeros="0123456789"
    private val puntuacion="!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~"
    private val caracteres=letras+numeros+puntuacion

    fun newPass(): String {
        var contrasenya: String = ""
        for (i in 1..tama) {
            contrasenya += caracteres[Random.nextInt(0, caracteres.length - 1)]
        }
        return contrasenya
    }
}

fun main() {
    var gp: Genpass
    var num: Int

    print("Introduza el tamaño de la contraseña: ")
    // Obtenemos el tamaño de la contraseña, controlamos la excepción.
    num = try {
        readLine()?.toInt() as Int
    } catch (_: NumberFormatException) {
        8
    }
    if (num==0)
    {
        println("La longitud debe ser un valor numérico. Adiós")
        return
    }
    //Creamos una clase que nos genera contraseñas de tamaño num
    gp = Genpass(num)
    //Llamamos al metodo
    print("la contraseña es:${gp.newPass()}")

}
