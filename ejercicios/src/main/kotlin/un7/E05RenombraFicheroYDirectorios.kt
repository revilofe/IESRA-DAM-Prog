package un7

import java.io.File
import kotlin.jvm.JvmStatic

object E05RenombraFicheroYDirectorios {
    @JvmStatic
    fun main(args: Array<String>) {
        val origenDir = File("./Temp/Fotos")
        val destinoDir = File("./Temp/Media/Fotografies")
        val origenDoc = File("./Temp/Media/Fotografies/Document.txt")
        val destinoDoc = File("./Temp/Document.txt")
        var res = origenDir.renameTo(destinoDir)
        println("Se ha movido y renombrado la carpeta? $res")
        res = origenDoc.renameTo(destinoDoc)
        println("Se ha movido el documento? $res")
    }
}