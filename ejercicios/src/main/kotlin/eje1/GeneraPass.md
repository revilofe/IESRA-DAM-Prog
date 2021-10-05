# Ejercicios 1.1
## Creación de un Generador de Contraseñas
Todos usamos contraseñas a diario; para mantener las cuentas seguras, tenemos que hacer que nuestra contraseña sea lo suficientemente difícil como para que nadie pueda adivinarla.
Un generador de contraseñas es un programa que genera contraseñas aleatorias -a partir de letras mayúsculas, minúsculas, números y símbolos de puntuación...-, lo suficientemente fuertes como para proporcionar seguridad.

### ¿Qué vamos a necesitar?
Para poder generar las contraseñas necesitamos varias cosas:
- Un conjunto de caracteres a escoger para la contraseña
  (*investiga si hay alguna manera de obtener todos los caracteres sin
  escribirlos a mano*)
    + Todas las mayúsculas
    + Todas las minúsculas
    + Los caracteres numéricos: 0123456789
    + Los caracteres de puntuación: !"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~
      <BR>(No todos los sitios aceptan todo tipo de caracteres de puntuación)
- Una forma aleatoria de escoger esos caracteres (para una longitud dada)
    + Funciones del package kotlin.random (*investiga que clases/funciones tiene y cuáles nos pueden ser más útiles*)

### ¿Qué vamos a hacer?
- Dividirnos en grupos
- Pensar cómo habría que hacerlo
- ¿Tenemos todas las herramientas necesarias para conseguirlo?
- *NO es necesario programar la solución*, voy a poner una propuesta de solución para discutirla.


~~~ kt
...

~~~
