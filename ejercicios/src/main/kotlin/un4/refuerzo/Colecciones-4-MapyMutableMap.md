# 46 - Colecciones - Map y MutableMap

La estructura de datos Map (Mapa) utiliza una clave para acceder a un valor. El subíndice puede ser cualquier tipo de
clase, lo mismo que su valor

Podemos relacionarlo con conceptos que conocemos:

* Un diccionario tradicional que conocemos podemos utilizar un Map de Kotlin para representarlo. La clave sería la
  palabra y el valor sería la definición de dicha palabra.
* Una agenda personal también la podemos representar como un Map. La fecha sería la clave y las actividades de dicha
  fecha sería el valor.
* Un conjunto de usuarios de un sitio web podemos almacenarlo en un Map. El nombre de usuario sería la clave y como
  valor podríamos almacenar su mail, clave, fechas de login etc.

Hay muchos problemas de la realidad que se pueden representar mediante un Map.

### Problema 1

En el bloque principal del programa definir un Map inmutable que almacene los nombres de países como clave y como valor
la cantidad de habitantes de dicho pais. Probar distintos métodos y propiedades que nos provee la clase Map.

#### Proyecto181 - Principal.kt

```Kt
fun main(args: Array<String>) {
    val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
                                          Pair("españa", 46000000),
                                          Pair("uruguay", 3400000))
    println("Listado completo del Map")
    println(paises)
    for ((clave, valor) in paises)
        println("Para la clave $clave tenemos almacenado $valor")
    println("La cantidad de elementos del mapa es ${paises.size}")
    val cantHabitantes1: Int? = paises["argentina"]
    if (cantHabitantes1 != null)
        println("La cantidad de habitantes de argentina es $cantHabitantes1")
    val cantHabitantes2: Int? = paises["brasil"]
    if (cantHabitantes2 != null)
        println("La cantidad de habitantes de brasil es $cantHabitantes2")
    else
        println("brasil no se encuentra cargado en el Map")
    var suma = 0
    paises.forEach { suma += it.value }
    println("Cantidad total de habitantes de todos los paises es $suma")
}
```

Para crear un Map en Kotlin debemos definir una variable e indicar de que tipo de datos son la clave del mapa y el valor
que almacena. Mediante la función mapOf retornamos un Map indicando cada entrada en nuestro Map mediante un objeto Pair:

```Kt
val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
                                      Pair("españa", 46000000),
                                      Pair("uruguay", 3400000))
```

Hemos creado un Map que almacena tres entradas.

La función println nos permite mostrar el Map en forma completo:

```Kt
println("Listado completo del Map")
println(paises)
```

Si queremos recorrer e ir imprimiendo elemento por elemento las componentes del mapa podemos hacerlo mediante un for, en
cada iteración recuperamos una clave y su valor:

```Kt
for ((clave, valor) in paises)
    println("Para la clave $clave tenemos almacenado $valor")
```

Como las listas la clase Map dispone de una propiedad size que nos retorna la cantidad de elementos del mapa:

```Kt
println("La cantidad de elementos del mapa es ${paises.size}")
```

Si necesitamos recuperar el valor para una determinada clave podemos hacerlo por medio de la sintaxis:

```Kt
val cantHabitantes1: Int? = paises["argentina"]
```

Como puede suceder que no exista la clave buscada en el mapa definimos la variable cantHabitantes1 de Int? ya que puede
almacenar un null si no existe el pais buscado.

Luego con un if podemos controlar si se recuperó la cantidad de habitantes para el país buscado:

```Kt
if (cantHabitantes1 != null)
    println("La cantidad de habitantes de argentina es $cantHabitantes1")
val cantHabitantes2: Int? = paises["brasil"]
if (cantHabitantes2 != null)
    println("La cantidad de habitantes de brasil es $cantHabitantes2")
else
    println("brasil no se encuentra cargado en el Map")
```

Finalmente para acumular la cantidad de habitantes de todos los paises podemos recorrer el Map y sumar el valor de cada
componente:

```Kt
var suma = 0
paises.forEach { suma += it.value }
println("Cantidad total de habitantes de todos los paises es $suma")
```

Otra sintaxis común para crear el Map en Kotlin es:

```Kt
val paises: Map<String, Int> = mapOf( "argentina" to 40000000,
                                      "españa" to 46000000,
                                      "uruguay" to 3400000)
```

La función `to` ya veremos que mediante una definición "infix" podemos pasar un parámetro, luego el nombre de la función
y finalmente el segundo parámetro. La función to ya existe y tiene esta sintaxis:

```Kt
public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
```

