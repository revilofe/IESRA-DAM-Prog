package dao

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

// Para hacer el DAO necesitamos la clases que mapea con la tabla
object CitiesTable: IntIdTable() {
    val name = varchar("name", 50)
}

// y luego el DAO, es la clase que mapea con las entidades asociadas a cada una de las filas de una tabla.
class CityDAO(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<CityDAO>(CitiesTable)

    var name by CitiesTable.name
    val users by UserDAO referrersOn UsersTable.city
}