package un4.array

import Modulo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ModuloTest {

    private val modulo = Modulo(11)


    @Test
    fun `establecer notas a los alumnos`() {
        assert(modulo.establecerNota("1", "1", 5.0F))
    }

    @Test
    fun getAlumnosMatriculados() {
    }

    @Test
    fun getNotas() {
    }

    @Test
    fun bajaAlumno() {
    }
}