Ya veremos más adelante funciones con notación infix y con parámetros genéricos. Podemos comprobar que la función
retorna un objeto de la clase Pair.

Si queremos conocer todas las propiedades y métodos de Map podemos visitar la documentación de
la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) de Kotlin.

### Problema 2

Crear un mapa que permita almacenar 5 artículos, utilizar como clave el nombre de productos y como valor el precio del
mismo. Desarrollar además las funciones de:

1) Imprimir en forma completa el diccionario
2) Mostrar la cantidad de artículos con precio superior a 20.

#### Proyecto182 - Principal.kt

```Kt
fun imprimir(productos: Map<String, Float>) {
    for((clave, valor) in productos)
        println("$clave tiene un precio $valor")
    println();
}

fun cantidadPrecioMayor20(productos: Map<String, Float>) {
    val cant = productos.count{ it.value > 20}
    println("Cantidad de productos con un precio superior a 20: $cant")
}

fun main(args: Array<String>) {
    val productos: Map<String, Float> = mapOf("papas" to 12.5f,
                                              "manzanas" to 26f,
                                              "peras" to 31f,
                                              "mandarinas" to 15f,
                                              "pomelos" to 28f)
    imprimir(productos)
    cantidadPrecioMayor20(productos)
}
```

En este caso creamos un mapa cuya clave es de tipo String y su valor es un Float:

```Kt
fun main(args: Array<String>) {
    val productos: Map<String, Float> = mapOf("papas" to 12.5f,
                                              "manzanas" to 26f,
                                              "peras" to 31f,
                                              "mandarinas" to 15f,
                                              "pomelos" to 28f)
```

Para mostrar el mapa en forma completo lo hacemos recorriendo por medio de un for:

```Kt
fun imprimir(productos: Map<String, Float>) {
    for((clave, valor) in productos)
        println("$clave tiene un precio $valor")
    println();
}
```

Para contar la cantidad de productos que tienen un precio superior a 20 llamamos al método count y le pasamos una
función lambda analizando el parámetro it en la propiedad value si cumple la condición de superar al valor 20:

```Kt
fun cantidadPrecioMayor20(productos: Map<String, Float>) {
    val cant = productos.count{ it.value > 20}
    println("Cantidad de productos con un precio superior a 20: $cant")
}
```

### Problema 3

Desarrollar una aplicación que nos permita crear un diccionario ingles/castellano. La clave es la palabra en ingles y el
valor es la palabra en castellano. Crear las siguientes funciones:

1) Cargar el diccionario (se ingresan por teclado la palabra en ingles y su traducción en castellano)
2) Listado completo del diccionario.
3) Ingresar por teclado una palabra en ingles y si existe en el diccionario mostrar su traducción.

#### Proyecto183 - Principal.kt

```Kt
fun cargar(diccionario: MutableMap<String, String>) {
    do {
        print("Ingrese palabra en castellano:")
        val palCastellano = readLine()!!
        print("Ingrese palabra en ingles:")
        val palIngles = readLine()!!
        diccionario[palIngles] = palCastellano
        print("Continua cargando otra palabra en el diccionario? (si/no):")
        val fin = readLine()!!
    } while (fin=="si")
}

fun listado(diccionario: MutableMap<String,String>) {
    for((ingles, castellano) in diccionario)
        println("$ingles: $castellano")
    println()
}

fun consultaIngles(diccionario: MutableMap<String, String>) {
    print("Ingrese una palabra en ingles para verificar su traducción:")
    val ingles = readLine()
    if (ingles in diccionario)
        println("La traducción en castellano es ${diccionario[ingles]}")
    else
        println("No existe esa palabra en el diccionario")
}

fun main(args: Array<String>) {
    val diccionario: MutableMap<String, String> = mutableMapOf()
    cargar(diccionario)
    listado(diccionario)
    consultaIngles(diccionario)
}
```

En la función main definimos un MutableMap vacío:

```Kt
fun main(args: Array<String>) {
    val diccionario: MutableMap<String, String> = mutableMapOf()
```

En la función cargar procedemos a ingresar una palabra en ingles y su traducción en castellano, para cargarla al Map
procedemos a acceder por medio del subíndice:

```Kt
        print("Ingrese palabra en castellano:")
        val palCastellano = readLine()!!
        print("Ingrese palabra en ingles:")
        val palIngles = readLine()!!
        diccionario[palIngles] = palCastellano
```

La función cargar finaliza cuando el operador carga un String distinto a "si":

```Kt
        print("Continua cargando otra palabra en el diccionario? (si/no):")
        val fin = readLine()!!
    } while (fin=="si")
```

