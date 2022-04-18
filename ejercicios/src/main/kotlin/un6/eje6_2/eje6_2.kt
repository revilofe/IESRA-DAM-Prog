package un6.eje6_2


interface Dispara {
    var municion: Int
    var municionARestar: Int
    fun dispara(): Boolean
}

abstract class ArmaDeFuego(
    nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String, danio: Int, radio: String
) : Dispara {
    override var municion: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var municionARestar: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    abstract override fun dispara(): Boolean
}

class Pistola(
    nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String, danio: Int, radio: String
) : ArmaDeFuego(

    nombre, municion, municionARestar, tipoDeMunicion, danio, radio
) {

    override fun dispara(): Boolean {
        return true
    }

}

fun main() {
    var d = Pistola("arma", 1, 1, "balas", 1, "peq")
}