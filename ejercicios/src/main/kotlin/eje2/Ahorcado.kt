package eje2

// Función para obtener la palabra a adivinar
// return: la palabra que hay que adivinar. Si es menor que 5 o contiene espacios devuelve ""
// TODO: Falta leer como si fuera un password para que no se ve la palabra
private fun obtenerPalabraAAdivinar(
): String {
    var palabra = ""

    val console = System.console()// val console: Console? = System.console()
    if (console==null)
    {
        print(">Introduce la palabra secreta (Mayor de 4 caracteres y caracteres letras): ")
        palabra = readLine() ?: "" // <= OJO ¿Que hace esto? ;; Operador Elvis
    }
    else
        palabra = console.readPassword(">>Introduce la palabra secreta (Mayor de 4 caracteres y caracteres letras): ").joinToString("")

    if (palabra.length < 5)
        palabra=""
    else if (palabra.filter { !it.isLetter() }.length > 0) palabra = "" // <= OJO ¿Que hace esto?

    return palabra.toUpperCase()
}

// Función para obtener la siguiente letra
// return: Letra para chequear si esta en la palabra.
private fun solicitaLetra(
): Char {
    var lineaLeida = ""

    // Repetir mientra no obtengamos lo que queramos ¿Hasta siempre?
    do {
        println("Introduzca una letra: ")
        lineaLeida = readLine() ?: "" // <= OJO ¿Que hace esto? ;; Operador Elvis
    } while (lineaLeida.length != 1 || !lineaLeida[0].toChar().isLetter())

    return lineaLeida[0].toChar().toUpperCase() // ¿Porque lineaLeida[0]?
}

// Función que inicializa la palabra de partida en el juego, en base a la longitud de la palabra a adivinar.
// return: Palabra de longitud el tamaño de la palabra a adivinar, con 'X'.
private fun inicializaPalabraDePartida(
    palabraAAdivinar: String
): String {
    var palabraDePartida = ""
    // OJO, 3 formas distintas de hacerlo
    // (1)
    // palabraAAdivinar.forEach() { _ -> palabraDePartida += '_' }
    // (2)
    /*
    for (c in palabraAAdivinar)
        palabraDePartida += '_'
    */
    // (3(
    palabraDePartida = "_".repeat(palabraAAdivinar.length)
    return palabraDePartida
}


// Función para procesar el juego, en el que solicita letras y comprueba si existen en la palabra.
// palabraAAdivinar: String que contiene la palabra a adivinar
// intentos: Int que indica el numero de intentos posibles
// return: el numero de intentos de los que dispone
private fun procesoParaAdivinarLaPalabra(
    palabraAAdivinar: String,
    intentos: Int
): Int {

    var palabraDePartida = ""
    var intentosRestantes = intentos
    var listaDeLetrasUsadas = mutableListOf<Char>()
    var letra: Char
    var posicionDeLetra = -1
    var letraConAcierto = true

    palabraDePartida = inicializaPalabraDePartida(palabraAAdivinar)

    while (!intentosRestantes.equals(0)  && !palabraAAdivinar.equals(palabraDePartida)) { // Entiende la condición

        println("${if (letraConAcierto) ":-)" else ":-("} RESULTADO: Intentos retantes " +
                "[$intentosRestantes] - Resultado de palabra a adivinar: $palabraDePartida")

        // Solicito letra a sustituir
        letra = solicitaLetra()

        // Chequear la letra
        letraConAcierto = !((letra in listaDeLetrasUsadas) || (!palabraAAdivinar.contains(letra)))
        if (letraConAcierto) { // La letra no esta contenida o error
            posicionDeLetra = -1

            listaDeLetrasUsadas.add(letra) //Añade la letra a lista de letras usadas

            // Sustituye la letra en todas las posiciones en las que se encuentre
            posicionDeLetra = palabraAAdivinar.indexOf(letra, posicionDeLetra)
            while (posicionDeLetra != -1) {
                palabraDePartida = palabraDePartida.replaceRange(posicionDeLetra, posicionDeLetra + 1, letra.toString())
                posicionDeLetra = palabraAAdivinar.indexOf(letra, posicionDeLetra + 1)
            }
        }
        else
            intentosRestantes-- // Disminuyo los intentos porque se ha repetido la letra o porque no está contenida

    }
    println("${if (letraConAcierto) ":-)" else ":-("} RESULTADO: Intentos retantes " +
            "[$intentosRestantes] - Resultado de palabra a adivinar: $palabraAAdivinar")

    return intentosRestantes
}

// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################

@ExperimentalStdlibApi
fun main(args: Array<String>) {

    println("${"*".repeat(20)}")
    println(" Juego del ahorcado ")
    println("${"*".repeat(20)}")

    val palabraAAdivinar = obtenerPalabraAAdivinar()
    if (palabraAAdivinar.length < 5) {
        print("la palabra es menor a 4 caracteres o contiene caracteres no validos.")
        return
    }
    if (procesoParaAdivinarLaPalabra(palabraAAdivinar, 5) > 0)
        println("Enhorabuena!!")
    else
        println("Agotaste los intentos. :-(")

    println("${"*".repeat(20)}")
    println("    GAME OVER ;-)   ")
    println("${"*".repeat(20)}")

}
