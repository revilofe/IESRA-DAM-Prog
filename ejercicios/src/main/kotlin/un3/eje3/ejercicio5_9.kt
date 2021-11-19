/**
 * Ejercicio 5.9
 *
 * Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible.
 * Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.
 * Crear además una clase Persona, que se caracteriza por un DNI y un vector
 * (Preguntar al profesor si tienes dudas sobre vector) de cuentas bancarias.
 * La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas
 * (hasta 3 que es el máximo). También debe contener un método que devuelva si la persona es morosa
 * (si tienen alguna cuenta con saldo negativo).
 * En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta,
 * una sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual,
 * por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda.
 * Imprimir por pantalla si la persona es morosa.
 * Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos)
 * y mostrar por pantalla el estado de la persona.
 */

fun main(args: Array<String>) {
    var p = Persona("1")
    listOf(
        Cuenta("123"),
        //Cuenta("124", 1.1),
        //Cuenta("125", -0.1),
        Cuenta("126", 700.0)
    ).forEach {
        print("Count del array es: ${p.cuentas.size} -> ")
        println("El numero de cuentas es ${p.agregarCuenta(it)}")
    }

    p.cuentas.filter { "123".equals(it?.numeroCuenta) }.get(0)?.realizaAbono(1100.0)
    println("Tras cobrar, es morosa: ${Cuenta.isMorosa(p)}")
    p.cuentas.filter { "126".equals(it?.numeroCuenta) }.get(0)?.realizaCargo(750.0)
    println("Tras pagar el alquiler, es morosa: ${Cuenta.isMorosa(p)}")

    Cuenta.transferencia(p, "123", p, "126", 200.0)
    println("Tras realizar transferencia, es morosa: ${Cuenta.isMorosa(p)}")
    println(p)
}

class Cuenta(val numeroCuenta: String, var saldo: Double = 0.0) {
    init {
        require(!numeroCuenta.isNullOrEmpty(), { "Numero de cuenta no puede ser nulo" })
    }

    fun realizaAbono(abono: Double): Double {
        saldo += abono
        return saldo
    }

    fun realizaCargo(cargo: Double): Double {
        saldo -= cargo
        return saldo
    }

    companion object {
        fun isMorosa(persona: Persona): Boolean {
            return persona.cuentas.filter { (it?.saldo ?: 0.0) < 0.0 }.size > 0
        }

        fun transferencia(
            pOrigen: Persona,
            numeroCuentaOrigen: String,
            pDestino: Persona,
            numeroCuentaDestino: String,
            tranferencia: Double
        ) {
            val cuentaOrigen = pOrigen.cuentas.filter { numeroCuentaOrigen.equals(it?.numeroCuenta) }.get(0)
            if (cuentaOrigen?.saldo ?: 0.0 >= tranferencia) {
                val cuentaDestino = pDestino.cuentas.filter { numeroCuentaDestino.equals(it?.numeroCuenta) }.get(0)
                cuentaOrigen?.realizaCargo(tranferencia)
                cuentaDestino?.realizaAbono(tranferencia)
            }
        }
    }

    override fun toString(): String {
        return "Cuenta $numeroCuenta => con saldo: $saldo"
    }
}

class Persona(var dni: String) {
    val cuentas = arrayOfNulls<Cuenta>(3)
    private var numeroDeCuentas = 0

    fun agregarCuenta(cuenta: Cuenta): Int {
        if (!TOTAL_CUENTAS.equals(numeroDeCuentas)) {
            cuentas[numeroDeCuentas] = cuenta
            numeroDeCuentas++
        }
        return numeroDeCuentas
    }

    companion object {
        const val TOTAL_CUENTAS = 3
    }

    override fun toString(): String {
        return "Persona: $dni, cuentas: ${cuentas.toList()}"
    }

}