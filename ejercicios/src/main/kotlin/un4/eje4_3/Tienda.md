# Relacion 4.3
> Se evaluará el RA6, CE 
Esta tarea está inspirada en [GS Collections Kata.](https://github.com/goldmansachs/gs-collections-kata)

>Para los ejercicios se usará como base el archivo Shop.kt.

#### Los puntos marcados con (Ampliación) con opcionales. 

**4.3.1** Kotlin tiene métodos para transformar de un tipo a otro de coleciones. Normalmente comienzan con `to`, por ejemplo `toSet`. 

- Implementa un método para obtener un conjunto de todos los clientes.
```Kt
  fun Tienda.obtenerConjuntoDeClientes(): ?

```


**4.3.2** Implementa los siguientes métodos para **filtrar** datos, que devolverán:
- un conjunto de las ciudades de donde son los clientes, puedes hacer uso de `map`

```kt
fun Tienda.obtenerCiudadesDeClientes(): Set<Ciudad> =
TODO()  
```

- una lista de los clientes que viven en una determinada ciudad determinada, puedes hacer uso de `filter`.

```Kt 
fun Tienda.obtenerClientesPor(ciudad:Ciudad): List<Cliente> =  
TODO()  
```

**4.3.3** Implementa los siguientes métodos, recomendado haciendo uso de  `all`, `any`, `count` y `find`. Piensa cuál usar en los siguientes métodos:

- Método que devuelve true si todos los clientes son de una determinada ciudad

```Kt
fun Tienda.checkTodosClientesSonDe(ciudad : Ciudad): Boolean =
TODO()
```

- Método que devuelve true si al menos un cliente es de una determinada ciudad
```Kt
fun Tienda.hayClientesDe(ciudad: Ciudad): Boolean =
TODO()
```
- Método que devuelve el número de cliente de una determinada ciudad
```Kt
fun Tienda.cuentaClientesDe(ciudad: Ciudad): Int =
TODO()
```
- Método que devuelve los clientes que viven en una ciudad dada o lista vacia si no hay ninguno
```Kt
fun Tienda.encuentraClientesDe(ciudad: Ciudad): List<Cliente> =
TODO()
```
- Método que devuelve el primer cliente que viven en una ciudad dada o null si no hay ninguno
```Kt
fun Tienda.encuentraClienteDe(ciudad: Ciudad): Cliente? =
TODO()
```

**4.3.4** Implementa un método para que devuelva una lista de clientes, **ordenadas** descendientemente por el número de pedidos que ellos han realizado. Puedes hacer uso de `sortedDescending` o `sortedByDescending`.
```Kt
fun Tienda.obtenerClientesOrdenadosPorPedidos(): List<Cliente> =
TODO()
```

**4.3.5** Implementa un método para que devuelva una lista de clientes que tiene más pedidos sin entregar que entregados, puedes hacer uso de `Partition`.
```Kt
fun Tienda.obtenerClientesConPedidosSinEntregar(): Set<Cliente> = 
TODO()
```

**4.3.6** Implementa un método para que devuelva 

- Los productos pedidos por un cliente, pudiendo usar flatmap
```Kt
fun Cliente.obtenerProductosPedidos(): List<Producto> =
TODO()
```

- Los productos que fueron pedidos por al menos un cliente.
```Kt
fun Tienda.obtenerProductosPedidos(): Set<Producto> =
TODO()
```

**4.3.7**(Ampliación) Implementa un método para que devuelva el conjunto de productos que han sido pedidos por TODOS los clientes. Puedes usar `flatMap` y `fold` y Puedes usar `Cliente.obtenerProductosPedidos()`
```Kt
fun Tienda.obtenerProductosPedidosPorTodos(): Set<Producto> =
TODO()
```

**4.3.8** Implementa un método para que devuelva

- Encuentra el producto más caro entre los productos entregados pedidos por el cliente. Usa `Pedido.estaEntregado`
```Kt
fun Cliente.encuentraProductoMasCaro(): Producto? = 
TODO()
```

- Cuenta la cantidad de veces que un producto se ha pedido. Ten en cuenta que un cliente puede pedir el pedido varias veces. Puedes usar `Cliente.obtenerProductosPedidos()`
```Kt
fun Tienda.obtenerNumeroVecesProductoPedido(producto: Producto): Int = 
TODO()
```

**4.3.9** Implementa un método para que un map que almacene los clientes viviendo en una determinada ciudad. Puedes usar `groupBy`
```Kt
fun Tienda.agrupaClientesPorCiudad(): Map<Ciudad, List<Cliente>> =
TODO()
```

**4.3.10**(Ampliación) Implementa un método para que devuelva
- un mapa desde el nombre del cliente al cliente, puedes usar `associateBy`
```Kt
fun Tienda.mapeaNombreACliente(): Map<String, Cliente> =
TODO()
```
- un mapa desde el cliente a su ciudad, puedes usar `associateWith`
```Kt
fun Tienda.mapeaClienteACiudad(): Map<Cliente, Ciudad> =
TODO()
```
- un mapa desde el nombre del cliente a su ciudad, puedes usar `associate`
```Kt
fun Tienda.mapeaNombreClienteACiudad(): Map<String, Ciudad> =
TODO()
```
**4.3.11**(Ampliación) Implementa un método para que devuelva
- el cliente que ha realizado más pedidos en la tienda, puedes usar `maxByOrNull`.
```Kt
fun Tienda.obtenerClientesConMaxPedidos(): Cliente? =
TODO()
```

- el producto más caro que ha pedido el cliente, puedes usar `flapMap` y `maxByOrNull` y callable references.
```Kt
fun Cliente.obtenerProductoMasCaroPedido(): Producto? =
TODO()
```
**4.3.12** Implementa un método para que devuelva
- la suma de los precios de todos los productos pedidos por un cliente, puedes usar `flatMap` y `sumOf`
```Kt
fun Cliente.dineroGastado(): Double =
TODO()
```



## Recursos
- https://kotlinlang.org/docs/collection-filtering.html#test-predicates
- https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition

