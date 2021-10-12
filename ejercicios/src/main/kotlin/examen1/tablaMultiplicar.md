# Examen 1
## Tabla de multiplicar
El CEIP Profesor Juan Carlos Aragón está probando un nuevo método para enseñar las tablas de multiplicar al alumnado. Y solicita ayuda al IES Rafael Alberti para que desarrolle una aplicación que cumpla con los siguientes requisitos:

El método se basa en la técnica divide y vencerás, y consiste en dividir el esfuerzo en el tiempo, poniendo el foco, durante un intervalo de tiempo, en un conjunto de tablas.
La división se realiza de la siguiente forma:

| Por edades  |  ¿Que tablas? |  Mes pares | Mes impares
|---|---|---|---|
|  Mayores de 10 años hasta 12 incluido | Tablas del 11 hasta el 13  | 11,12,13 | 11,12,13 | 
|  Mayores de 8 años hasta los 10 incluidos | Tablas del 6 hasta el 10  | 6,8,10 | 7,9 |
|  Mayores o iguales a 6 hasta los 8 incluidos | Tablas del 1 hasta el 5  | 2, 4 | 1, 3, 5 |

Por tanto, para la entrada siguiente 
8, 12
el programa mostrará la siguiente salida
~~~
*********************************************************************************
PROGRAMA DE GENERACIÓN DE TABLAS: <NOMBRE DEL ALUMNO>
̣̣̣_________________________________________________________________________________
Edad: 8. El alumno está dentro del rango [6-8]
Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
̣̣̣_________________________________________________________________________________

TABLA DEL 2
***********
2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20

TABLA DEL 4
***********
4 x 1 = 4
4 x 2 = 8
...
2 x 10 = 40
*********************************************************************************

~~~
### ¿Qué vamos a necesitar?
- Leer la palabra que se intentará adivinar. Para que quien tiene que adivinar no la vea, podrás darle varias veces al intro. Ya veremos que existen otra formas de ocultar lo que escribes.
  + La palabra solo contendrá letras.
  + La palabra será mayor o igual a 5 caracteres.
  + Para evitar tener problemas con las mayusculas o minusculas (Case sensitive), podrás pasarla a mayuscula.
- Leer las letras
  + Solo se puede escribir letras, y solo una.
  + Para evitar tener problemas con las mayusculas o minusculas (Case sensitive), podrás pasarla a mayuscula.
  + Mostrar el mensaje mientras no se cumpla la condición, sin tener en cuenta los intentos.
- Un objeto de clase [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/) para guardar las letras usadas.
  + Mira el operador in y la funcion add.
  + Si una letra introducida no esta en la palabra, o está en la lista de letras usadas se restará un intento.
  + Si la letra está contenida en la palabra que se pretende adivinar y no está en la lista de letras usadas antes, se rellena los huecos de la palabra con la letra y se introduce la letra en la lista de letras usadas.
- Necesitaremos trabajar con la clase [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/). Consulta el manual de referenia y mira las funicioens que tiene y te puedan servir para resolver el problema. Algunas:
  + ```replaceRange```
  + ```indexOf```
  + ```contains```
- Necesitarás hacer **uso de bucles** (While, for, do while, repeat) para
  + solicitar la palabra/letra mientras no se cumplan las condiciones
  + realizar el proceso del juego: solicita letra, si esta en la palabra sustituyela, sino resta intentos.
  + reemplazar la letra en la palabra tantas veces como sea necesario.

### ¿Qué vamos a hacer?
- Dividirnos en grupos
- Pensar cómo habría que hacerlo
- ¿Tenemos todas las herramientas necesarias para conseguirlo?
- *NO es necesario terminar la solución*, voy a poner una propuesta de solución para discutirla, pero intentadlo.


~~~ kt
....

~~~