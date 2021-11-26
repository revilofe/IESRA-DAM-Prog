# Relación 4.4
> Se evaluará el RA6, CE c, d y f


## Descripción
Una `Pila` tiene un conjunto de métodos: (para ver más sobre la pila consulta [aqui](#enlace-al-ejercicio))
- `Tope`: devuelve el elemento en la cabeza de la pila.
- `Push`: Insertar o apilar
- `Pop`: Eliminar o desapilar
- `Vacía`: si está vacía (tope es nulo, o tamaño es 0) o llena (si existe tamaño máximo)

El ejercicio consistirá en dos partes:

1. Crear una clase `Pila`, haciendo uso de una lista, que implemente los métodos descritos anteriormente y que sea capaz de trabajar con cualquier tipo de elemento, para ello consulta las posibilidades que ofrecen los genéricos en kotlin.
2. Crear una función `reverse` que reciba una lista, lista que puede ser de cualquier tipo, y devuelva la lista invertida. Usaremos la `Pila` para invertir el orden de elementos y la interface `Iterator` para recorrer los elementos de la lista.

Se usará este código para probar el correcto funcionamiento:
~~~kt
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
~~~

Para llevar a cabo la función `reverse`, será **obligatorio**:
- Hacer uso de la interfaz `Iterator` para recorrer la lista.
- Hacer uso de la clase `Pila` que has creado para invertir el orden. 

### Evaluación
| Criterio                                    | Valor 1                | Valor 2                                            | Valor 3                       |
|---------------------------------------------|------------------------|----------------------------------------------------|-------------------------------|
| RA6.c Desarrolla la pila mediante una lista | No funciona 0          | Funciona algún metodo 5                            | Funciona todos los metodos 10 |
| RA6.c Funciona adecuadamente la pila        | No funciona 0          | Funciona algún metodo 5                            | Funciona todos los metodos 10 |
| RA6.d Hace uso de los iteradores            | No usa o no adecuada 0 | Lo usa pero no correctamente 5                     | Lo usa correctamente 10       |
| RA6.d Itera adecuadamente en la pila        | No usa o no adecuada 0 | Adecuado pero mejorable, haciendo uso de métodos 5 | Adecuado 10                     |
| RA6.f La pila hace uso de Generics          | No usa o no adecuada 0 | Usa Generics, pero mejorable 5                     | Usa Generics adecuadamente 10 |
| RA6.f La función hace uso de Generics       | No usa o no adecuada 0 | Usa Generics, pero mejorable 5                     | Usa Generics adecuadamente 10 |



### Enlace al ejercicio
[Ejercicio 4.4](https://docs.google.com/document/d/e/2PACX-1vTbL2c4NJIsecao0rJEunzgwAi5IMoWynE11Zf31AYYTOz74g2sBIjf-2pcRq7wnuBgjckkZ3dIKyk2/pub)

### Apoyo
- https://github.com/revilofe/_kotlin_#generics
- https://www.baeldung.com/kotlin/generics

