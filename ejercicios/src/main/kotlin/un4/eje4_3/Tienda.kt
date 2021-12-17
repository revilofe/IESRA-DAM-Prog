package un4.eje4_3

data class Tienda(val nombre: String, val clientes: List<Cliente>) {
    fun obtenerConjuntoDeClientes(): Set<Cliente> = clientes.toSet()
    fun obtenerCiudadesDeClientes(): Set<Ciudad> =
        clientes.map { it.ciudad }.toSet()

    fun checkTodosClientesSonDe(ciudad: Ciudad): Boolean =
        clientes.all { it.ciudad  == ciudad }

    fun hayClientesDe(ciudad: Ciudad): Boolean =
        clientes.any { it.ciudad == ciudad }

    fun cuentaClientesDe(ciudad: Ciudad): Int =
        clientes.count { it.ciudad == ciudad }

    // Return a customer who lives in a given city, or null if there is none
    fun encuentraClienteDe(ciudad: Ciudad): Cliente? =
        clientes.find { it.ciudad == ciudad }

    fun obtenerClientesPor(ciudad: Ciudad): List<Cliente> =
        clientes.filter { it.ciudad == ciudad }

    fun obtenerClientesOrdenadosPorPedidos(): List<Cliente> =
        clientes.sortedByDescending {
            it.pedidos.size
        }

    fun obtenerClientesConPedidosSinEntregar(): Set<Cliente> =
        clientes.filter {
            val (delivered, undelivered) = it.pedidos.partition { it.estaEntregado }
            undelivered.size > delivered.size
        }.toSet()

    fun obtenerProductosPedidos(): Set<Producto> =
        clientes.flatMap(Cliente::obtenerProductosPedidos).toSet()

    fun obtenerProductosPedidosPorTodos(): Set<Producto> { //opcional
        val todosLosPedidos = clientes.flatMap { it.obtenerProductosPedidos() }.toSet()
        return clientes.fold(todosLosPedidos) { pedidosPorTodos, cliente ->
            pedidosPorTodos.intersect(cliente.obtenerProductosPedidos())
        }
    }

    fun obtenerNumeroVecesProductoPedido(producto: Producto): Int =
        clientes
            .flatMap(Cliente::obtenerProductosPedidos)
            .count { it == producto }

    fun agrupaClientesPorCiudad(): Map<Ciudad, List<Cliente>> =
        clientes.groupBy { it.ciudad }


    fun mapeaNombreACliente(): Map<String, Cliente> = //opcional
        clientes.associateBy(Cliente::nombre)

    fun mapeaClienteACiudad(): Map<Cliente, Ciudad> = //opcional
        clientes.associateWith(Cliente::ciudad)

    fun mapeaNombreClienteACiudad(): Map<String, Ciudad> = //opcional
        clientes.associate { it.nombre to it.ciudad }

    fun obtenerClientesConMaxPedidos(): Cliente? = //opcional
        clientes.maxByOrNull { it.pedidos.size }
}

data class Cliente(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {
    override fun toString() = "$nombre from ${ciudad.nombre}"
    fun encuentraProductoMasCaro(): Producto? =
        pedidos
            .flatMap(Pedido::productos)
            .maxByOrNull(Producto::precio)

    fun obtenerProductoMasCaroPedido(): Producto? = //opcional
        pedidos
            .filter(Pedido::estaEntregado)
            .flatMap(Pedido::productos)
            .maxByOrNull(Producto::precio)


    fun dineroGastado(): Double =
        pedidos.flatMap { it.productos }.sumOf { it.precio }


    fun obtenerProductosPedidos(): List<Producto> =
        pedidos.flatMap(Pedido::productos)
}

data class Pedido(val productos: List<Producto>, val estaEntregado: Boolean)

data class Producto(val nombre: String, val precio: Double) {
    override fun toString() = "'$nombre' for $precio"
}

data class Ciudad(val nombre: String) {
    override fun toString() = nombre

}