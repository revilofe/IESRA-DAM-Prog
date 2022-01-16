
# Prueba específica: Unidad 3 y 4
## ¿Qué se evalúa?
Se evaluará cada uno de los CE del RA2(a, i) y RA6(a, f)

> **RA2**: *Escribe y prueba programas sencillos, reconociendo y aplicando los fundamentos de la programación orientada a objetos.*

> **RA6**: *Escribe programas que manipulen información seleccionando y utilizando tipos avanzados de datos.*


## Descripción de la prueba
Consistirá de una prueba teórica y práctica.
### Teoria (2/10)
La prueba teórica consiste en contestar a las preguntas disponibles en el cuestionario de Moodle.
### Práctica  (8/10)
- Create una clase `Punto`. El constructor principal de la clase punto recibe como parámetro una variable, de clase `String`, que actuará de identificador del punto.
- Seguidamente declara dos variables de instancia que almacena los valores de las coordenadas `x` e `y`, de clase `Int`.
- La clase punto tiene un constructor secundario, que recibirá como parámetros dos `Int` `x` e `y`, que se utilizan para inicializar las variables de instancia definidas en el punto anterior.
- *(RA2.c)* Crea un método llamado `obtenerCoordenadas` que devuelva una instancia de la clase `Pair`, con las coordenadas del punto, `x` e `y`.
- *(RA2.d)* Crea un método llamado `toString` que devuelva un objeto de clase `String` que representará, en este formato, la instancia de la clase `Punto`.  
  El formato será:
  ~~~Kt 
    punto <id> -> [<x>,<y>]
  ~~~
  Donde `id` es el identificador del punto, y `x` e `y` son las coordenadas del punto.
- *(RA2.e,f)* Create un método estático (método de clase) con nombre `componenteDeVector` que realiza la resta entre dos puntos.  
  El método recibirá como parámetros los dos puntos, y retornará un punto resultado. El método realizará lo siguiente.
  ~~~Kt 
    // Puntos entrada
    1 parametro: pa("pa", x,y) 
    2 parametro: pb("pb", x,y)
    // Puntos resultado
    presultado(pa.id+pb.id, pb.x-pa.x, pb.y-pa.y)  
  ~~~ 

- - **OPCIONAL** Create un método estático (método de clase) con nombre `distancia` que obtiene la diferencia entre dos puntos.
  El método recibirá como parámetros los dos puntos, y retornará un Double. El método realizará lo siguiente:

  ~~~Kt
    // Puntos entrada
    1 parametro: pa("pa", x,y) 
    2 parametro: pb("pb", x,y)
    // Puntos resultado
    d(pa, pb) = RaizCuadrada(PotenciaDos(pb.x-pa.x) + PotenciaDos(pb.y-pa.y)) 
  ~~~ 
- *(RA2.b,d,h)* Escribe un programa que reste dos puntos, el programa tendrá que instanciar dos objetos de la clase punto, a(3,2) y b(1,3) y haciendo uso del método `componenteDeVector` devuelva un tercer punto. La salida será similar a:

  ~~~Kt
    punto pA -> [3, 2]
    punto pB -> [1, 3]
    Componente AB: punto pApB -> [-2, 1]
  ~~~
