package un7

import kotlinx.cli.*

fun produce(result: List<Double>, format: String, outputFileName: String?) {
    outputFileName.let {
        // Print to file.
        println("salida if")
    } ?: run {
        // Print to stdout
        println("salida else")
    }
}


fun readFrom(inputFileName: String): String {
    return "nada"
}

fun calculate(inputData: String, eps: Double, debug: Boolean = false): List<Double> {
    return listOf<Double>()
}

enum class Format {
    HTML,
    CSV,
    PDF
}

fun main(args: Array<String>) {
    val parser = ArgParser("example")
    val innput by parser.option(ArgType.String, shortName = "i", description = "Input file").required()
    val output by parser.option(ArgType.String, shortName = "o", description = "Output file name")
    val format by parser.option(ArgType.Choice<Format>(), shortName = "f",
        description = "Format for output file").default(Format.CSV).multiple()
    val stringFormat by parser.option(ArgType.Choice(listOf("html", "csv", "pdf"), { it }), shortName = "sf",
        description = "Format as string for output file").default("csv").multiple()
    val debug by parser.option(ArgType.Boolean, shortName = "d", description = "Turn on debug mode").default(false)
    val eps by parser.option(ArgType.Double, description = "Observational error").default(0.01)

    parser.parse(args)
    val inputData = readFrom(innput)
    val result = calculate(inputData, eps, debug)
    format.forEach {
        produce(result, it.toString(), output)
    }


}