package un3

class Coche(
            val marca:String,
            val modelo:String,
            val velocidadMaxima:Int,
            val variacionVelocidad:Int,
            var color: String = "Blanco"
) {
    init {
        require(marca.length > 0) { "Error: la marca no es correcta." }
        require(modelo.length > 0) { "Error: la marca no es correcta." }
        require((velocidadMaxima > 20) && (velocidadMaxima <250)) { "Error: la no es correcta." }
    }
    private fun describeMiCoche(): String
    {
        return this.toString()
    }

    override fun toString(): String {
        return ("$marca, de color $color. Y con una velocidad máxima de $velocidadMaxima")
    }
}

class Cuenta(var numero:String)

fun main() {
    var v: Array<Cuenta?> = arrayOfNulls(4)
    println("El tamaño es:" + v.size)

    v[0] = Cuenta("2")
    println("El primer nulo es " +v.indexOfFirst{it==null})
}