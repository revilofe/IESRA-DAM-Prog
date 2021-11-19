# Relacion 4.1

>Objetivo: Uso de arrays.

Lee detenidamente todo el ejercicio antes de empezar. Comienza por los marcados con *

### Crea un programa para mantener las notas de los alumnos.  
El programa tendrá la siguiente estructura. Los datos de inicialización estarían hardcodeados.

0. Existirán las siguientes clases:
    - Módulo, que tendrá
        - un array de los alumnos matriculados, al listarse quedarán ordenados por el identificador del alumno.
        - un array bidimensional, 3 evaluaciones + uno final, que almacena un array de notas de alumnos ordenadas según el orden de los alumnos. (Guarda la información de la nota el mismo valor del índice en el que se encuentra el alumno. Es decir, si por ejemplo el estudiante Pedro está en la posición 2 del array de estudiantes del módulo, su nota estaría en la posición 2 del array de notas.) 
    - Alumno
        - identificador numérico en el instituto. 
        - nombre y apellidos. 
    - Crea las clases y métodos que creas conveniente para realizar las operaciones que se listan a continuación.
1. *Crea un programa con 1 módulo de 15 alumnos, matricular 10 alumnos. Rellena las notas de la 1, 2 y 3 Evaluación.   
2. *Calcula la nota final de los módulos como la media de las 3 Evaluaciones.
3. *Obtener lista de alumnos, nota con las notas por evaluación, por defecto final. 
4. *Para un módulo, calcular cuantos alumnos han aprobado por evaluación, por defecto final. 
5. Para un módulo, calcular la nota más baja por evaluación, por defecto final.
6. Para un módulo, calcular la nota más alta por evaluación, por defecto final.
7. Para un módulo, calcular la nota media entre todos los alumnos por evaluación, por defecto final.
8. Para un módulo, calcular si alguno tiene un 10 por evaluación, por defecto final.
9. Para un módulo, calcular si hay alumnos aprobados por evaluación, por defecto final.
10. Para un módulo, calcular la primera nota que no ha superado el 5 por evaluación, por defecto final.
11. Obtener una lista con los alumnos ordenados ascendiente según su nota por evaluación, por defecto final.
12. *Poder matricular alumnos siempre que no se llegue al máximo de alumnos.
13. *Dar de baja alumnos. 

Opcional: Puedes hacer un menu para cada opción.

IMPORTANTE: Comenta el código e identifica claramente que parte del ejercicio estas resolviendo, haciendo referencia a los puntos del ejercicio.

### Crear, realizar y entregar el ejercicio:
a. Crea el proyecto usando el IDE:
    - Opción del Menú: `File` -> `New` -> `Project...`
    - Nombre del proyecto será DAM&lt;curso>-&lt;relacion>-&lt;iniciales>
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
