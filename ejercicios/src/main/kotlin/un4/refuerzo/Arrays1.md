# 21 - Arreglos (Arrays): conceptos

Hemos empleado variables de distinto tipo para el almacenamiento de datos (variables Int, Float, Double, Byte, Short,
Long, Char, Boolean). En esta sección veremos otros tipos de variables que permiten almacenar un conjunto de datos en
una única variable.

Un arreglo es una estructura de datos que permite almacenar un CONJUNTO de datos del MISMO tipo. Con un único nombre se
define un arreglo y por medio de un subíndice hacemos referencia a cada elemento del mismo (componente)

### Problema 1

Se desea guardar los sueldos de 5 operarios. Según lo conocido deberíamos definir 5 variables si queremos tener en un
cierto momento los 5 sueldos almacenados en memoria. Empleando un arreglo solo se requiere definir un único nombre y
accedemos a cada elemento por medio del subíndice.

![arreglos en Kotlin](https://www.tutorialesprogramacionya.com/kotlinya/imagentema/foto028.jpg)

#### Proyecto98 - Principal.kt

```Kt
fun main(parametro: Array<String>) {
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readLine()!!.toInt()
    }
    //impresion de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}
```

Para declarar un arreglo de enteros definimos una variable de tipo IntArray:

```Kt
val sueldos: IntArray
```

Para crearlo al arreglo y que se reserve espacio para 5 componentes debemos hacer:

```Kt
sueldos = IntArray(5)
```

Para acceder a cada componente del arreglo utilizamos los corchetes y mediante un subíndice indicamos que componente
estamos procesando:

```Kt
for(i in 0..4) {
    print("Ingrese sueldo:")
    sueldos[i] = readLine()!!.toInt()
}
```

Cuando i valore 0 estamos cargando la primer componente del arreglo.

Las componentes comienzan a numerarse a partir de cero y llegan hasta el tamaño que le indicamos menos 1.

Una vez que cargamos todas sus componentes podemos imprimirlas una a una dentro de otro for:

```Kt
for(i in 0..4) {
    println(sueldos[i])
}
```

Si queremos conocer el tamaño de un arreglo luego de haberse creado podemos acceder a la propiedad size:

```Kt
val sueldos: IntArray
sueldos = IntArray(5)
println(sueldos.size) // se imprime un 5
```

Es más común crear un arreglo de enteros en una sola línea con la sintaxis:

```Kt
val sueldos = IntArray(5)
```

### Acotaciones

La [biblioteca estándar de Kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/index.html) contiene todas las clases
básicas que se requieren para programar con este lenguaje organizado en paquetes.

En el paquete [kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/index.html) podemos identificar que se
encuentra declarada la clase IntArray.

Las otras clases de arreglos que suministra Kotlin son:

```Kt
ByteArray
ShortArray
LongArray
FloatArray
DoubleArray
BooleanArray
CharArray
```

No hay uno para manejar String, en los próximos conceptos veremos como trabajar con este tipo de dato.

### Problema 2

Definir un arreglo de 5 componentes de tipo Float que representen las alturas de 5 personas. Obtener el promedio de las
mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.

#### Proyecto99 - Principal.kt

```Kt
fun main(parametro: Array<String>) {
    val alturas = FloatArray(5)
    var suma = 0f
    for(i in 0..alturas.size-1){
        print("Ingrese la altura:")
        alturas[i] = readLine()!!.toFloat()
        suma += alturas[i]
    }
    val promedio = suma / alturas.size
    println("Altura promedio: $promedio")
    var altos = 0
    var bajos = 0
    for(i in 0..alturas.size-1)
        if (alturas[i] > promedio)
            altos++
        else
            bajos++
    println("Cantidad de personas más altas que el promedio: $altos")
    println("Cantidad de personas más bajas que el promedio: $bajos")
}
```

Creamos un arreglo con datos de tipo flotante de 5 elementos utilizando la clase FloatArray:

```Kt
val alturas = FloatArray(5)
```

En el primer for cargamos cada altura y la acumulamos en la variable suma. La variable suma se define por inferencia de
tipo Float si le agregamos el caracter "f" o "F":

```Kt
var suma = 0f
```

Dentro del for cargamos y acumulamos:

```Kt
for(i in 0..alturas.size-1){
    print("Ingrese la altura:")
    alturas[i] = readLine()!!.toFloat()
    suma += alturas[i]
}
```

Luego cuando salimos del for obtenemos la altura promedio de las personas y la mostramos:

```Kt
val promedio = suma / alturas.size
println("Altura promedio: $promedio")
```

Para contar la cantidad de personas más altas que el promedio y más bajas debemos definir dos contadores y dentro de
otro for controlar cada altura con respecto al promedio:

```Kt
var altos = 0
var bajos = 0
for(i in 0..alturas.size-1)
    if (alturas[i] > promedio)
        altos++
    else
        bajos++
```

Como el for tiene una sola sentencia no son obligatorias las llaves.

Fuera del for mostramos los dos contadores:

```Kt
println("Cantidad de personas más altas que el promedio: $altos")
println("Cantidad de personas más bajas que el promedio: $bajos")
```

### Problema 3

Cargar un arreglo de 10 elementos de tipo entero y verificar posteriormente si el mismo está ordenado de menor a mayor.

#### Proyecto100 - Principal.kt

```Kt
fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for(i in 0..arreglo.size-1) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    var ordenado = true
    for(i in 0..arreglo.size-2)
        if (arreglo[i+1] < arreglo[i])
            ordenado = false
    if (ordenado)
        print("Los elementos están ordenados de menor a mayor")
    else
        print("Los elementos no están ordenados de menor a mayor")
}
```

Definimos un arreglo de 10 elementos de tipo entero y procedemos a cargarlo por teclado:

```Kt
val arreglo = IntArray(10)
for(i in 0..arreglo.size-1) {
    print("Ingrese elemento:")
    arreglo[i] = readLine()!!.toInt()
}
```

Definimos una variable de tipo Boolean con el valor true (suponiendo que el arreglo está ordenado de menor a mayor antes
de analizarlo.

```Kt
var ordenado = true
```

Por inferencia sabe el compilador que la variable ordenado debe ser de tipo Boolean, la otra forma de definir es:

```Kt
var ordenado: Boolean = true
```

Ahora mediante otro for procedemos a comparar un elemento de la posición i+1 con el de la posición i, si se cumple que
sea mayor podemos ya inferir que el arreglo no está ordenado:

```Kt
for(i in 0..arreglo.size-2)
    if (arreglo[i+1] < arreglo[i])
        ordenado = false
```

Fuera del for preguntamos por el contenido de la variable "ordenado" si tiene almacenado el valor true significa que el
vector está ordenado de menor a mayor:

```Kt
if (ordenado)
    print("Los elementos están ordenados de menor a mayor")
else
    print("Los elementos no están ordenados de menor a mayor")
```

Si queremos hacer un poco más eficiente la verificación de si el array está ordenado podemos cortar las comparaciones en
cuanto aparezca un elemento no ordenado mediante la palabra clave break:

```Kt
for(i in 0..arreglo.size-2)
    if (arreglo[i+1] < arreglo[i]){
        ordenado = false
        break
    }
```

El comando break sale de la estructura repetitiva que lo contiene en forma inmediata sin continuar el ciclo.

### Propiedad indices de la clases IntArray, ByteArray, LongArray etc.

La clase IntArray tiene una propiedad IntRange llamada indices que almacena el rango mínimo y máximo del arreglo. La
propiedad indices podemos utilizarla en el for para recorrer las componentes:

### Problema 4

Cargar un arreglo de 10 elementos de tipo entero. Imprimir luego el primer y último elemento.

#### Proyecto101 - Principal.kt

```Kt
fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
}
```

Es más conveniente utilizar la propiedad indices en lugar de disponer el rango: 0..arreglo.size-1 si vamos a recorrer
todo el arreglo.

Para acceder a la última componente del arreglo utilizamos la propiedad lastIndex que devuelve el último índice válido:

```Kt
println("Ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
```

### Iterar con un for un objeto array

Además de la forma que hemos visto para acceder a los elementos de un arreglo mediante un subíndice podemos utilizar la
estructura repetitiva for con iteradores.

### Problema 5

Cargar un arreglo de 5 elementos de tipo entero. Imprimir luego todo el arreglo.

#### Proyecto102 - Principal.kt

```Kt
fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    for(elemento in arreglo)
        println(elemento)
}
```

Para iterar un arreglo completo de un array con un for utilizamos la siguiente sintaxis:

```Kt
for(elemento in arreglo)
    println(elemento)
```

Cada vuelta del for se almacena en la variable elemento un valor almacenado en la variable "arreglo".

Como vemos es una sintaxis muy simple para recorrer un arreglo y acceder a cada elementos para consultarlo.

### Otras características de los arreglos que pueden ser útiles.

Imprimir cada elemento y su índice iterando el arreglo llamando al método withIndex de la clase IntArray:

```Kt
for((indice, elemento) in arreglo.withIndex())
    println("En el índice $indice se almacena el elemento $elemento")
```

Carga de los elementos utilizando el for como iterador;

```Kt
for((indice, elemento) in arreglo.withIndex())
{
    print("Ingrese elemento:")
    arreglo[indice] = readLine()!!.toInt()
}
```

## Problemas propuestos

103. Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
     El valor acumulado de todos los elementos. El valor acumulado de los elementos que sean mayores a 36. Cantidad de
     valores mayores a 50.
     (Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
104. Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos. Obtener la suma de los dos
     arreglos elemento a elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.

## Bibliografía
https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=21&codigo=21&inicio=15
