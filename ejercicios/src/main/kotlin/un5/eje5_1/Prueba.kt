import kotlin.random.Random

open class ArmaDeFuego(private val nombre: String, //Aqui declaramos las variables y las funciones, que vamos a usar en las demas armas
                       private var municion: Int,
                       private val danio: Int,
                       private val cargador: Int){

    open val tipoDeMunicion: String = ""
    open var municionARestar: Int= 0
    open val radio: String= ""


    open fun dispara(){
        municionARestar += 1
        municion -= municionARestar
    }

    open fun recargar(){
        municion = cargador
    }


}

class Pistola(private val nombre: String, //Como en cada clase, ponemos las variables heredadas de Arma de fuego
              private var municion: Int,
              private val danio: Int,
              private val cargador: Int): ArmaDeFuego(nombre,municion,danio,cargador){

    override val tipoDeMunicion = "Balas de Calibre Bajo"
    override val radio = "Pequeno"

    override fun dispara() {
        municionARestar = 1
        municionARestar *= 1
        if (municion <= 0|| municion<municionARestar){
            println("No tienes Balas, Recarga")
        }else {
            municion -= municionARestar
            println("Has Disparado!")
        }
    }

    override fun recargar(){
        municion = cargador
        println("Recargado Correctamente")
    }

    override fun toString(): String { //Utilizamos la funcion to String para visualizarlo mas adelante
        return ("La arma es $nombre, tienes $municion, hace $danio de danio, tiene un cargador de $cargador, tiene unas $tipoDeMunicion y el radio es $radio")
    }

}

class Rifle(private val nombre: String,
            private var municion: Int,
            private val danio: Int,
            private val cargador: Int): ArmaDeFuego(nombre,municion,danio,cargador){

    override val tipoDeMunicion = "Balas de Calibre Medio"
    override val radio = "Pequeno"

    override fun dispara() {
        municionARestar = 1
        municionARestar *= 2
        if (municion <= 0|| municion<municionARestar){
            println("No tienes Balas, Recarga")
        }else {
            municion -= municionARestar
            println("Has Disparado!")
        }
    }

    override fun recargar(){
        municion = cargador
        println("Recargado Correctamente")
    }

    override fun toString(): String {
        return ("La arma es $nombre, tienes $municion, hace $danio de danio, tiene un cargador de $cargador, tiene unas $tipoDeMunicion y el radio es $radio")
    }

}

class Bazooka(private val nombre: String,
              private var municion: Int,
              private val danio: Int,
              private val cargador: Int): ArmaDeFuego(nombre,municion,danio,cargador){

    override val tipoDeMunicion = "Cohetes"
    override val radio = "Amplio"

    override fun dispara() {
        municionARestar = 1
        municionARestar *= 3
        if (municion <= 0|| municion<municionARestar){
            println("No tienes Balas, Recarga")
        }else {
            municion -= municionARestar
            println("Has Disparado!")
        }
    }

    override fun recargar(){
        municion = cargador
        println("Recargado Correctamente")
    }

    override fun toString(): String {
        return ("La arma es $nombre, tienes $municion, hace $danio de danio, tiene un cargador de $cargador, tiene unas $tipoDeMunicion y el radio es $radio")
    }

}




fun main() {
    val uno = Pistola("1911",8,30,8)
    val dos = Rifle("M4A1",12,30,30)
    val tres = Bazooka("RPG",0,30,5)
    val cuatro = Pistola("Tec-9",0,30,12)
    val cinco = Rifle("AK-47",32,30,32)
    val seis = Bazooka("M2",0,30,5 )

    //Para que coja una arma que hay entre todas las armas que hay se crea una mutable list donde se encuentra las armas
    //Y un map de armas dondese pondra los nuemeros random que se coge y con el foreach se mostrara en pantalla
    val lisdearmas:MutableList<ArmaDeFuego> = mutableListOf(uno,dos,tres,cuatro,cinco,seis)
    val mapdearmas:MutableMap<String,ArmaDeFuego> = mutableMapOf()

    for (i in 0 ..2){
        mapdearmas["Arma Nº$i"]= lisdearmas.random()
    }

    mapdearmas.forEach{
        it.value.dispara()
        it.value.recargar()
        println(it.value.toString())
    }
}