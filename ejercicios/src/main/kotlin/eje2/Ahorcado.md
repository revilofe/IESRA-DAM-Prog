# Ejercicios 2.1
## Creación del juego del ahorcado
El juego del "ahorcado" es un juego de lápiz y papel, en el que el objetivo es adivinar una palabra. Luego el jugador restante deberán ir diciendo letras que les parece que puede contener la frase. Si aciertan, se escriben todas las letras coincidentes.  Si la letra no está, se resta un intento, agregando una parte al cuerpo (cabeza, brazo, etc.) hasta que queda dibujado todo el cuerpo del "ahorcado".

Gana el juego si se completa la palabra, y se pierde si se completa el número de intentos antes de completar la palabra.

En nuestra versión del ahorcado, no dibujaremos el cuerpo, sino que esta parte se simulará estableciendo un número de intentos, por ejemplo 5.

### ¿Qué vamos a necesitar?
- Leer la palabra que se intentará adivinar. Para que quien tiene que adivinar no la vea, podrás darle varias veces al intro. Ya veremos que existen otra formas de ocultar lo que escribes.
  + La palabra solo contendrá letras.
  + La palabra será mayor o igual a 5 caracteres.
  + Para evitar tener problemas con las mayusculas o minusculas (Case sensitive), podrás pasarla a mayuscula.
- Leer las letras
  + Solo se puede escribir letras, y solo una.
  + Para evitar tener problemas con las mayusculas o minusculas (Case sensitive), podrás pasarla a mayuscula.
  + Mostrar el mensaje mientras no se cumpla la condición, sin tener en cuenta los intentos.
- Un objetod de clase [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/) para guardar las letras usadas.
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