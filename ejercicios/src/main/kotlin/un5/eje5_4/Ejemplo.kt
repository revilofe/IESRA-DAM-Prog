package un5.eje5_4

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import mu.KotlinLogging
import java.util.*

val logger = KotlinLogging.logger("Ejemplo")
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

//convert an object of type I to type O
inline fun <reified O> String.fromJson(): O {
    mi(this)
    return gson.fromJson(this, object : TypeToken<O>() {}.type)
}

//example usage
data class Book(
    val id: String,
    val autor: String,
    val title: String,
    val genre: String,
    val price: Double,
    val publish_date: Date,
    val description: String
)

fun main() {

    val book =
        Book("idk3d", "Eduardo", "Libro de eduardo", "Ficcion", 29.4, Date("2000/10/01"), "Descripción del libro")

    val map = mapOf(
        "id" to "bk101",
        "autor" to "Gambardella",
        "title" to "XML Developer's Guide",
        "genre" to "Computer",
        "price" to "44.95",
        "publish_date" to "2000-10-01",
        "description" to "An in-depth look at creating applications with XML."
    )

    val personAsMap: Map<String, Any> = book.serializeToMap()
    val mapAsPerson: Book = map.toDataClass()
    mi(mapAsPerson.toString())
    mi(personAsMap.toString())
    var json =
        """[{"id":"idk3d","autor":"Pedris","title":"Libro de eduardo","genre":"Ficcion","price":29.4,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro"}
        |,{"id":"idk3d","autor":"Pedris","title":"Libro de eduardo","genre":"Ficcion","price":29.4,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro"}
        |,{"id":"idk3d","autor":"Pedris","title":"Libro de eduardo","genre":"Ficcion","price":29.4,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro"}
        |,{"id":"idk3d","autor":"Pedris","title":"Libro de eduardo","genre":"Ficcion","price":29.4,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro"}
        |,{"id":"idk3d","autor":"Pedris","title":"Libro de eduardo","genre":"Ficcion","price":29.4,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro"}
        |]""".trimMargin()
    mi(json.fromJson<List<Book>>().toString())
    mi(json.fromJson<List<Map<String, Any>>>().toString())
}