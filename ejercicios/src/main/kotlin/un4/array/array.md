<script src="https://unpkg.com/kotlin-playground@1" data-selector="code"></script>

# Relacion 4.1

>Objetivo: Uso de arrays.

Crea un programa para mantener las notas de los alumnos.  El programa tendrá la siguiente estructura y datos y estos datos estarían hardcodeados.
0. Existirán las siguientes clases:
    - Módulo, que tendrá
        - un array de los alumnos matriculados, ordenados por el identificador del alumno.
        - un array bidimensional, 3 evaluaciones + uno final, que almacena un array de notas de alumnos ordenadas según el orden de los alumnos. (Guarda la información de la nota el mismo valor del índice en el que se encuentra el alumno. Es decir, si por ejemplo el estudiante Pedro está en la posición 2 del array de estudiantes del módulo, su nota estaría en la posición 2 del array de notas.) 
    - Alumnos
        - identificador numérico del instituto. 
        - nombre y apellidos. 
    - Crea los métodos necesarios y en las clases que creas conveniente para realizar las operaciones que se listan abajo.
1. Crea un programa con 1 módulo y 10 alumnos, Rellena las notras de la 1, 2 y 3 Evaluación.   
2. Calcula la nota final de los mćdulo como la media de las 3 Evaluaciones.
3. Lista las notas de 1, 2, 3 y finales 
4. Para un módulo, calcular cuantos alumnos han aprobado
5. Para un módulo, calcular la nota más baja
6. Para un módulo, calcular la nota más alta.
7. Para un módulo, calcular la nota media entre todos los alumnos.
8. Para un módulo, calcular si alguno tiene un 10
9. Para un módulo, calcular si todos han suspendido
10. Para un módulo, calcular la primera nota que no ha superado el 5.
11. Lista los alumnos ordenados según su nota

Opcional: Puedes hacer un menu para cada opción.

IMPORTANTE: Comenta el código e identifica claramente que parte del ejercicio estas resolviendo, haciendo referencia a los puntos del ejercicio.

### Crear, realizar y entregar el examen
a. Crea el proyecto usando el IDE:
    - Opción del Menú: `File` -> `New` -> `Project...`
    - Nombre del proyecto será DAM<curso>-<relacion>-<iniciales>
    - Siguen los pasos indicados en la siguiente imagen: ***ATENCIÓN*** Sustituye **CURSO, RELACION E INICIALES** en el nombre.
      ![](./../../../resources/img/examen1/creaProyecto.png)
    - Sigue los pasos hasta crear el proyecto.

b. Comparte el proyecto:
    - Opción de Menú: `VCS` -> `Share Project on GitHub`.
        - Deja todo tal como esta.
        - Pulsa en `Share`
    - Visita tu cuenta de GitHub
        - Copia la URL del repositorio que acabas de crear.
        - Comparte en la tarea del examen de la moodle la url de tu repositorio.
    - Desde GitHub, puedes añadirme también como colaborador en ese repositorio.
## Solución
~~~ kt