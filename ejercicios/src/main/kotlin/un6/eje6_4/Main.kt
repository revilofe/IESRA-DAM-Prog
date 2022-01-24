package un6.eje6_4

import java.util.logging.Level
import java.util.logging.LogManager

internal val l = LogManager.getLogManager().getLogger("DIP").apply { level = Level.ALL }
internal fun i(tag:String, msg:String)
{
    l.info("[$tag] - $msg")
}


fun main() {
    fun main() {
        var id = "bk105"
    }
}

class gestionLibrosIU
{

}
/*
class gestionLibros
{
    var portatil = "/home/edu/IdeaProjects/IESRA-DAM-Prog/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"
    var casa =
        "/home/usuario/Documentos/workspace/IdeaProjects/IESRA-DAM/ejercicios/src/main/kotlin/un5/eje5_4/Catalog.xml"
    var cat = CatalogoLibrosXML(portatil)

    fun preguntarPorUnLibro()
    {
        "Existe Libro", cat.existeLibro(id)
    }

    fun mostrarInfoDeUnLibro()
    {
        i("Info de Libro", cat.infoLibro(id).toString())
    }

}*/