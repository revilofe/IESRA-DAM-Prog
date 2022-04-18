//Proyecto104

fun main(parametro: Array<String>) {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    println("Carga del primer arreglo")
    for (i in arreglo1.indices) {
        print("Ingrese elemento:")
        arreglo1[i] = readLine()!!.toInt()
    }
    println("Carga del segundo arreglo")
    for (i in arreglo2.indices) {
        print("Ingrese elemento:")
        arreglo2[i] = readLine()!!.toInt()
    }
    val arregloSuma = IntArray(4)
    for (i in arregloSuma.indices)
        arregloSuma[i] = arreglo1[i] + arreglo2[i]
    println("Arreglo resultante")
    for (elemento in arregloSuma)
        println(elemento)
}