# 47 - Colecciones - Set y MutableSet

La clase Set y MutableSet (conjunto) permiten almacenar un conjunto de elementos que deben ser todos distintos. No
permite almacenar datos repetidos.

Un conjunto es una colección de elementos sin un orden específico a diferencia de las listas.

### Problema 1

Crear un conjunto mutable (MutableSet) con una serie de valores Int. Probar las propiedades y métodos principales para
administrar el conjunto.

#### Proyecto187 - Principal.kt

```Kt
fun main(args: Array<String>) {
    val conjunto1: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)
    println("Listado completo del conjunto")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    println("Cantidad de elementos del conjunto: ${conjunto1.size}")
    conjunto1.add(500)
    println("Listado completo del conjunto luego de agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    conjunto1.add(500)
    println("Listado completo del conjunto luego de volver a agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    println("Eliminamos el elemento 500 del conjunto")
    conjunto1.remove(500)
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    val cant = conjunto1.count { it >= 10 }
    println("Cantidad de elementos con valores superiores o igual a 10: $cant")
}

```

Creamos un MutableSet con elementos de tipo Int y almacenamos 5 enteros:

```Kt
val conjunto1: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)
```

Podemos recorrer con un for todos los elementos de un conjunto igual que las otras colecciones que proporciona Kotlin:

```Kt
for(elemento in conjunto1)
   print("$elemento ")
```

Para añadir un nuevo elemento a un conjunto llamamos al método add (esto se puede hacer solo con la clase MutableSet y
no con Set):

```Kt
conjunto1.add(500)
```

Si el elemento que enviamos al método add ya existe luego no se inserta (esto debido a que las colecciones de tipo
conjunto no pueden tener valores repetidos)

Para verificar si un elemento se encuentra contenido en el conjunto podemos hacerlo mediante el operador in:

```Kt
if (500 in conjunto1)
   println("El 500 está almacenado en el conjunto")
else
   println("El 500 no está almacenado en el conjunto")
```

Para eliminar un elemento del conjunto podemos llamar al método remove y pasar el valor a eliminar:

```Kt
conjunto1.remove(500)
```

Si queremos conocer todas las propiedades y métodos de MutableSet podemos visitar la documentación de
la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html) de
Kotlin.

Lo mismo para Set podemos visitar la documentación de
la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) de Kotlin.

### Problema 1

Crear un conjunto inmutable que almacene las fechas de este año que son feriados. Ingresar luego por teclado una fecha y
verificar si se encuentra en el conjunto de feriados

#### Proyecto188 - Principal.kt

```Kt
data class Fecha(val dia: Int, val mes: Int, val año: Int)

fun main(args: Array<String>) {
    var feriados: Set<Fecha> = setOf(Fecha(1, 1, 2017),
                                     Fecha(25, 12, 2017))
    println("Ingrese una fecha")
    print("Ingrese el día:")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes:")
    val mes = readLine()!!.toInt()
    print("Ingrese el año:")
    val año = readLine()!!.toInt()
    if (Fecha(dia, mes, año) in feriados)
        println("La fecha ingresada es feriado")
    else
        println("La fecha ingresada no es feriado")

}
```

Declaramos un data class que representa una fecha:

```Kt
data class Fecha(val dia: Int, val mes: Int, val año: Int)
```

Definimos un conjunto inmutable de tipo Fecha y guardamos dos fechas mediante la llamada a la función setOf:

```Kt
var feriados: Set<Fecha> = setOf(Fecha(1, 1, 2017),
                                Fecha(25, 12, 2017))
```

Cargamos una fecha cualquiera por teclado:

```Kt
println("Ingrese una fecha")
print("Ingrese el día:")
val dia = readLine()!!.toInt()
print("Ingrese el mes:")
val mes = readLine()!!.toInt()
print("Ingrese el año:")
val año = readLine()!!.toInt()
```

Mediante el operador in verificamos si la fecha ingresada se encuentra en el conjunto de feriados:

```Kt
if (Fecha(dia, mes, año) in feriados)
   println("La fecha ingresada es feriado")
else
   println("La fecha ingresada no es feriado")
```

## Problema propuesto

189. Definir un MutableSet y almacenar 6 valores aleatorios comprendidos entre 1 y 50. El objeto de tipo MutableSet
     representa un cartón de lotería. Comenzar a generar valores aleatorios (comprendidos entre 1 y 5) todos distintos y
     detenerse cuando salgan todos los que contiene el cartón de lotería. Mostrar cuantos números tuvieron que sortearse
     hasta que se completó el cartón.

## Bibliografía
https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=47&codigo=47&inicio=45