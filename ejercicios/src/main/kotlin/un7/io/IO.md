# 1. INTRODUCCIÓN

La principal función de una aplicación informática es la manipulación y transformación de datos. Estos datos pueden
representar cosas muy diferentes según el contexto del programa: notas de estudiantes, una recopilación de temperaturas,
las fechas de un calendario, etc. Las posibilidades son ilimitadas. Todas estas tareas de manipulación y transformación
se llevan a cabo normalmente mediante el almacenamiento de los datos en variables, dentro de la memoria del ordenador,
por lo que se pueden aplicar operaciones, ya sea mediante operadores o la invocación de métodos.

Desgraciadamente, todas estas variables solo tienen vigencia mientras el programa se está ejecutando. Una vez el
programa finaliza, los datos que contienen desaparecen. Esto no es problema para programas que siempre tratan los mismos
datos, que pueden tomar la forma de literales dentro del programa. O cuando el número de datos a tratar es pequeño y se
puede preguntar al usuario. Ahora bien, imagínense tener que introducir las notas de todos los estudiantes cada vez que
se ejecuta el programa para gestionarlas. No tiene ningún sentido. Por tanto, en algunos casos, aparece la necesidad de
poder registrar los datos en algún soporte de memoria externa, por lo que estas se mantengan de manera persistente entre
diferentes ejecuciones del programa, o incluso si se apaga el ordenador.

La manera más sencilla de lograr este objetivo es almacenar la información aprovechando el sistema de archivos que
ofrece el sistema operativo. Mediante este mecanismo, es posible tener los datos en un formato fácil de manejar e
independiente del soporte real, ya sea un soporte magnético como un disco duro, una memoria de estado sólido, como un
lápiz de memoria USB, un soporte óptico, cinta, etc.

En esta unidad didáctica se explican distintas clases de **Kotlin** que nos permiten crear, leer, escribir y eliminar
ficheros y directorios, entre otras operaciones. También se introduce la serialización de objetos como mecanismo de gran
utilidad para almacenar objetos en ficheros para luego recuperarlos en tiempo de ejecución.

# 2. GESTIÓN DE FICHEROS

Entre las funciones de un sistema operativo está la de ofrecer mecanismos genéricos para gestionar sistemas de archivos.
Normalmente, dentro de un sistema operativo moderno (o ya no tanto moderno), se espera disponer de algún tipo de
interfaz o explorador para poder gestionar archivos, ya sea gráficamente o usando una línea de comandos de texto. Si
bien la forma en que los datos se guardan realmente en los dispositivos físicos de almacenamiento de datos puede ser muy
diferente según cada tipo (magnético, óptico, etc.), la manera de gestionar el sistema de archivos suele ser muy similar
en la inmensa mayoría de los casos: una estructura jerárquica con **carpetas** y **ficheros**.

Ahora bien, en realidad, la capacidad de operar con el sistema de archivos no es exclusiva de la interfaz ofrecida por
el sistema operativo. Muchos lenguajes de programación proporcionan bibliotecas que permiten acceder directamente a los
mecanismos internos que ofrece el sistema, por lo que es posible crear código fuente desde el que, con las instrucciones
adecuadas, se pueden realizar operaciones típicas de un explorador de archivos. De hecho, las interfaces como un
explorador de archivos son un programa como cualquier otro, el cual, usando precisamente estas librerías, permite que el
usuario gestione archivos fácilmente. Pero es habitual encontrar otras aplicaciones con su propia interfaz para
gestionar archivos, aunque solo sea para poder seleccionar qué hay que cargar o guardar en un momento dado: editores de
texto, compresores, reproductores de música, etc.

Kotlin no es ninguna excepción ofreciendo este tipo de biblioteca, en forma del conjunto de clases incluidas dentro del
[`Package kotlin.io`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/)
(IO API for working with files and streams) Y en java, lo podemos encontrar en *`package java.io`*. Mediante la
invocación de los métodos adecuados definidos de estas clases es posible llevar a cabo prácticamente cualquier tarea
sobre el sistema de archivos.

## 2.1. La clase File

La pieza más básica para poder operar con archivos, independientemente de su tipo, en un programa Java es la **clase
File** . Esta clase pertenece al *`package java.io`* de Java. Por lo tanto será necesario importarla antes de poder
usarla.

```kotlin
import java.io.File
```

Esta clase permite manipular cualquier aspecto vinculado al sistema de ficheros. Su nombre ("archivo", en inglés) es un
poco engañoso, ya que no se refiere exactamente a un archivo.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
>
> **La clase `File` representa una ruta dentro del sistema de archivos**

Sirve para realizar operaciones tanto sobre rutas al sistema de archivos que ya existan como no existentes. Además, se
puede usar tanto para manipular archivos como directorios.

Como cualquier otra clase **hay que instanciarla para que sea posible invocar sus métodos** . El constructor de File
recibe como argumento una cadena de texto correspondiente a la ruta sobre la que se quieren llevar a cabo las
operaciones.

```kotlin
val ruta = "data.txt"
val f = File(ruta)
```

Una ruta, path en inglés, es la forma general de un **nombre de archivo o carpeta** , por lo que identifica únicamente
su localización en el sistema de archivos.

Cada uno de **los elementos de la ruta pueden existir realmente o no, pero esto no impide en modo poder inicializar
File**. En realidad, su comportamiento es como una declaración de intenciones sobre qué ruta del sistema de archivos se
quiere interactuar. No es hasta que se llaman los diferentes métodos definidos en File, o hasta que se escriben o se
leen datos, que realmente se accede al sistema de ficheros y se procesa la información.

Un aspecto importante a tener presente al inicializar `File` es tener siempre presente que el formato de la cadena de
texto que conforma la ruta puede ser diferente según el sistema operativo sobre el que se ejecuta la aplicación. Por
ejemplo, el sistema operativo Windows inicia las rutas por un nombre de unidad (C :, D :, etc.), mientras que los
sistemas operativos basados en Unix comienzan directamente con una barra
("/"). Además, los diferentes sistemas operativos usan diferentes separadores dentro de las rutas. Por ejemplo, los
sistemas Unix usan la barra ("/") mientras que el Windows la inversa ("\").

* Ejemplo de ruta Unix: `/usr/bin`
* Ejemplo de ruta Windows: `C:\Windows\System32`

De todos modos Java y Kotlin nos permite utilizar la barra de Unix ("/")
para representar rutas en sistemas Windows. Por lo tanto, es posible utilizar siempre este tipo de barra
independientemente del sistema, por simplicidad.

Es importante entender que **un objeto representa una única ruta** del sistema de ficheros. Para operar con diferentes
rutas habrá que crear y manipular varios objetos. Por ejemplo, en el siguiente código se instancian tres objetos `File`
diferentes.

```kotlin
var carpetaFotos: File = File("C:/Fotos")
var unaFoto: File = File("C:/Fotos/Foto1.png")
var otraFoto: File = File("C:/Fotos/Foto2.png")
```

## 2.2. Rutas absolutas y relativas

En los ejemplos empleados hasta el momento para crear objetos de la clase `File` se han usado rutas absolutas, ya que es
la manera de dejar más claro a qué elemento dentro del sistema de archivos, ya sea archivo o carpeta, se está haciendo
referencia.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_e5d45b04953e17dd.png)
>
> Una **ruta absoluta** es aquella que **se refiere a un elemento a
> partir del raíz** del sistema de ficheros.
>
> Por ejemplo `C:/Fotos/Foto1.png`

Las rutas absolutas se distinguen fácilmente, ya que el texto que las representa comienza de una manera muy
característica dependiendo del sistema operativo del ordenador. En el caso de los sistemas operativos Windows a su
inicio siempre se pone el nombre de la unidad ( "C:", "D:", etc.), mientras que en el caso de los sistemas operativos
Unix, estas comienzan siempre por una barra ("/").

Por ejemplo, las cadenas de texto siguientes representan rutas absolutas en un sistema de archivos de Windows:

* `C:\Fotos\Viajes` (ruta a una carpeta)
* `M:\Documentos\Unitat11\apartado1` (ruta a una carpeta)
* `N:\Documentos\Unitat11\apartado1\Actividades.txt` (ruta a un archivo)

En cambio, en el caso de una jerarquía de ficheros bajo un sistema operativo Unix, un conjunto de rutas podrían estar
representadas de la siguiente forma:

* `/Fotos/Viajes` (ruta a una carpeta)
* `/Documentos/Unidad11/apartado1` (ruta a una carpeta)
* `/Documentos/Unidad11/Apartado1/Actividades.txt` (ruta a un archivo)

Al instanciar objetos de tipo `File` usando una ruta absoluta siempre hay que usar la representación correcta según el
sistema en que se ejecuta el programa.

Si bien el **uso de rutas absolutas resulta útil para indicar con toda claridad qué elemento dentro del sistema de
archivos se está manipulando, hay casos que su uso conlleva ciertas complicaciones**. Suponga que ha hecho un programa
en el que se llevan a cabo operaciones sobre el sistema de archivos. Una vez funciona, le deja el proyecto Kotlin a un
amigo que lo copia en su ordenador dentro de una carpeta cualquiera y la abre con su entorno de trabajo. Para que el
programa le funcione perfectamente antes será necesario que en su ordenador haya exactamente las mismas carpetas que usa
en su máquina, tal como están escritas en el código fuente de su programa. De lo contrario, no funcionará, ya que las
carpetas y ficheros esperados no existirán, y por tanto, no se encontrarán. Usar rutas absolutas hace que un programa
siempre tenga que trabajar con una estructura del sistema de archivos exactamente igual donde quiera que se ejecute, lo
cual no es muy cómodo.

Para resolver este problema, a la hora de inicializar una variable de tipo `File`, también se puede hacer referencia a
una ruta relativa.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_e5d45b04953e17dd.png)
>
> Una **ruta relativa** es aquella que **no incluye el raíz** y por ello
> se considera que**parte desde el directorio de trabajo **de la
> aplicación. Esta carpeta puede ser diferente cada vez que se ejecuta
> el programa.

