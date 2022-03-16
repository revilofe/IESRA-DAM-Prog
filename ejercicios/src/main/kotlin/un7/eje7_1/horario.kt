package un7.eje7_1

import de.m3y.kformat.Table
import de.m3y.kformat.table


object Horario {
    fun print()
    {
        var t = table {
            header("Id", "Hora","Duración", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Porcentaje")

            row(1, "15:30-16:30",1.0f, "SI", "PRO", "BBDD", "BBDD", "LM", 20.0)
            row(1, "15:30-16:30",1.0f, "SI", "PRO", "BBDD", "BBDD", "LM", 20.0)


            hints {
                alignment("Hora", Table.Hints.Alignment.LEFT)
                alignment("Duración", Table.Hints.Alignment.RIGHT)
                precision("Duración", 2)
                precision("Porcentaje", 2)
                postfix("Porcentaje", "%")
                borderStyle = Table.BorderStyle.SINGLE_LINE // or NONE
            }
        }.render(StringBuilder())
        println (t)
    }
}

fun main()
{
    Horario.print()
}
//Muestra información, solicitando datos.
//Entrada adecuada
//Recoge los datos de forma original
//Impelmenta orientado a objetos, con sentido y elegante
