data class Tienda(val nombre: String, val clientes: List<Cliente>) {

    // 4.2.1 - Implementa un método para obtener un conjunto de todos los clientes.
    fun obtenerConjuntoDeClientes(): Set<Cliente> = clientes.toSet()

    // 4.2.2 - Un conjunto de las ciudades de donde son los clientes, puedes hacer uso de map
    fun obtenerCiudadesDeClientes(): Set<Ciudad> = clientes.map { it.ciudad }.toSet()

    // 4.2.2(2) - Una lista de los clientes que viven en una determinada ciudad determinada, puedes hacer uso de filter.
    fun obtenerClientesPor(ciudad: Ciudad): List<Cliente> = clientes.filter { it.ciudad == ciudad }

    // 4.2.3 - Método que devuelve true si todos los clientes son de una determinada ciudad
    fun checkTodosClientesSonDe(ciudad: Ciudad): Boolean = clientes.all { it.ciudad == ciudad }

    // 4.2.3(2) - Método que devuelve true si al menos un cliente es de una determinada ciudad
    fun hayClientesDe(ciudad: Ciudad): Boolean = clientes.any { it.ciudad == ciudad }

    // 4.2.3(3) - Método que devuelve el número de cliente de una determinada ciudad
    fun cuentaClientesDe(ciudad: Ciudad): Int = clientes.count { it.ciudad == ciudad }

    // 4.2.3(4) - Método que devuelve un cliente que vive en una ciudad dada o nulo si no hay ninguno
    fun encuentraClienteDe(ciudad: Ciudad): Cliente? = clientes.find { it.ciudad == ciudad }

    /* 4.2.4 - Implementa un método para que devuelva una lista de clientes, ordenadas descendientemente por el
    número de pedidos que ellos han realizado. Puedes hacer uso de sortedDescending o sortedByDescending.*/
    fun obtenerClientesOrdenadosPorPedidos(): List<Cliente> = clientes.sortedByDescending { it.pedidos.count() }

    /* 4.2.5 - Implementa un método para que devuelva una lista de clientes que tiene más pedidos sin entregar que entregados,
    puedes hacer uso de Partition. */
    fun obtenerClientesConPedidosSinEntregar(): Set<Cliente> =
        clientes.partition { it.pedidos.count { it.estaEntregado } > it.pedidos.count { !it.estaEntregado } }.second.toSet()

    // 4.2.6(2) - Los productos que fueron pedidos por al menos un cliente.
    fun obtenerProductosPedidos(): Set<Producto> =
        clientes.flatMap { it.pedidos }.filter { it.estaEntregado }.flatMap { it.productos }.toSet()

    /* 4.2.8(2) - Cuenta la cantidad de veces que un producto se ha pedido.Ten en cuenta que un cliente puede
    pedir el pedido varias veces. Puedes usar Cliente.obtenerProductosPedidos() Verificar si el filter de repetido es correcto*/
    //fun obtenerNumeroVecesProductoPedido(producto: Producto): Int =

    // 4.2.9 - Implementa un método para que un map que almacene los clientes viviendo en una determinada ciudad. Puedes usar groupBy
    fun agrupaClientesPorCiudad(): Map<Ciudad, List<Cliente>> = clientes.groupBy { it.ciudad }

    // Ejercicios de Ampliación

    /* 4.2.7 - Implementa un método para que devuelva el conjunto de productos que han sido pedidos por TODOS los clientes.
       Puedes usar flatMap y fold y Puedes usar Cliente.obtenerProductosPedidos()*/
    //fun obtenerProductosPedidosPorTodos(): Set<Producto> =

    // 4.2.10 - Implementa un método para que devuelva un mapa desde el nombre del cliente al cliente, puedes usar associateBy
    fun mapeaNombreACliente(): Map<String, Cliente> = clientes.associateBy { it.nombre }

    // 4.2.10(2) - Un mapa desde el cliente a su ciudad, puedes usar associateWith
    fun mapeaClienteACiudad(): Map<Cliente, Ciudad> = clientes.associateWith { it.ciudad }

    // 4.2.10(3) - Un mapa desde el nombre del cliente a su ciudad, puedes usar associate


    // 4.2.11 - Implementa un método para que devuelva el cliente que ha realizado más pedidos en la tienda, puedes usar maxByOrNull.
    fun obtenerClientesConMaxPedidos(): Cliente? = clientes.maxByOrNull { it.pedidos.count() }


}
data class Cliente(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {

    override fun toString() = "$nombre from ${ciudad.nombre}"

    // 4.2.6 - Los productos pedidos por un cliente, pudiendo usar flatmap
    fun obtenerProductosPedidos(): List<Producto> = pedidos.flatMap { it.productos }


    // 4.2.8 - Encuentra el producto más caro entre los productos entregados pedidos por el cliente. Usa Pedido.estaEntregado
    fun encuentraProductoMasCaro(): Producto? =
        pedidos.filter { it.estaEntregado }.flatMap { it.productos }.maxByOrNull { it.precio }

    // 4.2.12 - La suma de los precios de todos los productos pedidos por un cliente, puedes usar flatMap y sumOf
    fun dineroGastado(): Double = pedidos.filter { it.estaEntregado }.flatMap { it.productos }.sumOf { it.precio }

    // Ejercicios de Ampliación

    // 4.2.11(2) - El producto más caro que ha pedido el cliente, puedes usar flapMap y maxByOrNull y callable references.
    fun obtenerProductoMasCaroPedido(): Producto? = pedidos.flatMap { it.productos }.maxByOrNull { it.precio }

}
    data class Pedido(val productos: List<Producto>, val estaEntregado: Boolean)

    data class Producto(val nombre: String, val precio: Double) {
        override fun toString() = "'$nombre' for $precio"
    }

    data class Ciudad(val nombre: String) {
        override fun toString() = nombre
    }

    fun main() {

    }
