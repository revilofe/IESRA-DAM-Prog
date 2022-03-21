package un7.io.ejemplos

import kotlin.jvm.JvmStatic
import java.io.File

object E01ExisteYTipo {
    @JvmStatic
    fun main(args: Array<String>) {
        val temp = File("./Temp")
        val fotos = File("./Temp/Fotos")
        val document = File("./Temp/Documento.txt")
        println(temp.absolutePath + " ¿existe? " + temp.exists())
        mostrarEstado(fotos)
        mostrarEstado(document)
    }

    fun mostrarEstado(f: File) {
        println(f.absolutePath + " ¿archivo? " + f.isFile)
        println(f.absolutePath + " ¿carpeta? " + f.isDirectory)
    }
}