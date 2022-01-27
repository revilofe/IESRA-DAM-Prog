# 45 - Colecciones - List y MutableList

Una lista es una colección ordenada de datos. Se puede recuperar un elemento por la posición que se encuentra en la colección.

Podemos crear en Kotlin tanto listas inmutables como mutables.

### Creación de una lista inmutable.

### Problema 1

Crear una lista inmutable con los días de la semana. Probar las propiedades y métodos principales para administrar la lista.

Para crea una lista inmutable podemos llamar a la función listOf y pasar como parámetro los datos a almacenar, debemos indicar el tipo de datos que almacena luego de List:

```Kt
var lista1: List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")
```

Una vez creada la lista no podemos modificar sus datos:

```Kt
lista1[0] = "domingo"
```

Tampoco podemos agregar elementos:

<pre><del>lista1.add("enero")</del>
</pre>

Lo que podemos hacer con una lista inmutable es acceder a sus elementos, por ejemplo recorrerla con un for:

```Kt
for(elemento in lista1)
   print("$elemento ")
```

Acceder a cualquier elemento por un subíndice:

```Kt
println("Imprimir el primer elemento de la lista")
println(lista1[0])
```

Si queremos conocer todas las propiedades y métodos de List podemos visitar la documentación de la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) de Kotlin.

### Problema 2

Veamos otro ejemplo de crear una lista inmutable pero utilizando la función List a la cual le pasamos el tamaño de la lista y una función lambda indicando que valores almacenar:

#### Proyecto174 - Principal.kt

```Kt
fun cargar(): Int {
    print("Ingrese un entero:")
    val valor = readLine()!!.toInt()
    return valor
}

fun main(args: Array<String>) {
    var lista1: List<Int> = List(5, {cargar()})
    println(lista1)
}
```

En este ejemplo creamos una lista inmutable llamando a la función List a la cual le pasamos en el primer parámetro el tamaño de la lista a crear y el segundo parámetro es la función lambda que se ejecutará para cada elemento.

En la función lambda llamamos a cargar pero podríamos haber codificado en dicho lugar la carga:

```Kt
fun main(args: Array<String>) {
    var lista1: List<Int> = List(5) {
        print("Ingrese un entero:")
        val valor = readLine()!!.toInt()
        valor
    }
    println(lista1)
}
```

El valor que retorna la función lambda es el dato que se va almacenando en cada componente de la colección.

### Creación de una lista mutable.

### Problema 3

Crear una lista mutable con las edades de varias personas. Probar las propiedades y métodos principales para administrar la lista mutable.

#### Proyecto175 - Principal.kt

```Kt
fun main(args: Array<String>) {
    val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)
    println("Lista de edades")
    println(edades)
    edades[0] = 60
    println("Lista completa después de modificar la primer edad")
    println(edades)
    println("Primera edad almacenada en la lista")
    println(edades[0])
    println("Promedio de edades")
    println(edades.average())
    println("Agregamos una edad al final de la lista:")
    edades.add(50)
    println("Lista de edades")
    println(edades)
    println("Agregamos una edad al principio de la lista:")
    edades.add(0, 17)
    println("Lista de edades")
    println(edades)
    println("Eliminamos la primer edad de la lista:")
    edades.removeAt(0)
    println("Lista de edades")
    println(edades)
    print("Cantidad de personas mayores de edad:")
    val cant = edades.count { it >= 18 }
    println(cant)
    edades.removeAll { it == 12 }
    println("Lista de edades después de borrar las que tienen 12 años")
    println(edades)
    edades.clear()
    println("Lista de edades luego de borrar la lista en forma completa")
    println(edades)
    if (edades.isEmpty())
        println("No hay edades almacenadas en la lista")
}
```

Este ejemplo muestra como crear una lista mutable llamando a la función mutableListOf e indicando los valores iniciales:

```Kt
val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)
```

Para agregar un nuevo elemento a la lista al final llamamos al método add:

```Kt
edades.add(50)
```

Pero podemos agregarlo en cualquier posición dentro de la lista mediante el método add con dos parámetros, en el primero indicamos la posición y en el segundo el valor a almacenar:

