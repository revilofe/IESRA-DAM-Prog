package un7

import kotlin.jvm.JvmStatic
import java.io.File

object E02RutaRelativaAbsoluta {
    @JvmStatic
    fun main(args: Array<String>) {
        // Dos rutas absolutas
        val carpetaAbs = File("/tmp/fotos")
        val archivoAbs = File("/tmp/albania1.jpg")

        // Dos rutas relativas
        val carpetaRel = File("./Temp/trabajos")
        val fitxerRel = File("./Temp/trabajos/documento.txt")

        // Mostremos sus rutas
        mostrarRutas(carpetaAbs)
        mostrarRutas(archivoAbs)
        mostrarRutas(carpetaRel)
        mostrarRutas(fitxerRel)
    }

    fun mostrarRutas(f: File) {
        println("getParent(): " + f.parent)
        println("getName(): " + f.name)
        println("getAbsolutePath(): " + f.absolutePath)
    }
}