**Cuando un programa se ejecuta** por defecto **se le asigna una carpeta de trabajo**. Esta carpeta **suele ser la
carpeta desde donde se lanza el programa**. En el caso de un programa en Kotlin ejecutado a través de un IDE (como
IntelliJ IDEA), la carpeta de trabajo suele ser la misma carpeta donde se ha elegido guardar los archivos del proyecto.

El formato de una ruta relativa es similar a una ruta absoluta, pero nunca se indica la raíz del sistema de ficheros.
Directamente se empieza por el primer elemento escogido dentro de la ruta. Por ejemplo:

* Viajes
* Unidad11\apartado1
* Unidad11\apartado1\Actividades.txt

Una ruta relativa siempre incluye el directorio de trabajo de la aplicación como parte inicial a pesar de no haberse
escrito. El rasgo distintivo es que el directorio de trabajo puede variar. Por ejemplo, el elemento al que se refiere el
siguiente objeto `File` varía según el directorio de trabajo.

```kotlin
val f = File("Unidad11/apartado1/Actividades.txt")
```


| **Directorio de trabajo** | **Ruta real**                                          |
| :-------------------------- | :------------------------------------------------------- |
| `C:/Proyectos/Java`       | `C:/Proyectos/Java/Unidad11/apartado1/Actividades.txt` |
| `X:/Unidades`             | `X:/Unidades/Unidad11/apartado1/Actividades.txt`       |
| `/Programas`              | `/Programas/Unidad11/apartado1/Actividades.txt`        |

Este mecanismo permite facilitar la portabilidad del software entre distintos ordenadores y sistemas operativos, ya que
solo es necesario que los archivos y carpetas permanezcan en la misma ruta relativa al directorio de trabajo. Veámoslo
con un ejemplo:

```kotlin
val f = File("Activdades.txt")
```

Dada esta ruta relativa, basta garantizar que el fichero
`Activdades.txt` esté siempre en el mismo directorio de trabajo de la aplicación, cualquiera que sea éste e
independientemente del sistema operativo utilizado (en un ordenador puede ser `C:\Programas` y en otro
`/Kotlin`). En cualquiera de todos estos casos, la ruta siempre será correcta. De hecho, aún más. Nótese como **las
rutas relativas a Kotlin permiten crear código independiente del sistema operativo**, ya que no es necesario especificar
un formato de raíz ligada a un sistema de archivos concreto ( "C:", "D:", "/", etc.).

## 2.3. Métodos de la clase File

`File` ofrece varios métodos para poder manipular el sistema de archivos u obtener información a partir de su ruta.
Algunos de los más significativos para entender las funcionalidades se muestran a continuación, ordenados por tipo de
operación.

### 2.3.1. Obtención de la ruta

Una vez se ha instanciado un objeto de tipo `File`, puede ser necesario recuperar la información empleada durante su
inicialización y conocer en formato texto a qué ruta se está refiriendo, o al menos parte de ella.

* `fun getParent():String` devuelve la ruta de la carpeta del elemento referido por esta ruta. Básicamente la cadena de
  texto resultante es idéntica a la ruta original, eliminando el último elemento. Si la ruta tratada se refiere a la
  carpeta raíz de un sistema de archivos ("C:\",
  "/", etc.), este método devuelve null. En el caso de tratarse de una ruta relativa, este método no incluye la parte de
  la carpeta de trabajo.
* `fun getName():String` devuelve el nombre del elemento que representa la ruta, ya sea una carpeta o un archivo. Es el
  caso inverso del método getParent(), ya que el texto resultante es solo el último elemento.
* `fun getAbsolutePath():String` devuelve la ruta absoluta. Si el objeto
  `File` se inicializó usando una ruta relativa, el resultado incluye también la carpeta de trabajo.

Veamos un ejemplo de cómo funcionan estos tres métodos. Obsérvese que las rutas relativas se añaden a la ruta de la
carpeta de trabajo (donde se encuentra el proyecto):

```Kotlin
import kotlin.jvm.JvmStatic
import java.io.File

object PruebasFicheros {
    @JvmStatic
    fun main(args: Array<String>) {
        // Dos rutas absolutas
        val carpetaAbs = File("/home/lionel/fotos")
        val archivoAbs = File("/home/lionel/fotos/albania1.jpg")

        // Dos rutas relativas
        val carpetaRel = File("trabajos")
        val fitxerRel = File("trabajos/documento.txt")

        // Mostremos sus rutas
        mostrarRutas(carpetaAbs)
        mostrarRutas(archivoAbs)
        mostrarRutas(carpetaRel)
        mostrarRutas(fitxerRel)
    }

    fun mostrarRutas(f: File) {
        println("getParent(): " + f.parent)
        println("getName(): " + f.name)
        println("getAbsolutePath(): " + f.absolutePath)
    }
}
```

Este programa produce la salida:

```
getParent()     :   /home/lionel
getName()       :   fotos
getAbsolutePath():  /home/lionel/fotos

getParent()     :   /home/lionel/fotos
getName()       :   albania1.jpg
getAbsolutePath():  /home/lionel/fotos/albania1.jpg

getParent()     :   null
getName()       :   trabajos
getAbsolutePath():  /home/lionel/NetBeans/Ficheros/trabajos

getParent()     :   trabajos
getName()       :   documento.txt
getAbsolutePath():  /home/lionel/NetBeans/Ficheros/trabajos/documento.txt
```

### 2.3.2. Comprobaciones de estado

Dada la ruta empleada para inicializar una variable de tipo File, esta puede que realmente exista dentro del sistema de
ficheros o no, ya sea en forma de archivo o carpeta. La clase `File` ofrece un conjunto de métodos que permiten hacer
comprobaciones sobre su estado y saber si es así.

* `fun exists(): Boolean` comprueba si la ruta existe dentro del sistema de ficheros. Devolverá `true` si existe
  y `false` en caso contrario. Normalmente los archivos incorporan en su nombre una extensión (.txt, .jpg, .mp4, etc.).
  Aún así, hay que tener en cuenta que la extensión no es un elemento obligatorio en el nombre de un archivo, sólo se
  usa como mecanismo para que tanto el usuario como algunos programas puedan discriminar más fácilmente el tipo de
  archivos. Por lo tanto, solo con el texto de una ruta no se puede estar 100% seguro de si esta se refiere a un archivo
  o una carpeta. Para poder estar realmente seguros se pueden usar los métodos siguientes:
* `fun isFile(): Boolean` comprueba el sistema de ficheros en busca de la ruta y devuelve true si existe y es un
  fichero. Devolverá `false`
  si no existe, o si existe pero no es un fichero.
* `fun isDirectory():Boolean` funciona como el anterior pero comprueba si es una carpeta.

Por ejemplo, el siguiente código hace una serie de comprobaciones sobre un conjunto de rutas. Para poder probarlo puedes
crear la carpeta `Temp`
en la raíz `C:` (si estas en Windows). Dentro, un archivo llamado
`Document.txt` (puede estar vacío) y una carpeta llamada `Fotos`. Después de probar el programa puedes eliminar algún
elemento y volver a probar para ver la diferencia.

```Kotlin

import kotlin.jvm.JvmStatic
import un7.PruebaExiste
import java.io.File

object PruebaExiste {
    @JvmStatic
    fun main(args: Array<String>) {
        val temp = File("C:/Temp")
        val fotos = File("C:/Temp/Fotos")
        val document = File("C:/Temp/Documento.txt")
        println(temp.absolutePath + " ¿existe? " + temp.exists())
        mostrarEstado(fotos)
        mostrarEstado(document)
    }

    fun mostrarEstado(f: File) {
        println(f.absolutePath + " ¿archivo? " + f.isFile)
        println(f.absolutePath + " ¿carpeta? " + f.isDirectory)
    }
}
```

### 2.3.3. Propiedades de ficheros

El sistema de ficheros de un sistema operativo almacena diversidad de información sobre los archivos y carpetas que
puede resultar útil conocer: sus atributos de acceso, su tamaño, la fecha de modificación, etc. En general, todos los
datos mostrados en acceder a las propiedades del archivo. Esta información también puede ser consultada usando los
métodos adecuados. Entre los más populares hay los siguientes:

* `fun length(): Long` devuelve el tamaño de un archivo en bytes. Este método solo puede ser llamado sobre una ruta que
  represente un archivo, de lo contrario no se puede garantizar que el resultado sea válido.
* `fun lastModified(): Long` devuelve la última fecha de edición del elemento representado por esta ruta. El resultado
  se codifica en un único número entero cuyo valor es el número de milisegundos que han pasado desde el 1 de junio de
  1970.

El ejemplo siguiente muestra cómo funcionan estos métodos. Para probarlos crea el archivo `Documento.txt` en la
carpeta `C:\Temp`. Primero deja el archivo vacío y ejecuta el programa. Luego, con un editor de texto, escribe cualquier
cosa, guarda los cambios y vuelve a ejecutar el programa. Observa cómo el resultado es diferente. Como curiosidad,
fíjate en el uso de la clase `Date` para poder mostrar la fecha en un formato legible.

```Kotlin
import java.io.File
import java.util.*
import kotlin.jvm.JvmStatic

object PruebaPropiedades {
    @JvmStatic
    fun main(args: Array<String>) {
        val documento = File("C:/Temp/Documento.txt")
        println(documento.absolutePath)
        val milisegundos = documento.lastModified()
        val fecha = Date(milisegundos)
        println("Últimamodificación (ms)   : $milisegundos")
        println("Últimamodificación (fecha): $fecha")
        println("Tamañodel archivo: " + documento.length())
    }
}
```

**Primera salida:**

```
C:/Temp/Documento.txt
Últimamodificación (ms)   : 1583025735411
Últimamodificación (fecha): Sun Mar 01 02:22:15 CET 2020
Tamañodel archivo: 0
```

**Segunda salida:**

