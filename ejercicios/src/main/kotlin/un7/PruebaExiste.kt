package un7

import kotlin.jvm.JvmStatic
import un7.PruebaExiste
import java.io.File

object PruebaExiste {
    @JvmStatic
    fun main(args: Array<String>) {
        val temp = File("C:/Temp")
        val fotos = File("C:/Temp/Fotos")
        val document = File("C:/Temp/Documento.txt")
        println(temp.absolutePath + " ¿existe? " + temp.exists())
        mostrarEstado(fotos)
        mostrarEstado(document)
    }

    fun mostrarEstado(f: File) {
        println(f.absolutePath + " ¿archivo? " + f.isFile)
        println(f.absolutePath + " ¿carpeta? " + f.isDirectory)
    }
}