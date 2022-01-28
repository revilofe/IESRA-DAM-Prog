package un7

import java.io.File
import java.util.*
import kotlin.jvm.JvmStatic

object PruebaPropiedades {
    @JvmStatic
    fun main(args: Array<String>) {
        val documento = File("C:/Temp/Documento.txt")
        println(documento.absolutePath)
        val milisegundos = documento.lastModified()
        val fecha = Date(milisegundos)
        println("Últimamodificación (ms)   : $milisegundos")
        println("Últimamodificación (fecha): $fecha")
        println("Tamañodel archivo: " + documento.length())
    }
}