//Proyecto145

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

fun imprimir(articulos: Array<Articulo>) {
    for(articulo in articulos)
        println("Código: ${articulo.codigo} - Descripción ${articulo.descripcion} Precio: ${articulo.precio}")
}

fun aumentarPrecio(articulos: Array<Articulo>) {
    for(articulo in articulos)
        articulo.precio = articulo.precio + (articulo.precio * 0.10f)
}

fun main(parametro: Array<String>) {
    val articulos: Array<Articulo> = arrayOf(Articulo(1, "papas", 7.5f),
        Articulo(2, "manzanas", 23.2f),
        Articulo(1, "naranjas", 12f),
        Articulo(1, "cebolla", 21f))
    println("Listado de precios actual")
    imprimir(articulos)
    aumentarPrecio(articulos)
    println();
    println("Listado de precios con aumento del 10%")
    imprimir(articulos)
}
