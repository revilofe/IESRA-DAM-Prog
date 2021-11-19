/**
 *
 * Ejercicio 5.10
 * Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación
 * según nos haya gustado más o menos al leerlo.
 * Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y
 * la calificación que le damos entre 0 y 10. Crear los métodos para poder modificar y obtener los
 * atributos (sólo si tienen sentido).
 * Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector
 * de un tamaño fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar
 * libros por título o autor, mostrar por pantalla los libros con la mayor y menor calificación y,
 * por último, mostrar un contenido de todo el conjunto.
 * En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al
 * conjunto, eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío,
 * volver a añadir un libro y mostrar el contenido final.
 */


/**
 * Clase Libro.
 */
class Libro(
    val titulo: String,
    val autor: String,
    val numeroPaginas: Int,
    calificacion: Int = 1
) {
    var calificacion: Int = calificacion
        set(value: Int) {
            require(calificacion in 1..10, { "Calificación errónea" })
            field = value
        }

    init {
        require(!titulo.isNullOrEmpty(), { "Titulo del libro erróneo" })
        require(!autor.isNullOrEmpty(), { "Autor del libro erróneo" })
        require(numeroPaginas > 10, { "Numero de pátinas erróneas" })
    }


    override fun toString(): String {
        return "LIBRO: Titulo - '$titulo', Autor - '$autor', Paginas ($numeroPaginas), Calificación [$calificacion]"
    }
}

/**
 * Clase conjunto de libros, que almacena un conjunto de libros.
 */
class ConjuntoLibros(
    val capacidadAlmacenamiento: Int
) {
    private val libros: Array<Libro?> = arrayOfNulls(capacidadAlmacenamiento)
    var totalLibrosAlmacenados = 0
    init {
        require(capacidadAlmacenamiento > 1, { "Error en el número de libros." })
    }


    /**
     * Introduce un libro.
     * return: Devuelve el total de libros.
     */
    fun introducir(libro: Libro): Int {
        if (totalLibrosAlmacenados < capacidadAlmacenamiento) // ¿Hay espacio?
            if (libros.filter { it?.titulo.equals(libro.titulo) }.size == 0) { // ¿No existe ya?
                libros[libros.indexOfFirst { it == null }] = libro
                totalLibrosAlmacenados++
            }
        return totalLibrosAlmacenados
    }

    /**
     * Elimina los libros que cumplen condicion.
     * return: Devuelve el total de libros.
     */
    fun eliminar(condicion: (Libro?) -> Boolean): Int {
        var pos = -1
        do {
            pos = libros.indexOfFirst { condicion(it) }
            if (pos >= 0) {
                libros[pos] = null
                totalLibrosAlmacenados--
            }
        } while (pos >= 0)
        return totalLibrosAlmacenados
    }

    /**
     * Convierte a String el contenido de todo el conjunto
     */
    override fun toString(): String {
        var sConjunto: String = ""
        libros.forEachIndexed { index, libro -> sConjunto += if (libro != null) "[$index] $libro \n" else "" }
        return sConjunto
    }

    /**
     * Obtiene el libro con calificacion maxima
     * return: un libro
     */
    fun obtenerPorCalificacionMax(): Libro? = obtenerSegunComparacion { libroConCalificacionMayor, otroLibro ->
        (libroConCalificacionMayor?.calificacion ?: 0) > (otroLibro?.calificacion ?: 0)
    }

    /**
     * Obtiene el libro con calificacion minima
     * return: un libro
     */
    fun obtenerPorCalificacionMin(): Libro? = obtenerSegunComparacion { libroConCalificacionMenor, otroLibro ->
        (libroConCalificacionMenor?.calificacion ?: 11) < (otroLibro?.calificacion ?: 11)
    }

    //Obtiene un libro que cumple una condición de comparación con el resto de libros.
    private fun obtenerSegunComparacion(comparacion: (Libro?, Libro?) -> Boolean): Libro? {

        var libroQueCumpleComparacion: Libro? = null

        if (totalLibrosAlmacenados > 0) {
            libroQueCumpleComparacion = libros[0]
            libroQueCumpleComparacion = libros.reduce { libroQueCumpleComparacion, otroLibro ->
                if (comparacion(
                        libroQueCumpleComparacion,
                        otroLibro
                    )
                ) libroQueCumpleComparacion else otroLibro
            }
        }
        return libroQueCumpleComparacion

    }
}


fun main(args: Array<String>) {
    println("Programa que trabaja con libros!")

    var conjunto = ConjuntoLibros(10)
    // Crea dos libros y un conjunto
    listOf(
        Libro("Kotlin in action", "Antonio Guiri", 300, 6),
        Libro("Kotlin Reference", "Jose Guiri", 150, 9),
        Libro("Kotlin Chulo", "Apañao Guiri", 50, 10),
        Libro("Kotlin guay", "Una Guiri", 50),
        Libro("Kotlin ++", "Maria Guiri", 150, 9),
    ).forEach {    // Añadelos al conjunto
        conjunto.introducir(it)
    }
    println("TODOS Los libros")
    println(conjunto)

    // Eliminalos por los dos criterios (titulo y Autor) hasta que esté vación.
    conjunto.eliminar { "Kotlin in action".equals(it?.titulo) }
    println("eliminado kotlin in action")
    println(conjunto)

    conjunto.eliminar { "Una Guiri".equals(it?.autor) }
    println("eliminado Una Guiri")
    println(conjunto)

    // Añade un libro
    conjunto.introducir(Libro("Reference of Kotlin", "Pepe Guiri", 150, 8))
    conjunto.introducir(Libro("Kotlin se secas", "Android Guiri", 150))

    // Mostrar el contenido final
    println(conjunto)

    println("Libro Mayor: ")
    println(conjunto.obtenerPorCalificacionMax())

    println("Libro Menor: ")
    println(conjunto.obtenerPorCalificacionMin())
}