```
C:/Temp/Documento.txt
Últimamodificación (ms)   : 1583025944088
Últimamodificación (fecha): Sun Mar 01 02:25:44 CET 2020
Tamañodel archivo: 7
```

### 2.3.4. Gestión de ficheros

El conjunto de operaciones más habituales al acceder a un sistema de ficheros de un ordenador son las vinculadas a su
gestión directa:
renombrar archivos, borrarlos, copiarlos o moverlos. Dado el nombre de una ruta, Java y kotlin también permite realizar
estas acciones.

* `fun mkdir(): Boolean` permite crear la carpeta indicada en la ruta. La ruta debe indicar el nombre de una carpeta que
  no existe en el momento de invocar el método. Por ejemplo, dado un objeto `File`
  instanciado con la ruta `C: /Fotos/Albania` que no existe, el método
  `mkdir()` creará la carpeta `Albania` dentro de `C:/Fotos`. Devuelve
  `true` si se ha creado correctamente, en caso contrario devuelve
  `false` (por ejemplo si la ruta es incorrecta, la carpeta ya existe o el usuario no tiene permisos de escritura).
* `fun delete(): Boolean` borra el archivo o carpeta indicada en la ruta. La ruta debe indicar el nombre de un archivo o
  carpeta que sí existe en el momento de invocar el método. Se podrá borrar una carpeta solo si está vacía (no contiene
  ni carpetas ni archivos). Devuelve
  `true` o `false` según si la operación se ha podido llevar a cabo.

Para probar el ejemplo que se muestra a continuación de manera que se pueda ver cómo funcionan estos métodos, primero
asegúrate de que en la raíz de la unidad `C:` no hay ninguna carpeta llamada `Temp` y ejecute el programa. Todo fallará,
ya que las rutas son incorrectas (no existe
`Temp`). Luego, crea la carpeta `Temp` y en su interior crea un nuevo documento llamado `Documento.txt` (puede estar
vacío). Ejecuta el programa y verás que se habrá creado una nueva carpeta llamada `Fotos`. Si lo vuelves a ejecutar por
tercera vez podrás comprobar que se habrá borrado.

```Kotlin
import java.io.File
import kotlin.jvm.JvmStatic

object PruebasGestionFicheros {
    @JvmStatic
    fun main(args: Array<String>) {
        val fotos = File("C:/Temp/Fotos")
        val doc = File("C:/Temp/Documento.txt")
        val mkdirFot: Boolean = fotos.mkdir()
        if (mkdirFot) {
            println("Creada carpeta " + fotos.getName().toString() + "? " + mkdirFot)
        } else {
            val delCa: Boolean = fotos.delete()
            println("Borrada carpeta " + fotos.getName().toString() + "? " + delCa)
            val delAr: Boolean = doc.delete()
            println("Borrado archivo " + doc.getName().toString() + "? " + delAr)
        }
    }
}
```

Desde el punto de vista de un sistema operativo la operación de `mover`
un archivo o carpeta no es más que cambiar su nombre desde su ruta original hasta una nueva ruta destino. Para hacer
esto también hay un método.

* `fun renameTo(File destino): Boolean` el nombre de este método es algo engañoso ("renombrar", en inglés), ya que su
  función real no es simplemente cambiar el nombre de un archivo o carpeta, sino cambiar la ubicación completa. El
  método se invoca el objeto `File` con la ruta origen (donde se encuentra el archivo o carpeta), y se le da como
  argumento otro objeto `File` con la ruta destino. Devuelve `true` o
  `false` según si la operación se ha podido llevar a cabo correctamente o no (la ruta origen y destino son correctos,
  no existe ya un archivo con este nombre en el destino, etc.). Nótese que, en el caso de carpetas, es posible moverlas
  aunque contengan archivos.

Una vez más, veamos un ejemplo. Dentro de la carpeta `C:/Temp` crea una carpeta llamada `Media` y otra llamada `Fotos`.
Dentro de la carpeta
`Fotos` crea dos documentos llamados `Documento.txt` y `Fotos.txt`. Después de ejecutar el programa, observa como la
carpeta `Fotos` se ha movido y ha cambiado de nombre, pero mantiene en su interior el archivo
`Fotos.txt`. El archivo `Documento.txt` se ha movido hasta la carpeta
`Temp`.

```Kotlin
import java.io.File
import kotlin.jvm.JvmStatic

object PruebasGestionFicheros2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val origenDir = File("C:/Temp/Fotos")
        val destinoDir = File("C:/Temp/Media/Fotografies")
        val origenDoc = File("C:/Temp/Media/Fotografies/Document.txt")
        val destinoDoc = File("C:/Temp/Document.txt")
        var res = origenDir.renameTo(destinoDir)
        println("Se ha movido y renombrado la carpeta? $res")
        res = origenDoc.renameTo(destinoDoc)
        println("Se ha movido el documento? $res")
    }
}

```

Como ya se ha comentado este método también sirve, implícitamente, para renombrar archivos o carpetas. Si el elemento
final de las rutas origen y destino son diferentes, el nombre del elemento, sea archivo o carpeta, cambiará. Para
simplemente renombrar un elemento sin moverlo de lugar, simplemente su ruta padre sea exactamente la misma. El resultado
es que el elemento de la ruta origen "se mueve" en la misma carpeta donde está ahora, pero con un nombre diferente.

Por ejemplo, si utilizamos `C:/Trabajos/Doc.txt` como ruta origen y
`C:/Trabajos/File.txt` como ruta destino, el archivo `Doc.txt` cambiará de nombre a `File.txt` pero permaneceráen la
misma carpeta
`C:/Trabajos`.

### 2.3.5. Listado de archivos

Finalmente, sólo en el caso de las carpetas, es posible consultar cuál es el listado de archivos y carpetas que
contiene.

* fun listFiles(): Array<File> devuelve un vector de objectos `File` con todos los elementos contenidos en la carpeta (
  representados por objetos `File`, uno por elemento). Para que se ejecute correctamente la ruta debe indicar una
  carpeta. El tamaño del vector será igual al número de elementos que contiene la carpeta. Si el tamaño es `0`, el valor
  devuelto será `null` y toda operación posterior sobre el vector será errónea. El orden de los elementos es aleatorio (
  al contrario que en el explorador de archivos del sistema operativo, no se ordena automáticamente por tipo ni
  alfabéticamente).

Veamos un ejemplo. Antes de ejecutarlo, crea una carpeta `Temp` en la raíz de la unidad `C:`. Dentro crea o copia
cualquier cantidad de carpetas o archivos.

```Kotlin
import java.io.File
import kotlin.jvm.JvmStatic

object PruebasGestionFicheros3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val dir = File("C:/Temp")
        val lista = dir.listFiles()
        println("Contenido de " + dir.absolutePath + " :")

        // Recorremos el array y mostramos el nombre de cada elemento
        for (i in lista.indices) {
            val f = lista[i]
            if (f.isDirectory) {
                println("[DIR] " + f.name)
            } else {
                println("[ARX] " + f.name)
            }
        }
    }
}
```

### 2.3.6. Creación de archivos

En Kotlin, se puede crear un nuevo archivo usando `File.createNewFile()`, `File.writeText(text :String)`,
`Files.writeBytes()`, etc. Hay muchas otras formas de crear un archivo en Kotlin. Examinaremos la implementación del
código para algunos de ellos utilizando programas Kotlin de ejemplo.

##### Crear archivo usando `File.createNewFile()`

`File.createNewFile()` crea un nuevo archivo si aún no existe y devuelve el valor booleano de `true`. Si el archivo ya
existe en la ruta proporcionada, el método devuelve `false`. El archivo creado está vacío y tiene cero bytes escritos.

Usar `File.createNewFile()` es el mejor procedimiento y el más seguro para crear un nuevo archivo. La mayoría de los
otros métodos, **sobrescribirían el archivo si existe**, lo que puede resultar en la pérdida de los datos existentes en
el archivo, y puede ser que no se desee este efecto.

En el siguiente ejemplo, intentamos crear un nuevo archivo con el nombre `data.txt`. La primera vez se crea el archivo y
se devuelve `true`. Cuando intentamos crear el archivo por segunda vez, como el archivo `data.txt` ya se creó,
obtenemos `false`.

```Kotlin
import java.io.File

fun main(args: Array<String>) {

    val fileName = "data.txt"
    var file = File(fileName)

    // create a new file
    val isNewFileCreated: Boolean = file.createNewFile()

    if (isNewFileCreated) {
        println("$fileName is created successfully.")
    } else {
        println("$fileName already exists.")
    }

    // try creating a file that already exists
    val isFileCreated: Boolean = file.createNewFile()

    if (isFileCreated) {
        println("$fileName is created successfully.")
    } else {
        println("$fileName already exists.")
    }

}
```

mostrará como salida:

```
data.txt is created successfully.
data.txt already exists.
```

##### Crear archivo usando `File.writeText()`

`File.writeText(` crea un nuevo archivo si aún no existe y escribe el texto (argumento de cadena) en el archivo. Si se
proporciona una cadena vacía, se crea el archivo y no se escribe nada en él. De forma predeterminada, el archivo está
codificado como UTF-8. Pasar cualquier otro conjunto de caracteres como segundo argumento codifica el archivo en
consecuencia.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
>
> En caso de que el archivo ya exista, se sobrescribe y los datos existentes se pierden

Utilice este método si está seguro de que el archivo aún no existe o si sobrescribir los datos existentes no afecta a su
aplicación.

En este ejemplo, usaremos `File.writeText()` para crear un nuevo archivo.

```Kotlin
import java.io.File

fun main(args: Array<String>) {

    val fileName = "data.txt"

    var file = File(fileName)

    // create a new file
    file.writeText("")

}
```

Al método `writeText()` se le puede proporcionar como argumento la cadena que le gustaría escribir en este archivo. Le
hemos pasado una cadena vacía, como dato a escribir en el archivo.

#### Crear archivo usando `File.writeBytes()`

