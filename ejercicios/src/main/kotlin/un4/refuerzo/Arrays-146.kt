//Proyecto146

class Dado(var valor: Int = 1) {

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}

fun main(parametro: Array<String>) {
    var dados: Array<Dado> = arrayOf(Dado(), Dado(), Dado(), Dado(), Dado())
    for (dado in dados)
        dado.tirar()
    for (dado in dados)
        dado.imprimir()
}