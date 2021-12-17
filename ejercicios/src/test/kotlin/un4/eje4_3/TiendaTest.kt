package un4.eje4_3

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


import org.junit.jupiter.api.Assertions.*

internal class TiendaTest {

    val idea = Producto("IntelliJ IDEA Ultimate", 199.0)
    val reSharper = Producto("ReSharper", 149.0)
    val dotTrace = Producto("DotTrace", 159.0)
    val dotMemory = Producto("DotTrace", 129.0)
    val dotCover = Producto("DotCover", 99.0)
    val appCode = Producto("AppCode", 99.0)
    val phpStorm = Producto("PhpStorm", 99.0)
    val pyCharm = Producto("PyCharm", 99.0)
    val rubyMine = Producto("RubyMine", 99.0)
    val webStorm = Producto("WebStorm", 49.0)
    val teamCiudad = Producto("TeamCiudad", 299.0)
    val youTrack = Producto("YouTrack", 500.0)

    //clientes
    val lucas = "Lucas"
    val cooper = "Cooper"
    val nathan = "Nathan"
    val reka = "Reka"
    val bajram = "Bajram"
    val asuka = "Asuka"

    //cities
    val Canberra = Ciudad("Canberra")
    val Vancouver = Ciudad("Vancouver")
    val Budapest = Ciudad("Budapest")
    val Ankara = Ciudad("Ankara")
    val Tokyo = Ciudad("Tokyo")

    fun cliente(nombre: String, Ciudad: Ciudad, vararg pedidos: Pedido) = Cliente(nombre, Ciudad, pedidos.toList())
    fun pedido(vararg productos: Producto, isDelivered: Boolean = true) = Pedido(productos.toList(), isDelivered)
    fun tienda(nombre: String, vararg clientes: Cliente) = Tienda(nombre, clientes.toList())

    val tienda = tienda(
        "jb test tienda",
        cliente(
            lucas, Canberra,
            pedido(reSharper),
            pedido(reSharper, dotMemory, dotTrace)
        ),
        cliente(cooper, Canberra),
        cliente(
            nathan, Vancouver,
            pedido(rubyMine, webStorm)
        ),
        cliente(
            reka, Budapest,
            pedido(idea, isDelivered = false),
            pedido(idea, isDelivered = false),
            pedido(idea)
        ),
        cliente(
            bajram, Ankara,
            pedido(reSharper)
        ),
        cliente(
            asuka, Tokyo,
            pedido(idea)
        )
    )

    val clientes: Map<String, Cliente> = tienda.clientes.associateBy { it.nombre }

    val productosPedidos = setOf(idea, reSharper, dotTrace, dotMemory, rubyMine, webStorm)

    val groupedByCities = mapOf(
        Canberra to listOf(lucas, cooper),
        Vancouver to listOf(nathan),
        Budapest to listOf(reka),
        Ankara to listOf(bajram),
        Tokyo to listOf(asuka)
    ).mapValues { it.value.map { nombre -> clientes[nombre] } }

    @BeforeEach
    fun setUp() {

    }


    @Test
    fun obtenerConjuntoDeClientes() {
        assertTrue(
            tienda.obtenerConjuntoDeClientes() == clientes.values.toSet(),
            errorMessage("Tienda.obtenerConjuntoDeClientes")
        )
    }

