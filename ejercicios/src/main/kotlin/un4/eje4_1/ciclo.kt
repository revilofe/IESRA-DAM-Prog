/*
Modulo


propiedades
- alumnos
- evaluaciones

metodos
X (1) Modulo(maxAlumnos:Int), establecerNota(idAlumno:String, evaluacion:String, nota:Float): Boolean
X (2) calculaEvaluacionFinal()
X (3) listaNotas(evaluacion:String): List<Pair>
X (4) numeroAprobados(evaluacion:String): Int
X (5) notaMasBaja(evaluacion:String): Float
X (6) notaMasAlta(evaluacion:String): Float
X (7) notaMedia(evaluacion:String): Float
- (8) hayAlumnosConDiez(evaluacion:String): Boolean
- (9) hayAlumnosAprobados(evaluacion:String): Boolean
- (10) primeraNotaNoAprobada(evaluacion:String): Float
X (11) listaNotasOrdenados(evaluacion:String): List<Pair>
X (12) matricularAlumno(alumno:Alumno): Boolean
X (13) bajaAlumno(idAlumno:String): Boolean

Alumnos

propiedades
- id: String
- nombre: String
- ap1: String
- ap2: String
*/

//Clases

data class Alumno(val id: String, val nombre: String, val ap1: String, val ap2: String)

class Modulo(val maxAlumnos: Int = 10) {
    companion object {
        const val EV_PRIMERA = "0"
        const val EV_SEGUNDA = "1"
        const val EV_TERCERA = "2"
        const val EV_FINAL = "3"
    }

    init {
        require(maxAlumnos > 10) { "Numero máximo de alumnos tiene que ser mayor a 10" }
    }

    val alumnos = arrayOfNulls<Alumno?>(maxAlumnos)
    var alumnosMatriculados = 0
    val notas = arrayOf(FloatArray(maxAlumnos) { -1.0f },
        FloatArray(maxAlumnos) { -1.0f },
        FloatArray(maxAlumnos) { -1.0f },
        FloatArray(maxAlumnos) { -1.0f })

    /*************
     * Metodos
     *************/

    fun matricularAlumno(alumno: Alumno): Boolean {
        var pos = -1
        var matriculado = false;
        if (!existe(alumno.id)) {
            pos = primeraPosicionLibre()
            if (pos >= 0) {
                alumnos[pos] = alumno
                matriculado = true
                alumnosMatriculados++
            }
        }
        return matriculado
    }


    fun bajaAlumno(alumno: Alumno): Boolean {
        var pos = -1
        var baja = false;
        pos = posicion(alumno.id)
        if (pos >= 0) {
            alumnos[pos] = null
            notas[EV_PRIMERA.toInt()][pos] = -1.0F
            notas[EV_SEGUNDA.toInt()][pos] = -1.0F
            notas[EV_TERCERA.toInt()][pos] = -1.0F
            notas[EV_FINAL.toInt()][pos] = -1.0F
            baja = true
            alumnosMatriculados--
        }
        return baja
    }

    fun establecerNota(idAlumno: String, evaluacion: String, nota: Float): Boolean {
        var establecida = false
        if (evaluacion in EV_PRIMERA..EV_FINAL) {
            var pos = posicion(idAlumno)
            if (pos >= 0) {
                notas[evaluacion.toInt()][pos] = nota
                establecida = true
            }
        }
        return establecida
    }

    /**
     * Lista de notas por evaluación
     */
    fun listaNotas(evaluacion: String = EV_FINAL): List<Pair<Alumno, Float>> {
        val listaNotas = ArrayList<Pair<Alumno, Float>>()
        if (evaluacion in EV_PRIMERA..EV_FINAL)
            alumnos.forEachIndexed { i, alumno ->
                if (alumno != null) listaNotas.add(Pair(alumno, notas[evaluacion.toInt()][i]))
            }
        return listaNotas
    }

    /**
     * Lista de notas ordenados
     * return Una lista de pares Alumno, Nota
     */
    fun listaNotasOrdenados(evaluacion: String = EV_FINAL): List<Pair<Alumno, Float>> {
        return this.listaNotas().sortedBy { it.second }
    }

    /**
     * Obtiene una lista de alumnos.
     * return lista de alumnos.
     */
    fun obtenerAlumnos(): List<Alumno?> {
        return ordenaPorId()
    }

    /**
     * Obtiene un representando en string del modulo, en modo lista [Alumno, nota]
     */
    override fun toString(): String {
        return "Alumnos:\n" + obtenerAlumnos()
    }

    /**
     * Asume que las evaluaciones 1, 2 y 3 están rellenas.
     */
    fun calculaEvaluacionFinal() {
        notas[3].forEachIndexed { i, _ ->
            notas[EV_FINAL.toInt()][i] =
                (notas[EV_PRIMERA.toInt()][i] + notas[EV_SEGUNDA.toInt()][i] + notas[EV_TERCERA.toInt()][i]) / 3
        }
    }

    fun numeroAprobados(evaluacion: String = EV_FINAL): Int {
        var numeroAprobados = 0
        if (evaluacion in EV_PRIMERA..EV_FINAL)
            numeroAprobados = notas[evaluacion.toInt()].filter { it >= 5.0F }.size
        return numeroAprobados
    }

    fun notaMasBaja(evaluacion: String = EV_FINAL): Float {
        var masBaja = 11.0F
        if (evaluacion in EV_PRIMERA..EV_FINAL)
        //masBaja = notas[evaluacion.toInt()].reduce { masBaja, it -> if (it < masBaja && it >=0) it else masBaja  }
            masBaja = notas[evaluacion.toInt()].filter { it >= 0 }.minOf { it }
        return masBaja
    }

