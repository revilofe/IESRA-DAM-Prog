# Relación 7.1

> Se evaluará el RA5, CE a,b

## 1. Descripción de la práctica

Tenemos un cliente que desea hacer un generador de horarios. Este generador tomará la entrada desde entrada estándar y
mostrará el horario generado en salida estándar

Nuestro cliente indica que, en posteriores versiones, le gustaría que pudiésemos indicar un fichero para tomar la
entrada y otro para la salida, tomando como la entrada estándar por defecto si no se le indican ficheros de entrada y
salida.

La entrada que nos encontraríamos sería de la siguiente forma:

1. La primera línea indicará la cabecera de la tabla:

```
Id; Hora; Duración; Lunes; Martes; Miercoles; Jueves; Viernes; %Jornada
```

2. Las siguientes 7 líneas indicarán el contenido del horario, incluido el horario:

```
1; 15:30-16:30; 1.0f; SI; PRO; BBDD; BBDD; LM; 0,16%
2; 16:30-17:30; 1.0f; SI; PRO; BBDD; BBDD; LM; 0,32%
```

La salida será similar a la siguiente:

```
Id | Hora        | Duración | Lunes | Martes | Miercoles | Jueves | Viernes | Porcentaje
---|-------------|----------|-------|--------|-----------|--------|---------|-----------
 1 | 15:30-16:30 |     1,00 |    SI |    PRO |      BBDD |   BBDD |      LM |      0,16%
 2 | 15:30-16:30 |     1,00 |    SI |    PRO |      BBDD |   BBDD |      LM |      0,32%
 ....
```

El funcionamiento del programa será el siguiente: Tras ejecutarse, el programa leerá líneas hasta encontrarse con una
vacía. La primera la tomará como la cabecera y las siguientes serán el cuerpo del horario. Una vez volcado el horario a
salida estándar, el programa terminará.

Si encuentra un error, generará un mensaje de error "```El formato de entrada no es correcto, se aborta el programa!```"

Para realizar la salida, se puede usar la siguiente librería: https://github.com/marcelmay/kformat

### 1.1. Se pide

- Formar grupos de 5 componentes mínimo.
- La creación de un programa que tome la información desde entrada estándar y genere el horario.
- Realizar un diseño basado en clases, haciendo uso de clases, herencia, interfaces, polimorfismo, etc. En la medida que
  sea necesario.
- Realizar un diseño del programa para mantener desacoplando la entrada, el procesamiento y la salida. Esto facilitará
  que podamos repartir las distintas tareas entre los componentes del grupo a la hora de realizar el software.
- Hacer uso de la librería kformat.
- Documentar el programa.
- Hacer uso del LOG, si necesitas mostrar algún registro de lo que va haciendo el programa.

### 1.2 Entrega y condiciones de entrega
- Cumplir con lo que se pide.
- Memoria de trabajo, identificando a los integrantes, de no más de 2 folios indicando como os habéis organizado y las labores realizadas por cada integrante del equipo.
- Un repositorio con el trabajo final. Al ejecutarlo de
- El repositorio tendrá una carpeta Dokka que contendrá la documentación Dokka, haciendo uso de KDoc, de las clases
  generadas.
- Presentación del trabajo
- La URL al repositorio, el repositorio será:

- **privado**
- Compartido conmigo.
- El nombre del repositorio será `DAM1_id_iniciales` donde:
    - `id`: es el ide de la actividad, por ejemplo 7_1
    - `iniciales': son tus iniciales del grupo.

## 2. Evaluación

Se tendrá en cuenta el uso de superclases, interfaces, clases abstractas, el uso de jerarquía de clases ya conocidas y
que nos las proporcionan kotlin, como por ejemplo List, Map, Set. etc.

###### a) Se ha utilizado la consola para realizar operaciones de entrada y salida de información.

0. No lo hace; 5. Contiene algún error o falta de funcionalidad; 10. Nivel avanzado.

###### b) Se han aplicado formatos en la visualización de la información.

0. No lo hace; 5. Contiene algún error o falta de funcionalidad; 10. Nivel avanzado.


Adicionalmente se tendrá en cuenta:

- El código realizado es óptimo, limpio y está comentado.
- Se cumple requisitos de entrega.

## 4. Bibliografía

- [Kformat](https://github.com/marcelmay/kformat)
- [Lectura y escritura en entrada y salida estándar](https://github.com/revilofe/IESRA-DAM-Prog/blob/master/ejercicios/src/main/kotlin/un7/IO.md#3-lectura-y-escritura-en-entrada-y-salida-estandar)