    @Test
    fun obtenerCiudadesDeClientes() {
        assertTrue(
            setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo) == tienda.obtenerCiudadesDeClientes(),
            errorMessage("Tienda.obtenerCiudadesDeClientes")
        )
    }

    @Test
    fun checkTodosClientesSonDe() {
        assertFalse(tienda.checkTodosClientesSonDe(Canberra), errorMessage("Tienda.checkTodosClientesSonDe"))
    }

    @Test
    fun hayClientesDe() {
        assertTrue(tienda.hayClientesDe(Canberra), errorMessage("Tienda.hayClientesDe"))

    }

    @Test
    fun cuentaClientesDe() {
        assertTrue(2 == tienda.cuentaClientesDe(Canberra), errorMessage("Tienda.cuentaClientesDe"))
    }

    @Test
    fun encuentraClienteDe() {

        assertTrue(
            clientes[lucas] == tienda.encuentraClienteDe(Canberra),
            errorMessage("Tienda.encuentraClienteDe")
        )
    }

    @Test
    fun obtenerClientesPor() {
        assertTrue(
            listOf(clientes[lucas], clientes[cooper]) == tienda.obtenerClientesPor(Canberra),
            errorMessage("Tienda.obtenerClientesPor")
        )
    }

    @Test
    fun obtenerClientesOrdenadosPorPedidos() {
        val errorMessage = errorMessage("Tienda.obtenerClientesOrdenadosPorPedidos")
        val actual = tienda.obtenerClientesOrdenadosPorPedidos()
        assertTrue(6 == actual.size, errorMessage)
        assertTrue(clientes[reka] == actual[0], errorMessage)
        assertTrue(clientes[lucas] == actual[1], errorMessage)
        assertTrue(clientes[cooper] == actual[5], errorMessage)
        assertTrue(setOf(clientes[nathan], clientes[bajram], clientes[asuka]) == actual.subList(2, 5).toSet())
    }

    @Test
    fun obtenerClientesConPedidosSinEntregar() {
        assertTrue(
            setOf(clientes[reka]) == tienda.obtenerClientesConPedidosSinEntregar(),
            errorMessage("Tienda.obtenerClientesConPedidosSinEntregar")
        )
    }

    @Test
    fun testObtenerProductosPedidos() {
        assertTrue(productosPedidos == tienda.obtenerProductosPedidos(), errorMessage("Tienda.obtenerProductosPedidos"))
    }

    @Test
    fun obtenerProductosPedidosPorTodos() {
        val testShop = tienda(
            "test shop for 'fold'",
            cliente(
                lucas, Canberra,
                pedido(idea),
                pedido(webStorm)
            ),
            cliente(
                reka, Budapest,
                pedido(idea),
                pedido(youTrack)
            )
        )
        assertTrue(
            setOf(idea) == testShop.obtenerProductosPedidosPorTodos(),
            errorMessage("Tienda.obtenerProductosPedidosPorTodos")
        )
    }

    @Test
    fun obtenerNumeroVecesProductoPedido() {
        assertTrue(
            3 == tienda.obtenerNumeroVecesProductoPedido(reSharper),
            errorMessage("Tienda.obtenerNumeroVecesProductoPedido")
        )
    }

    @Test
    fun agrupaClientesPorCiudad() {
        assertTrue(
            groupedByCities == tienda.agrupaClientesPorCiudad(),
            errorMessage("Tienda.agrupaClientesPorCiudad()")
        )
    }

    @Test
    fun mapeaNombreACliente() {
        val expected = clientes.values.associateBy { it.nombre }
        val actual = tienda.mapeaNombreACliente()
        assertTrue(expected == actual, errorMessage("Tienda.mapeaNombreACliente"))
    }

    @Test
    fun mapeaClienteACiudad() {
        val expected = clientes.values.associateWith { it.ciudad }
        val actual = tienda.mapeaClienteACiudad()
        assertTrue(expected == actual, errorMessage("Tienda.mapeaClienteACiudad"))
    }

    @Test
    fun mapeaNombreClienteACiudad() {
        val expected = clientes.values.associate { it.nombre to it.ciudad }
        val actual = tienda.mapeaNombreClienteACiudad()
        assertTrue(expected == actual, errorMessage("Tienda.mapeaNombreClienteACiudad"))
    }

    @Test
    fun obtenerClientesConMaxPedidos() {
        assertTrue(
            clientes[reka] == tienda.obtenerClientesConMaxPedidos(),
            errorMessage("Tienda.obtenerClientesConMaxPedidos")
        )
    }

    @Test
    fun dineroGastado1() {
        assertTrue(clientes[nathan]?.dineroGastado() == 148.0, errorMessage("Cliente.dineroGastado"))
    }

    @Test
    fun dineroGastado2() {
        assertTrue(
            clientes[lucas]?.dineroGastado() == 586.0,
            errorMessage("Cliente.dineroGastado") + ": Un producto pedido varias veces debe ser contado tantas veces como haya sido pedido"
        )
    }

    @Test
    fun obtenerProductoMasCaroPedido() {
        val testShop = tienda(
            "test shop for 'most expensive delivered product'",
            cliente(
                lucas, Canberra,
                pedido(idea, isDelivered = false),
                pedido(reSharper)
            )
        )
        assertTrue(
            reSharper == testShop.clientes[0].obtenerProductoMasCaroPedido(),
            errorMessage("Cliente.obtenerProductoMasCaroPedido")
        )
    }

    @Test
    fun encuentraProductoMasCaro() {
        assertTrue(
            rubyMine == clientes[nathan]?.encuentraProductoMasCaro(),
            errorMessage("getMostExpensiveProductBy")
        )
    }

    @Test
    fun obtenerProductosPedidosPorCliente() {
        assertTrue(
            listOf(idea, idea, idea) == clientes[reka]?.obtenerProductosPedidos(),
            errorMessage("Cliente.obtenerProductosPedidos")
        )
    }

    fun errorMessage(functionName: String) =
        "El método '$functionName' se ha implementado INCORRECTAMENTE!!\n"
}