- *(RA6.a,c)* Create un método estático (método de clase) con nombre `localizacionGeograficaNS` que clasifica los puntos geográficamente, en `Norte` y `Sur`.
  El método recibirá como parámetros un `Array` de puntos y devolverá un `Map` en el que la cadena `"Norte"` tendrá asociada una lista de puntos localizados al norte y la cadena `"Sur"` tendrá una lista de puntos localizados al sur.
  El método realizará lo siguiente:

  ~~~Kt 
    // Puntos entrada
    lista [pa("pa", x,y),pb("pb", x,y), pc("pc", x,y), pd("pd", x,y)]  
    // Mapa resultado
    Para cada pto en el array, 
        si pto.y >= 0 
            introducir pto en la lista del Norte, que se almacena en el Map 
        sino 
            introducir pto en la lista del Sur, que se almacena en el Map 
    Retornará: Map ("Sur" to {pa.id+pb.b, pb.x-pa-x, pb.y-pa.y)  
  ~~~ 
- *(RA6.a,c)* Escribe un programa que haga uso del método estático con nombre `localizacionGeograficaNS`, al que se le pasará la lista de puntos y retornará la clasificación geográfica de los puntos.  
  El resultado será similar al siguiente:
  ~~~Kt 
    Lista de puntos: [punto p1 -> [-1, 0], punto p2 -> [3, -1], punto p3 -> [-4, 4], punto p4 -> [-3, 2], punto p5 -> [6, -4], punto p6 -> [-5, 6], punto p7 -> [10, -8], punto p8 -> [1, 5], punto p9 -> [6, -7]]
    Localización Geográfica NS: {Norte=[punto p1 -> [-1, 0], punto p3 -> [-4, 4], punto p4 -> [-3, 2], punto p6 -> [-5, 6], punto p8 -> [1, 5]], Sur=[punto p2 -> [3, -1], punto p5 -> [6, -4], punto p7 -> [10, -8], punto p9 -> [6, -7]]}
  ~~~

## Evaluación:
- RA2.a 1 -  Ha contestado correctamente a las preguntas, sobre fundamentos de POO
- RA2.b 3 -  El programa que ha creado funciona
- RA2.c 1 -  Ha instanciado correctamente objetos a partir de clases predefinidas (por ejemplo Pair)
- RA2.d 1 -  Ha utilizado correctamente los métodos y propiedades del objeto Punto, durante el programa.
- RA2.e 1 -  Ha llamado de forma correcta al os métodos estáticos.
- RA2.f 1 -  Ha utilizado correctamente los parámetros en la llamada a los métodos, por ejemplo en la llamada a los estáticos.
- RA2.g 2 -  Ha incorporado y utilizado librerías de objetos variada.
- RA2.h 1 -  Ha utilizado constructores para crear los distintos objetos, por ejemplo Puntos.
- RA2.i 1 -  Utiliza el IDE.
- RA6.a 4 -  Escribe programas que use arrays, y el programa funciona
- RA6.e 1 -  Contesta correctamente a las preguntas de teoría sobre las ventajas/desventajas de coleciones
- RA6.c 1 -  Utiliza listas para almacenar y procesar información.

Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

## ¿Qué vamos a hacer?
### Está permitido
- El uso de internet.
- El uso de manuales y documentación adicional.
### Recuerda
- Márcate objetivos pequeños, crea el código y pruébalo.
- Ve poco a poco y prueba las cosas que haces antes de pasar a la siguiente.
- El código no tiene que estar perfecto, siempre se puede modificar a posteriori.
- Usa el depurador si te atascas.
### Crear, realizar y entregar el examen
1. Crea el proyecto usando el IDE:
    - Opción del Menú: `File` -> `New` -> `Project...`
    - Siguen los pasos indicados en la siguiente imagen: ***ATENCIÓN*** Sustituye **INICIALES** por tu iniciales.
      ![](../../../resources/img/examen1/creaProyecto.png)
    - Sigue los pasos hasta crear el proyecto.
2. Realiza el examen: Ayuda para plantear el examen:
    - Ve realizando los métodos de las clases, y pruébalos en el `main`.
    - Lee atentamente las indicaciones y pregunta las dudas al profesor.
3. Comparte el proyecto, si lo haces privado tendrás que añadirme como colaborador:
    - Opción de Menú: `VCS` -> `Share Project on GitHub`.
        - Deja todo tal como esta.
        - Pulsa en `Share`
    - Visita tu cuenta de GitHub
        - Copia la URL del repositorio que acabas de crear.
        - Comparte en la tarea del examen de la moodle la url de tu repositorio.
    - Desde GitHub, puedes añadirme también como colaborador en ese repositorio.

## Solución
~~~ kt
....

~~~