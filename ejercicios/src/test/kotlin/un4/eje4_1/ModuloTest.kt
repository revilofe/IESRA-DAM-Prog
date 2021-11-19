package un4.eje4_1

import Alumno
import Modulo
import org.junit.jupiter.api.Test

internal class ModuloTest {

    private val modulo = Modulo(15).apply {
        matricularAlumno(Alumno("1", "Eduardo 1", "Fernández", "Oliver"))
        matricularAlumno(Alumno("2", "Andres 2", "Astana", "Santana"))
        matricularAlumno(Alumno("1", "Eduardo 1-1", "Fernández", "Oliver"))
        matricularAlumno(Alumno("3", "Andrea 3", "Astana", "Santana"))
        matricularAlumno(Alumno("4", "Andrea 4", "Astana", "Santana"))
        matricularAlumno(Alumno("7", "Andrea 7", "Astana", "Santana"))
        matricularAlumno(Alumno("6", "Andrea 6", "Astana", "Santana"))
        matricularAlumno(Alumno("5", "Andrea 5", "Astana", "Santana"))
    }
    modulo.bajaAlumno(Alumno("5", "Andrea", "Astana", "Santana"))
    modulo.matricularAlumno(Alumno("17", "Andrea 17", "Astana", "Santana"))
    modulo.matricularAlumno(Alumno("16", "Andrea 16", "Astana", "Santana"))
    modulo.matricularAlumno(Alumno("15", "Andrea 15", "Astana", "Santana"))


    @Test
    fun `establecer notas a los alumnos`() {
        assert(modulo.establecerNota("1", Modulo.EV_PRIMERA, 4.0F))
        assert(modulo.establecerNota("1", Modulo.EV_SEGUNDA, 5.0F))
        assert(modulo.establecerNota("1", Modulo.EV_TERCERA, 6.0F))
        assert(modulo.establecerNota("15", Modulo.EV_PRIMERA, 4.5F))
        assert(modulo.establecerNota("15", Modulo.EV_SEGUNDA, 5.5F))
        assert(modulo.establecerNota("15", Modulo.EV_TERCERA, 6.5F))
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