`File.writeBytes()` crea un nuevo archivo si aún no existe y escribe los bytes del `ByteArray` proporcionado sin ningún
formato. Si se proporciona un `ByteArray` vacío, se crea el archivo y no se escribe nada en él.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
>
> En caso de que el archivo ya exista, se sobrescribe y los datos existentes se pierden

Utilice este método si está seguro de que el archivo aún no existe o si sobrescribir los datos existentes no afecta a su
aplicación.

En este ejemplo, usaremos `File.writeText()` para crear un nuevo archivo.

```Kotlin
import java.io.File

fun main(args: Array<String>) {

    val fileName = "data.txt"

    var file = File(fileName)

    // create a new file
    file.writeBytes(ByteArray(0))
}
```

Al método `writeBytes()` se le puede proporcionar como argumento el vector de Bytes que le gustaría escribir en este
archivo. Le hemos pasado un vector vacío, como dato a escribir en el archivo.

# 3. LECTURA Y ESCRITURA EN ENTRADA Y SALIDA ESTANDAR

Dentro de la biblioteca estándar de Kotlin, el paquete `kotlin.io` proporciona elementos esenciales para trabajar con
los flujos de entrada y salida estándar (Input/Output o I/O). Esta transmisión de información entre la memoria principal
y los dispositivos de entrada y salida permite, entre otras cosas, leer y escribir datos.

Vamos a ver cómo se transfieren datos de entrada y salida en consola (el paquete `kotlin.io` también proporciona
herramientas para trabajar con archivos, como veremos mas adelante), lo que es útil para mostrar una información en **
pantalla** y para obtener información aportada por el usuario, habitualmente a través de un dispositivo de entrada como
el **teclado**.

## 3.1. Output: Escribir en consola

Como ya hemos visto en multitud de ejemplos previos durante el curso, para enviar un mensaje a la salida estándar (la
pantalla) usamos habitualmente las funciones `print()` y `println()`, que se diferencian en que la segunda incluye un
salto de línea al final. Este salto de línea es reproducible a través del caracter especial `\n`, de la siguiente
forma `print("\n")`

```kotlin
fun main(args: Array<String>) {
    println("1. println ")
    println("2. println ")

    print("1. print ")
    print("2. print ")
}
```

El programa anterior obtiene este resultado:

```
1. println 
2. println 
1. print 2. print
```

Podemos añadir un salto de línea en la función `print` (aunque para eso ya tenemos a `println`):

```kotlin
print("Función print con salto de línea\n")
```

Un ejemplo que utiliza la función println para mostrar valores en consola:

```kotlin
val numero = 12.3
println("numero")            // numero
println(numero)                // 12.3
println("$numero")            // 12.3
println("numero = $numero")    // numero = 12.3
println("${numero + numero}")   // 24.6
println(12.3)                // 12.3
```

## 3.2. Input: Lectura de datos en consola

Para la lectura de datos por teclado utilizamos la función `readLine` (otra opción que no vamos a ver ahora es utilizar
la clase `Scanner` importada desde la librería estándar de Java con `import java.util.Scanner`):

```kotlin

fun main(args: Array<String>) {
    print("Tu nombre: ")
    val nombre = readLine()
    println("Hola $nombre")
}
```

La función `readLine()` convierte la entrada en un `String` (realmente devuelve un `String?` puesto que puede ser nulo)
aunque es posible tomar la entrada y convertirla a otro tipo explícitamente:

```kotlin
print("Nombre: ")
val nombre = readLine()
print("Edad: ")
val edad = Integer.valueOf(readLine()) // cuidadín!!   
println("Tu nombre es $nombre y tienes $edad años.")
```

El programa anterior funcionará bien mientras el usuario introduzca un entero como valor de edad, pero en caso contrario
saltará un excepción durante la ejecución (`NumberFormatException`). Una primera solución podría pasar por el uso del
manejo de excepciones (que veremos en posteriores entradas) para capturar los casos problemáticos:

```kotlin
print("Nombre: ")
val nombre = readLine()
print("Edad: ")
try {
    val edad = Integer.valueOf(readLine())
    println("Tu nombre es $nombre y tienes $edad años.")
} catch (ex: NumberFormatException) {
    println("Edad no válida")
}
```

A veces se pueden ver ejemplos de código que intentan resolver este problema con el operador de aserción `!!` (revisar
Gestión de tipos nulos en Kotlin), y de esta manera se le avisa al compilador que confíe que la función `readLine`
siempre retornará un `String`, pero en general no es una buena manera de validar la entrada de datos.

```kotlin
val num: Int
print("Introduce un número entero: ")
num = readLine()!!.toInt() // prometemos algo que no podemos cumplir
println(num)
```

A pesar de la pretendida seguridad del operador `!!`, seguimos sin escapar del `NumberFormatException`. Recuerda que
además de la función `toInt()` también existen las funciones `toFloat()`, `toDouble()`, `toLong()`, `toShort()`
y `toByte()` para la conversión de tipos (ver Tipos básicos de datos).

Existen distintas formas de resolver éste y otros problemas similares respecto a la entrada de datos por parte del
usuario. Algunas soluciones pasan por combinar la función `readLine` con el operador de llamada segura `?` y con la
expresión `try` para devolver un valor (otras soluciones también utilizan el operador `as` que vimos en Comprobación y
conversión de tipos con `is` y `as`). Un ejemplo:

```kotlin
val num: Int?
print("Introduce un número entero: ")
num = try {
    readLine()?.toInt()
} catch (ex: NumberFormatException) {
    null
}
if (num != null) {
    println("El número es: $num")
} else {
    println("¡Eso no es un número entero!")
}
```

En este ejemplo el valor introducido es asignado a la variable anulable `num`, cuyo valor depende de que se procese el
contenido de la expresión `try` (cuando se ingresa un entero) o de que, en caso contrario, se produzca
un `NumberFormatException` que es capturado por `catch`, que retorna `null` que es asignado a la variable `num`.

Pero podemos mejorarla prescindiendo de `try..catch` y sustituyendo la función `toInt` por la función `toIntOrNull`:

```kotlin
val num: Int?
print("Introduce un número entero: ")
num = readLine()?.toIntOrNull()
if (num != null) {
    println("El número es: $num")
} else {
    println("¡Eso no es un número entero!")
}
```

En el ejemplo anterior llamamos a `readLine` con el operador `?` para realizar la conversión con `toIntOrNul` de forma
segura. La función `toIntOrNull()` requiere que la variable sea de tipo anulable (`val num: Int?`) porque si la
conversión a entero falla, se retorna null, que es asignado a `num`. Igualmente contamos con las
funciones `toFloatOrNull()`, `toDoubleOrNull()`, `toLongOrNull()`, `toShortOrNull()` y `toByteOrNull()` que en caso de
no poder realizar la conversión de tipos devuelven `null`.

### 3.2.1. Mejorando las funciones

