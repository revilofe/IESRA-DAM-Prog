package un7

import java.io.File

fun main(args: Array<String>) {

    val fileName = "data.txt"

    var file = File(fileName)

    // create a new file
    file.writeText("")

}