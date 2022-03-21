fun main(args: Array<String>) {
    var rutaSAlFichero: String? = null
    var rutaEAlFichero: String? = null

    //println("Introduce el fichero de salida: ")
    //rutaAlFichero = readln()
    if ((args.size == 1) && ("-h".equals(args[0])))
        println("ejecuta -o ficheroSalida -i ficheroEntrada")
    else if (args.size == 0)
        println("tomare e/s estandar")
    else {
        if ("-o".equals(args[0]))
            rutaSAlFichero = args[1]
        else if ("-i".equals(args[0]))
            rutaEAlFichero = args[1]
        if ("-o".equals(args[2]))
            rutaSAlFichero = args[3]
        else if ("-i".equals(args[2]))
            rutaEAlFichero = args[3]
        println("salida: $rutaSAlFichero")
        println("entrada: $rutaEAlFichero")
    }

}