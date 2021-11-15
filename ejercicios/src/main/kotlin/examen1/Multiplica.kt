package examen1

// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################
fun main() {
    // Declaración de variables
    val miNombre = "Eduardo Fernández Oliver"
    var edad: Byte = -1
    var mes: Byte = -1

    fun tablaDeMultiplicar(factor: Byte) {
        println("\nTABLA DEL $factor\n***********")
        for (i in 1..10) println("$factor x $i = ${factor * i}")
    }
    fun leeEdadyMes() {
        val entrada: String
        val listaEntrada: List<String>

        // Leo desde teclado la edad del alumno y el mes actual
        println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
        entrada = readLine() ?: ""
        listaEntrada = entrada.split(",")
        if (listaEntrada.size == 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
        {   edad = try {listaEntrada[0].trim().toByte()} catch (_: Exception) {-1}
            mes = try {listaEntrada[1].trim().toByte()} catch (_: Exception) {-1}
        }
    }

    leeEdadyMes()

    println("*".repeat(80)) // Linea Inicial de programa
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")
    println("_".repeat(80)) // Linea inicio cabecera

    if ((edad < 0) || (mes < 0)) // Si alguno es menor que -1, finaliza el programa
    {
        println("La entrada no es correcta.")
        println("_".repeat(80)) // Linea final cabecera}
    }
    else { //Sino, continuo
        when
        {
            edad !in 6..12  -> {
                println("Edad: $edad. No se contempla esta edad.")
                println("_".repeat(80)) // Linea final cabecera
            }
            mes !in 1..12   -> {
                println("Mes: $mes. El mes no es correcto.")
                println("_".repeat(80)) // Linea final cabecera
            }
            else -> {
                println("Edad: $edad. El alumno está dentro del rango ...")
                println("Mes: $mes. El mes es par, corresponden las tablas siguientes: ...")
                println("_".repeat(80)) // Linea final cabecera
                when {
                    edad in 6..8 -> (1..5).filter { it % 2 == mes % 2 }.forEach { tablaDeMultiplicar(it.toByte()) }
                    edad in 9..10 -> (6..10).filter { it % 2 == mes % 2 }.forEach { tablaDeMultiplicar(it.toByte()) }
                    edad in 11..12 -> (11..13).forEach { tablaDeMultiplicar(it.toByte()) }
                }
            }
        }
    }
    println("*".repeat(80)) // Linea final de programa
}