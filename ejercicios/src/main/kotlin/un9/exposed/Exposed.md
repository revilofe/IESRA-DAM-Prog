# Guía del framework para acceso a datos: **Exposed**

## **1. Introducción**

En este tutorial, veremos cómo consultar una base de datos relacional usando [Exposed](https://github.com/JetBrains/Exposed).

Exposed es una biblioteca de código abierto (licencia de Apache) desarrollada por JetBrains, que proporciona una API de Kotlin idiomática para algunas implementaciones de bases de datos relacionales al tiempo que suaviza las diferencias entre los proveedores de bases de datos.

**Exposed se puede utilizar como un DSL de alto nivel sobre SQL y como un ORM ligero (Mapeo relacional de objetos). **Por lo tanto, cubriremos ambos usos a lo largo del transcurso de esta guía.

## **2. Configuración del framework Exposed**

Agreguemos las dependencias Maven requeridas:

```xml
<dependency>
    <groupId>org.jetbrains.exposed</groupId>
    <artifactId>exposed-core</artifactId>
    <version>0.37.3</version>
</dependency>
<dependency>
    <groupId>org.jetbrains.exposed</groupId>
    <artifactId>exposed-dao</artifactId>
    <version>0.37.3</version>
</dependency>
<dependency>
    <groupId>org.jetbrains.exposed</groupId>
    <artifactId>exposed-jdbc</artifactId>
    <version>0.37.3</version>
</dependency>
```

Además, en las siguientes secciones, mostraremos ejemplos usando la base de datos en memoria H2:

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.1.210</version>
</dependency>
```

Podemos encontrar la última versión de las dependencias [expuestas y la última versión de ](https://search.maven.org/search?q=g:org.jetbrains.exposed)[H2](https://search.maven.org/search?q=g:com.h2database%20a:h2) en Maven Central.

## **3. Conexión a la base de datos**

Definimos las conexiones a la base de datos con la clase *Database* :

```kotlin
Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")
```

También podemos especificar un *usuario* y una *contraseña* como parámetros con nombre:

```kotlin
Database.connect(
 "jdbc:h2:mem:test", driver = "org.h2.Driver",
 user = "myself", password = "secret")
```

**Tenga en cuenta que invocar *connect* no establece una conexión con la base de datos de inmediato. **Simplemente guarda los parámetros de conexión para más tarde.

### **3.1. Parámetros adicionales**

Si necesitamos proporcionar otros parámetros de conexión, usaremos una sobrecarga diferente del método de *conexión* que nos brinda control total sobre la adquisición de una conexión de base de datos:

```kotlin
Database.connect({ DriverManager.getConnection("jdbc:h2:mem:test;MODE=MySQL") })
```

Esta versión de *connect* requiere un parámetro de cierre. **Exposed invoca el cierre cada vez que necesita una nueva conexión a la base de datos.**

### **3.2. Uso de una *fuente de datos***

Si, en cambio, nos conectamos a la base de datos utilizando un *DataSource* , como suele ser el caso en las aplicaciones empresariales (por ejemplo, para beneficiarnos de la agrupación de conexiones), podemos usar la sobrecarga de *conexión adecuada:*

```kotlin
Database.connect(datasource)
```

## **4. Apertura de una Transacción**

**Cada operación de base de datos en Exposed necesita una transacción activa.**

El método de *transacción toma un cierre y lo invoca con una transacción activa:*

```kotlin
transaction {
   //Do cool stuff
}
```

La *transacción* devuelve lo que devuelve el cierre. **Luego, Exposed cierra automáticamente la transacción cuando finaliza la ejecución del bloque.**

### **4.1. Confirmar y retroceder**

**Cuando el bloque de *transacción* regresa con éxito, Exposed confirma la transacción. Cuando, en cambio, el cierre finaliza lanzando una excepción, el marco revierte la transacción.**

También podemos confirmar o revertir manualmente una transacción. El cierre que proporcionamos a la *transacción* es en realidad una instancia de la clase *Transacción* gracias a la magia de Kotlin.

Por lo tanto, tenemos un método de *confirmación* y de *reversión disponibles:*

```kotlin
transaction {
   //Do some stuff
   commit()
   //Do other stuff
}
```

### **4.2. Registro de declaraciones**

Al aprender el marco o la depuración, puede que nos resulte útil inspeccionar las declaraciones SQL y las consultas que Exposed envía a la base de datos.

Podemos agregar fácilmente un registrador de este tipo a la transacción activa:

```kotlin
transaction {
   addLogger(StdOutSqlLogger)
   //Do stuff
}
```

## **5. Definición de tablas**

Por lo general, en Exposed no trabajamos con cadenas y nombres de SQL sin formato. **En cambio, definimos tablas, columnas, claves, relaciones, etc., utilizando un DSL de alto nivel.**

Representamos cada tabla con una instancia de la clase *Table* :

```kotlin
object StarWarsFilms : Table()
```

Exposed calcula automáticamente el nombre de la tabla a partir del nombre de la clase, pero también podemos proporcionar un nombre explícito:

```kotlin
object StarWarsFilms : Table("STAR_WARS_FILMS")
```

### **5.1. columnas**

Una tabla no tiene sentido sin columnas. Definimos columnas como propiedades de nuestra clase de tabla:

Hemos omitido los tipos por brevedad, ya que Kotlin puede inferirlos por nosotros. De todos modos, cada columna es de tipo *Column<T>* y tiene un nombre, un tipo y posiblemente parámetros de tipo.

```kotlin
object StarWarsFilms_Simple : Table() {
    val id = integer("id").autoIncrement()
    val sequelId = integer("sequel_id").uniqueIndex()
    val name = varchar("name", 50)
    val director = varchar("director", 50)
    override val primaryKey = PrimaryKey(id, name = "PK_StarWarsFilms_Id")
}
```

### **5.2. Claves primarias**

Como podemos ver en el ejemplo de la sección anterior, **podemos definir fácilmente índices y claves principales con una API fluida.**

Sin embargo, para el caso común de una tabla con una clave primaria entera, Exposed proporciona clases *IntIdTable* y *LongIdTable* que definen la clave para nosotros:

```kotlin
object StarWarsFilms : IntIdTable() {
   val sequelId = integer("sequel_id").uniqueIndex()
   val name = varchar("name", 50)
   val director = varchar("director", 50)
}
```

También hay una *UUIDTable; *además, podemos definir nuestras propias variantes subclasificando *IdTable.*

### **5.3. Llaves extranjeras**

Las claves foráneas son fáciles de introducir. También nos beneficiamos del tipado estático porque siempre nos referimos a propiedades conocidas en tiempo de compilación.

Supongamos que queremos rastrear los nombres de los actores que actúan en cada película:

```kotlin
object Players : Table() {
   val sequelId = integer("sequel_id")
     .uniqueIndex()
     .references(StarWarsFilms.sequelId)
   val name = varchar("name", 50)
}
```

Para evitar tener que deletrear el tipo de columna (en este caso, *entero* ) cuando se puede derivar de la columna a la que se hace referencia, podemos usar el método de *referencia como abreviatura:*

```kotlin
val sequelId = reference("sequel_id", StarWarsFilms.sequelId).uniqueIndex()
```

Si la referencia es a la clave principal, podemos omitir el nombre de la columna:

```kotlin
val filmId = reference("film_id", StarWarsFilms)
```

### **5.4. Creación de tablas**

Podemos crear las tablas como se definió anteriormente mediante programación:

```kotlin
transaction {
   SchemaUtils.create(StarWarsFilms, Players)
   //Do stuff
}
```

Las tablas solo se crean si aún no existen. Sin embargo, no hay soporte para migraciones de bases de datos.

## **6. Consultas**

Una vez que hayamos definido algunas clases de tabla como hemos mostrado en las secciones anteriores, podemos enviar consultas a la base de datos utilizando las funciones de extensión proporcionadas por el marco.

### **6.1. Seleccionar todo**

Para extraer datos de la base de datos, usamos objetos *Query* creados a partir de clases de tablas. La consulta más simple es la que devuelve todas las filas de una tabla determinada:

```kotlin
val query = StarWarsFilms.selectAll()
```

Una consulta es *iterable,* por lo que admite *forEach:*

```kotlin
query.forEach {
   assertTrue { it[StarWarsFilms.sequelId] >= 7 }
}
```

El parámetro de cierre, llamado implícitamente *en* el ejemplo anterior, es una instancia de la clase *ResultRow* . Podemos verlo como un mapa tecleado por columna.

### **6.2. Selección de un subconjunto de columnas**

También podemos seleccionar un subconjunto de las columnas de la tabla, es decir, realizar una proyección, usando el método de *corte* :

```kotlin
StarWarsFilms.slice(StarWarsFilms.name, StarWarsFilms.director)
 .selectAll()
 .forEach {
     assertTrue { it[StarWarsFilms.name].startsWith("The") }
 }
```

También usamos *slice* para aplicar una función a una columna:

```kotlin
StarWarsFilms.slice(StarWarsFilms.name.countDistinct())
```

A menudo, cuando usamos funciones agregadas como *count* y *avg,* necesitaremos una cláusula group by en la consulta. Hablaremos del grupo en la sección 6.5.

### **6.3. Filtrado con expresiones Where**

**Exposed contiene un DSL dedicado para expresiones *where*** , que se utilizan para filtrar consultas y otros tipos de declaraciones. Este es un mini-lenguaje basado en las propiedades de columna que hemos encontrado anteriormente y una serie de operadores booleanos.

Esta es una expresión donde:

```kotlin
{ (StarWarsFilms.director like "J.J.%") and (StarWarsFilms.sequelId eq 7) }
```

Su tipo es complejo; es una subclase de *SqlExpressionBuilder* , que define operadores como *like, eq y* . Como vemos, se trata de una secuencia de comparaciones combinadas entre sí con los operadores *and* y *or .*

Podemos pasar dicha expresión al método de *selección , que nuevamente devuelve una consulta:*

```kotlin
val select = StarWarsFilms.select { ... }
assertEquals(1, select.count())
```

Gracias a la inferencia de tipos, no necesitamos deletrear el tipo complejo de la expresión where cuando se pasa directamente al método de *selección como en el ejemplo anterior.*

**Dado que las expresiones son objetos de Kotlin, no existen disposiciones especiales para los parámetros de consulta. **Simplemente usamos variables:

```kotlin
val sequelNo = 7
StarWarsFilms.select { StarWarsFilms.sequelId >= sequelNo }
```

### **6.4. Filtrado avanzado**

Los objetos *Query devueltos por **select* y sus variantes tienen varios métodos que podemos usar para refinar la consulta.

Por ejemplo, podríamos querer excluir filas duplicadas:

```kotlin
query.withDistinct(true).forEach { ... }
```

O es posible que deseemos devolver solo un subconjunto de las filas, por ejemplo, al paginar los resultados de la interfaz de usuario:

```kotlin
query.limit(20, offset = 40).forEach { ... }
```

**Estos métodos devuelven una nueva *consulta* , por lo que podemos encadenarlos fácilmente.**

### **6.5. *Ordenar **por* y *agrupar **por***

El método *Query.orderBy* acepta una lista de columnas asignadas a un valor *SortOrder* que indica si la ordenación debe ser ascendente o descendente:

```kotlin
query.orderBy(StarWarsFilms.name to SortOrder.ASC)
```

Mientras que la agrupación por una o más columnas, útil en particular cuando se usan funciones agregadas (ver sección 6.2.), se logra usando el método *groupBy* :

```kotlin
StarWarsFilms
 .slice(StarWarsFilms.sequelId.count(), StarWarsFilms.director)
 .selectAll()
 .groupBy(StarWarsFilms.director)
```

### **6.6. Uniones**

Las uniones son posiblemente uno de los puntos de venta de las bases de datos relacionales. En el caso más simple, cuando tenemos una clave externa y no hay condiciones de unión, podemos usar uno de los operadores de unión integrados:

```kotlin
(StarWarsFilms innerJoin Players).selectAll()
```

Aquí hemos mostrado *innerJoin* , pero también tenemos combinaciones izquierda, derecha y cruzada disponibles con el mismo principio.

Luego, podemos agregar condiciones de unión con una expresión where; por ejemplo, si no hay una clave foránea y debemos realizar la combinación explícitamente:

```kotlin
(StarWarsFilms innerJoin Players)
 .select { StarWarsFilms.sequelId eq Players.sequelId }
```

En el caso general, la forma completa de una combinación es la siguiente:

```kotlin
val complexJoin = Join(
 StarWarsFilms, Players,
 onColumn = StarWarsFilms.sequelId, otherColumn = Players.sequelId,
 joinType = JoinType.INNER,
 additionalConstraint = { StarWarsFilms.sequelId eq 8 })
complexJoin.selectAll()
```

### **6.7. alias**

**Gracias a la asignación de nombres de columna a propiedades, no necesitamos ningún alias en una combinación típica, incluso cuando las columnas tienen el mismo nombre:**

```kotlin
(StarWarsFilms innerJoin Players)
 .selectAll()
 .forEach {
     assertEquals(it[StarWarsFilms.sequelId], it[Players.sequelId])
 }
```

De hecho, en el ejemplo anterior, *StarWarsFilms.sequelId* y *Players.sequelId* son columnas diferentes.

Sin embargo, cuando la misma tabla aparece más de una vez en una consulta, es posible que deseemos darle un alias. Para eso usamos la función *alias* :

```kotlin
val sequel = StarWarsFilms.alias("sequel")
```

Entonces podemos usar el alias un poco como una tabla:

```kotlin
Join(StarWarsFilms, sequel,
 additionalConstraint = {
     sequel[StarWarsFilms.sequelId] eq StarWarsFilms.sequelId + 1 
 }).selectAll().forEach {
     assertEquals(
       it[sequel[StarWarsFilms.sequelId]], it[StarWarsFilms.sequelId] + 1)
 }
```

En el ejemplo anterior, podemos ver que el alias de *secuela* es una tabla que participa en una unión. Cuando queremos acceder a una de sus columnas, usamos la columna de la tabla con alias como clave:

```kotlin
sequel[StarWarsFilms.sequelId]
```

## **7. Declaraciones**

Ahora que hemos visto cómo consultar la base de datos, veamos cómo realizar declaraciones DML.

### **7.1. Inserción de datos**

**Para insertar datos, llamamos a una de las variantes de la función de *inserción* . **Todas las variantes llevan un cierre:

```kotlin
StarWarsFilms.insert {
   it[name] = "The Last Jedi"
   it[sequelId] = 8
   it[director] = "Rian Johnson"
}
```

Hay dos objetos notables involucrados en el cierre anterior:

* *esto* (el propio cierre) es una instancia de la clase *StarWarsFilms* ; por eso podemos acceder a las columnas, que son propiedades, por su nombre sin calificar
* *it* (el parámetro de cierre) es un *InsertStatement; es* una estructura similar a un mapa con una ranura para que cada columna se inserte

### **7.2. Extracción de valores de columna de incremento automático**

Cuando tenemos una declaración de inserción con columnas generadas automáticamente (por lo general, incremento automático o secuencias), es posible que queramos obtener los valores generados.

En el caso típico, solo tenemos un valor generado y llamamos a *insertAndGetId:*

```kotlin
val id = StarWarsFilms.insertAndGetId {
   it[name] = "The Last Jedi"
   it[sequelId] = 8
   it[director] = "Rian Johnson"
}
assertEquals(1, id.value)
```

Si tenemos más de un valor generado, podemos leerlos por nombre:

```kotlin
val insert = StarWarsFilms.insert {
   it[name] = "The Force Awakens"
   it[sequelId] = 7
   it[director] = "J.J. Abrams"
}
assertEquals(2, insert[StarWarsFilms.id]?.value)
```

### **7.3. Actualización de datos**

Ahora podemos usar lo que hemos aprendido sobre consultas e inserciones para actualizar los datos existentes en la base de datos. **De hecho, una actualización simple parece una combinación de una selección con una inserción:**

```kotlin
StarWarsFilms.update ({ StarWarsFilms.sequelId eq 8 }) {
   it[name] = "Episode VIII – The Last Jedi"
}
```

Podemos ver el uso de una expresión where combinada con un cierre *UpdateStatement . *De hecho, *UpdateStatement* e *InsertStatement* comparten la mayor parte de la API y la lógica a través de una superclase común, *UpdateBuilder,* que brinda la capacidad de establecer el valor de una columna mediante corchetes idiomáticos.

**Cuando necesitamos actualizar una columna calculando un nuevo valor a partir del valor anterior, aprovechamos *SqlExpressionBuilder:***

```kotlin
StarWarsFilms.update ({ StarWarsFilms.sequelId eq 8 }) {
   with(SqlExpressionBuilder) {
       it.update(StarWarsFilms.sequelId, StarWarsFilms.sequelId + 1)
   }
}
```

Este es un objeto que proporciona operadores infijos (como *más* , *menos* , etc.) que podemos usar para construir una instrucción de actualización.

### **7.4. Eliminación de datos**

Finalmente, podemos eliminar datos con el método *deletewhere* :

```kotlin
StarWarsFilms.deleteWhere ({ StarWarsFilms.sequelId eq 8 })
```

## **8. La API DAO, un ORM ligero**

Hasta ahora, hemos usado Exposed para mapear directamente desde operaciones en objetos Kotlin a consultas y declaraciones SQL. Cada invocación de método, como *insertar, actualizar, seleccionar,* etc., da como resultado una cadena SQL que se envía inmediatamente a la base de datos.

Sin embargo, Exposed también tiene una API DAO de nivel superior que constituye un ORM simple. Ahora profundicemos en eso.

### **8.1. Entidades**

En las secciones anteriores, hemos usado clases para representar tablas de bases de datos y expresar operaciones sobre ellas, usando métodos estáticos.

Avanzando un paso más, podemos definir entidades basadas en esas clases de tablas, donde cada instancia de una entidad representa una fila de la base de datos:

```kotlin
class StarWarsFilm(id: EntityID<Int>) : Entity<Int>(id) {
   companion object : EntityClass<Int, StarWarsFilm>(StarWarsFilms)

   var sequelId by StarWarsFilms.sequelId
   var name     by StarWarsFilms.name
   var director by StarWarsFilms.director
}
```

Analicemos ahora la definición anterior pieza por pieza.

En la primera línea, podemos ver que una entidad es una *Entidad* que extiende la clase . Tiene un ID con un tipo específico, en este caso, *Int* .

```kotlin
class StarWarsFilm(id: EntityID<Int>) : Entity<Int>(id) {
```

Luego, nos encontramos con una definición de objeto complementario. **El objeto complementario representa la clase de entidad, es decir, los metadatos estáticos que definen la entidad y las operaciones que podemos realizar en ella.**

Además, en la declaración del objeto complementario, conectamos la entidad *StarWarsFilm (* singular, ya que representa una sola fila *)* a la tabla *StarWarsFilms* (plural, porque representa la colección de todas las filas).

```kotlin
companion object : EntityClass<Int, StarWarsFilm>(StarWarsFilms)
```

Finalmente, tenemos las propiedades, implementadas como delegados de propiedades a las columnas de la tabla correspondiente.

```kotlin
var sequelId by StarWarsFilms.sequelId
var name     by StarWarsFilms.name
var director by StarWarsFilms.director
```

**Tenga en cuenta que anteriormente declaramos las columnas con *val* porque son metadatos inmutables. Ahora, en cambio, estamos declarando las propiedades de la entidad con var *porque* son ranuras mutables en una fila de la base de datos.**

### **8.2. Inserción de datos**

Para insertar una fila en una tabla, simplemente creamos una nueva instancia de nuestra clase de entidad utilizando el método de fábrica estático *nuevo* en una transacción:

```kotlin
val theLastJedi = StarWarsFilm.new {
   name = "The Last Jedi"
   sequelId = 8
   director = "Rian Johnson"
}
```

**Tenga en cuenta que las operaciones contra la base de datos se realizan con pereza; solo se emiten cuando se vacía la *memoria caché tibia . ***A modo de comparación, Hibernate llama a la caché tibia una *sesión* .

Esto sucede automáticamente cuando es necesario; por ejemplo, la primera vez que leemos el identificador generado, Exposed ejecuta silenciosamente la declaración de inserción:

```kotlin
assertEquals(1, theLastJedi.id.value) //Reading the ID causes a flush
```

Compare este comportamiento con el método de *inserción* de la sección 7.1., que inmediatamente emite una declaración contra la base de datos. Aquí, estamos trabajando en un nivel más alto de abstracción.

### **8.3. Actualización y eliminación de objetos**

Para actualizar una fila, simplemente asignamos a sus propiedades:

```kotlin
theLastJedi.name = "Episode VIII – The Last Jedi"
```

Mientras que para borrar un objeto llamamos *delete* on it:

```kotlin
theLastJedi.delete()
```

Al igual que con *new* , la actualización y las operaciones se realizan con pereza.

**Las actualizaciones y eliminaciones solo se pueden realizar en un objeto previamente cargado. **No hay API para actualizaciones y eliminaciones masivas. En su lugar, tenemos que usar la API de nivel inferior que vimos en la sección 7. Aún así, las dos API se pueden usar juntas en la misma transacción.

### **8.4. consultando**

Con la API de DAO podemos realizar tres tipos de consultas.

Para cargar todos los objetos sin condiciones usamos el método estático *all:*

```kotlin
val movies = StarWarsFilm.all()
```

Para cargar un solo objeto por ID, llamamos a *findById:*

```kotlin
val theLastJedi = StarWarsFilm.findById(1)
```

Si no hay ningún objeto con esa ID, *findById* devuelve *nulo.*

**Finalmente, en el caso general, usamos *find* con una expresión where:**

```kotlin
val movies = StarWarsFilm.find { StarWarsFilms.sequelId eq 8 }
```

### **8.5. Asociaciones de muchos a uno**

Así como las uniones son una característica importante de las bases de datos relacionales, **la asignación de uniones a referencias es un aspecto importante de un ORM. **Entonces, veamos qué tiene para ofrecer Exposed.

Supongamos que queremos realizar un seguimiento de la calificación de cada película por parte de los usuarios. Primero, definimos dos tablas adicionales:

```kotlin
object Users: IntIdTable() {
   val name = varchar("name", 50)
}

object UserRatings: IntIdTable() {
   val value = long("value")
   val film = reference("film", StarWarsFilms)
   val user = reference("user", Users)
}
```

Luego, escribiremos las entidades correspondientes. Omitamos la entidad *User* , que es trivial, y pasemos directamente a la clase *UserRating* :

```kotlin
class UserRating(id: EntityID<Int>): IntEntity(id) {
   companion object : IntEntityClass<UserRating>(UserRatings)

   var value by UserRatings.value
   var film  by StarWarsFilm referencedOn UserRatings.film
   var user  by User         referencedOn UserRatings.user
}
```

**En particular, tenga en cuenta la llamada al método de infijo *referencedOn en propiedades que representan asociaciones. ***El patrón es el siguiente: una declaración de *var , **por* parte de la entidad referenciada, *referenciada* en la columna de referencia.

Las propiedades declaradas de esta manera se comportan como propiedades regulares, pero su valor es el objeto asociado:

```kotlin
val someUser = User.new {
   name = "Some User"
}
val rating = UserRating.new {
   value = 9
   user = someUser
   film = theLastJedi
}
assertEquals(theLastJedi, rating.film)
```

### **8.6. Asociaciones opcionales**

Las asociaciones que hemos visto en el apartado anterior son obligatorias, es decir, siempre debemos especificar un valor.

Si queremos una asociación opcional, primero debemos declarar la columna como anulable en la tabla:

```kotlin
val user = reference("user", Users).nullable()
```

Luego, usaremos *OptionalReferencedOn* en lugar de *referencedOn* en la entidad:

```kotlin
var user by User optionalReferencedOn UserRatings.user
```

De esa forma, la propiedad del *usuario* será anulable.

### **8.7. Asociaciones de uno a muchos**

También podríamos querer mapear el lado opuesto de la asociación. Una calificación es sobre una película, eso es lo que modelamos en la base de datos con una clave externa; en consecuencia, una película tiene una serie de calificaciones.

Para mapear las clasificaciones de una película, simplemente agregamos una propiedad al lado "uno" de la asociación, es decir, la entidad de la película en nuestro ejemplo:

```kotlin
class StarWarsFilm(id: EntityID<Int>) : Entity<Int>(id) {
   //Other properties omitted
   val ratings  by UserRating referrersOn UserRatings.film
}
```

El patrón es similar al de las relaciones de muchos a uno, pero utiliza *referrersOn. *La propiedad así definida es un *Iterable,* por lo que podemos recorrerla con *forEach:*

```kotlin
theLastJedi.ratings.forEach { ... }
```

Tenga en cuenta que, a diferencia de las propiedades regulares, hemos definido *calificaciones* con *val. ***De hecho, la propiedad es inmutable, solo podemos leerla.**

El valor de la propiedad tampoco tiene API para la mutación. Entonces, para agregar una nueva calificación, debemos crearla con una referencia a la película:

```kotlin
UserRating.new {
   value = 8
   user = someUser
   film = theLastJedi
}
```

Luego, la lista de *calificaciones* de la película contendrá la calificación recién agregada.

### **8.8. Asociaciones de muchos a muchos**

En algunos casos, es posible que necesitemos una asociación de muchos a muchos. Digamos que queremos agregar una tabla de *Actores de referencia a la clase **StarWarsFilm* :

```kotlin
object Actors: IntIdTable() {
   val firstname = varchar("firstname", 50)
   val lastname = varchar("lastname", 50)
}

class Actor(id: EntityID<Int>): IntEntity(id) {
   companion object : IntEntityClass<Actor>(Actors)

   var firstname by Actors.firstname
   var lastname by Actors.lastname
}
```

Habiendo definido la tabla y la entidad, necesitamos otra tabla para representar la asociación:

```kotlin
object StarWarsFilmActors : Table() {
    val starWarsFilm = reference("starWarsFilm", StarWarsFilms)
    val actor = reference("actor", Actors)
    override val primaryKey = PrimaryKey(
      starWarsFilm, actor, 
      name = "PK_StarWarsFilmActors_swf_act")
}
```

La tabla tiene dos columnas que son claves foráneas y que también forman una clave principal compuesta.

Finalmente, podemos conectar la tabla de asociaciones con la entidad *StarWarsFilm*:

```kotlin
class StarWarsFilm(id: EntityID<Int>) : IntEntity(id) {
   companion object : IntEntityClass<StarWarsFilm>(StarWarsFilms)

   //Other properties omitted
   var actors by Actor via StarWarsFilmActors
}
```

Al momento de escribir, no es posible crear una entidad con un identificador generado e incluirlo en una asociación de muchos a muchos en la misma transacción.

De hecho, tenemos que usar múltiples transacciones:

```kotlin
//First, create the film
val film = transaction {
  StarWarsFilm.new {
   name = "The Last Jedi"
   sequelId = 8
   director = "Rian Johnson"r
 }
}
//Then, create the actor
val actor = transaction {
 Actor.new {
   firstname = "Daisy"
   lastname = "Ridley"
 }
}
//Finally, link the two together
transaction {
 film.actors = SizedCollection(listOf(actor))
}
```

Aquí, hemos usado tres transacciones diferentes por conveniencia. Sin embargo, dos habrían sido suficientes.

## **9. Conclusión**

En este artículo, brindamos una descripción completa del marco Exposed para Kotlin. Para obtener información adicional y ejemplos, consulte el [wiki de Exposed](https://github.com/JetBrains/Exposed/wiki) .

La implementación de todos estos ejemplos y fragmentos de código se puede encontrar en [el proyecto de GitHub](https://github.com/Baeldung/kotlin-tutorials/tree/master/kotlin-libraries) .

por Alessio Stalla[](https://www.baeldung.com/kotlin/author/alessio-stalla "Entradas de Alessio Stalla")


## 10. Bibliografia

- https://github.com/JetBrains/Exposed
- https://github.com/JetBrains/Exposed/wiki