[Aquí](https://stackoverflow.com/questions/41283393/reading-console-input-in-kotlin) hay un grupo extendido (inspirado
en
el [artículo](https://kotlinlang.org/docs/competitive-programming.html#functional-operators-example-long-number-problem))
de funciones de ayuda para leer todos los tipos posibles, listas, arrays, arrays 2D, etc.:

```Kotlin
// private fun readln() = readLine()!! //Ya disponib le en la versión 1.6
private fun readlnByte() = readln().toByte()
private fun readlnShort() = readln().toShort()
private fun readlnInt() = readln().toInt()
private fun readlnLong() = readln().toLong()
private fun readlnFloat() = readln().toFloat()
private fun readlnDouble() = readln().toDouble()
private fun readlnBigInt(radix: Int = 10) = readln().toBigInteger(radix)
private fun readlnBigDecimal() = readln().toBigDecimal()

private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)
private fun readlnStrings() = readln().split(' ')
private fun readlnBytes() = readlnStrings().map { it.toByte() }
private fun readlnShorts() = readlnStrings().map { it.toShort() }
private fun readlnInts() = readlnStrings().map { it.toInt() }
private fun readlnLongs() = readlnStrings().map { it.toLong() }
private fun readlnFloats() = readlnStrings().map { it.toFloat() }
private fun readlnDoubles() = readlnStrings().map { it.toDouble() }

private fun readByteArray() = readlnStrings().run { ByteArray(size) { get(it).toByte() } }
private fun readShortArray() = readlnStrings().run { ShortArray(size) { get(it).toShort() } }
private fun readIntArray() = readlnStrings().run { IntArray(size) { get(it).toInt() } }
private fun readLongArray() = readlnStrings().run { LongArray(size) { get(it).toLong() } }
private fun readFloatArray() = readlnStrings().run { FloatArray(size) { get(it).toFloat() } }
private fun readDoubleArray() = readlnStrings().run { DoubleArray(size) { get(it).toDouble() } }

private fun readlnByteArray(n: Int) = ByteArray(n) { readlnByte() }
private fun readlnShortArray(n: Int) = ShortArray(n) { readlnShort() }
private fun readlnIntArray(n: Int) = IntArray(n) { readlnInt() }
private fun readlnLongArray(n: Int) = LongArray(n) { readlnLong() }
private fun readlnFloatArray(n: Int) = FloatArray(n) { readlnFloat() }
private fun readlnDoubleArray(n: Int) = DoubleArray(n) { readlnDouble() }

private fun readByteArray2d(rows: Int, cols: Int) = Array(rows) { readByteArray().also { require(it.size == cols) } }
private fun readShortArray2d(rows: Int, cols: Int) = Array(rows) { readShortArray().also { require(it.size == cols) } }
private fun readLongArray2d(rows: Int, cols: Int) = Array(rows) { readLongArray().also { require(it.size == cols) } }
private fun readIntArray2d(rows: Int, cols: Int) = Array(rows) { readIntArray().also { require(it.size == cols) } }
private fun readFloatArray2d(rows: Int, cols: Int) = Array(rows) { readFloatArray().also { require(it.size == cols) } }
private fun readDoubleArray2d(rows: Int, cols: Int) =
    Array(rows) { readDoubleArray().also { require(it.size == cols) } }

private fun isWhiteSpace(c: Char) = c in " \r\n\t"

// JVM-only targeting code follows next

// readString() via sequence is still slightly faster than Scanner
private fun readString() = generateSequence { System.`in`.read().toChar() }
    .dropWhile { isWhiteSpace(it) }.takeWhile { !isWhiteSpace(it) }.joinToString("")
private fun readByte() = readString().toByte()
private fun readShort() = readString().toShort()
private fun readInt() = readString().toInt()
private fun readLong() = readString().toLong()
private fun readFloat() = readString().toFloat()
private fun readDouble() = readString().toDouble()
private fun readBigInt(radix: Int = 10) = readString().toBigInteger(radix)
private fun readBigDecimal() = readString().toBigDecimal()

private fun readBytes(n: Int) = generateSequence { readByte() }.take(n)
private fun readShorts(n: Int) = generateSequence { readShort() }.take(n)
private fun readInts(n: Int) = generateSequence { readInt() }.take(n)
private fun readLongs(n: Int) = generateSequence { readLong() }.take(n)
private fun readFloats(n: Int) = generateSequence { readFloat() }.take(n)
private fun readDoubles(n: Int) = generateSequence { readDouble() }.take(n)
```

## 3.3. Aplicando formato a la salida estándar

A continuacion veremos como aplicar formato a las cadenas que se imprimen en salida estandar. La explicación esta hecha
en Kotlin pero en Java aplica prácticamente lo mismo.

En Kotlin (Y la mayoría de los lenguajes de programación) podemos utilizar formatos para reemplazar variables dentro de
los String, supongamos que queremos imprimir nuestro nombre, edad y peso, podríamos hacer algo así

```kotlin
val name: String = "Walter White"
val age: Int = 50
val weight: Double = 75.5

val description = "Me llamo " + name + ", tengo " + age + " años y peso " + weight + " kg."
println(description)

// O mejor aún, en Kotlin podemos hacer esto
val description = "Me llamo $name, tengo $age años y peso $weight kg"
println(description)

// Ahora, si usamos el String format
val description = String.format("Me llamo %s, tengo %d años y peso %.2f kg", name, age, weight)
println(description)
```

Las 3 soluciones son correctas e imprimen lo mismo, pero la tercera es la más útil al usar `Strings` donde tendrás que
reemplazar variables porque te ayuda a tener código más limpio y soportar diferentes idiomas.

Si observas en la última opción, lo que hacemos es poner ciertos formatos dentro del `String` y luego al final,
separados por coma, ponemos las variables que queremos que se reemplacen en el `String`: `%s` para otros strings
como `name`, `%d` para enteros como `age` y `%f` para `doubles` y `floats`, en el `.2` que ves en el `%f` el `2` es la
cantidad de decimales que queremos que se impriman, así por ejemplo en este caso se imprimiría el peso como `75.50`.

Aquí te dejo una tabla con los formatos más comunes, también pueden ser usados en Java:


| **Formato** | Tipo de**dato**                                          |
| ------------- | ---------------------------------------------------------- |
| %b          | Boolean                                                  |
| %c          | Char                                                     |
| %d          | Integer                                                  |
| %e          | Float en notación científica                           |
| %f          | Float y Double (Agrega %**.n**f para forzar n decimales) |
| %o          | Formato Octal                                            |
| %s          | Strings                                                  |
| %x          | Formato Hexadecimal                                      |

Hay otros 3 o 4 formatos más pero son tan poco usuales que si los necesitas prefiero que los consultes tu en la
documentación.

¿Que muestra como salida el siguiente código?

```kotlin
 val str1 = String.format("%d", 404) // Integer value  
val str2 = String.format("%s", "Mehmet") // String value  
val str3 = String.format("%f", 404.00) // Float value  
val str4 = String.format("%x", 404) // Hexadecimal value  
val str5 = String.format("%c", 'c') // Char value  
println(str1)
println(str2)
println(str3)
println(str4)
println(str5)
```

## 3.3.1. Biblioteca KFormat

https://github.com/marcelmay/kformat

Existen bibliotecas hechas por otras personas, que intentan solucionar alguna necesidad que han encontrado en sus
desarrollos.

KFormat es una pequeña biblioteca de Kotlin para la salida de texto con formato, como por ejemplo la impresión de
valores en una tabla estructurada. Los casos de uso típicos incluyen el desarrollo de herramientas CLI. (Command Line
Interface)

Un ejemplo: Dar formato a una tabla, incluido el cambio de tamaño de celda:

```kotlin
table {
    header("A", "B", "C", "Long_Header")

    row(10, "b...1", 2.1f, "foo")
    row(20, "b2", 1 / 3f, "bar")

    hints {
        alignment("A", Hints.Alignment.LEFT)
        precision("C", 2)
        postfix("C", "%")
        borderStyle = Table.BorderStyle.SINGLE_LINE // or NONE
    }
}.render(StringBuilder())
```

Genera la siguiente salida:

```
A  |     B |     C | Long_Header
---|-------|-------|------------
10 | b...1 | 2.10% |         foo
20 |    b2 | 0.33% |         bar
```

# 4. LECTURA Y ESCRITURA DE FICHEROS

Normalmente las aplicaciones que utilizan archivos no están centradas en la gestión del sistema de archivos de su
ordenador. El objetivo principal de usar ficheros es **poder almacenar datos de modo que entre diferentes ejecuciones
del programa**, incluso en diferentes equipos, sea posible recuperarlos. El caso más típico es un editor de documentos,
que mientras se ejecuta se encarga de gestionar los datos relativos al texto que está escribiendo, pero en cualquier
momento puede guardarlo en un archivo para poder recuperar este texto en cualquier momento posterior, y añadir otros
nuevos si fuera necesario. El fichero con los datos del documento lo puede abrir tanto en el editor de su ordenador como
en el de otro compañero.

Para saber cómo tratar los datos de un fichero en un programa, hay que
**tener muy claro cómo se estructuran**. Dentro de un archivo se pueden almacenar todo tipo de valores de cualquier tipo
de datos. La parte más importante es que estos valores **se almacenan en forma de secuencia**, uno tras otro. Por lo
tanto, como pronto veréis, la forma más habitual de tratar ficheros es **secuencialmente**, de forma parecida a como se
hace para leerlas del teclado, mostrarlas por pantalla o recorrer las posiciones de un array.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_e5d45b04953e17dd.png)
>
> Se denomina **acceso secuencial** al procesamiento de un conjunto de
> elementos de manera que sólo es posible acceder a ella de acuerdo a su
> orden de aparición. Para procesar un elemento es necesario procesar
> primero todos los elementos anteriores.

Kotlin, junto con otros lenguajes de programación, diferencia entre dos tipos de archivos según cómo se representan los
valores almacenados en un archivo.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_e5d45b04953e17dd.png)
>
> En los **ficheros orientados a carácter** , los datos se
> representan como una secuencia de cadenas de texto, donde cada valor se
> diferencia del otro usando un delimitador. En cambio, en los **ficheros
> orientados a byte**, los datos se representan directamente de acuerdo a
> su formato en binario, sin ninguna separación. Estos últimos ficheros son
> no son legibles a simple vista, y son interpretados por programas que
> entienden su formato. Por ejemplo, pdf, doc, xls.

Nos centraremos principalmente en el procesamiento de ficheros orientados a carácter.

## 4.1. Ficheros orientados a carácter

Un fichero orientado a carácter no es más que un **documento de texto**, como el que podría generar con cualquier editor
de texto simple. Los valores están almacenados según su representación en cadena de texto, exactamente en el mismo
formato que ha usado hasta ahora para entrar datos desde el teclado. Del mismo modo, los diferentes valores se
distinguen al estar separados entre ellos con un delimitador, que por defecto es cualquier conjunto de espacios en
blanco o salto de línea. Aunque estos valores se puedan distribuir en líneas de texto diferentes, conceptualmente, se
puede considerar que están organizados uno tras otro, secuencialmente, como las palabras en la página de un libro.

El siguiente podría ser el contenido de un fichero orientado a carácter donde hay diez valores de tipo `float`, 7 en la
primera línea y 3 en la segunda:

```
1,5 0,75 −2,35 18,0 9,4 3,1416 −15,785
−200,4 2,56 9,3785
```

Y este el de un fichero con 3 valores de tipo `String` `"Había"`, `"una"` y
`"vez..."`:

```
Había una vez...
```

En un fichero orientado a carácter **es posible almacenar cualquier combinación de datos de cualquier tipo** (`int`
, `double`, `boolean`, `String`, etc.).

```
7 10 20,51 6,99
Había una vez...
true false 2020 0,1234
```

La principal ventaja de un fichero de este tipo es que resulta muy sencillo inspeccionar su contenido y generarlos de
acuerdo a nuestras necesidades.

Para el caso de los ficheros orientados a carácter, hay que usar dos clases diferentes según si lo que se quiere es leer
o escribir datos en un archivo. Normalmente esto no es muy problemático, ya que **en un bloque de código dado solo se
llevarán a cabo operaciones de lectura o de escritura sobre un mismo archivo, pero no los dos tipos de operación a la
vez**.

Una diferencia importante a la hora de tratar con archivos respecto a leer datos del teclado es que las operaciones de
lectura no son producto de una interacción directa con el usuario, que es quien escribe los datos. Solo se puede
trabajar con los datos que hay en el archivo y nada más. Esto tiene dos efectos sobre el proceso de lectura:

