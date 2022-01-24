package un6.eje6_4

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import mu.KotlinLogging
import java.util.*

private val logger = KotlinLogging.logger("Ejemplo")
fun mi(tag: String, m: String) = mi("[[[$tag]]] - "+m)
fun mi(m: String) = logger.info(m)
val gson = Gson()


//convert a data class to a map
fun <T> T.serializeToMap(): Map<String, Any> {
    return convert()
}

//convert a map to a data class
inline fun <reified T> Map<String, Any>.toDataClass(): T {
    return convert()
}

//convert an object of type I to type O
inline fun <I, reified O> I.convert(): O {
    val json = gson.toJson(this)
    mi(json)
    return gson.fromJson(json, object : TypeToken<O>() {}.type)
}

/**
 * Convierte un objeto de tipo I a tipo O
 * @return un objetio de tipo O
 */
inline fun <reified O> String.fromJson(): O {
    mi(this)
    return gson.fromJson(this, object : TypeToken<O>() {}.type)
}

/**
 * Un *libro*.
 *
 * Esta clase no tiene lógica, es una data class
 *
 *
 * @param id el identificador del libro
 * @property autor el nombre del autor.
 * @constructor crea un libro.
 */
internal data class Book(
    val id: String,
    val autor: String,
    val title: String,
    val genre: String,
    val price: Double,
    val publish_date: Date,
    val description: String
)

internal fun main() {
    val book =
        Book("idk3d", "Eduardo", "Libro de eduardo", "Ficcion", 29.4, Date("2000/10/01"), "Descripción del libro")
    val personAsMap: Map<String, Any> = book.serializeToMap()
    mi("o2m",personAsMap.toString())

    val map = mapOf(
        "id" to "bk101",
        "autor" to "Gambardella",
        "title" to "XML Developer's Guide",
        "genre" to "Computer",
        "price" to "44.95",
        "publish_date" to "2000-10-01",
        "description" to "An in-depth look at creating applications with XML."
    )
    val mapAsPerson: Book = map.toDataClass()
    mi("m2o", mapAsPerson.toString())


    var json =
        """[{"id":"idk1d","autor":"Pedris1","title":"Libro de eduardo 1","genre":"Ficcion 1","price":29.41,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro 1"}
        |,{"id":"idk2d","autor":"Pedris2","title":"Libro de eduardo 2","genre":"Ficcion 2","price":29.42,"publish_date":"Oct 2, 2000 12:00:00 AM","description":"Descripción del libro 2"}
        |,{"id":"idk3d","autor":"Pedris3","title":"Libro de eduardo 3","genre":"Ficcion 3","price":29.43,"publish_date":"Oct 3, 2000 12:00:00 AM","description":"Descripción del libro 3"}
        |,{"id":"idk4d","autor":"Pedris4","title":"Libro de eduardo 4","genre":"Ficcion 4","price":29.44,"publish_date":"Oct 4, 2000 12:00:00 AM","description":"Descripción del libro 4"}
        |,{"id":"idk5d","autor":"Pedris5","title":"Libro de eduardo 5","genre":"Ficcion 5","price":29.45,"publish_date":"Oct 5, 2000 12:00:00 AM","description":"Descripción del libro 5"}
        |]""".trimMargin()
    mi("j2o", json.fromJson<List<Book>>().toString())
    mi("j2o",json.fromJson<List<Map<String, Any>>>().toString())
}

