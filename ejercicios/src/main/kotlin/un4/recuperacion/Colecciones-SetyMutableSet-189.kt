//Proyecto189

fun generarCarton(carton: MutableSet<Int>) {
    do {
        val valor = ((Math.random() * 50) + 1).toInt()
        carton.add(valor)
    } while (carton.size!=6)
}

fun generarBolillero(bolillero: MutableSet<Int>) {
    do {
        val valor = ((Math.random() * 50) + 1).toInt()
        bolillero.add(valor)
    } while (bolillero.size!=50)
}

fun verificarTriunfo(carton: MutableSet<Int>, bolillero: MutableSet<Int>) {
    var aciertos = 0
    var cantBolillas = 0
    var intentos = 0
    for(bolilla in bolillero) {
        cantBolillas++
        if (bolilla in carton) {
            aciertos++
            if (aciertos == 6) {
                intentos = cantBolillas
                break
            }
        }
    }
    println("Se sacaron $intentos bolillas hasta que el cartón ganó.")
}

fun main(args: Array<String>) {
    val carton: MutableSet<Int> = mutableSetOf()
    generarCarton(carton)
    println("Carton de lotería generado")
    println(carton)
    val bolillero: MutableSet<Int> = mutableSetOf()
    generarBolillero(bolillero)
    println("Numeros del bolillero")
    println(bolillero)
    verificarTriunfo(carton, bolillero)
}
