# Relación 6.4

> Se evaluará el RAX, CE y

## 1. Descripción de la práctica

Tenemos una clase `GestorDeLibros` que se va a encargar de getionar un catalogo de libros. A la información del catalogo
se va a acceder a través de 2 métodos:

- `fun preguntarPorUnLibro()`
- `fun mostrarInfoDeUnLibro()`

### a) Inversión de dependencias sobre el acceso a los datos. (40%)

Esta clase utiliza internamente una clase sobre la que delega el acceso a un fichero XML. Nuestro cliente nos solicita
que realicemos un diseño de forma que podamos intercambiar la clase que accede a los datos haciendo uso de otros
formatos. (JSON, BBDD, etc.)

Para implementar esta funcionalidad, haremos uso del principio de inversión de dependencia visto en clase, de forma que
podamos acceder a una clase u otra sin necesidad de modificar la lógica de la clase `GestorDeLibros`.

### b) Inversión de dependencias sobre la interface (60%)

Aplicando DIP crea la estructura de clases que consideres necesaria para desacoplar la parte del acceso a teclado y
pantalla, a través de una clase `GestorDeLibrosIUT1` que se encargue de este trabajo, es decir, solicitar la información
que necesita nuestra clase GestorDeLibros, y presentar la información tras realizar las consultas de los datos, de forma
podamos utilizar esta clase u otra para solicitar y presentar los datos resultado.

Una vez este desacoplando, implementa otra clase `GestorDeLibrosIUT2` que haga el mismo trabajo pero de formas
distintas (por ejemplo, cambiando los mensajes que muestra solicitando y mostrando los datos) de interactuar con el
teclado y la pantalla.

Prueba las distintas configuraciones que puede hacer de tu programa haciendo uso de las clases que has creado.

## 2. Evaluación
###### d) Se han creado clases heredadas que sobrescriban la implementación de métodos de la superclase.
0. No lo hace; 5. Crea clases heredadas que sobreescriben pero no adecuadamente o no completo; 10. Correcto. 
###### e) Se han diseñado y aplicado jerarquías de clases.
0. No lo hace; 5. Se diseña y aplica jerarquía pero no adecuadamente o no completa; 10. Correcto.
###### f) Se han probado y depurado las jerarquías de clases.
0. No lo hace; 5. No funciona adecuadamente; 10. Correcto.
###### g) Se han realizado programas que implementen y utilicen jerarquías de clases.
0. No lo hace; 5. Implementa y utiliza jerarquías de clases vistas pero no correctamente; 10. Correcto.


Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

## 3. Condiciones de entrega

Se entrega la URL al repositorio, el repositorio será:

- **privado**
- Compartido conmigo.
- El nombre del repositorio será `DAM1_id_iniciales` donde:
    - `id`: es el ide de la actividad, por ejemplo 6_5
    - `iniciales': son tus iniciales por ejemplo EFO las mías.

## 4. Bibliografía

- [Principio de inversión de dependencias](https://github.com/revilofe/IESRA-DAM-Prog/blob/master/ejercicios/src/main/kotlin/un6/dip/dip.md)
