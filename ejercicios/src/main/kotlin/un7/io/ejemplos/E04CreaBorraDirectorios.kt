package un7.io.ejemplos

import java.io.File
import kotlin.jvm.JvmStatic

object E04CreaBorraDirectorios {
    @JvmStatic
    fun main(args: Array<String>) {
        val fotos = File("./Temp/Fotos")
        val doc = File("./Temp/Documento.txt")
        val mkdirFot: Boolean = fotos.mkdir()
        if (mkdirFot) {
            println("Creada carpeta " + fotos.getName()+ "? " + mkdirFot)
        } else {
            val delCa: Boolean = fotos.delete()
            println("Borrada carpeta " + fotos.getName() + "? " + delCa)
            val delAr: Boolean = doc.delete()
            println("Borrado archivo " + doc.getName()+ "? " + delAr)
        }
    }
}