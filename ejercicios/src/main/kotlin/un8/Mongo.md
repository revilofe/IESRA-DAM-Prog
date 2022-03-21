# NoSQL

**Aitor Medrano**[[aitormedrano@gmail.com](mailto:aitormedrano@gmail.com)](%5Baitormedrano@gmail.com%5D(mailto:aitormedrano@gmail.com))

Índice de contenidos

* [2. MongoDB](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#sesion02)
  * [2.1. BSON](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_bson)
  * [2.2. Trabajando con el shell](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_trabajando_con_el_shell)
    * [2.2.1. Empleando *JavaScript*](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_empleando_em_javascript_em)
  * [2.3. ObjectId](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_objectid)
  * [2.4. Consultas](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_consultas)
    * [2.4.1. Criterios en consultas](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_criterios_en_consultas)
    * [2.4.2. Proyección de campos](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_proyecci%C3%B3n_de_campos)
    * [2.4.3. Condiciones sobre objetos anidados](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_condiciones_sobre_objetos_anidados)
    * [2.4.4. Condiciones compuestas con Y / O](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_condiciones_compuestas_con_y_o)
    * [2.4.5. Consultas sobre arrays](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_consultas_sobre_arrays)
    * [2.4.6. Conjunto de valores](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_conjunto_de_valores)
    * [2.4.7. Cursores](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_cursores)
    * [2.4.8. Contando Documentos](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_contando_documentos)
  * [2.5. Actualizando documentos](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_actualizando_documentos)
    * [2.5.1. Operadores de actualización](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_operadores_de_actualizaci%C3%B3n)
    * [2.5.2. Actualización múltiple](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_actualizaci%C3%B3n_m%C3%BAltiple)
    * [2.5.3. Actualizaciones sobre Arrays](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_actualizaciones_sobre_arrays)
  * [2.6. Borrando documentos](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_borrando_documentos)
  * [2.7. Control de errores](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_control_de_errores)
  * [2.8. *MongoDB* desde *Java*](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__em_mongodb_em_desde_em_java_em)
    * [2.8.1. `MongoClient`](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__code_mongoclient_code)
    * [2.8.2. `DBObject`](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__code_dbobject_code)
    * [2.8.3. Inserción](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_inserci%C3%B3n)
    * [2.8.4. Consultas](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_consultas_2)
    * [2.8.5. Modificación](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_modificaci%C3%B3n)
    * [2.8.6. Borrado](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_borrado)
    * [2.8.7. `mongodb-driver`](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__code_mongodb_driver_code)
  * [2.9. Mapping de objetos](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_mapping_de_objetos)
  * [2.10. Ejercicios](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_ejercicios)
    * [2.10.1. (1 punto) Ejercicio 21. Consultas desde `mongo`](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__1_punto_ejercicio_21_consultas_desde_code_mongo_code)
    * [2.10.2. (1 punto) Ejercicio 22. Modificaciones desde `mongo`](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__1_punto_ejercicio_22_modificaciones_desde_code_mongo_code)
    * [2.10.3. (1.5 puntos) Ejercicio 23. Operaciones desde *Java*](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#__1_5_puntos_ejercicio_23_operaciones_desde_em_java_em)

## 2. MongoDB

Ya hemos visto que *MongoDB* es una base de datos documental, que agrupa los documentos en colecciones.

En esta sesión estudiaremos la estructura de estos documentos, y como podemos interactuar con ellos.

### 2.1. BSON

Mediante *JavaScript* podemos crear objetos que se representan con JSON. Internamente, *MongoDB* almacena los documentos en BSON ( *Binary JSON* ). Podemos consultar la especificación en [http://BSONSpec.org](http://bsonspec.org/)

![Especificación BSON](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/bson.jpg)

Figure 1. Especificación BSON

BSON representa un superset de JSON, ya que:

1. Almacena datos en binario
2. Incluye un conjunto de tipos de datos no incluidos en JSON, como pueden ser `ObjectId`, `Date` o `BinData`.

Podemos consultar todos los tipos que soporta un objeto *BSON* en [http://docs.mongodb.org/manual/reference/bson-types/](http://docs.mongodb.org/manual/reference/bson-types/)

Ejemplo de objeto BSON

```
var yo = {
  nombre: "Aitor",
  apellidos: "Medrano",
  fnac: new Date("Oct 3, 1977"),
  hobbies: ["programación", "videojuegos", "baloncesto"],
  casado: true,
  hijos: 2,
  fechaCreacion = new Timestamp()
}
```

Los documentos BSON tienen las siguientes restricciones:

* no pueden tener un tamaño superior a 16 MB.
* el atributo `_id` queda reservado para la clave primaria.
* los nombres de los campos no pueden empezar por `$`.
* los nombres de los campos no pueden contener el `.`.

Además  *MongoDB* :

* no asegura que el orden de los campos se respete.
* es sensible a los tipos de los datos
* es sensible a las mayúsculas.

Por lo que estos documentos son distintos:

Ejemplo de objetos con tipos distintos y atributos diferentes

```
{"edad": "18"}
{"edad": 18}
{"Edad": 18}
```

Si queremos validar si un documento JSON es válido, podemos usar [http://jsonlint.com/](http://jsonlint.com/). Hemos de tener en cuenta que sólo valida JSON y no BSON, por tanto nos dará errores en los tipos de datos propios de BSON.

### 2.2. Trabajando con el shell

Antes de entrar en detalles en las instrucciones necesarias para realizar las operaciones CRUD, veamos algunos comandos que nos serán muy utiles al interactuar con el shell:

Table 1. Comandos útiles dentro del cliente de *MongoDB*| Comando | Función |
| - | - |
| --------------------- |


| `show dbs`          | Muestra el nombre de las bases de datos                      |
| --------------------- | -------------------------------------------------------------- |
| `show collections`  | Muestra el nombre de las colecciones                         |
| `db`                | Muestra el nombre de la base de datos que estamos utilizando |
| `db.dropDatabase()` | Elimina la base de datos actual                              |
| `db.help()`         | Muestra los comandos disponibles                             |
| `db.version()`      | Muestra la versión actual del servidor                      |

En el resto de la sesión vamos a hacer un uso intenso del shell de  *MongoDB* . Por ejemplo, si nos basamos en el objeto definido en el apartado de BSON, podemos ejecutar las siguientes instrucciones:

Ejemplos de interacción con el shell

```
> db.people.insert(yo)      
> db.people.find()          
{ "_id" : ObjectId("53274f9883a7adeb6a573e64"), "nombre" : "Aitor", "apellidos" : "Medrano", "fnac" : ISODate("1977-10-02T23:00:00Z"), "hobbies" : [  "programación",  "videojuegos",  "baloncesto" ], "casado" : true, "hijos" : 2, "fechaCreacion" : Timestamp(1425633249, 1) }
> yo.email = "aitormedrano@gmail.com"
aitormedrano@gmail.com
> db.people.save(yo)        
> db.people.find()
{ "_id" : ObjectId("53274f9883a7adeb6a573e64"), "nombre" : "Aitor", "apellidos" : "Medrano", "fnac" : ISODate("1977-10-02T23:00:00Z"), "hobbies" : [  "programación",  "videojuegos",  "baloncesto" ], "casado" : true, "hijos" : 2, "fechaCreacion" : Timestamp(1425633249, 1) }
{ "_id" : ObjectId("53274fca83a7adeb6a573e65"), "nombre" : "Aitor", "apellidos" : "Medrano", "fnac" : ISODate("1977-10-02T23:00:00Z"), "hobbies" : [  "programación",  "videojuegos",  "baloncesto" ], "casado" : true, "hijos" : 2, "fechaCreacion" : Timestamp(1425633373, 1), "email" : "aitormedrano@gmail.com" }    
> db.people.find().forEach(printjson)
```


Si queremos insertar un documento en una colección, hemos de utilizar el método **`insert`**
1. ([http://docs.mongodb.org/master/reference/method/db.collection.insert/](http://docs.mongodb.org/master/reference/method/db.collection.insert/)) pasándole como parámetro el documento que queremos insertar.
2. **`find`** permite recuperar documentos
3. **`save`** es similar a `insert`, pero si existe un documento con el mismo `ObjectId`, realizará un `update` (realmente un `upsert`)
4. Hay dos documentos porque al guardar el segundo se le ha asignado un nuevo`ObjectId`. Además, los dos documentos no tienen el mismo número de campos, y la fechaCreación se ha actualizado con el *timestamp* actual.

Otros ejemplos tanto de `insert` como de `save` con objetos directos, sin necesidad de usar variables, serían:

Inserción y Guardado

```
db.people.insert({ nombre : "Aitor", edad : 37, profesion : "Profesor" })
db.people.save({ nombre : "Aitor", edad : 37, profesion : "Profesor" })
```


> **Autoevaluación** 
> 
> Al ejecutar las dos instrucciones anteriores sobre una colección vacía ¿Cuantos registros tendrá la colección?[**[1]**](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_1 "View footnote.")

#### 2.2.1. Empleando *JavaScript*

Ya hemos comentado que el *shell* utiliza *JavaScript* como lenguaje de interacción, por lo que podemos almacenar los comandos en un *script* externo y ejecutarlo mediante `load()`:

Carga de *script*

```
load("scripts/misDatos.js");   
load("/data/db/scripts/misDatos.js");
```


|  | Si hacemos una referencia relativa, lo hace respecto a la ruta desde la cual se ejecuta el*shell* `mongo` |
| -- | ----------------------------------------------------------------------------------------------------------- |

Otra manera de lanzar un *script* es hacerlo desde la línea de comandos, pasándole como segundo parámetro el script a ejecutar:

Ejecución de *script*

```
mongo expertojava misDatos.js
```

Si el código a ejecutar no necesita almacenarse en un *script* externo, el propio *shell* permite introducir instrucciones en varias líneas:

![Uso de JavaScript en el shell](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/shellJS.jpg)

Figure 2. Uso de *JavaScript* en el shell

### 2.3. ObjectId

En  *MongoDB* , el atributo `_id` es único dentro de la colección, y hace la función de clave primaria. Se le asocia un `ObjectId` ([http://docs.mongodb.org/manual/reference/object-id/](http://docs.mongodb.org/manual/reference/object-id/)), el cual es un tipo BSON de 12 bytes que se crea mediante:

* el *timestamp* actual ( *4 bytes* )
* un identificador de la máquina / *hostname* ( *3 bytes* ) donde se genera
* un identificador del proceso ( *2 bytes* ) donde se genera
* un número aleatorio ( *3 bytes* ).

Este objeto lo crea el driver y no  *MongoDB* , por lo cual no deberemos considerar que siguen un orden concreto, ya que clientes diferentes pueden tener *timestamps* desincronizados. Lo que sí que podemos obtener a partir del `ObjectId` es la fecha de creación del documento, mediante el método `getTimestamp()` del atributo `_id`.

Obteniendo la fecha de creación de un documento

```
> db.people.find()[0]._id
ObjectId("53274f9883a7adeb6a573e64")
> db.people.find()[0]._id.getTimestamp()
ISODate("2014-03-17T19:40:08Z")
```

Este identificador es  **global, único e inmutable** . Esto es, no habrá dos repetidos y una vez un documento tiene un `_id`, éste no se puede modificar.

Si en la definición del objeto a insertar no ponemos el atributo identificador, *MongoDB* creará uno de manera automática. Si lo ponemos nosotros de manera explícita, *MongoDB* no añadirá ningún `ObjectId`. Eso sí, debemos asegurarnos que sea único (podemos usar números, cadenas, etc…).

Por lo tanto, podemos hacer esto:

Asignando un identificador al insertar

```
db.people.insert({_id:3, nombre:"Marina", edad:6 })
```


|  | Cuidado con los tipos, ya que no es lo mismo insertar un atributo con`edad:6` (se considera el campo como entero) que con `edad:"6"`, ya que considera el campo como texto. |
| -- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

O también, si queremos podemos hacer que el `_id` de un documento sea un documento en sí, y no un entero, para ello, al insertarlo, podemos asignarle un objeto JSON al atributo identificador:

Insertanto un documento cuyo identificador es otro documento

```
db.people.insert({_id:{nombre:'Aitor', apellidos:'Medrano', twitter:'@aitormedrano'}, ciudad:'Elx'})
```

### 2.4. Consultas

Para recuperar los datos de una colección o un documento en concreto usaremos el método `find()`:

Ejemplo de consulta con `find()`

```
> db.people.find()
{ "_id" : ObjectId("53274f9883a7adeb6a573e64"), "nombre" : "Aitor", "apellidos" : "Medrano", "fnac" : ISODate("1977-10-02T23:00:00Z"), "hobbies" : [  "programación",  "videojuegos",  "baloncesto" ], "casado" : true, "hijos" : 2 }
{ "_id" : ObjectId("53274fca83a7adeb6a573e65"), "nombre" : "Aitor", "apellidos" : "Medrano", "fnac" : ISODate("1977-10-02T23:00:00Z"), "hobbies" : [  "programación",  "videojuegos",  "baloncesto" ], "casado" : true, "hijos" : 2, "email" : "aitormedrano@gmail.com" }
{ "_id" : 3, "nombre" : "Marina", "edad" : 6 }
```

El método `find()` sobre una colección devuelve un cursor a los datos obtenidos, el cual se queda abierto con el servidor y que se cierra automáticamente a los 10 minutos de inactividad o al finalizar su recorrido. Si hay muchos resultados, la consola nos mostrará un subconjunto de los datos (20). Si queremos seguir obtiendo resultados, solo tenemos que introducir `it`, para que continúe iterando el cursor.

Si queremos que el resultado sea más legible, podemos recorrer la consulta y mostrar una vista tabulada mediante `printjson`:

```
> db.people.find().forEach(printjson)
```

En cambio, si sólo queremos recuperar un documento hemos de utilizar `findOne()`:

Recuperando un único documento

```
> db.people.findOne()
{
  "_id" : ObjectId("53274f9883a7adeb6a573e64"),
  "nombre" : "Aitor",
  "apellidos" : "Medrano",
  "fnac" : ISODate("1977-10-02T23:00:00Z"),
  "hobbies" : [
    "programación",
    "videojuegos",
    "baloncesto"
  ],
  "casado" : true,
  "hijos" : 2
}
```

Se puede observar que al recuperar un documento con `findOne`, se muestra una vista formateada. Si queremos que esta vista se aplique a un documento encontrado con `find` podemos utilizar el sufijo `.pretty()`.

```
> db.people.find().pretty()
```

Preparando los ejemplos

Para los siguientes ejemplos, vamos a utilizar una colección de 800 calificaciones que han obtenido diferentes estudiantes en trabajos, exámenes o cuestionarios.

Para ello, importaremos la colección [grades.json](http://expertojava.ua.es/experto/restringido/2015-16/nosql/resources/nosql/grades.json) mediante:

Importanto [grades.json](http://expertojava.ua.es/experto/restringido/2015-16/nosql/resources/nosql/grades.json)

```
mongoimport -d expertojava -c grades --file grades.json
```

Un ejemplo de una calificación sería:

```
> db.grades.findOne()
{
  "_id" : ObjectId("50906d7fa3c412bb040eb577"),
  "student_id" : 0,
  "type" : "exam",
  "score" : 54.6535436362647
}
```

El campo `type` puede tomar los siguientes valores:  *quiz* , *homework* o *exam*

#### 2.4.1. Criterios en consultas

Al hacer una consulta, si queremos obtener datos mediante más de un criterio, en el primer parámetro del `find` podemos pasar un objeto JSON con los campos a cumplir (condición Y).

Consulta con dos condiciones

```
> db.grades.find({student_id:0, type:"quiz"})
```


|  | Consejo de RendimientoLas consultas disyuntivas, es decir, con varios criterios u operador`$and`, deben filtrar el conjunto más pequeño cuanto más pronto posible.Supongamos que vamos a consultar documentos que cumplen los criterios A, B y C. Digamos que el criterio A lo cumplen 40.000 documentos, el B lo hacen 9.000 y el C sólo 200. Si filtramos A, luego B, y finalmente C, el conjunto que trabaja cada criterio es muy grande.![Restringiendo consultas AND](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/andABC.jpg)Figure 3. Restringiendo consultas AND de mayor a menorEn cambio, si hacemos una consulta que primero empiece por el criterio más restrictivo, el resultado con lo que se intersecciona el siguiente criterio es menor, y por tanto, se realizará más rápido.![Restringiendo consultas AND](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/andCBA.jpg)Figure 4. Restringiendo consultas AND de menor a mayor |
| -- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

*MongoDB* también ofrece operadores lógicos para los campos numéricos:

Table 2. Operadores lógicos| Comparador | Operador |
| - | - |
| ---------------------------------- |


| menor que (`<`)          | `$lt`  |
| -------------------------- | -------- |
| menor o igual que (`≤`) | `$lte` |
| mayor que (`>`)          | `$gt`  |
| mayor o igual que (`≥`) | `$gte` |

Estos operadores se pueden utilizar de forma simultánea sobre un mismo campo o sobre diferentes campos, y se colocan como un nuevo documento en el valor del campo a filtrar, compuesto del operador y del valor a comparar:

Ejemplos de consultas con operadores relacionales

```
> db.grades.find({ score:{$gt:95} })
> db.grades.find({ score:{$gt:95, $lte:98}, type:"exam" })
> db.grades.find({ type:"exam", score:{$gte:65} })
```

Para los campos de texto, además de la comparación directa, podemos usar el operador `$ne` para obtener los documentos cuyo campos **no** tienen un determinado valor. Así pues, podemos usarlo para averiguar todas las calificaciones que no sean cuestionarios ( *quiz* ):

Consulta con *not equal*

```
> db.grades.find({type:{$ne:"quiz"}})
```


|  | Mucho cuidado al usar polimorfismo y almacenar en un mismo campo un entero y una cadena, ya que al hacer comparaciones para recuperar datos, no vamos a poder mezclar cadenas con valores numéricos. Se considera un antipatrón el mezclar tipos de datos en un campo. |
| -- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

Las comparaciones de cadenas se realizan siguiendo el orden UTF8, similar a ASCII, con lo cual no es lo mismo buscar un rango entre mayúsculas que minúsculas.

Con cierto parecido a la condición de valor no nulo de las BBDD relacionales y teniendo en cuenta que la libertad de esquema puede provocar que un documento tenga unos campos determinados y otro no lo tenga, podemos utilizar el operador `$exists` si queremos averiguar si un campo existe (y por tanto tiene algún valor).

Consulta con condición de existencia de un campo

```
> db.grades.find({"score":{$exists:true}})
```

Pese a que ciertos operadores contengan su correspondiente operador negado, *MongoDB* ofrece el operador `$not`. Éste puede utilizarse conjuntamente con otros operadores para negar el resultado de los documentos obtenidos.

Por ejemplo, si queremos obtener todas las calificaciones que no sean múltiplo de 5, podríamos hacerlo así:

Ejemplo de consulta con negación

```
> db.grades.find({score:{$not: {$mod: [5,0]}}})
```

Finalmente, si queremos realizar consultas sobre partes de un campo de texto, hemos de emplear expresiones regulares. Para ello, tenemos el operador `$regexp` o, de manera más sencilla, indicando como valor la expresión regular a cumplir:

Por ejemplo, para buscar las personas cuyo nombre contenga la palabra `Aitor`:

Ejemplo de consulta con expresión regular

```
> db.people.find({nombre:/Aitor/})
> db.people.find({nombre:/aitor/i})
> db.people.find({nombre: {$regex:/aitor/i}})
```

Ya vimos en el módulo de *JavaScript* la flexibilidad y potencia que ofrecen las expresiones regulares. Para profundizar en su uso mediante *MongoDB* podéis obtener más información sobre el operador `$regex` en [http://docs.mongodb.org/manual/reference/operator/query/regex/#op._S_regex](http://docs.mongodb.org/manual/reference/operator/query/regex/#op._S_regex)


|  | Otros operadoresAlgunos operadores que conviene citar aunque su uso es más bien ocasional son:* Si queremos recuperar documentos que dependan del tipo de campo que contiene, podemos preguntar con`$type` [http://docs.mongodb.org/manual/reference/operator/query/type/](http://docs.mongodb.org/manual/reference/operator/query/type/)* El operador `$where` permite introducir una expresión *JavaScript* [http://docs.mongodb.org/manual/reference/operator/query/where/](http://docs.mongodb.org/manual/reference/operator/query/where/) |
| -- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

#### 2.4.2. Proyección de campos

Las consultas realizadas hasta ahora devuelven los documentos completos. Si queremos que devuelva un campo o varios campos en concreto, hemos de pasar un segundo parámetro de tipo JSON con aquellos campos que deseamos mostrar con el valor `true` o `1`. Destacar que si no se indica nada, por defecto siempre mostrará el campo `_id`

```
> db.grades.findOne({student_id:3},{score:true});
{ "_id" : ObjectId("50906d7fa3c412bb040eb583"), "score" : 92.6244233936537 }
```

Por lo tanto, si queremos que no se muestre el `_id`, lo podremos a `false` o `0`:

```
> db.grades.findOne({student_id:3},{score:true, _id:false});
{ "score" : 92.6244233936537 }
```

#### 2.4.3. Condiciones sobre objetos anidados

Si queremos acceder a campos de subdocumentos, siguiendo la sintaxis de JSON, se utiliza la notación punto. Esta notación permite acceder al campo de un documento anidado, da igual el nivel en el que esté y su orden respecto al resto de campos.

Por ejemplo, supongamos que tenemos un catálogo de productos de una tienda electrónica, el cual es similar al siguiente documento:

```
{
  "producto" : "Condensador de Fluzo",
  "precio" : 100000000000,
  "reviews" : [
    {
      "usuario" : "emmett",
      "comentario" : "¡Genial!",
      "calificacion" : 5
    },{
      "usuario" : "marty" ,
      "comentario" : "¡Justo lo que necesitaba!",
      "calificacion" : 4
    } ]
}
```

Para acceder al usuario de una revisión usaríamos la propiedad `reviews.usuario`.

Por ejemplo, para averiguar los productos que cuestan más de 10.000 y que tienen una calificación igual a 5 o superior haríamos:

```
> db.catalogo.find({"precio":{$gt:10000},"reviews.calificacion":{$gte:5}})
```

#### 2.4.4. Condiciones compuestas con Y / O

Para usar la conjunción o la disyunción, tenemos los operadores `$and` y `$or`. Son operadores prefijo, de modo que se ponen antes de las subconsultas que se van a evaluar. Estos operadores trabajan con arrays, donde cada uno de los elementos es un documento con la condición a evaluar, de modo que se realiza la unión entre estas condiciones, aplicando la lógica asociada a AND y a OR.

```
> db.grades.find({ $or:[ {"type":"exam"}, {"score":{$gte:65}} ]})
> db.grades.find({ $or:[ {"score":{$lt:50}}, {"score":{$gt:90}} ]})
```

Realmente el operador `$and` no se suele usar porque podemos anidar en la consulta 2 criterios, al poner uno dentro del otro. Así pues, estas dos consultas hacen lo mismo:

Ejemplos consultas conjunciones con y sin `$and`

```
> db.grades.find({ type:"exam", score:{$gte:65} })
> db.grades.find({ $and:[ {type:"exam"}, {score:{$gte:65}} ] })
```


|  | Consejo de RendimientoLas consultas conjuntivas, es decir, con varios criterios excluyentes u operador`$or`, deben filtrar el conjunto más grande cuanto más pronto posible.Supongamos que vamos a consultar los mismos documentos que cumplen los criterios A (40.000 documentos), B (9.000 documentos) y C (200 documentos).Si filtramos C, luego B, y finalmente A, el conjunto de documentos que tiene que comprobar *MongoDB* es muy grande.![Restringiendo consultas OR](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/orCBA.jpg)Figure 5. Restringiendo consultas OR de menor a myorEn cambio, si hacemos una consulta que primero empiece por el criterio menos restrictivo, el conjunto de documentos sobre el cual va a tener que comprobar siguientes criterios va a ser menor, y por tanto, se realizará más rápido.![Restringiendo consultas AND](http://expertojava.ua.es/experto/restringido/2015-16/nosql/images/nosql02/orABC.jpg)Figure 6. Restringiendo consultas OR de mayor a menor |
| -- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

También podemos utilizar el operado `$nor`, que no es más que la negación de `$or` y que obtendrá aquellos documentos que no cumplan ninguna de las condiciones.

|  | AutoevaluaciónQue obtendríamos al ejecutar la siguiente consulta: **[**[2](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_2 "View footnote.")]

```
> db.grades.find({ score:{$gte:65}, $nor:[ {type:"quiz"}, {type:"homework"} ] })
```


|  |  |
| -- | -- |

Finalmente, si queremos indicar mediante un array los diferentes valores que puede cumplir un campo, podemos utilizar el operador `$in`:

```
> db.grades.find({ type:{$in:["quiz","exam"]}})
```

Por supuesto, también existe su negación mediante `$nin`.

#### 2.4.5. Consultas sobre arrays

Si trabajamos con arrays, vamos a poder consultar el contenido de una posición del mismo tal como si fuera un campo normal, siempre que sea un campo de primer nivel, es decir, no sea un documento embebido dentro de un array.

Si queremos filtrar teniendo en cuenta el número de ocurrencias del array, podemos utilizar:

* `$all` para filtrar ocurrencias que tienen todos los valores del array, es decir, los valores pasados a la consulta serán un subconjunto del resultado. Puede que devuelva los mismos, o un array con más campos (el orden no importa)
* `$in`, igual que SQL, para obtener las ocurrencias que cumple con alguno de los valores pasados (similar a usar `$or` sobre un conjunto de valores de un mismo campo). Si queremos su negación, usaremos `$nin`, para obtener los documentos que no cumplen ninguno de los valores.

Por ejemplo, si queremos obtener las personas que dentro de sus amistades se encuentre *Juan* **y**  *David* , y respecto a sus hobbies estén el *footing* **o** el  *baloncesto* , tendríamos:

Ejemplo consulta con `$all` y `$in`

```
> db.people.find( {amistades: {$all: ["Juan", "David"]}, hobbies: {$in: ["footing", "baloncesto"]}} )
```

Si el array contiene documentos y queremos filtrar la consulta sobre los campos de los documentos del array, tenemos que utilizar `$elemMatch`. Más información en [http://docs.mongodb.org/manual/reference/operator/projection/elemMatch/](http://docs.mongodb.org/manual/reference/operator/projection/elemMatch/)

Si lo que nos interesa es la cantidad de elementos que contiene un array, emplearemos el operador `$size`.

Por ejemplo, para obtener las personas que tienen 3 hobbies haríamos:

Ejemplo consulta con `$size`

```
> db.people.find( {hobbies : {$size : 3}} )
```

Finalmente, a la hora de proyectar los datos, si no estamos interesados en todos los valores de un campo que es un array, podemos restringir el resultado mediante el operador `$slice`:

Así pues, si quisieramos obtener las personas que tienen mas de un hijo, y que de esas personas, en vez de mostrar todos sus hobbies, mostrase los dos primeros, haríamos:

Ejemplo con `$slice`

```
> db.people.find( {hijos: {$gt:1}}, {hobbies: {$slice:2}} )
```

Más información en [http://docs.mongodb.org/manual/reference/operator/projection/slice/](http://docs.mongodb.org/manual/reference/operator/projection/slice/)

#### 2.4.6. Conjunto de valores

Igual que en SQL, a partir de un colección, si queremos obtener todos los diferentes valores que existen en un campo, utilizaremos el método `<strong>distinct</strong>`

```
> db.grades.distinct('type')
[ "exam", "quiz", "homework" ]
```

Si queremos filtrar los datos sobre los que se obtienen los valores, le pasaremos un segundo parámetro con el criterio a aplicar:

```
> db.grades.distinct('type', { score: { $gt: 99.9 } } )
[ "exam" ]
```

#### 2.4.7. Cursores

Al hacer una consulta en el  *shell* , se devuelve un cursor. Este cursor lo podemos guardar en un variable, y partir de ahí trabajar con él como haríamos mediante  *Java* . Si `cur` es la variable que referencia al cursor, podremos utilizar los siguientes métodos:

Table 3. Métodos de uso de cursores| Método | Uso | Lugar de ejecución |
| - | - | - |
| --------------------------------------------------------------------------------------- |


| `cur.hasNext()`                    | `true`/`false` para saber si quedan elementos                   | Cliente  |
| ------------------------------------ | ----------------------------------------------------------------- | ---------- |
| `cur.next()`                       | Pasa al siguiente documento                                     | Cliente  |
| `cur.limit(<em>numElementos</em>)` | Restringe el número de resultados a*numElementos*              | Servidor |
| `cur.sort({<em>campo</em>:1})`     | Ordena los datos por*campo* `1` ascendente o `-1` o descendente | Servidor |
| `cur.skip(<em>numElementos</em>)`  | Permite saltar*numElementos* con el cursor                      | Servidor |

La consulta no se ejecuta hasta que el cursor comprueba o pasa al siguiente documento (`next`/`hasNext`), por ello que tanto `limit` como `sort` (ambos modifican el cursor) sólo se pueden realizar antes de recorrer cualquier elemento del cursor.

Como tras realizar una consulta con `find`, realmente se devuelve un cursor, un uso muy habitual es encadenar una operación de `find` con `sort` y/o `limit` para ordenar el resultado por uno o más campos y posteriormente limitar el número de documentos a devolver.

Así pues, si quisiéramos obtener la calificación del trabajo con la nota más alta, podríamos hacerlo así:

```
> db.grades.find({ type:'homework'}).sort({score:-1}).limit(1)
```

Por ejemplo, si queremos paginar las notas de 10 en 10, a partir de la tercera página, podríamos hacer algo así:

```
> db.grades.find().sort({score:-1}).limit(10).skip(20);
```


|  | AutoevaluaciónA partir de la colección*grades* , escribe un consulta que obtenga los documentos de tipo "exam" ordenados descendentemente y que obtenga los documentos de 51 al 70. **[**[3](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_3 "View footnote.")] |
| -- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

#### 2.4.8. Contando Documentos

Para contar el número de documentos, en vez de `find` usaremos el método `count`. Por ejemplo:

```
> db.grades.count({type:"exam"})
> db.grades.find({type:"exam"}).count() 
> db.grades.count({type:"essay", score:{$gt:90}})
```


|  | También se puede utilizar`count` como método de un cursor. |
| -- | -------------------------------------------------------------- |

### 2.5. Actualizando documentos

Para actualizar (y fusionar datos), se utiliza el método `update` con 2 parámetros: el primero es la consulta para averiguar sobre qué documentos, y en el segundo parámetro, los campos a modificar.

Modificando un documento

```
> db.people.update({nombre:"Steve Jobs"}, {nombre:"Domingo Gallardo", salario: 1000000})
```


|  | `update` hace un **reemplazo** de los campos, es decir, si en el origen había 100 campos y en el `update` sólo ponemos 2, el resultado sólo tendrá 2 campos. ¡Cuidado que puede ser muy PELIGROSO! |
| -- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

Si cuando vamos a actualizar, en el criterio de selección no encuentra el documento sobre el que hacer los cambios, no se realiza ninguna acción.

Si quisiéramos que en el caso de no encontrar nada insertase un nuevo documento, acción conocida como **upsert** ( ***up**date + in**sert*** ), hay que pasarle un tercer parámetro al método con el objeto `{upsert:true}`

Ejemplo *upsert*

```
db.people.update({nombre:"Domingo Gallardo"}, {name:"Domingo Gallardo", twitter: '@domingogallardo'}, {upsert: true})
```

Otra manera de realizar un *upsert* es mediante la operación `save`, que ya hemos visto anteriormente. Así pues, si reescribimos la consulta anterior tendríamos (siempre y cuando considerasemos que el `nombre` actúa como el campo `_id`):

Ejemplo *save*

```
db.people.save({nombre:"Domingo Gallardo"}, {name:"Domingo Gallardo", twitter: '@domingogallardo'})
```

Si no indicamos el valor `_id`, el comando `save` asume que es una inserción e inserta el documento en la colección.

#### 2.5.1. Operadores de actualización

*MongoDB* ofrece un conjunto de operadores para simplificar la modificación de campos.

Para evitar el reemplazo, hay que usar la variable `$set` (si el campo no existe, se creará).

Por ejemplo, para modificar el salario haríamos:

Ejemplo `$set`

```
> db.people.update({nombre:"Aitor Medrano"}, {$set:{salario: 1000000}})
```

Mediante `$inc` podemos incrementar el valor de una variable.

En cambio, si queremos incrementar el salario haríamos:

Ejemplo `$inc`

```
> db.people.update({nombre:"Aitor Medrano"}, {$inc:{salario: 1000}})
```

Para eliminar un campo de un documento, usaremos el operador `$unset`.

De este modo, para eliminar el campo `twitter` de una persona haríamos:

Ejemplo `$unset`

```
> db.people.update({nombre:"Aitor Medrano"}, {$unset:{twitter: ''}})
```

Otros operadores que podemos utilizar son `$mul`, `$min`, `$max` y `$currentDate`. Podemos consultar todos los operadores disponibles en [http://docs.mongodb.org/manual/reference/operator/update/](http://docs.mongodb.org/manual/reference/operator/update/)

|  | AutoevaluaciónTras realizar la siguiente operación sobre una colección vacía:

```
> db.people.update({nombre:'yo'}, {'$set':{'hobbies':['gaming', 'sofing']}}, {upsert: true} );
```


| ¿Cuál es el estado de la colección?**[**[4](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_4 "View footnote.")] |  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | -- |

Realmente podemos dividir las actualizaciones en cuatro tipos:

* reemplazo completo
* modificar un campo
* hacer un *upsert*
* o actualizar múltiples documentos

#### 2.5.2. Actualización múltiple

Un aspecto que no hemos comentado y el cual es muy importante es que, si a la hora de actualizar la búsqueda devuelve más de un resultado, la actualización sólo se realiza sobre el primer resultado obtenido.

Para modificar múltiples documentos, en el tercer parámetro indicaremos `{multi: true}`. ¡Esta es una diferencia sustancial respecto a SQL!

Por ejemplo, para incrementar todas las calificaciones de los exámenes en un punto haríamos:

Ejemplo Actualización Múltiple

```
> db.grades.update({type:'exam'}, {'$inc':{'score':1}}, {multi: true} );
```

Cuando se hace una actualización múltiple, *MongoDB* no la realiza de manera atómica (no soporta transacciones  *isolated* ), lo que provoca que se puedan producir pausas ( *pause yielding* ). Cada documento si es atómico, por lo que ninguno se va a quedar a la mitad.

*MongoDB* ofrece el método `findAndModify` para encontrar y modificar un documento de manera atómica, y así evitar que, entre la búsqueda y la modificación, el estado del documento se vea afectado. Además, devuelve el documento modificado. Un caso de uso muy común es para contadores y casos similares.

Encontrar y Modificar de manera atómica - `findAndModify`

```
> db.grades.findAndModify({
  query:{student_id:0, type:"exam"},
  update:{$inc:{score:1}},
  new: true
})
```

Por defecto, el documento devuelto será el resultado que ha encontrado con la consulta. Si queremos que nos devuelva el documento modificado con los cambios deseados, necesitamos utilizar el parámetro `new` a `true`. Si no lo indicamos o lo ponemos a `false`, tendremos el comportamiento por defecto.

Para el resto de opciones que ofrece `findAndModifiy` se recomienda consultar la documentación ([http://docs.mongodb.org/master/reference/method/db.collection.findAndModify/](http://docs.mongodb.org/master/reference/method/db.collection.findAndModify/))

Finalmente, un caso particular de las actualizaciones es la posibilidad de renombrar un campo mediante el operador `$rename`:

Renombrando un campo con `$rename`

```
> db.people.update( {_id:1}, {$rename:{'nickname':'alias', 'cell':'movil'}})
```

Podemos consultar todas las opción de configuración de una actualización en [http://docs.mongodb.org/manual/reference/method/db.collection.update/](http://docs.mongodb.org/manual/reference/method/db.collection.update/)

#### 2.5.3. Actualizaciones sobre Arrays

Para trabajar con arrays necesitamos nuevos operadores que nos permitan tanto introducir como eliminar elementos de una manera más sencilla que sustituir todos los elementos del array.

Los operadores que podemos emplear para trabajar con arrays son:


| Operador                            | Propósito                        |
| ------------------------------------- | ----------------------------------- |
| ----------------------------------- |                                   |
| `$push`                             | Añade un elemento                |
| -                                   | -                                 |
| `$pushAll`                          | Añade varios elementos           |
| `$addToSet`                         | Añade un elemento sin duplicados |
| `$pull`                             | Elimina un elemento               |
| `$pullAll`                          | Elimina varios elementos          |
| `$pop`                              | Elimina el primer o el último    |

Preparando los ejemplos

Para trabajar con los arrays, vamos a suponer que tenemos una colección de *enlaces* donde vamos a almacenar un documento por cada site, con un atributo *tags* con etiquetas sobre el enlace en cuestión

```
> db.enlaces.insert({titulo:"www.google.es", tags:["mapas", "videos"]})
```

De modo que tendríamos el siguiente objeto:

```
{
	"_id" : ObjectId("54f9769212b1897ae84190cf"),
	"titulo" : "www.google.es",
	"tags" : [
		"mapas", "videos"
	]
}
```

##### Añadiendo elementos

Si queremos añadir un elemento, usaremos el operador `$push`. Si queremos añadir varios elementos de una sola vez, usaremos `$pushAll`.

```
> db.enlaces.update({titulo:"www.google.es"}, {$push:{tags:"blog"}})
> db.enlaces.update({titulo:"www.google.es"}, {$pushAll:{tags:["calendario", "email", "mapas"]}})
```

Al hacer estar modificación, el resultado del documento sería:

```
{
  "_id" : ObjectId("54f9769212b1897ae84190cf"),
  "titulo" : "www.google.es",
  "tags" : [
    "mapas",
    "videos",
    "blog",
    "calendario",
    "email",
    "mapas"
  ]
}
```

Tanto `$push` como `$pushAll` no tienen en cuenta lo que contiene el array, por tanto, si un elemento ya existe, se repetirá y tendremos duplicados. Si queremos evitar los duplicados, usaremos `$addToSet`:

```
> db.enlaces.update({titulo:"www.google.es"}, {$addToSet:{tags:"buscador"}})
```

Si queremos añadir más de un campo a la vez sin duplicados, debemos anidar el operador `$each`:

```
> db.enlaces.update({titulo:"www.google.es"},{ $addToSet:{tags:{$each:["drive", "traductor"]}}})
```

##### Eliminando elementos

En cambio, si queremos eliminar elementos de un array, usaremos el operador `$pull`:

```
> db.enlaces.update({titulo:"www.google.es"}, {$pull:{tags:"traductor"}})
```

Similar al caso anterior, con `$pullAll`, eliminaremos varios elementos de una sola vez:

```
> db.enlaces.update({titulo:"www.google.es"}, {$pullAll:{tags:["calendario", "email"]}})
```

Otra manera de eliminar elementos del array es mediante `$pop`, el cual elimina el primero (`-1`) o el último (`1`) elemento del array:

```
> db.enlaces.update({titulo:"www.google.es"}, {$pop:{tags:-1}})
```

##### Operador posicional

Por último, tenemos el operador posicional, el cual se expresa con el símbolo `$` ([http://docs.mongodb.org/master/reference/operator/update/positional/](http://docs.mongodb.org/master/reference/operator/update/positional/)) y nos permite modificar el elemento que ocupa una determinada posición del array.

Supongamos que tenemos las calificaciones de los estudiantes (colección `students`) en un documento con una estructura similar a la siguiente:

```
{ "_id" : 1, "grades" : [ 80, 85, 90 ] }
```

y queremos cambiar la calificación de `80` por `82`. Mediante el operador posicional haremos:

Modificando un array con el operador posicional

```
> db.students.update( { _id: 1, grades: 80 }, { $set: { "grades.$" : 82 } } )
```

De manera similar, si queremos modificar parte de un documento el cual forma parte de un array, debemos usar la notación punto tras el `$`:

Por ejemplo, supongamos que tenemos estas calificación de un determinado alumno:

Ejemplo de calificación de un alumno, las cuales forman parte de un objeto dentro de un array

```
{ "_id" : 4, "grades" :
  [ { grade: 80, mean: 75, std: 8 },
    { grade: 85, mean: 90, std: 5 },
    { grade: 90, mean: 85, std: 3 } ] }
```

Podemos observar como tenemos cada calificación como parte de un objeto dentro de un array. Si queremos cambiar el valor de `std` a `6` de la calificación cuya nota es `85`, haremos:

Modificando un elemento de un objeto dentro de un array

```
> db.students.update( { _id: 4, "grades.grade": 85 }, { $set: { "grades.$.std" : 6 } } )
```

Es decir, el `$` referencia al documento que ha cumplido el filtro de búsqueda.

Podemos consultar toda la documentación disponible sobre estos operadores en [http://docs.mongodb.org/manual/reference/operator/update-array/](http://docs.mongodb.org/manual/reference/operator/update-array/)

### 2.6. Borrando documentos

Para borrar, usaremos el método `remove`, el cual funciona de manera similar a `find`. Si no pasamos ningún parámetro, borra toda la colección documento a documento. Si le pasamos un parámetro, éste será el criterio de selección de documentos a eliminar.

```
> db.people.remove({nombre:"Domingo Gallardo"})
```


|  | Al eliminar un documento, no podemos olvidar que cualquier referencia al documento que existe en la base de datos seguirá existiendo. Por este motivo, manualmente también hay que eliminar o modificar esas referencias. |
| -- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

Si queremos borrar toda la colección, es más eficiente usar el método `drop`, ya que también elimina los índices.

```
> db.people.drop()
```

Recordad que eliminar un determinado campo de un documento no se considera un operación de borrado, sino una actualización mediante el operador `$unset`.

### 2.7. Control de errores

En versiones anteriores a la 2.6, si queremos averiguar qué ha sucedido, y si ha fallado conocer el motivo, deberemos ejecutar el siguiente comando con `getLastError` ([http://docs.mongodb.org/master/reference/command/getLastError/](http://docs.mongodb.org/master/reference/command/getLastError/)):

Control de Errores

```
> db.runCommand({getLastError:1})
```

Para ello, ejecutaremos la sentencia después de haber realizado una operación, para obtener información sobre la última operación realizada.

Si la última operación ha sido una modificación mediante un `update` podremos obtener el número de registros afectados, o si es un `upsert` podremos obtener si ha insertado o modificado el documento. Finalmente, en el caso de una operación de borrado, podemos obtener el número de documentos eliminados.

Desde la versión 2.6, *MongoDB* devuelve un objeto `WriteResult` con información del número de documentos afectados (`nInserted`), y en el caso de un error, un documento en la propiedad `writeError`:

```
> db.people.insert({"_id":"error","nombre":"Pedro Casas", "edad":38})
WriteResult({ "nInserted" : 1 })
> db.people.insert({"_id":"error","nombre":"Pedro Casas", "edad":38})
WriteResult({
	"nInserted" : 0,
	"writeError" : {
		"code" : 11000,
		"errmsg" : "insertDocument :: caused by :: 11000 E11000 duplicate key error index: expertojava.people.$_id_  dup key: { : \"error\" }"
	}
})
```

Más información en [http://docs.mongodb.org/master/reference/method/db.collection.insert/#writeresult](http://docs.mongodb.org/master/reference/method/db.collection.insert/#writeresult)

A continuación vamos a estudiar como realizar todas estas operación mediante el driver *Java* que ofrece  *MongoDB* .

### 2.8. *MongoDB* desde *Java*

Para interactuar desde *Java* con *MongoDB* disponemos de diferentes alternativas:

* Trabajar directamente con el driver *Java*
* Utilizar un abstracción JPA

En nuestro caso, nos vamos a centrar en el uso del driver.


|  | v2 o v3En la actualidad existen dos versiones principales del driver*Java* , dependiendo de la versión de *MongoDB* que estemos empleando, ya sea la v2 o la v3. A partir de la versión 3, se introdujeron nuevas interfaces y clases para interactuar con  *MongoDB* , con lo cual, lo primero que debemos hacer es decidirnos por uno u otro.La ventaja de usar la v2 es que existe una comunidad rica con mucha documentación y librerías construidas sobre esta versión. En cambio, la v3 ofrece un API más intuitiva y promete un mejor rendimiento al ofrecer un esquema de documento que se traduce a BSON.En principio, los apuntes que vienen a continuación se centran en la versión v2 para explicar los conceptos. Más adelante, se muestra un ejemplo con código de la versión v3 para mostrar las diferencias. |
| -- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

Para descargar el driver, tal como vimos en la unidad anterior, hemos de utilizar la siguiente dependencia  *Maven* :

```
<dependency>
  <groupId>org.mongodb</groupId>
  <artifactId>mongo-java-driver</artifactId>
  <version>2.14.2</version>
</dependency>
```

Si nos decidimos por la versión 3, el nombre del artefacto cambia, así como su versión:

```
<dependency>
  <groupId>org.mongodb</groupId>
  <artifactId>mongodb-driver</artifactId>
  <version>3.2.2</version>
</dependency>
```

Todas las clases explicadas a continuación pertenecen al paquete `com.mongodb`. Toda la información del API de *MongoDB* la podemos encontrar en [http://api.mongodb.org/java/current/](http://api.mongodb.org/java/current/) e información del driver en [http://mongodb.github.io/mongo-java-driver/](http://mongodb.github.io/mongo-java-driver/)

#### 2.8.1. `MongoClient`

Para conectarnos desde  *Java* , tenemos que crear un `MongoClient`, el cual gestiona internamente un *pool* de conexiones. Su constructor se sobrecarga para permitir la conexión a una URI, a un determinado puerto o a un conjunto de réplicas. Podemos consultar todas estas opciones en [http://api.mongodb.org/java/current/com/mongodb/MongoClient.html](http://api.mongodb.org/java/current/com/mongodb/MongoClient.html)

A partir de un `MongoClient`, podremos obtener una `DB` y de ésta una `DBCollection`:

Ejemplo de conexión a MongoDB con Java (`HolaMongoDB.java`)

```
MongoClient cliente = new MongoClient();  

DB db = cliente.getDB("expertojava");
DBCollection col = db.getCollection("people");

System.out.println("doc:" + col.findOne()); 
```


|  | `MongoClient` realiza la conexión con la base de datos. El constructor por defecto se conecta con `localhost` al puerto `27017`. Además, lanza una `UnknownHostException` cuando no encuentra un servidor funcionando |
| -- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|  | `DBCollection` nos permite interactuar con la colección, y sobre ella realizaremos las operaciones CRUD.                                                                                                               |

Sobre un `MongoClient` podemos destacar los siguientes métodos:

* `getDB(String nombre)` → recupera la base de datos indicada
* `dropDatabase(String nombre)` → elimina la base de datos indicada
* `getDatabaseNames()` → obtiene el nombre de las bases de datos existentes

Sobre una `DB` podemos destacar los siguientes métodos:

* `getCollection(String nombre)` → recupera la colección indicada
* `command(DBObject obj)` → ejecuta un comnado
* `createCollection(String col)` → crea una nueva colección sobre la DB activa
* `dropDatabase()` → elimina la base de datos activa
* `getCollectionNames()` → obtiene el nombre de las colecciones existentes
* `getLastError()` → obtiene el último error, si lo hay, de la operación previa ( *deprecated* )
* `shutdownServer()` → detiene el servidor

#### 2.8.2. `DBObject`

Para representar un documento JSON se utiliza el interfaz `DBObject`, el cual se emplea como parámetro para la mayoría de operaciones. Su funcionamiento es similar a un mapa donde las claves están ordenadas.

Para crear un documento necesitamos una instancia de `BasicDBObject`. Por ejemplo, podremos crear un documento del siguiente modo:

Rellenando un `BasicDBObject`

```
BasicDBObject doc = new BasicDBObject();
doc.put("nombre", "Aitor Medrano");
doc.put("fnac", new Date(234832423));
doc.put("casado", true);
doc.put("hijos", 2);
doc.put("hobbies", Arrays.asList("programación","videojuegos", "baloncesto")); 
doc.put("direccion", new BasicDBObject("calle", "Mayor")  
  .append("ciudad", "Elx")
  .append("cp", "03206"));
```


|  | Los arrays realmente son implementaciones de`BasicDBList`, el cual es una lista de `DBObject`                                                                                                           |
| -- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|  | Además de usar el método`put` para añadir un atributo a un objeto, podemos crear un objeto con su constructor de clave/valor, o mediante el método `append` para concatenar un objeto al existente. |

Además, las operaciones para realizar consultas devuelven objetos `DBObject` o bien son listas (`List<DBObject>`). Para acceder a los campos de un `DBObject` emplearemos el método `get`:

Obteniendo datos a partir de un `DBObject`

```
Persona p = new Persona(); 
p.setNombre((String) obj.get("nombre"));
p.setFnac((Date) obj.get("fnac"));
p.setHijos((Integer) obj.get("hijos"));

BasicDBList hobbies = (BasicDBList) obj.get("hobbies");
p.setHobbies(hobbies.toArray(new String[0])); 
```


|  | Supongamos que tenemos una clase de modelo`Persona` compuesta únicamente de  *getters* /*setters* sobre las propiedades del objeto |
| -- | ------------------------------------------------------------------------------------------------------------------------------------- |
|  | Dentro de la clase`Persona`, tenemos la siguiente declaración `String[] hobbies`                                                   |

Para realizar operaciones, tras conectar del `MongoClient` una `DB`, y de la `DB` una `DBCollection` podemos realizar las operaciones de inserción, consulta, modificación y borrado.

#### 2.8.3. Inserción

Para insertar datos emplearemos el método `coleccion.insert(DBObject objeto)`.

Tras insertar el objeto, *MongoDB* rellenará automáticamente la clave `_id`.

|  | Autoevaluación¿Funcionará el segundo `insert`? **[**[5](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_5 "View footnote.")]

```
MongoClient client = new MongoClient();
DB db = client.getDB("expertojava");
DBCollection people = db.getCollection("people");
DBObject doc = new BasicDBObject("nombre", "Aitor Medrano")
  .append("twitter", "@aitormedrano");

try {
  people.insert(doc);      // primer insert
  doc.removeField("_id");  // elimina el campo "_id"
  people.insert(doc);      // segundo insert
} catch (Exception e) {
  e.printStackTrace();
}
```


|  |  |
| -- | -- |

#### 2.8.4. Consultas

Para hacer consultas utilizaremos el método `find` o `findOne`, de manera similar al uso desde el  *shell* . Hay que destacar que cuando hacemos una consulta con `find` recuperamos un `DBCursor`, el cual funciona como un iterador y que nos permite recorrer los documentos encontrados.

A continuación tenemos un ejemplo de su uso:

```
MongoClient client = new MongoClient();
DB db = client.getDB("expertojava");
DBCollection coleccion = db.getCollection("pruebas");
coleccion.drop();  

// insertamos 10 documentos con un número aleatorio
for (int i = 0; i < 10; i++) {
  coleccion.insert(new BasicDBObject("numero", new Random().nextInt(100)));
}

System.out.println("Primero:");
DBObject uno = coleccion.findOne(); // Encuentra uno
System.out.println(uno);

System.out.println("\nTodos: ");
DBCursor cursor = coleccion.find(); // Encuentra todos
try {
  while (cursor.hasNext()) {
    DBObject otro = cursor.next();
    System.out.println(otro);
  }
} finally {
  cursor.close(); 
}

System.out.println("\nTotal:" + coleccion.count());
```


|  | Antes de rellenar la colección, la vaciamos para siempre partir de cero. |
| -- | --------------------------------------------------------------------------- |
|  | Es recomendable cerrar el cursor tras finalizar su uso                    |

##### Criterios

Supongamos que partimos de una colección con los siguientes datos:

```
MongoClient cliente = new MongoClient();
DB db = cliente.getDB("expertojava");
DBCollection coleccion = db.getCollection("pruebas");
coleccion.drop();

// insertamos 10 documentos con 2 números aleatorios
for (int i = 0; i < 10; i++) {
  coleccion.insert(
    new BasicDBObject("x", new Random().nextInt(2))
      .append("y", new Random().nextInt(100)));
}
```

Para añadir criterios a las consultas, podemos hacerlo de dos maneras:

1. Usando el objeto `QueryBuilder`, el cual ofrece diferentes métodos asociados a los operadores lógicos y aritméticos, y que permite hacer consultas a más alto nivel, lo que desacopla al driver de la sintaxis de  *MongoDB* .

   ```
   QueryBuilder builder = QueryBuilder.start("x").is(0).and("y").greaterThan(10).lessThan(90);
   long cantidadBuilder = coleccion.count(builder.get());
   ```

   Más información en [http://api.mongodb.org/java/current/com/mongodb/QueryBuilder.html](http://api.mongodb.org/java/current/com/mongodb/QueryBuilder.html)
2. Añadiendo las condiciones de manera similar a como se realiza mediante el shell creando `BasicDBObject`

   ```
   DBObject query = new BasicDBObject("x", 0).append("y", new BasicDBObject("$gt", 10).append("$lt", 90));
   long cantidadQuery = coleccion.count(query);
   ```

En ambos casos, le podemos pasar tanto el `DBObject` como el `QueryBuilder` a los métodos `find`:

```
System.out.println("\nConsultas: ");
DBCursor cursor = coleccion.find(builder.get());  
try {
  while (cursor.hasNext()) {
    DBObject cur = cursor.next();
    System.out.println(cur);
  }
} finally {
  cursor.close();
}
```


|  | A partir de un`QueryBuilder`, mediante el método `get()` obtenemos un `DBObject` |
| -- | ----------------------------------------------------------------------------------- |


|  | La versión 3.0 ha introducido nuevos filtros para facilitar el filtrado de campos, como`eq()`, `gt()`, `and()`, etc… Más información en [http://api.mongodb.org/java/current/com/mongodb/client/model/Filters.html](http://api.mongodb.org/java/current/com/mongodb/client/model/Filters.html) |
| -- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

##### Selección de campos

Para elegir que datos queremos proyectar y que aparezcan como resultado de la consulta, el método `find` permite que indiquemos con un segundo parámetro los campos deseados mediante un `BasicDBObject` poniendo como nombre los nombres de los atributos y como valores `true`/`false` dependiendo de si queremos que se devuelvan o no.

```
DBObject query = QueryBuilder.start("x").is(0).and("y").greaterThan(10).lessThan(70).get();
DBObject proyeccion = new BasicDBObject("y", true).append("_id", false);  

DBCursor cursor = coleccion.find(query, proyeccion);  
try {
  while (cursor.hasNext()) {
    DBObject cur = cursor.next();
    System.out.println(cur);
  }
} finally {
  cursor.close();
}
```


|  | Proyecta el atributo`y` y no muestra el `_id`                       |
| -- | --------------------------------------------------------------------- |
|  | Al método`find()` le pasamos tanto la consulta como la proyección |

|  | AutoevaluaciónDada una variable `alumnos` de tipo `DBCollection`,

```
alumnos.find(new BasicDBObject("tlfno", 1).append("_id", 0))
alumnos.find(new BasicDBObject("tlfno", 1))
alumnos.find(new BasicDBObject(), new BasicDBObject("tlfno", 1).append("_id", 0))
alumnos.find(new BasicDBObject("tlfno", 1).append("_id", 0), new BasicDBObject()
```


| ¿Cual de las anteriores instrucciones nos permitirá obtener todos los documentos pero recuperando únicamente el campo`tlfno` ? **[**[6](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_6 "View footnote.")] |  |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -- |

##### Campos anidados

Cuando tenemos un documento que forma parte del valor del atributo de otro documento, usaremos la notación `.` para navegar y descender un nivel.

```
// insertamos 10 documentos con puntos de inicio y fin aleatorios
for (int i = 0; i < 10; i++) {
  coleccion.insert( 
    new BasicDBObject("_id", i)
    .append("inicio", new BasicDBObject("x", rand.nextInt(90)).append("y", rand.nextInt(90)))
    .append("fin", new BasicDBObject("x", rand.nextInt(90)).append("y", rand.nextInt(90)))
  );
}

QueryBuilder builder = QueryBuilder.start("inicio.x").greaterThan(50); 

DBCursor cursor = coleccion.find(builder.get(), new BasicDBObject("inicio.y", true).append("_id", false)); 
```


|  | Crea 10 documentos del tipo`{ "_id" : 0 , "inicio" : { "x" : 28 , "y" : 46} , "fin" : { "x" : 37 , "y" : 51}}` |
| -- | ---------------------------------------------------------------------------------------------------------------- |
|  | La consulta filtra por el campo anidado`inicio.x`                                                              |
|  | La proyección sólo muestra el campo anidado`inicio.y`                                                        |

|  | AutoevaluaciónCon el siguiente fragmento de código, ¿Qué piensas que sucederá si en la colección existe un documento que cumple con la consulta pero no que no tiene una clave llamada `medio.url` ? **[**[7](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnote_7 "View footnote.")]

```
DBObject encuentraUrlPorTipoMedio(DBCollection videos, String tipoMedio) {
  DBObject query = new BasicDBObject("medio.tipo", mediaType);
  DBObject proyeccion = new BasicDBObject("medio.url", true);

  return videos.findOne(query, proyeccion);
}
```

1.  | Lanzará una excepción1. Devolverá un documento vacío1. Devolverá un documento que contiene un único campo que contiene el`_id` del documento1. No hay suficiente información para responder |  |
   | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -- |

##### Trabajando con `DBCursor`

Del mismo modo que con el  *shell* , podemos utilizar los métodos `sort`, `skip` y `limit` sobre un `DBCursor`.

Suponiendo que tenemos los mismos datos del ejemplo anterior:

Ejemplo de métodos sobre un cursor -

```
DBCursor cursor = coleccion.find().sort(new BasicDBObject("inicio.x", 1).append("inicio.y", -1)).skip(2).limit(5);
```

#### 2.8.5. Modificación

Si queremos modificar un documento, el *driver* nos ofrece el método `update` con diferentes sobrecargas:

* `update(DBObject origen, DBOject destino)` → para cambiar un documento por otro, o aplicar un operador sobre *destino* y actuar conforme indique el operador
* `update(DBObject origen, DBOject destino, boolean upsert, boolean multiple)` → igual que el anterior, más la posibilidad de indicar de si hacemos un *upsert* o si la actualización es múltiple.

Ejemplo de actualización en Java -

```
List<String> nombres = Arrays.asList("Laura", "Pedro", "Ana", "Sergio", "Helena");
for (String nombre : nombres) {
  coleccion.insert(new BasicDBObject("_id", nombre));
}

coleccion.update(new BasicDBObject("_id", "Laura"), new BasicDBObject("hermanos", 2)); 

coleccion.update(new BasicDBObject("_id", "Laura"), new BasicDBObject("$set", new BasicDBObject("edad", 34))); 

coleccion.update(new BasicDBObject("_id", "Laura"), new BasicDBObject("sexo", "F")); 

coleccion.update(new BasicDBObject("_id", "Emilio"), new BasicDBObject("$set", new BasicDBObject("edad", 36)), true, false); 

coleccion.update(new BasicDBObject(), new BasicDBObject("$set", new BasicDBObject("titulo", "Don")), false, true); 
```


|  | Le asigna a`Laura` 2 hermanos                                                                            |
| -- | ---------------------------------------------------------------------------------------------------------- |
|  | Le añade la edad, pero manteniendo el resto de atributos                                                |
|  | Realiza un reemplazo completo con lo que`Laura` solo tiene el atributo `sexo`                            |
|  | Realiza un*upsert* con lo que inserta una nueva persona                                                  |
|  | Realiza una actualización múltiple, con lo que todas las personas tendrán el atributo`"titulo":"Don"` |

#### 2.8.6. Borrado

Para borrar un documento usaremos el método `remove(DBObject obj)` sobre la colección:

```
coleccion.remove(new BasicDBObject("_id", "Sergio"));
```


|  | Podéis consultar un ejemplo completo de CRUD en[http://www.javahotchocolate.com/notes/mongodb-crud.html](http://www.javahotchocolate.com/notes/mongodb-crud.html) |
| -- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |

#### 2.8.7. `mongodb-driver`

Si nos centramos en la v3 y el driver *Java* cuyo artefacto es `mongodb-driver`, tal como hemos comentado, han cambiado una serie de interfaces:

* la base de datos emplea el interfaz `MongoDatabase`, y la colección `MongoCollection`
* los documentos se crean mediante el interfaz `Document`, el cual emplea el método `append(clave, valor)` para añadir información al documento
* uso de filtros en consultas del tipo `colleccion.find(and(gt("i", 50), lte("i", 100)))`
* actualizaciones mediante los operadores de actualización similares a las operaciones desde el *shell* como `colleccion.updateOne(eq("i", 10), set("i", 110))` y métodos específicos como `updateMany`

A modo de ejemplo, se muestra un fragmento de código similar al anterior:

```
MongoClient cliente = new MongoClient();
MongoDatabase database = cliente.getDatabase("expertojava");
MongoCollection<Document> coleccion = database.getCollection("pruebas");
coleccion.drop();

// insertamos 10 documentos con un número aleatorio
for (int i = 0; i < 10; i++) {
  coleccion.insertOne(new Document("numero", new Random().nextInt(100)));
}

System.out.println("Primero:");
Document uno = coleccion.find().first(); // Encuentra uno
System.out.println(uno);

System.out.println("\nTodos: ");
MongoCursor<Document> cursor = coleccion.find().iterator();; // Encuentra todos
try {
  while (cursor.hasNext()) {
    DBObject otro = cursor.next();
    System.out.println(otro.toJson());
  }
} finally {
  cursor.close();
}

System.out.println("\nTotal:" + coleccion.count());
```

Más información en [http://mongodb.github.io/mongo-java-driver/3.2/driver/getting-started/quick-tour/](http://mongodb.github.io/mongo-java-driver/3.2/driver/getting-started/quick-tour/)

### 2.9. Mapping de objetos

Hasta ahora, el mapeo de objetos POJO a JSON lo estamos realizando a mano, atributo por atributo. Otras opciones alternativas es automatizar el *mapping* con herramientas como:

* **Jackson** ([https://github.com/FasterXML/jackson](https://github.com/FasterXML/jackson)), y en particular **MongoJack** ([http://mongojack.org](http://mongojack.org/)), que facilitan la conversión de BSON a objetos Java. Una alternativa similar es  **Gson** , librería de *Google* ([https://github.com/google/gson](https://github.com/google/gson)).
* **Morphia** ([http://mongodb.github.io/morphia/](http://mongodb.github.io/morphia/)): framework *ORM* ligero, similar a  *Hibernate* , para automatizar el *mapping* mediante anotaciones.
* **Spring Data MongoDB** : *wrapper* que facilita la conexión y simplifica el uso de consultas: ([http://projects.spring.io/spring-data-mongodb/](http://projects.spring.io/spring-data-mongodb/))

En esta sesión no vamos a entrar en detalle en estas herramientas por falta de tiempo, pero cabe destacar que ofrecen una serie de ventajas que conviene conocer:

* Desarrollo más ágil que con mapeo manual.
* Anotación unificada entre todas las capas.
* Manejo de tipos amigables, por ejemplo, para cambios de tipos de `long` a `int` de manera transparente.
* Posibilidad de incluir mapeos diferentes entre la base de datos y las capas del servidor web para transformar los formatos como resultado de una llamada REST.

Otra solución flexible es **Hibernate OGM** ([http://hibernate.org/ogm/](http://hibernate.org/ogm/)), con soporte para  *Infinispan* ,  *Ehcache* , *MongoDB* y  *Neo4j* . Más información sobre *Hibernate OGM* y *MongoDB* en [http://docs.jboss.org/hibernate/ogm/4.1/reference/en-US/html/ogm-mongodb.html](http://docs.jboss.org/hibernate/ogm/4.1/reference/en-US/html/ogm-mongodb.html)

Finalmente, si nos decidimos por acceder via el *driver* directamente y empleamos EJB para ofrecer una capa de servicios, es conveniente encapsular el cliente dentro de un  *Singleton* . Podemos ver un ejemplo completo en [http://www.codingpedia.org/ama/how-to-connect-to-mongodb-from-a-java-ee-stateless-application/](http://www.codingpedia.org/ama/how-to-connect-to-mongodb-from-a-java-ee-stateless-application/)

### 2.10. Ejercicios

En esta sesión, vamos a centrarnos en utilizar los comandos aprendidos para interactuar con los datos de la base de datos `ejercicios`.

Posteriormente, mediante *Java* también trabajaremos con estos datos.

#### 2.10.1. (1 punto) Ejercicio 21. Consultas desde `mongo`

Escribe la operación necesaria y el resultado para averiguar:

1. Número de ciudades.
2. Datos de la ciudad de `Elx`.
3. Población de la ciudad de `Vergel`.
4. Cantidad de ciudades en España `({"country":"ES"})`.
5. Datos de las ciudades españolas con más de 1.000.000 de habitantes.
6. Cantidad de ciudades de Andorra `({"country":"AD"})` y España.
7. Listado con el nombre y la población de las 10 ciudades más pobladas.
8. Nombre de las distintas zonas horarias en España.
9. Ciudades españolas que su zona horaria no sea `Europe/Madrid`.
10. Ciudades españolas que comiencen por `Ben`
11. Ciudades que su zona horaria sea `Atlantic/Canary` o `Africa/Ceuta`, y que tengan más de 500.000 habitantes.
12. Nombre y población de las tres ciudades europeas más pobladas.
13. Cantidad de ciudades españolas cuya coordenadas de longitud estén comprendidas entre `-0.1` y `0.1`.

Escribe los comandos necesarios y el resultado en `ej21.txt`.

#### 2.10.2. (1 punto) Ejercicio 22. Modificaciones desde `mongo`

Escribe la operación necesarias para:

1. Modifica la población de tu ciudad a 1.000.000
2. Incrementa la población de `Elx` en 666 personas.
3. Reduce la cantidad de todas las ciudades de Andorra en 5 personas.
4. Modifica la ciudad de `Gibraltar` para que sea española (tanto el país como la zona horaria).
5. Modifica todas las ciudades y añade un atributo `tags` que contenga un array vacío.
6. Modifica todas las ciudades españolas y añade al atributo `tags` el valor `sun`.
7. Modifica el valor de `sun` de la ciudad `A Coruña` y sustitúyelo por `rain`.
8. Renombra en las ciudades de Andorra, el atributo `population` por `poblacion`.
9. Elimina las coordenadas de `Gibraltar`.
10. Elimina tu entrada

Escribe los comandos necesarios y el resultado en `ej22.txt`.

#### 2.10.3. (1.5 puntos) Ejercicio 23. Operaciones desde *Java*

Los siguientes ejercicios se basan en el uso de  *Java* . Para ello, los ejercicios estarán dentro del paquete `es.ua.expertojava.nosql`, en una clase nombrada como `ConsultasEjercicios`.

En base a los datos sobre una ciudad almacenados en la colección `cities` de la base de datos `ejercicios`, usaremos la siguiente clase `Ciudad`:

```
public class Ciudad {
  private String name;
  private String country;
  private String timezone;
  private long population;
  private float longitude;
  private float latitude;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public float getLongitude() {
    return longitude;
  }
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLatitude() {
    return latitude;
  }
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }
}
```

Para poder interactuar con este objeto, deberás crear dos métodos privados que se encarguen del *mapping* entre BSON y el objeto Java:

* `Ciudad mapDBObject2Ciudad(DBObject dbo)`
  * Al asociar la población desde un `DBObject` a una propiedad *Java* de tipo `long`, *MongoDB* en ocasiones devuelve un entero y en otras un entero largo. Para evitar problemas de *casting* podemos hacer:
    ```
    ciudad.setPopulation(((Number) dbo.get("population")).longValue());
    ```
* `DBObject mapCiudad2DBOject(Ciudad ciudad)`

Una vez creado estos métodos, añadiremos los siguientes métodos para interactuar con los datos:

* `void insertaCiudad(Ciudad ciudad)`: A partir de una  *ciudad* , inserta los datos en la colecciones `cities`.
* `List<Ciudad> listarCiudades()`: Obtiene todas las ciudades de la colección.
* `List<Ciudad> listarCiudades(String pais)`: Obtiene todos las ciudades de un determinado país.
* `List<String> listarPaises()`: Obtiene un listado de los paises (sin repeticiones).

---

[1](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_1). 2, porque no comparten `ObjectId`

[2](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_2). documentos con una calificación superior o igual a 65 y no que no sean de tipo "quiz" ni "homework"

[3](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_3). `db.grades.find({"type":"exam"}).sort({"score":-1}).skip(50).limit(20)`

[4](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_4). Al estar la colección vacía, insertará un nuevo registro

[5](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_5). Sí, porque la llamada a `removeField` borrará la clave añadida por el driver en el primer `insert`

[6](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_6). la correcta es la 3ª instrucción, ya que el primer parámetro del `find` indica que quiere todos los documentos, y con el segundo ya fija los campos a devolver

[7](http://expertojava.ua.es/experto/restringido/2015-16/nosql/nosql02.html#_footnoteref_7). lanzará una excepción ya que no puede aplicar la proyección

Last updated 2016-01-24 20:22:59 CET
