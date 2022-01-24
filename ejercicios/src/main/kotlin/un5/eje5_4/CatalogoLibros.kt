package un5.eje5_4

import mu.KotlinLogging
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import java.time.LocalDate
import javax.xml.parsers.DocumentBuilderFactory

class CatalogoLibrosXML(private val cargador: String) {

    companion object {
        val l = KotlinLogging.logger("LOG")
    }

    private var xmlDoc: Document? = null
    init {
        try {
            xmlDoc = readXml(cargador)
            xmlDoc?.let { it.documentElement.normalize() }
        } catch (e: Exception) {
            requireNotNull(xmlDoc , { e.message.toString() })
        }
    }

    private fun readXml(pathName: String): Document {
        val xmlFile = File(pathName)
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile)
    }

    private fun obtenerListaNodosPorNombre(doc: Document, tagName: String): MutableList<Node> {
        val bookList: NodeList = doc.getElementsByTagName(tagName)
        val lista = mutableListOf<Node>()
        for (i in 0..bookList.length - 1)
            lista.add(bookList.item(i))
        return lista
    }

    fun obtenerAtributosEnMapKV(e: Element): MutableMap<String, String> {
        val mMap = mutableMapOf<String, String>()
        for (j in 0..e.attributes.length - 1)
            mMap.putIfAbsent(e.attributes.item(j).nodeName, e.attributes.item(j).nodeValue)
        return mMap
    }

    /*
    *
    * @return  Devuelve true si existe, `false` en caso contrario.
    * */
    fun existeLibro(idLibro: String): Boolean {
        var existe: Boolean
        if (idLibro.isNullOrBlank())
            existe = false
        else {
            var encontrado = xmlDoc?.let {
                var nodosLibro = obtenerListaNodosPorNombre(it, "book")
                ((nodosLibro.indexOfFirst {
                    if (it.getNodeType() === Node.ELEMENT_NODE) {
                        val elem = it as Element
                        obtenerAtributosEnMapKV(elem)["id"] == idLibro
                    } else
                        false
                }) >= 0)
            }
            existe = (encontrado != null && encontrado)
        }
        return existe
    }

    /*
      *
      * @return  Devuelve true si existe, `false` en caso contrario.
      * */
    fun infoLibro(idLibro: String): Map<String, Any> {
        var m = mutableMapOf<String, Any>()
        if (!idLibro.isNullOrBlank())
            xmlDoc?.let {
                var nodosLibro = obtenerListaNodosPorNombre(it, "book")

                var posicionDelLibro = nodosLibro.indexOfFirst {
                    if (it.getNodeType() === Node.ELEMENT_NODE) {
                        val elem = it as Element
                        obtenerAtributosEnMapKV(elem)["id"] == idLibro
                    } else false
                }
                if (posicionDelLibro >= 0) {
                    if (nodosLibro[posicionDelLibro].getNodeType() === Node.ELEMENT_NODE) {
                        val elem = nodosLibro[posicionDelLibro] as Element
                        m.put("id", idLibro)
                        m.put("author", elem.getElementsByTagName("author").item(0).textContent)
                        m.put("genre", elem.getElementsByTagName("genre").item(0).textContent)
                        m.put("price", elem.getElementsByTagName("price").item(0).textContent.toDouble())
                        m.put(
                            "publish_date",
                            LocalDate.parse(elem.getElementsByTagName("publish_date").item(0).textContent)
                        )
                        m.put("description", elem.getElementsByTagName("description").item(0).textContent)
                    }
                }
            }
        return m
    }
    fun i(msg:String)
    {
        CatalogoLibrosXML.l.info { msg }
    }
}

fun main() {
    var portatil = "/home/edu/IdeaProjects/IESRA-DAM-Prog/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"
    var casa =
        "/home/usuario/Documentos/workspace/IdeaProjects/IESRA-DAM/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"
    var cat = CatalogoLibrosXML(portatil)
    var id = "bk105"
    cat.i(cat.existeLibro(id).toString())
    cat.i(cat.infoLibro(id).toString())
}

/*
Implementar una clase `CatalogoLibrosXML` con sus métodos y propiedades. Usa los modificadores de acceso adecuado según lo creas conveniente e intenta separar la funcionalidad en métodos que tengan sentido para la clase y que hagan una única cosa.
### Propiedades
- Las que necesites.
### Métodos
- `constructor(cargador:String)`: Debe abortar si el fichero no existe o es incorrecto.
- `existeLibro(idLibro:String): Boolean`: Devuelve true si existe, `false` en caso contrario.
- `infoLibro(idLibro:String): Map<String,Any>`: Devuelve un `Map` con los atributos y valores del libro. Devolverá
  un `Map` vacío en caso contrario.

 */