1. Por un lado, recuerda que **cuando se lleva a cabo el proceso de lectura de una secuencia de valores, siempre hay que
   tener cuidado de usar el método adecuado al tipo de valor que se espera que venga a continuación** . Qué tipo de
   valor se espera es algo que habréis decidido vosotros a la hora de hacer el programa que escribió ese archivo, por lo
   que es vuestra responsabilidad saber qué hay que leer en cada momento. De todos modos nada garantiza que no se haya
   cometido algún error o que el archivo haya sido manipulado por otro programa o usuario. Como operamos con ficheros y
   no por el teclado, no existe la opción de pedir al usuario que vuelva a escribir el dato. Por lo tanto, el programa
   debería decir que se ha producido un error ya que el archivo no tiene el formato correcto y finalizar el proceso de
   lectura.
2. Por otra parte, **también es necesario controlar que nunca se lean más valores de los que hay disponibles para leer**
   . En el caso de la entrada de datos por el teclado el programa simplemente se bloqueaba y espera a que el usuario
   escribiera nuevos valores. Pero con ficheros esto no sucede. Intentar leer un nuevo valor cuando el apuntador ya ha
   superado el último disponible se considera erróneo y lanzará una excepción. Para evitarlo, habrá que utilizar el
   algún procedimiento que nos permita saber si se ha llegado al final de fichero en vez de suponer que siguen
   existiendo datos que leer.

### 4.1.1. Lectura de fichero

En Kotlin demos leer el contenido de un archivo utilizando los métodos estándar de la clase `java.io.File` o los métodos
que proporciona Kotlin como una extensión de `java.io.File`.

Examinaremos programas de ejemplo para los métodos de extensión, proporcionados por Kotlin a la clase `java.io.File` de
Java, para leer el contenido de un archivo.

#### 4.1.1.1. Usar `java.io.File.bufferedReader()` de Java

