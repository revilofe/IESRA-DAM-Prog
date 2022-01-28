package un7

import java.io.File
import kotlin.jvm.JvmStatic

object PruebasGestionFicheros3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val dir = File("C:/Temp")
        val lista = dir.listFiles()
        println("Contenido de " + dir.absolutePath + " :")

        // Recorremos el array y mostramos el nombre de cada elemento
        for (i in lista.indices) {
            val f = lista[i]
            if (f.isDirectory) {
                println("[DIR] " + f.name)
            } else {
                println("[ARX] " + f.name)
            }
        }
    }
}