Para controlar si un Map contiene una determinada clave lo podemos hacer mediante el operador in:

```Kt
    print("Ingrese una palabra en ingles para verificar su traducción:")
    val ingles = readLine()
    if (ingles in diccionario)
        println("La traducción en castellano es ${diccionario[ingles]}")
    else
        println("No existe esa palabra en el diccionario")
```

Si queremos conocer todas las propiedades y métodos de MutableMap podemos visitar la documentación de
la [biblioteca estándar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html) de
Kotlin.

### Problema 4

Confeccionar un programa que permita cargar un código de producto como clave en un Map. Guardar para dicha clave un
objeto de la clase Producto que defina como propiedades su nombre del producto, su precio y cantidad en stock.

Implementar las siguientes actividades:

1) Carga de datos en el Map.
2) Listado completo de productos.
3) Consulta de un producto por su clave, mostrar el nombre, precio y stock.
4) Cantidad de productos que tengan un stock con valor cero.

#### Proyecto184 - Principal.kt

```Kt
data class Producto(val nombre: String, val precio: Float, val cantidad: Int)

fun cargar(productos: MutableMap<Int, Producto>) {
    productos[1] = Producto("Papas", 13.15f, 200)
    productos[15] = Producto("Manzanas", 20f, 0)
    productos[20] = Producto("Peras", 3.50f, 0)
}

fun listadoCompleto(productos: MutableMap<Int, Producto>) {
    println("Listado completo de productos")
    for((codigo, producto) in productos)
        println("Código: $codigo  Descripción ${producto.nombre} Precio: ${producto.precio} Stock Actual: ${producto.cantidad}")
    println()
}

fun consultaProducto(productos: MutableMap<Int, Producto>) {
    print("Ingrese el código de un producto:")
    val codigo = readLine()!!.toInt()
    if (codigo in productos)
        println("Nombre: ${productos[codigo]?.nombre} Precio: ${productos[codigo]?.precio} Stock: ${productos[codigo]?.cantidad}")
    else
        println("No existe un producto con dicho código")
}

fun sinStock(productos: MutableMap<Int, Producto>) {
    val cant = productos.count { it.value.cantidad == 0 }
    println("Cantidad de artículos sin stock: $cant")
}

fun main(args: Array<String>) {
    val productos: MutableMap<Int, Producto> = mutableMapOf()
    cargar(productos);
    listadoCompleto(productos)
    consultaProducto(productos)
    sinStock(productos)
}
```

Definimos un Map mutable en la función main y llamamos a una serie de funciones donde en uno lo cargamos y en el resto
procesamos sus elementos:

```Kt
fun main(args: Array<String>) {
    val productos: MutableMap<Int, Producto> = mutableMapOf()
    cargar(productos);
    listadoCompleto(productos)
    consultaProducto(productos)
    sinStock(productos)
}
```

En la función de cargar llega el Map y agregamos tres productos:

```Kt
fun cargar(productos: MutableMap<Int, Producto>) {
    productos[1] = Producto("Papas", 13.15f, 200)
    productos[15] = Producto("Manzanas", 20f, 0)
    productos[20] = Producto("Peras", 3.50f, 0)
}
```

La función que analiza la cantidad de productos sin stock lo hacemos llamando a count y pasando una función lambda que
contará todos los productos cuya cantidad sea cero:

```Kt
fun sinStock(productos: MutableMap<Int, Producto>) {
    val cant = productos.count { it.value.cantidad == 0 }
    println("Cantidad de artículos sin stock: $cant")
}
```

### Problema 5

Se desea almacenar los datos de n alumnos (n se ingresa por teclado). Definir un MutableMap cuya clave sea el número de
documento del alumno. Como valor almacenar una lista con componentes de la clase Materia donde almacenamos nombre de
materia y su nota.

Crear las siguientes funciones:

1) Carga de los alumnos (de cada alumno solicitar su dni y los nombres de las materias y sus notas)
2) Listado de todos los alumnos con sus notas
3) Consulta de un alumno por su dni, mostrar las materias que cursa y sus notas.

#### Proyecto185 - Principal.kt

