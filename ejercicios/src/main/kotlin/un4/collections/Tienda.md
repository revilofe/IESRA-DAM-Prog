# Relacion 4.2 
>Para los ejercicios se usará como base el archivo Shop.kt

**4.2.1** Kotlin tiene metodos para transformar de un tipo a otro de colleciones. Normalmente comientan con `to`, por ejemplo `toSet`. 

Implementa  una función `Tienda.obtenerConjuntoDeClientes()`.


**4.2.2** Implementa los siguientes métodos
- `Tienda.obtenerCiudadesDeClientes()` que devolverá un conjunto de las ciudades de donde son los clientes.
- `Tienda.obtenerClientesPorCiudad()` que devolverá una lista de los clientes que viven en una determinada ciudad determinada.

pista
```Kt
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```

**4.2.3** Implementa los siguientes métodos, usando `all`, `any`, `count` y `find`

- Método que devuelve true si todos los clientes son de una determinada ciudad
```
fun Tienda.checkTodosClientesSonDe(ciudad : Ciudad): Boolean =
TODO()
```

- Método que devuelve true si al menos un cliente es de una determinada ciudad
```
fun Tieda.hayClientesDe(ciudad: Ciudad): Boolean =
TODO()
```
- Método que devuelve el número de cliente de una determinada ciudad
```
fun Tienda.cuentaClientesDe(ciudad: Ciudad): Int =
TODO()
```
- Método que devuelve un cliente que vive en una ciudad dada o nulo si no hay ninguno
```
fun Tienda.encuentraClienteDe(ciudad: Ciudad): Customer =
TODO()
```

## Recursos
- https://kotlinlang.org/docs/collection-filtering.html#test-predicates
- https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition

