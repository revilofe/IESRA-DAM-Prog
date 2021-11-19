package un3.eje3/**
 * Ejercicio 5.6
 * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y
 * los métodos para calcular el área y el perímetro. Opcionalmente se puede crear el método toString
 * para mostrar información sobre el rectángulo.
 * En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
 */

/**
 * Clase Rectangulo. Calcula el area y perimetro
 */
class Rectangulo(val base: Int, val altura: Int)
{
    fun calculaArea() = base * altura
    fun calculaPerimetro() = 2*altura * 2*base
    override fun toString(): String {
        return "Rectangulo: base: $base, altura: $altura"
    }
}

fun main(args: Array<String>) {
    println("Programa que crea Rectaculos!")
    val r1 = Rectangulo(2,4)
    var r2 = Rectangulo(6, 3)

    println(r1)
    println("area ${r1.calculaArea()}")
    println("perimetro ${r1.calculaPerimetro()}")

    println(r2)
    println("area ${r2.calculaArea()}")
    println("perimetro ${r2.calculaPerimetro()}")

}

