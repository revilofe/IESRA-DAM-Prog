package un6.eje6_5

import java.util.logging.Level
import java.util.logging.LogManager

internal val l = LogManager.getLogManager().getLogger("").apply { level = Level.ALL }
internal fun i(tag: String, msg: String) {
    l.info("[$tag] - $msg")
}


fun main() {
    var portatil = "/home/edu/IdeaProjects/IESRA-DAM-Prog/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"
    //var casa = "/home/usuario/Documentos/workspace/IdeaProjects/IESRA-DAM/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"

    val gestorDeLibros = gestionLibros(portatil)
    gestorDeLibros.preguntarPorUnLibro()
    gestorDeLibros.mostrarInfoDeUnLibro()

}

class gestionLibrosIU {

}

class gestionLibros(cargador:String)
{
     var cat = CatalogoLibrosXML(cargador)

    fun preguntarPorUnLibro() {
        println("Introduzca un ID: ")
        var idLibro = readln()
        if (cat.existeLibro(idLibro))
            println("El libro $idLibro existe!")
        else
            println("El libro $idLibro NO existe!")
    }

    fun mostrarInfoDeUnLibro()
    {
        println("Introduzca un ID: ")
        var idLibro = readln()
        var infoLibro = cat.infoLibro(idLibro)
        if (!infoLibro.isEmpty())
            println("La información sobre es la siguiente\n$infoLibro")
        else
            println("No se encontró información sobre el libro")
    }

}