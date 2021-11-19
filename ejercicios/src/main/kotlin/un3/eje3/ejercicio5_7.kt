package un3.eje3/**
 *
 * Ejercicio 5.7
 * Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo,
 * el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como
 * los métodos estándar: ¿getters, setters? y toString.
 * En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos
 * de ellos y vuelve a mostrarlos por pantalla.
 */

/** Cuando se usa el prefijo 'val' Kotlin genera automáticamente el método 'getter()' y cuando se usa
 * el prefijo 'var' Kotlin genera el 'getter()' y 'setter()'. Si no necesitamos los accesores se puede
 * definir el constructor sin los prefijos. De esta forma podemos definir nuestros propios métodos accesores.
 * 'Getters()' and 'Setters()'
 * La sintaxis completa de definición de una propiedad en Kotlin:
 *
 * {var|val} <propertyName>[: <PropertyType>] [= <property_initializer>]
 * [<getter>]
 * [<setter>]
 *
 */


/**
 * Clase Rectangulo. Calcula el area y perimetro
 */
class Coche(
    val marca: String,
    val modelo: String,
    val numCaballos: Int,
    var color: String,    // Unica que puede cambiar
    val numPuertas: Int,
    val matricula: String
) {
    override fun toString(): String {
        return "Coche: marca $marca, modelo $modelo, numero de caballos $numCaballos, color $color, numero de puertas $numPuertas, matricula $matricula"
    }
}

fun main(args: Array<String>) {
    println("Programa que crea Rectaculos!")
    val c1 = Coche("Opel", "Corsa", 90, "Blanco", 3, "ASJ 87453")
    val c2 = Coche("Seat", "Leon", 100, "Negro", 5, "ABB 10212")
    val c3 = Coche("Reanult", "Megane", 120, "Rojo", 5, "JAA 01010")

    println(c1)
    println(c2)
    println(c3)
    c2.color= "Blanco"
    c3.color= "Blanco"
    println(c2)
    println(c3)

}

