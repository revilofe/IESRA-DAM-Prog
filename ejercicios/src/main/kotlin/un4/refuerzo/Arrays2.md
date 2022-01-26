# 35 - POO - arreglos con objetos

Dijimos que un arreglo es una estructura de datos que permite almacenar un CONJUNTO de datos del MISMO tipo. Con un
único nombre se define un arreglo y por medio de un subíndice hacemos referencia a cada elemento del mismo (componente)

Vimos como crear arreglos con componentes de tipo Int, Char, Float, Double etc., ahora veremos como definir un arreglo
con componentes de una determinada clase que declaramos nosotros.

### Problema 1

Declarar una clase Persona con las propiedades nombre y edad, definir como métodos su impresión y otra que retorna true
si es mayor de edad o false en caso contrario En la función main definir un arreglo con cuatro elementos de tipo
Persona. Calcular cuantas personas son mayores de edad.

#### Proyecto144 - Principal.kt

```
class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre  Edad: $edad")
    }

    fun esMayor() = if (edad >= 18) true else false
}

fun main(parametro: Array<String>) {
    val personas: Array<Persona> = arrayOf(Persona("ana", 22), Persona("juan", 13), Persona("carlos", 6), Persona("maria", 72))
    println("Listado de personas")
    for(per in personas)
        per.imprimir()
    var cant = 0
    for(per in personas)
        if (per.esMayor())
            cant++
    println("Cantidad de personas mayores de edad: $cant")
}
```

La declaración de la clase Persona define 2 propiedades en el mismo constructor y sus dos métodos:

```
class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre  Edad: $edad")
    }

    fun esMayor() = if (edad >= 18) true else false
}
```

En la función main definimos una variable llamada personas que es un Array con componentes de tipo Persona. Para definir
sus componentes utilizamos la función arrayOf que nos provee la librería estándar de Kotlin:

```
val personas: Array<Persona> = arrayOf(Persona("ana", 22), Persona("juan", 13), Persona("carlos", 6), Persona("maria", 72))
```

A la función arrayOf se le pasa cada uno de los objetos de tipo Persona.

Un Array una vez creado no puede cambiar su tamaño.

La forma más fácil de recorrer el Array es mediante un for:

```
for(per in personas)
   per.imprimir()
```

En cada ciclo del for en la variable per se almacena una de las componentes del arreglo.

De forma similar para contar la cantidad de personas mayores de edad procedemos a definir un contador y mediante un for
recorremos el arreglo y llamamos al método esMayor para cada objeto:

```
var cant = 0
for(per in personas)
   if (per.esMayor())
       cant++
println("Cantidad de personas mayores de edad: $cant")
```

### Acotaciones

A un Array lo podemos acceder por medio de un subíndice o por medio de llamadas a métodos, podemos cambiar el valor
almacenado en una componente etc.:

```
//imprimir los datos de la persona almacenada en la componente 0
personas[0].imprimir()
//imprimir la cantidad de compoentes del arreglo
println(personas.size)
//imprimir la edad de la persona almacenada en la última componente
println(personas[3].nombre)
//Copiar la persona almacenada en la primer componente en la segunda
personas[1] = personas[0]
personas[0].imprimir()
personas[1].imprimir()
//Acceder a la primer componente por medio de un método en lugar de un subíndice
personas.get(0).imprimir()
//Copiar la primer componente en la tercera mediante un método en lugar de un subíndice
personas.set(2, personas[0])
println("-------------------------------")
for(per in personas)
   per.imprimir()
```

## Problemas propuestos

145. Se tiene la declaración del siguiente data class:
```
data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)
  ```
Definir un Array con 4 elementos de tipo Articulo. Implementar dos funciones, una que le enviemos el Array y nos muestre
todos sus componentes, y otra que también reciba el Array de artículos y proceda a aumentar en 10% a todos los
productos.

146. Declarar una clase Dado que tenga como propiedad su valor y dos métodos que permitan tirar el dado e imprimir su
     valor. En la main definir un Array con 5 objetos de tipo Dado. Tirar los 5 dados e imprimir los valores de cada
     uno.

## Bibliografía
https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=35&codigo=35&inicio=30
