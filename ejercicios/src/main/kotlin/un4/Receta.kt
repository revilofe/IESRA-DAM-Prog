data class Ingrediente(val nombre: String, val cantidad: Double, val unidad: String)
data class Receta(val nombre: String, val ingredientes: Set<Ingrediente>, val pasos: Map<Int, String>)


fun main() {
    var unaReceta = Receta(
        "Arrzo con Leche",
        setOf(
            Ingrediente("Arroz", 1000.0, "gr"),
            Ingrediente("Leche", 1.0, "l"),
            Ingrediente("Canela en rama", 1.0, "palo")
        ),
        mapOf(
            1 to "Calentar la leche",
            2 to "Echar el arroz",
            3 to "Remover frecuentemente",
            4 to "Apagar el fuego cuando el arroz este blandito con el corazon duro"
        )
    )
    println("$unaReceta")

}