    fun notaMasAlta(evaluacion: String = EV_FINAL): Float {
        var masAlta = -1.0F
        if (evaluacion in EV_PRIMERA..EV_FINAL)
            masAlta = notas[evaluacion.toInt()].maxOf { it }
        return masAlta
    }

    fun notaMedia(evaluacion: String = EV_FINAL): Float {
        var masMedia = -1.0F
        if (evaluacion in EV_PRIMERA..EV_FINAL)
            masMedia = notas[evaluacion.toInt()].filter { it >= 0 }.average().toFloat()
        return masMedia
    }

    private fun primeraPosicionLibre(): Int {
        return alumnos.indexOfFirst { it == null }
    }

    private fun posicion(idAlumno: String): Int {
        return alumnos.indexOfFirst { (it?.id ?: "").equals(idAlumno) }
    }

    private fun existe(idAlumno: String): Boolean {
        return posicion(idAlumno) >= 0
    }

    private fun ordenaPorId(): List<Alumno?> {
        return alumnos.sortedBy { it?.id ?: "" }
    }
}

//Main
fun main() {
    val modulo = Modulo(15).apply {
        matricularAlumno(Alumno("1", "Eduardo 1", "Fernández", "Oliver"))
        matricularAlumno(Alumno("2", "Andres 2", "Astana", "Santana"))
        matricularAlumno(Alumno("1", "Eduardo 1", "Fernández", "Oliver"))
        matricularAlumno(Alumno("3", "Andrea 3", "Astana", "Santana"))
        matricularAlumno(Alumno("4", "Andrea 4", "Astana", "Santana"))
        matricularAlumno(Alumno("7", "Andrea 7", "Astana", "Santana"))
        matricularAlumno(Alumno("6", "Andrea 6", "Astana", "Santana"))
        matricularAlumno(Alumno("5", "Andrea 5", "Astana", "Santana"))
        bajaAlumno(Alumno("5", "Andrea", "Astana", "Santana"))
        matricularAlumno(Alumno("11", "Andrea 11", "Astana", "Santana"))
        matricularAlumno(Alumno("8", "Andrea 8", "Astana", "Santana"))
        matricularAlumno(Alumno("10", "Andrea 10", "Astana", "Santana"))
        matricularAlumno(Alumno("9", "Andrea 9", "Astana", "Santana"))
    }
    modulo.bajaAlumno(Alumno("4", "Andrea", "Astana", "Santana"))

    println("Deben aparecer 1..11, meno 4 y 5")
    println(modulo)


    modulo.establecerNota("1", Modulo.EV_PRIMERA, 4.0F)
    modulo.establecerNota("1", Modulo.EV_SEGUNDA, 5.0F)
    modulo.establecerNota("1", Modulo.EV_TERCERA, 6.0F)
    modulo.establecerNota("2", Modulo.EV_PRIMERA, 5.0F)
    modulo.establecerNota("2", Modulo.EV_SEGUNDA, 2.0F)
    modulo.establecerNota("2", Modulo.EV_TERCERA, 2.0F)
    modulo.establecerNota("3", Modulo.EV_PRIMERA, 4.0F)
    modulo.establecerNota("3", Modulo.EV_SEGUNDA, 7.0F)
    modulo.establecerNota("3", Modulo.EV_TERCERA, 6.0F)
    modulo.establecerNota("6", Modulo.EV_PRIMERA, 5.0F)
    modulo.establecerNota("6", Modulo.EV_SEGUNDA, 2.0F)
    modulo.establecerNota("6", Modulo.EV_TERCERA, 2.0F)
    modulo.establecerNota("7", Modulo.EV_PRIMERA, 4.0F)
    modulo.establecerNota("7", Modulo.EV_SEGUNDA, 5.0F)
    modulo.establecerNota("7", Modulo.EV_TERCERA, 6.0F)
    modulo.establecerNota("8", Modulo.EV_PRIMERA, 5.0F)
    modulo.establecerNota("8", Modulo.EV_SEGUNDA, 2.0F)
    modulo.establecerNota("8", Modulo.EV_TERCERA, 1.0F)
    modulo.establecerNota("9", Modulo.EV_PRIMERA, 4.0F)
    modulo.establecerNota("9", Modulo.EV_SEGUNDA, 5.0F)
    modulo.establecerNota("9", Modulo.EV_TERCERA, 6.0F)
    modulo.establecerNota("10", Modulo.EV_PRIMERA, 5.0F)
    modulo.establecerNota("10", Modulo.EV_SEGUNDA, 2.0F)
    modulo.establecerNota("10", Modulo.EV_TERCERA, 2.0F)
    modulo.establecerNota("11", Modulo.EV_PRIMERA, 4.0F)
    modulo.establecerNota("11", Modulo.EV_SEGUNDA, 5.0F)
    modulo.establecerNota("11", Modulo.EV_TERCERA, 6.0F)

    modulo.calculaEvaluacionFinal()

    println("Lista de notas FINALES: ")
    println(modulo.listaNotas(Modulo.EV_FINAL))

    println("Numero de aprobados: ${modulo.numeroAprobados(Modulo.EV_SEGUNDA)}")
    println("Nota mas baja: ${modulo.notaMasBaja(Modulo.EV_FINAL)}")
    println("Nota mas alta: ${modulo.notaMasAlta(Modulo.EV_FINAL)}")
    println("Nota media: ${modulo.notaMedia(Modulo.EV_FINAL)}")

    println("Lista de notas ordenadas")
    println(modulo.listaNotasOrdenados(Modulo.EV_FINAL))

}
