package un3

class Coche(val marca:String, val  velocidadMaxima:Int, var color: String = "Blanco") {
    init {
        require(marca.length > 0) { "Error: la marca no es correcta." }
        require((velocidadMaxima > 20) && (velocidadMaxima <250)) { "Error: la no es correcta." }
    }
    private fun describeMiCoche(): String
    {
        return "Coche: $marca, con una velicidad máxima de: $velocidadMaxima"
    }
}

fun main()
{
    var c = Coche("Clio", 160)
    println("Mi coche es: "+c.toString());
}