package un4.eje4_4

/*
- `Tope`: devuelve el elemento en la cabeza de la pila.
- `Push`: Insertar o apilar
- `Pop`: Eliminar o desapilar
- `Vacía:
 */

class Pila<T>() {
    private var pila:MutableList<T> = mutableListOf()

    fun push(elemento: T): Boolean = this.pila.add(elemento)
    fun pop(): T = this.pila.removeAt(this.pila.lastIndex)
    fun tope(): T = this.pila.get(this.pila.lastIndex)
    fun vacia(): Boolean = pila.isEmpty()
    override fun toString() = "Pila: "+this.pila.toString()
}

fun<T> reverse(lista:List<T>): List<T>
{
    var unaPila = Pila<T>()
    var reverseNumbers = mutableListOf<T>()
    val iter = lista.iterator()
    while(iter.hasNext())
        unaPila.push(iter.next())

    while(!unaPila.vacia())
        reverseNumbers.add(unaPila.pop())

    return reverseNumbers
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}