[Ver mas info](https://dcodingames.com/como-usar-la-clase-bufferedreader/)

`BufferedReader` lee texto desde un flujo de entrada de caracteres, almacenando los caracteres para proporcionar una lectura
eficiente de caracteres, arreglos y líneas.

Se puede configurar específicamente el tamaño del buffer, o usar el que se otorga por default, el cual es suficientemente
grande para la mayoría de los casos.

Dado que esta clase extiende de `Reader`, cada petición de lectura causa una petición de lectura del flujo de entrada, por
lo que es aconsejable envolverla con la clase `InputStreamReader` o `FileReader`, según el propósito de la lectura.

A continuación podemos ver cómo leer el contenido de un archivo en `BufferedReader`, El proceso es el siguiente:

1. Prepare el objeto `File` con la ubicación del archivo pasado como argumento al constructor de la clase de `File`.
2. `File.bufferedReader` devuelve un nuevo `BufferedReader` para leer el contenido del archivo.
3. Utilice `BufferedReader.readLines()` para leer el contenido del archivo.

Un ejemplo

```kotlin

import java.io.File

fun main(args: Array<String>) {
    val file = File("input" + File.separator + "contents.txt")
    val bufferedReader = file.bufferedReader()
    val text: List<String> = bufferedReader.readLines()
    for (line in text) {
        println(line)
    }
}

```

El contenido del archivo se imprime en la consola.

#### 4.1.1.2. Usar `java.io.File.forEachLine()` de Kotlin

Lee un archivo línea por línea en Kotlin. El proceso es el siguiente:

1. Prepare el objeto `File` con la ubicación pasada como argumento al constructor de la clase de `File`.
2. Use la función `File.forEachLine` y lea cada línea del archivo.

Un ejemplo

```kotlin

import java.io.File

fun main(args: Array<String>) {
    val file = File("input" + File.separator + "contents.txt")
    file.forEachLine { println(it) }
}
```

El contenido del archivo se imprime en la consola.

<!--
> ![](./../../resources/img/un7/lu37016xc6sgf_tmp_e5d45b04953e17dd.png)
>
> ...Para tratar de manera sencilla ficheros orientados a carácter, Java
> proporciona las clases `Scanner` (para lectura) del `package
> java.util`, y `FileWriter` (para escritura) del `package java.io`

## 3.2. Lectura de fichero (clase Scanner)

**La clase que permite llevar a cabo la lectura de datos desde un fichero orientado a carácter es exactamente la misma
que permite leer datos desde el teclado: Scanner** . Al fin y al cabo, los valores almacenados en los archivos de este
tipo se encuentran exactamente en el mismo formato que ha usado hasta ahora para entrar información en sus programas:
una secuencia de cadenas de texto. La única diferencia es que estos valores no se piden al usuario durante la ejecución,
sino que se encuentran almacenados en un fichero.

Para procesar datos desde un archivo, **el constructor de la clase Scanner permite como argumento un objeto de tipo
File** que contenga la ruta a un archivo.

Por ejemplo, para crear un objeto de tipo Scanner de modo que permita leer datos desde el archivo ubicado en la ruta
"C:\Programas\Unidad11\Documento.txt", habría que hacer:

importjava.io.File;

importjava.util.Scanner;

...

Filef = new File("C:\Programas\Unidad11\Documento.txt");

ScannerlectorArchivo = new Scanner(f);

...

Una vez instanciado el objeto Scanner **podemos utilizar sus métodos exactamente igual que si leyéramos de teclado** :
hasNext(), next(), nextLine(), nextInt(), nextDouble(), nextBoolean(), etc. La única diferencia es que el objeto Scanner
leerá secuencialmente el contenido del archivo.

Es importante entender que en el caso de un archivo, **el objeto Scanner gestiona internamente un apuntador que indica
sobre qué valor actuarán las operaciones de lectura** . Inicialmente el apuntador se encuentra en el primer valor dentro
del archivo. **Cada vez que se hace una lectura el apuntador avanza automáticamente hasta el siguiente valor dentro del
archivo y no hay ninguna manera de hacerlo retroceder** . A medida que invocamos métodos de lectura el apuntador sigue
avanzando hasta que hayamos leído tantos datos como queramos, o hasta que no podamos seguir leyendo porque hemos llegado
al final del fichero.

A continuación se muestra un pequeño esquema de este proceso, recalcando cómo avanza el apuntador a la hora de realizar
operaciones de lectura sobre un archivo que contiene valores de tipo entero.

![](file:///tmp/lu37016xc6sfk.tmp/lu37016xc6sgf_tmp_43d276c79f83a115.png)

**Es importante recordar la diferencia entre el método next() y nextLine()** , ya que ambos evalúan una cadena de texto.
El método
**next() sólo lee una palabra individual** (conjuntos de caracteres, incluidos dígitos, que no están separados por
espacios o saltos de línea, como por ejemplo "casa", "hola", "2", "3,14", "1024", etc.). En cambio, **nextLine() lee
todo el texto que encuentre (espacios incluidos) hasta el siguiente salto de línea** . En tal caso el apuntador se
posiciona al inicio de la siguiente línea.

**Una vez se ha finalizado la lectura del archivo** , ya sean todas o solo una parte, **es imprescindible ejecutar un
método especial llamado close()** . Este método indica al sistema operativo que el archivo ya no está siendo utilizado
por el programa. Esto es muy importante ya que mientras un archivo se considera en uso, su acceso puede verse limitado.
Si no se utiliza close() el sistema operativo puede tardar un tiempo en darse cuenta de que el archivo ya no está en
uso.

| ...**Siempre hay que cerrar los archivos con close()**cuando se ha terminado de leer o escribir en
ellos.![](file:///tmp/lu37016xc6sfk.tmp/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
| |

|

Es importante saber que al instanciar el objeto Scanner **se lanzará una excepción de tipo java.io.FileNotFoundException
si el fichero no existe** . Siempre habrá que manejar dicha excepción mediante un try-catch. Scanner también **puede
lanzar otras excepciones** , por ejemplo si se intenta leer el tipo de dato incorrecto (llamamos a nextInt() cuando no
hay un entero, como sucede en la entrada por teclado,) o si hemos llegado al final del fichero e intentamos seguir
leyendo (podemos comprobarlo mediante el método hasNext() de Scanner, que devuelve true si aún hay algún elemento que
leer).

El programa siguiente muestra un ejemplo de cómo leer diez valores enteros de un archivo llamado "Enteros.txt" ubicado
en la carpeta de trabajo (debería ser la carpeta del proyecto Netbeans). Para probarlo, crea el archivo e introduce
exactamente 10 valores enteros separados por espacios en blanco o saltos de línea.

importjava.io.File;

importjava.util.Scanner;

publicclass PruebasFicheros {

publicstatic final int NUM_VALORES = 10;

publicstatic void main(String[] args) {

try{

//Intentamos abrir el fichero

Filef = new File("Enteros.txt");

Scannerlector = new Scanner(f);

//Si llega aquí es que ha abierto el fichero :)

for(int i = 0; i < NUM_VALORES; i++) {

intvalor = lector.nextInt();

System.out.println("Elvalor leído es: " + valor); }

//¡Hay que cerrar el fichero!

lector.close(); }catch (Exception e) {

//En caso de excepción mostramos el error

System.out.println("Error:" + e);

e.printStackTrace(); } }

}
-->

#### 4.1.1.3. Oros métodos de lectura

Existen otras formas de leer archivos:

- `File.inputStream().readBytes()`: Lee el contenido del archivo en InputStream
- `File.readBytes()`: devuelve todo el contenido del archivo como ByteArray
- `File.readLines()`: devuelve todo el contenido del archivo como una lista de líneas
- `File.readText()`: devuelve todo el contenido del archivo como una sola cadena
- `java.util.Scanner`: permite leer indicando el tipo de dato a leer.

### 4.1.2. Escritura en fichero

Con en el lenguaje de programación Kotlin tambien se puede escribir en un archivo. Por lo general, en los archivos orientados a caracteres se escriben cadenas de texto.

Igual que para la lectura, haciendo uso de Kotlin podremos escribir en un archivo usando las funciones de extensión proporcionadas por Kotlin (o decir de manera idiomática o de Kotlin) o también puede usar el código Java existente que escribe contenido en un archivo.

A continuación veremos ejemplos de cómo usar clases de Java como `PrintWriter` para escribir en un archivo y más ejemplos usando funciones de extensión de Kotlin.

#### 4.1.2.1. Usar `java.io.File.bufferedWriter`

Podemos usar la función de extensión `java.io.File.bufferedWriter()` para obtener el objeto de escritura y luego usar la función `write()` en el objeto de escritura para escribir contenido en el archivo.

1. Tenga su contenido como una cadena.
2. Pase el nombre del archivo al constructor de archivos.
3. Luego llame al método `bufferedWriter()` de la clase `File`.
4. Haciendo uso de la función `use()`, llama al método `writer(content)` del bufer escritor devuelto por `bufferedWriter()`, y que se encarga de escribir el contenido en el archivo.

```kotlin
import java.io.File
 
/**
 * Example to use File.bufferedWriter() in Kotlin to write content to a text file
 */
fun main(args: Array<String>) {
    // content to be written to file
    var content = "Hello World. Welcome to Kotlin!!"
 
    // write content to file
    File("file.txt").bufferedWriter().use { out ->
        out.write(content)
    }
}
```

#### 4.1.2.2. Usar `java.io.File.writeText()`

Si está escribiendo exclusivamente texto en un archivo, puede usar la función de extensión `java.io.File.writeText()`.

En el siguiente ejemplo, hemos usado esta función de extensión de kotlin para escribir texto en un archivo.

```kotlin
import java.io.File
 
/**
 * Example to use File.writeText in Kotlin to write text to a file
 */
fun main(args: Array<String>) {
    // content to be written to file
    var content = "Hello World. Welcome to Kotlin!!"
 
    // write content to file
    File("file.txt").writeText(content)
}
```

#### 4.1.2.3. Usar `java.io.File.printWriter`

En este ejemplo, usaremos la función de extensión de Kotlin `printWriter()` para la clase `java.io.File`. El siguiente es el proceso para escribir en el archivo.

1. Tenga su contenido como una cadena.
2. Pase el nombre del archivo al constructor de archivos.
3. Luego llame al método `printWriter()` de la clase `File`.
4. Haciendo uso de la función `use()`, llama al método `println(content)` del escritor devuelto por `printWriter()`, y que se encarga de escribir el contenido en el archivo.

```kotlin
import java.io.File
 
/**
 * Example to use File.printWriter in Kotlin to write content to a text file
 */
fun main(args: Array<String>) {
    // content to be written to file
    var content = "Hello World. Welcome to Kotlin!!"
 
    // write content to file
    File("file.txt").printWriter().use { out ->
        out.println(content)
    }
}
```

#### 4.1.2.4. Usar `java.io.PrintWriter`

En este ejemplo, tomamos una cadena y la escribimos en un archivo usando la clase `java.io.PrintWriter`. Para ello se siguen los siguientes pasos.

1. Tenga sus datos listos como una cadena en una variable.
2. Inicialice un objeto escritor de la clase `PrintWriter`.
3. Agregue la cadena al archivo usando la función `PrintWriter.append()`.
4. Cerrar el escritor.

```kotlin
import java.io.PrintWriter

/**
 * Example to use standard Java method in Kotlin to write content to a text file
 */
fun main(args: Array<String>) {
    // content to be written to file
    var content = "Hello World. Welcome to Kotlin!!"

    // using java class java.io.PrintWriter
    val writer = PrintWriter("file.txt")
    writer.append(content)
    writer.close()
}
```

En los ejemplso, se creará un nuevo archivo con el nombre `file.txt`, como se especifica para el argumento de `PrintWriter()`, con el contenido. Si el archivo ya está presente, primero se borra el contenido del archivo y luego se escribe el nuevo contenido en el archivo.

#### 4.1.2.5. Oros métodos de escritura

Existen otras formas de leer archivos:

- `java.io.FileWriter`: Escribe en un fichero haciendo uso del método `writer()`.

<!--
Existen muchas formas de acceder a un fichero para escribir en él. Una de las formas más fáciles, es el uso de la clase  `FileWriter`.

### 4.1.2.1. Usar `FileWriter`

Esta clase tiene dos constructores que
merece la pena conocer:

* public FileWriter(File file)
* public FileWriter(File file, boolean append)

El primer constructor es muy parecido al del Scanner. Solo hay que pasarle un objeto `File` con la ruta al archivo. Al
tratarse de escritura la ruta puede indicar un fichero que puede existir o no dentro del sistema. **Si el fichero no
existe, se creará uno nuevo** . Pero
**si el fichero ya existe, su contenido se borra por completo, con tamaño igual a 0** . Esto puede ser peligroso ya que
si no se maneja correctamente puede producir la pérdida de datos valiosos. Hay que estar completamente seguro de que se
quiere sobreescribir el fichero. importjava.io.File; importjava.io.FileWriter; ... Filef = new File("C:
\Programas\Unidad11\Documento.txt"); FileWriterwriter= newFileWriter(f); El segundo constructor tiene otro **parámetro
de tipo booleano llamado “append”** **(añadir) que nos permite indicar si queremos escribir al final del fichero o no**
. Es decir, si le pasamos “false” hará lo mismo que el contructor anterior (si el archivo ya existe, lo sobreescribirá),
pero si le pasamos “true” abrirá el archivo para escritura en **modo “append”** , es decir, **escribiremos al final del
fichero sin borrar los datos ya existentes** . importjava.io.File; importjava.io.FileWriter; ... Filef = new File("C:
\Programas\Unidad11\Documento.txt"); FileWriterwriter= newFileWriter(f, true); La escritura secuencial de datos en un
fichero orientado a carácter es muy sencilla. Solo es necesario utilizar el siguiente método
**void write(String str)** que escribirá la cadena str en el fichero. Si se desea agregar un **final de línea** se puede
agregar **" \n"** . | ...**Tanto el constructor de FileWriter como el método write() pueden lanzar una excepción
IOException**si se produce algún error
inesperado.![](file:///tmp/lu37016xc6sfk.tmp/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
| |

---

|

Es importante tener en cuenta que **para que el método write() escriba texto correctamente es imprescindible pasarle
como argumento un String**
. Está permitido utilizar datos o variables distintas a String, pero se escribirá directamente su valor en bytes, no
como texto. Veamos dos ejemplos ilustrativos.

writer.write("8"); // Escribe el carácter 8

writer.write(8); // Escribe 8 como byte, es un carácter no imprimible

writer.write("65");// Escribe dos carácteres, el 6 y el 5

writer.write(65); // Escribe 65 como byte, es el carácter A

Por lo tanto cuando queremos escribir el valor de variables que no sean String será necesario pasárselas a write() como
String. Esto es muy sencillo, solo hay que concatenar un String vacío con la variable (Java siempre convierte a String
la concatenación de cadenas de texto con cualquier otro elemento): ""+ variable

intedad = 35;

writer.write(""+ edad); // escribe el texto "35"

La escritura de datos en fichero tiene la particularidad de que una vez se ha escrito un dato ya no hay marcha atrás. No
es posible escribir información antes o en medio de valores que ya están escritos.

Como en el caso de la lectura, la clase FileWriter también gestiona un apuntador que le permite saber a partir de qué
posición del texto debe ir escribiendo. Cada vez que se invoca uno de sus métodos de escritura, el apuntador avanza
automáticamente y no es posible hacerlo retroceder. A efectos prácticos este apuntador siempre está al final del
archivo, de modo que a medida que se van escribiendo datos el archivo va incrementando su tamaño.

A continuación se muestra un esquema del funcionamiento de la escritura en fichero.

![](file:///tmp/lu37016xc6sfk.tmp/lu37016xc6sgf_tmp_78a0f492846799d6.png)

La escritura no genera automáticamente un delimitador entre valores. Los espacios en blanco o saltos de línea que se
deseen incorporar deben escribirse esplícitamente. De lo contrario los valores quedarán pegados y en una posterior
lectura se interpretarán como un único valor. Por ejemplo, si se escribe el valor 2 y luego el 4, sin espacio, en el
fichero se habrá escrito el valor 24. Si se leyera mediante un nextInt()
nos devolvería un único valor, no dos.

**Al escribir en ficheros el cierre con close() es todavía más importante** que en la lectura. Esto se debe a que los
sistemas operativos a menudo actualizan los datos de forma diferida. Es decir, el hecho de ejecutar una instrucción de
escritura no significa que inmediatamente se escriba en el archivo. Puede pasar un intervalo de tiempo variable. Solo al
ejecutar el método close() se fuerza al sistema operativo a escribir los datos pendientes (si los hubiera).

| ...Al terminar la escritura también**es imprescindible invocar el método close()**para cerrarlo y asegurar la correcta
escritura de datos.![](file:///tmp/lu37016xc6sfk.tmp/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
| |

|

El código siguiente sirve como ejemplo de un programa que escribe un archivo llamado "Enteros.txt" dentro de la carpeta
de trabajo. Se escriben 20 valores enteros, empezando por el 1 y cada vez el doble del anterior. Pruébalo para ver su
funcionamiento. Ten en cuenta que si ya existía un archivo con ese nombre, quedará totalmente sobrescrito. Después,
puedes intentar leerlo con el programa del ejemplo anterior para leer 10 valores enteros y mostrarlos por pantalla.

publicstatic void main(String[] args) {

try{

Filef = new File("Enteros.txt");

FileWriterfw = new FileWriter(f);

intvalor = 1;

for(int i = 1; i <= 20; i++) {

fw.write(""+ valor); // escribimos valor

fw.write(""); // escribimos espacio en blanco

valor= valor * 2; // calculamos próximo valor }

fw.write("\n");// escribimos nueva línea

fw.close();// cerramos el FileWriter

System.out.println("Ficheroescrito correctamente"); }catch (IOException e) {

System.out.println("Error:" + e); }

}

Prueba a ejecutar el código varias veces. Verás que el archivo se sobrescribe y siempre queda igual. Luego, modifica la
instanciación del FileWriter agregando el segundo argumento (“append”) a true:
FileWriterfw = new FileWriter(f, true); Pruébalo y verás que ya no se sobreescribe el fichero, sino que se añaden los 20
números al final. -->

## 4.2. Ficheros binarios.

Los Data Stream (Flujos de datos) se utilizan para escribir datos binarios. `DataOutputStream` escribe datos binarios de tipos primitivos(`Int`, `Long`, `String`) mientras que `DataInputStream` lee datos del flujo binario y los convierte en tipos primitivos.

A continuación veremos un programa de ejemplo que escribe datos en un archivo y luego los vuelve a leer a memoria para luego imprimirlos por salida estándar.

```kotlin
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.FileInputStream
import java.io.FileOutputStream
 
fun main(args : Array<String>){
    val burgers = "data.burgers"
 
    //Open the file in binary mode
    DataOutputStream(FileOutputStream(burgers)).use { dos ->
        with(dos){
            //Notice we have to write our data types
            writeInt("Bob is Great\n".length) //Record length of the array
            writeChars("Bob is Great\n") //Write the array
            writeBoolean(true) //Write a boolean
 
            writeInt("How many burgers can Bob cook?\n".length) //Record length of array
            writeBytes("How many burgers can Bob cook?\n") //Write the array
            writeInt(Int.MAX_VALUE) //Write an int
 
            for (i in 0..5){
                writeByte(i) //Write a byte
                writeDouble(i.toDouble()) //Write a double
                writeFloat(i.toFloat()) //Write a float
                writeInt(i) //Write an int
                writeLong(i.toLong()) //Write a long
            }
        }
    }
 
    //Open a binary file in read mode. It has to be read in the same order
    //in which it was written
    DataInputStream(FileInputStream(burgers)).use {dis ->
        with (dis){
            val bobSize = readInt() //Read back the size of the array
            for (i in 0 until bobSize){
                print(readChar()) //Print the array one character at a time
            }
            println(readBoolean()) //Read a boolean
 
            val burgerSize = readInt() //Length of the next array
            for (i in 0 until burgerSize){
                print(readByte().toChar()) //Print array one character at a time
            }
            println(readInt()) //Read an int
 
            for (i in 0..5){
                println(readByte()) //Read a byte
                println(readDouble()) //Read a double
                println(readFloat()) //Read a float
                println(readInt()) //Read an int
                println(readLong()) //Read a long
            }
        }
 
    }
}
```

El programa crea un objeto `FileOutputStream` y pasa el nombre del archivo a su constructor. Luego, el objeto `FileOutputStream` se pasa al constructor de `DataOutputStream`. Aplicamos la función `use()` para **garantizar que todos los recursos se liberen correctamente cuando hayamos terminado**. El archivo ahora está abierto para escritura en modo binario.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
>
> Aplicamos la función `use()` para **garantizar que todos los recursos se liberen correctamente cuando hayamos terminado**

Cuando deseamos usar el mismo objeto repetidamente, podemos pasarlo a la función `with()`. En nuestro caso, tenemos la intención de seguir usando nuestro objeto `DataOutputStream`, por lo que en la línea 11, lo pasamos a la función `with()`. Dentro de la función `with()`, todas las llamadas a métodos apuntarán al objeto dos porque se proporcionó a `with()`.

> ![](../../../resources/img/un7/lu37016xc6sgf_tmp_4f43f86e4682ec35.png)
>
> Cuando deseamos usar un mismo objeto repetidamente, podemos pasarlo a la función `with()`. Cuan un objeto es pasado a la función `with()`, dentro de esta, **todas las llamadas a métodos apuntarán al objeto que se le ha pasado por parámetro**.

Dado que tenemos la intención de escribir un `String` en el archivo, necesitamos registrar la longitud de la cadena, ya que de otra forma no sabriamos cuantos bytes se han escrito. Hacemos esto usando la función `writeInt` y pasándole la longitud de nuestra cadena. Luego podemos usar `writeChars()` para escribir una matriz de caracteres en el archivo. El argumento `String` se convierte en una matriz de caracteres y se escribe en el archivo. Finalmente, llamamos a `writeBoolean()` para escribir valores `true`/`false` en el archivo.

La siguiente sección es una repetición de la primera. Tenemos la intención de escribir otro `String` en el archivo, pero al hacerlo, necesitamos registrar la longitud en el archivo. Una vez más, recurrimos a `writeInt()` para registrar un valor `int`. En la siguiente línea, usamos `writeBytes()` en lugar de `writeChars()` para demostrar cómo podemos escribir una matriz de bytes en lugar de una cadena. La clase `DataOutputStream` se ocupa de los detalles de convertir un `String` en una matriz de bytes. Finalmente, escribimos otro valor int en la secuencia.

A continuación, se ejecuta un ciclo `for` en la línea 21. Dentro del ciclo `for`, demostramos escribir diferentes tipos primitivos en el archivo. Podemos usar `writeByte()` para un `byte`, `writeDouble()` para un `double`, y así sucesivamente para cada tipo primitivo. **La clase `DataOutputStream` conoce el tamaño de cada tipo primitivo y escribe el número correcto de bytes para cada primitivo**.

Cuando terminamos de escribir el objeto, lo abrimos nuevamente para leerlo. La línea 33 crea un objeto `FileInputStream` que acepta la ruta al archivo en su constructor. El objeto `FileInputStream` está encadenado a `DataInputStream` pasándolo al constructor de `DataInputStream`. Aplicamos la función `use()` para garantizar que todos los recursos estén correctamente cerrados.

La lectura del archivo requiere que el archivo se lea en el mismo orden en que se escribe. Nuestra primera orden del día es tomar el tamaño de la matriz de caracteres que escribimos en el archivo anteriormente. Usamos `readInt()` en la línea 35 seguido de un ciclo `for` que termina en el tamaño de la matriz en la línea 36. Cada iteración del ciclo `for` llama a `readChar()` y la cadena se imprime en la consola. Cuando terminamos, leemos un booleano en la línea 39.

Nuestra siguiente matriz fue una matriz de bytes. Una vez más, necesitamos su tamaño final, por lo que llamamos a `readInt()` en la línea 41. Las líneas 42-44 recorren la matriz y llaman a `readByte()` hasta que finaliza el bucle. Cada `byte` se convierte en un objeto de carácter mediante `toChar()`. En la línea 45, leemos un `int` usando `readInt()`.

La parte final del programa repite el ciclo for encontrado anteriormente. En este caso, ingresamos un ciclo for que termina después de cinco iteraciones (línea 47). Dentro del ciclo `for`, llamamos a `readByte()`, `readDouble()`, `readFloat()`, y así sucesivamente. Cada llamada imprime la variable restaurada en la consola.

# 5. Kotlin Command-Line Arguments

Al invocar un programa desde la línea de comandos, puedes pasarle un número variable de argumentos. Por ej: `> tar -vzzf file.tar.gz`

## 5.1 Línea de comandos en `Main`

Para capturar los argumentos de la línea de comandos, debes proporcionar un parámetro predefinido a `main()`:

```kotlin
fun main (argumentos: Array < String >) {
   para   (a en argumentos) {
    imprimir (a)
  }
}
```

El parámetro se llama tradicionalmente `args` aunque puede llamarlo de cualquier manera, y el tipo de `args` solo puede ser `Array<String>` (Array of String).

También se puede usar el compilador kotlinc para crear un programa que se ejecuta desde línea de comandos.

Una vez que haya creado y guardado y compilado el código para un programa llamado `MainArgs.kt`, escriba lo siguiente en el símbolo del sistema:


```Bash
kotlinc MainArgsKt
```

Puedes proporcionar los argumentos de la línea de comandos después de la invocación del programa, así:

```Bash
kotlin MainArgsKt aaa 42 3.14159.
```
Y por salida estandar, saldra lo siguiente:

```
aaa
42
3.14159
```

Si una vez leidos los parametros quieres convertir un parámetro `String` en un tipo específico, Kotlin proporciona funciones de conversión, como`toInt()` para convertir a `Int` y `toFloat()` para convertir a `Float`.

El uso de estos métodos supone que los argumentos de la línea de comandos aparecen en un orden particular.

Por ejemplo, en el siguiente código, el programa espera un `String`, seguido de algo convertible a `Int`, seguido de algo convertible a `Float`:



```kotlin
fun main (args: Array < String >) {
   if   (args.size < 3) return 
  val primero = args[0]
   val segundo = args[1].toInt ()
   val tercero = args[2].toFloat ()
  println( "$primero $segundo $tercero" )
}
```

La primera línea de `main()` cierra el programa si no hay suficientes argumentos.

Si no proporciona algo convertible a `Int` y `Float` como segundo y tercer argumento de la línea de comandos, verá errores de tiempo de ejecución.

Compila y ejecuta `MainArgConversion.kt` con los mismos argumentos de línea de comandos que usamos antes, y verás:
```
aaa 42 3.14159
```

## 5.2 Parseador de línea de comandos

 Revisa https://github.com/Kotlin/kotlinx-cli


# 6. BIBLIOGRAFÍA

Parte del contenido de esta unidad didáctica es una traducción al castellano de los apuntes de programación de Joan
Arnedo Moreno
(Institut Obert de Catalunya, IOC) y recopilación de varios articulos.

También se ha utilizado como referencia las siguientes fuentes:

1. Apuntes de programación de Jose Luis Comesaña (sitiolibre.com).
2. Apuntes de programación de Natividad Prieto, Francisco Marqués y Javier Piris (E.T.S. de Informática, Universidad
   Politécnica de Valencia).
3. https://kotlindoc.blogspot.com/2019/04/io-entrada-y-salida-de-datos-en-consola.html
4. https://hackaprende.com/2020/11/25/formatos-de-string-en-kotlin/
5. https://www.tutorialkart.com/kotlin/kotlin-create-file/
6. https://stonesoupprogramming.com/2017/11/24/kotlin-data-streams
7. https://www.baeldung.com/kotlin/read-file
8. https://www.baeldung.com/kotlin/inputstream-to-string
9. https://www.demo2s.com/kotlin/kotlin-command-line-arguments.html
