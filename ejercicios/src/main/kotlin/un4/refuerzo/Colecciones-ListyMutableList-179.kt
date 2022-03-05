

//Proyecto179

class Empleado(var nombre: String, var sueldo: Double) {

    fun imprimir() {
        println("$nombre tiene un sueldo de $sueldo")
    }
}

fun calcularGastos(empleados: MutableList<Empleado>) {
    val suma = empleados.sumByDouble { it.sueldo }
    println("Total de gastos de la empresa:$suma")
}

fun main(args: Array<String>) {
    val empleados: MutableList<Empleado> = mutableListOf(Empleado("Juan", 2000.0),
        Empleado("Ana", 3500.0),
        Empleado("Carlos", 1500.0))
    empleados.forEach { it.imprimir() }
    calcularGastos(empleados)
    empleados.add(Empleado("Marcos", 3000.0))
    println("Gastos luego de ingresar un nuevo empleado que cobra 3000")
    calcularGastos(empleados)
}


