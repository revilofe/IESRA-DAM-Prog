package un7.io.ejemplos

import java.io.File
import java.util.*
import kotlin.jvm.JvmStatic

object E03PropiedadesFicheroYDirectorios {
    @JvmStatic
    fun main(args: Array<String>) {
        val documento = File("./Temp/Documento.txt")
        println(documento.absolutePath)

        if (documento.exists()) {
            val milisegundos = documento.lastModified()
            val fecha = Date(milisegundos)
            println("Última modificación (ms)   : $milisegundos")
            println("Última modificación (fecha): $fecha")
            println("Tamaño del archivo: " + documento.length())
        }
        else
            println("No existe el documento.")
    }
}