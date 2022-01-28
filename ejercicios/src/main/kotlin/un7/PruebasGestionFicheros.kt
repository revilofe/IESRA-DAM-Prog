package un7

import java.io.File
import kotlin.jvm.JvmStatic

object PruebasGestionFicheros {
    @JvmStatic
    fun main(args: Array<String>) {
        val fotos = File("C:/Temp/Fotos")
        val doc = File("C:/Temp/Documento.txt")
        val mkdirFot: Boolean = fotos.mkdir()
        if (mkdirFot) {
            System.out.println("Creada carpeta " + fotos.getName().toString() + "? " + mkdirFot)
        } else {
            val delCa: Boolean = fotos.delete()
            System.out.println("Borrada carpeta " + fotos.getName().toString() + "? " + delCa)
            val delAr: Boolean = doc.delete()
            System.out.println("Borrado archivo " + doc.getName().toString() + "? " + delAr)
        }
    }
}