
//Proyecto180

fun cargar(): Float {
    print("Ingrese la altura de la persona (Ej. 1.92):")
    val valor = readLine()!!.toFloat()
    return valor
}

fun main(args: Array<String>) {
    val lista1: List<Float> = List(5) {cargar()}
    val promedio = lista1.average()
    println("La altura promedio de las personas es $promedio")
    val altos = lista1.count { it > promedio}
    val bajos = lista1.count { it < promedio}
    println("La cantidad de personas más altas al promedio es: $altos")
    println("La cantidad de personas más bajas al promedio es: $bajos")
}