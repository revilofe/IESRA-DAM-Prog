# Relacion 4.2 
>Para los ejercicios se usará como base el archivo Shop.kt

**4.2.1** Kotlin tiene métodos para transformar de un tipo a otro de coleciones. Normalmente comienzan con `to`, por ejemplo `toSet`. 

- Implementa  un método 
```
  fun Tienda.obtenerConjuntoDeClientes(): ?
```


**4.2.2** Implementa los siguientes métodos para **filtrar** datos, que devolverán:
- un conjunto de las ciudades de donde son los clientes.

```
fun Tienda.obtenerCiudadesDeClientes(): Set<Ciudad> =
TODO()  
```

- una lista de los clientes que viven en una determinada ciudad determinada.

```
fun Tienda.obtenerClientesPorCiudad(): List<Cliente> =  
TODO()  
```

pista
```Kt
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```

**4.2.3** Implementa los siguientes métodos, usando `all`, `any`, `count` y `find`

- Método que devuelve true si todos los clientes son de una determinada ciudad
```Kt
fun Tienda.checkTodosClientesSonDe(ciudad : Ciudad): Boolean =
TODO()
```

- Método que devuelve true si al menos un cliente es de una determinada ciudad
```Kt
fun Tieda.hayClientesDe(ciudad: Ciudad): Boolean =
TODO()
```
- Método que devuelve el número de cliente de una determinada ciudad
```Kt
fun Tienda.cuentaClientesDe(ciudad: Ciudad): Int =
TODO()
```
- Método que devuelve un cliente que vive en una ciudad dada o nulo si no hay ninguno
```Kt
fun Tienda.encuentraClienteDe(ciudad: Ciudad): Customer =
TODO()
```

**4.2.4** Implementa un método para que devuelva una lista de clientes, **ordenadas** descendientemente por el numero de pedidos que ellos han realizado.
```Kt
fun Tienda.obtenerClientesOrdenadosPorPedidos(): List<Clientes> =
TODO()
```

**4.2.5** Implementa un método para que devuelva una lista de clientes que tiene mas pedidos sin entregar que entregados.
```Kt
fun Tienda.obtenerClientesConPedidosSinEngregar(): Set<Cliente> = 
TODO()
```

**4.2.6** Implementa un método para que devuelva 

- Los productos que un determinado cliente ha pedido.
```Kt
fun Cliente.obtenerProductosPedidos(): List<Producto> =
TODO()
```

- Los productos que fueron pedidos por al menos un cliente.
```Kt
fun Tienda.obtenerProductosPedidos(): Set<Producto> =
TODO()
```



## Recursos
- https://kotlinlang.org/docs/collection-filtering.html#test-predicates
- https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition

