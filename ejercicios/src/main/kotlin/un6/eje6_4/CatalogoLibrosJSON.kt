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
internal fun <T> T.serializeToMap(): Map<String, Any> {
    return convert()
}

//convert a map to a data class
internal inline fun <reified T> Map<String, Any>.toDataClass(): T {
    return convert()
}

//convert an object of type I to type O
internal inline fun <I, reified O> I.convert(): O {
    val json = gson.toJson(this)
    mi(json)
    return gson.fromJson(json, object : TypeToken<O>() {}.type)
}

/**
 * Convierte un objeto de tipo I a tipo O
 * @return un objetio de tipo O
 */
internal inline fun <reified O> String.fromJson(): O {
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

    var jsonLibros = """[{"id":"bk101","autor":"Pedris1","title":"Libro de eduardo 1","genre":"Ficcion 1","price":29.41,"publish_date":"Oct 1, 2000 12:00:00 AM","description":"Descripción del libro 1"}
        |,{"id":"bk102","autor":"Pedris2","title":"Libro de eduardo 2","genre":"Ficcion 2","price":29.42,"publish_date":"Oct 2, 2000 12:00:00 AM","description":"Descripción del libro 2"}
        |,{"id":"bk103","autor":"Pedris3","title":"Libro de eduardo 3","genre":"Ficcion 3","price":29.43,"publish_date":"Oct 3, 2000 12:00:00 AM","description":"Descripción del libro 3"}
        |,{"id":"bk104","autor":"Pedris4","title":"Libro de eduardo 4","genre":"Ficcion 4","price":29.44,"publish_date":"Oct 4, 2000 12:00:00 AM","description":"Descripción del libro 4"}
        |,{"id":"bk105","autor":"Pedris5","title":"Libro de eduardo 5","genre":"Ficcion 5","price":29.45,"publish_date":"Oct 5, 2000 12:00:00 AM","description":"Descripción del libro 5"}
        |]""".trimMargin()

    var cat = CatalogoLibrosJSON(jsonLibros)
    var id = "bk105"
    cat.i(cat.existeLibro(id).toString())
    cat.i(cat.infoLibro(id).toString())
}


public class CatalogoLibrosJSON(cargador:String)
{

    private lateinit var libros: List<Book>
    companion object {
        val l = KotlinLogging.logger("LOG")
    }
    init {
        libros = cargador.fromJson<List<Book>>()
    }
    internal fun i(msg:String)
    {
        CatalogoLibrosXML.l.info {"[Clase]"+ msg }
    }
    fun infoLibro(idLibro: String): Map<String, Any> {
        var book = libros.first{ it.id == idLibro }
        return book.serializeToMap()
    }
    fun existeLibro(idLibro: String): Boolean {
        return libros.indexOfFirst { it.id == idLibro } >=0
    }
}

