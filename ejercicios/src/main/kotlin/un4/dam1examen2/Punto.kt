package un4.dam1examen2

/**
 *
 *
 *
 * Create una clase punto. El contructor principal de la clase punto recibe como parámetro una variable, de clase String, que actuara de identificador del punto.
 *
 * Además, declara una variables de instancia de clase Pair, que almacena los valores de x e y, de clase Int.
 *
 * La clase punto tiene un constructor secundario, en el que recibe dos enteros x e y, que se utilizan para inicializar las variables de instancia anteriores.
 *
 * RA2.c Crea un método llamado obtenerCoordenadas que devuelva una instancia de la clase Pair, con las coordenadas del punto x e y.
 *
 * RA2.d Crea un método llamado toString que devuelva un String que representará en este formato, la instancia de la clase Punto.
 *
 * El formato será: "punto <id> -> [<x>,<y>]"
 * RA2.e y f Create un método estático (De clase) que reste dos puntos. Deberás pasar los dos puntos como parámetros en la llamada al método.
 * El método se llamará componenteDeVector
 *
 * RA2.e y f Create un método estático (De clase) que reste dos puntos. Deberás pasar los dos puntos  como parámetros en la llamada al método.
 *
 * RA2.b,RA2.d Escribe un programa que reste dos puntos, el programa tendrá que instanciar dos objetos de la clase punto, punto a(3,2) y b(1,3) y haciendo uso del método
 *
 *
 */




class Punto(val id:String){
    var x: Int = 0
    var y: Int = 0

    constructor(id: String, unaX:Int, unaY:Int):this(id) {
        x=unaX
        y=unaY
    }

    companion object{
        fun componenteDeVector(a: Punto, b: Punto) = Punto(a.id+b.id,b.x-a.x, b.y-a.y)
        fun distancia(a: Punto, b: Punto) = Math.sqrt(Math.pow((b.x-a.x).toDouble(), 2.0).toDouble() + Math.pow((b.y-a.y).toDouble(), 2.0).toDouble())
        fun localizacionGeograficaNS(puntos:Array<Punto>):Map<String, MutableList<Punto>> {
            var mapa: MutableMap<String, MutableList<Punto>> = mutableMapOf(
                "Norte" to mutableListOf<Punto>(),
                "Sur" to mutableListOf<Punto>())

            for (p in puntos) {
                if (p.y >= 0)
                    mapa["Norte"]?.add(p)
                else
                    mapa["Sur"]?.add(p)
            }
            return mapa
        }
    }

    fun obtenerCoordenadas()= Pair(x,y)
    //override fun toString()=

}




fun main() {
    var pA = Punto("pA")
    pA.x = 3
    pA.y = 2
    var pB = Punto("pB",1,3)
    println(pA)
    println(pB)
    println("Componente AB: ${Punto.componenteDeVector(pA,pB)}")
/*
    pA.x = 2
    pA.y = 1
    pB.x = -3
    pB.y = 2
    println(pA)
    println(pB)
    println("Distancia AB:${Punto.distancia(pA,pB)}")
*/

    var pts = arrayOf(
        Punto("p1", -1, 0),
        Punto("p2", 3, -1),
        Punto("p3", -4, 4),
        Punto("p4", -3, 2),
        Punto("p5", 6, -4),
        Punto("p6", -5, 6),
        Punto("p7", 10, -8),
        Punto("p8", 1, 5),
        Punto("p9", 6, -7),
    )
    println("Lista de puntos: ${pts.toList()}")
    println("Localización Geográfica NS: ${Punto.localizacionGeograficaNS(pts)}")

}