```Kt
data class Materia(val nombre: String, val nota: Int)

fun cargar(alumnos: MutableMap<Int, MutableList<Materia>>) {
    print("Cuantos alumnos cargará ?:")
    val cant = readLine()!!.toInt()
    for(i in 1..cant) {
        print("Ingrese dni:")
        val dni = readLine()!!.toInt()
        val listaMaterias = mutableListOf<Materia>()
        do {
            print("Ingrese materia del alumno:")
            val nombre = readLine()!!
            print("Ingrese nota:")
            val nota = readLine()!!.toInt()
            listaMaterias.add(Materia(nombre, nota))
            print("Ingrese otra nota (si/no):")
            val opcion = readLine()!!
        } while (opcion == "si")
        alumnos[dni] = listaMaterias
    }
}

fun imprimir(alumnos: MutableMap<Int, MutableList<Materia>>) {
    for((dni, listaMaterias) in alumnos) {
        println("Dni del alumno: $dni")
        for(materia in listaMaterias) {
            println("Materia: ${materia.nombre}")
            println("Nota: ${materia.nota}")
        }
        println()
    }
}

fun consultaPorDni(alumnos: MutableMap<Int, MutableList<Materia>>) {
    print("Ingrese el dni del alumno a consultar:")
    val dni = readLine()!!.toInt()
    if (dni in alumnos) {
        println("Cursa las siguentes materias")
        val lista = alumnos[dni]
        if (lista!=null)
            for((nombre, nota) in lista) {
                println("Nombre de materia: $nombre")
                println("Nota: $nota")
            }
    }
}

fun main(args: Array<String>) {
    val alumnos: MutableMap<Int, MutableList<Materia>> = mutableMapOf()
    cargar(alumnos)
    imprimir(alumnos)
    consultaPorDni(alumnos)
}
```

A medida que tenemos que representar conceptos más complejos necesitamos definir en este caso un Map cuya clave es un
entero pero su valor es una lista mutable con elementos de la clase Materia:

```Kt
fun main(args: Array<String>) {
    val alumnos: MutableMap<Int, MutableList<Materia>> = mutableMapOf()
```

En la función de cargar previa a un for solicitamos la cantidad de alumnos a almacenar en el mapa:

```Kt
fun cargar(alumnos: MutableMap<Int, MutableList<Materia>>) {
    print("Cuantos alumnos cargará ?:")
    val cant = readLine()!!.toInt()
```

Luego mediante un for procedemos a cargar el dni del alumno y crear una lista mutable donde se almacenarán las materias
y sus respectivas notas del alumno:

```Kt
for(i in 1..cant) {
    print("Ingrese dni:")
    val dni = readLine()!!.toInt()
    val listaMaterias = mutableListOf<Materia>()
```

Mediante una estructura repetitiva cargamos cada materia y nota hasta que finalizamos con ese alumno:

```Kt
do {
    print("Ingrese materia del alumno:")
    val nombre = readLine()!!
    print("Ingrese nota:")
    val nota = readLine()!!.toInt()
    listaMaterias.add(Materia(nombre, nota))
    print("Ingrese otra nota (si/no):")
    val opcion = readLine()!!
} while (opcion == "si")
```

Cuando salimos del ciclo do/while procedemos a insertar la lista de materias en el mapa:

```Kt
        alumnos[dni] = listaMaterias
    }
}
```

Para imprimir en forma completa el mapa lo recorremos con un for que rescata en cada ciclo el dni del alumno y la lista
de materias que cursa:

```Kt
fun imprimir(alumnos: MutableMap<Int, MutableList<Materia>>) {
    for((dni, listaMaterias) in alumnos) {
        println("Dni del alumno: $dni")
```

Mediante otro for interno recorremos la lista de materias de ese alumno y mostramos los nombres de materias y sus notas:

```Kt
        for(materia in listaMaterias) {
            println("Materia: ${materia.nombre}")
            println("Nota: ${materia.nota}")
        }
        println()
    }
}
```

Por último la consulta de las materias que cursa un alumno se ingresa el dni y luego de controlar si está almacenado en
el mapa procedemos a recorrer con un ciclo for todas las materias que cursa:

```Kt
fun consultaPorDni(alumnos: MutableMap<Int, MutableList<Materia>>) {
    print("Ingrese el dni del alumno a consultar:")
    val dni = readLine()!!.toInt()
    if (dni in alumnos) {
        println("Cursa las siguentes materias")
        val lista = alumnos[dni]
        if (lista!=null)
            for((nombre, nota) in lista) {
                println("Nombre de materia: $nombre")
                println("Nota: $nota")
            }
    }
}
```

## Problema propuesto

186. Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:

```Kt
data class Fecha(val dia: Int, val mes: Int, val año: Int)
```

Como valor en el mapa almacenar un String. Implementar las siguientes funciones:

1) Carga de datos en la agenda.
2) Listado completo de la agenda.
3) Consulta de una fecha.

## Bibliografía
https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=46&codigo=46&inicio=45