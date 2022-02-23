# Jetpack Compose

Imperativa:

Se define paso a paso la casuistica de la aplicación, es decir, cuando se pinta algo, cuando cambia de color, etc.... Se indica a través del código lo que tiene que hacer y como tiene que hacerlo.

Manipular las vistas de forma manual aumenta la probabilidad de errores:
○ Es fácil olvidarse de actualizar estados de vistas.
○ Es fácil crear estados ilegales (conflicto de actualizaciones)
○ El mantenimiento de los estados de las vistas se hace complejo.

Declarativa:

Donde está migrando la industria:

La industria está migrando a un modelo de UI declarativo:
○ La pantalla se regenera desde cero y solo se aplican los cambios necesarios.
○ Enfoque que evita la complejidad de actualizar manualmente una jerarquía de vistas.
○ Es costoso en términos computacionales: **Recomposición**.

Composición:

Las funciones etiquetadas con una anotación @composable.   

● Funciones que reciben datos y emiten elementos de UI

● Puedes usar for, if, etc para genera la potencia del lenguaje.

Todas las funciones que admiten composición deben ser
anotadas con @Composable.
● Las funciones que admiten composición pueden aceptar
parámetros. La lógica de la aplicación describe la UI.
● Text() es también una función que admite composición y que
se encarga de crear el elemento en la UI.