```Kt
edades.add(0, 17)
```

Mediante el método count y pasando una lambda podemos contar todos los elementos que cumplen una condición:

```Kt
print("Cantidad de personas mayores de edad:")
val cant = edades.count { it >= 18 }
println(cant)
```

También podemos eliminar todos los elementos de la lista que cumplen una determinada condición indicada una lambda:

```Kt
edades.removeAll { it == 12 }
println("Lista de edades después de borrar las que tienen 12 años")
println(edades)
```

Si queremos conocer todas las propiedades y métodos de MutableList podemos visitar la documentación de la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html) de Kotlin.

### Problema 4

Crear una lista mutable de 20 elementos con valores aleatorios comprendidos entre 1 y 6.
Contar cuantos elementos tienen almacenado el valor 1.
Eliminar los elementos que almacenan un 6.

#### Proyecto176 - Principal.kt

```Kt
fun main(args: Array<String>) {
    val lista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }
    println("Lista completa")
    println(lista)
    val cant = lista.count { it == 1 }
    println("Cantidad de elementos con el valor 1: $cant")
    lista.removeAll { it == 6 }
    println("Lista luego de borrar los elementos con el valor 6")
    println(lista)
}
```

Para crear una lista de 20 elementos utilizamos la función MutableList y le pasamos en el primer parámetro la cantidad de elementos y en el segundo parámetro una lambda generando valores aleatorios comprendidos entre 1 y 6.

Para contar los elementos que almacenan un 1 utilizamos la función count y pasamos una lambda con la condición que se debe cumplir para ser contado:

```Kt
val cant = lista.count { it == 1 }
```

Para eliminar llamamos al método removeAll:

```Kt
lista.removeAll { it == 6 }
```

### Problema 5

Implementar una clase llamada Persona que tendrá como propiedades su nombre y edad.
Definir además dos métodos, uno que imprima las propiedades y otro muestre si es mayor de edad.

Definir una lista mutable de objetos de la clase Persona.
Imprimir los datos de todas las personas.
Imprimir cuantas personas son mayor de edad.

#### Proyecto177 - Principal.kt

```Kt
class Persona (var nombre: String, var edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main(args: Array<String>) {
    val personas: MutableList<Persona>
    personas = mutableListOf(Persona("Juan", 22), Persona("Ana", 19), Persona("Marcos", 12))
    println("Listado de todas personas")
    personas.forEach { it.imprimir() }
    val cant = personas.count { it.edad >= 18}
    println("La cantidad de personas mayores de edad es $cant")
}
```

Declaramos la clase Persona con dos propiedades y dos métodos:

```Kt
class Persona (var nombre: String, var edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}
```

Definimos una lista mutable que almacena componentes de tipo Persona:

```Kt
fun main(args: Array<String>) {
    val personas: MutableList<Persona>
```

Creamos la lista mediante el método mutableListOf y le pasamos la referencia de tres objetos de la clase Persona:

```Kt
personas = mutableListOf(Persona("Juan", 22), Persona("Ana", 19), Persona("Marcos", 12))
```

Imprimimos todos los datos de las personas procesando cada objeto almacenado en la lista llamando al método forEach y en la función lambda llamando al método imprimir de cada persona:

```Kt
println("Listado de todas personas")
personas.forEach { it.imprimir() }
```

Finalmente contamos la cantidad de personas mayores de edad:

```Kt
val cant = personas.count { it.edad >= 18}
println("La cantidad de personas mayores de edad es $cant")
```

## Problemas propuestos

178. Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20.
     contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13.
     Imprimir si el valor 20 está presente en la lista.
179. Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.
     Definir una lista mutable con tres empleados.
     Imprimir los datos de los empleados.
     Calcular cuanto gasta la empresa en sueldos.
     Agregar un nuevo empleado a la lista y calcular nuevamente el gasto en sueldos.
180. Cargar por teclado y almacenar en una lista inmutable las alturas de 5 personas (valores Float)
     Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
     Colecciones-List&MutableList.mdColecciones-List&MutableList.md
