package examen1


// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################

fun main() {
    // Declaración de variables
    val miNombre = "Eduardo Fernández Oliver"
    val entrada: String
    val listaEntrada: List<String>
    val edad: Byte
    val mes: Byte

    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")

    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    }
    else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {listaEntrada[0].trim().toByte()} catch (_: Exception) {-1}
        mes = try {listaEntrada[1].trim().toByte()} catch (_: Exception) {-1}

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        }
        else //Sino, continuo
        {
            //TODO("Aquí el código de la cabecera")
            //Edad: 8. El alumno está dentro del rango [6-8]
            //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
            println("La edad es $edad y el mes es $mes")

            // Linea final cabecera
            println("_".repeat(80))

            //Imprime las las tablas en función de
            //TODO("Aquí las tablas")

        }

    }
    // Linea final de programa
    println("*".repeat(80))

}
