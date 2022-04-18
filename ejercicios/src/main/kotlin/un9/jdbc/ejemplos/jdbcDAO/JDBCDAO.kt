package un9.jdbc.ejemplos.jdbcDAO

/**
 * https://stonesoupprogramming.com/2017/12/13/kotlin-jdbc-create-insert-query-and-truncate-tables/
 * https://levelup.gitconnected.com/how-to-access-database-with-kotlin-6b86f6680cd7
 *
 */

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

fun main() {
    val c = ConnectionBuilder()
    println("conectando.....")

    if (c.connection.isValid(10)) {
        println("Conexión válida")

        // Deshabilito el autoCommit. Si no, tengo que quitar los commit()
        c.connection.autoCommit = false

        // Uso la conexión. De esta manera cierra la conexión cuando termine el bloque
        c.connection.use {

            // Me creo mi objeto DAO (Data Access Object), el cual sabe acceder a los ç
            // datos de la tabla USER. Necesita la conexión (it) para poder acceder a la
            // base de datos.
            // El objeto DAO va a tener todos los metodos necesarios para trabajar con
            // la tabla USER, y devolverá entidades MyUser.
            // Fuera de este objeto no debería hablarse de nada relacioando con la base
            // de datos.
            // Los objetos MyUser, tambien llamados entidades, se llaman
            // Objetos TO (Transfer Object) porque son objetos que transfieren datos.
            // desde la base de datos hasta las capas de logica de negocio y presentación.
            val h2DAO = UserDAO(it)

            // Creamos la tabla o la vaciamos si ya existe
            h2DAO.prepareTable()

            // Insertamos 4 usuarios
            repeat(4)
            {
                h2DAO.insert(MyUser(name = "Edu", email = "falto", country = "spain"))
            }  // Buscar un usuario
            var u = h2DAO.selectById(1)

            // Si ha conseguido el usuario, por tanto no es nulo, entonces
            // actualizar el usuario
            if (u!=null)
            {
                u.name = "Nuevo usuario"
                h2DAO.update(u)
            }
            // Borrar un usuario
            h2DAO.deleteById(2)

            // Seleccionar todos los usuarios
            println(h2DAO.selectAll())
        }
    } else
        println("Conexión ERROR")
}

/**
 * Connection builder construye una conexión
 *
 * @constructor Create empty Connection builder
 */
class ConnectionBuilder {
    // TODO Auto-generated catch block
    lateinit var connection: Connection

    // La URL de conexión. Tendremos que cambiarsa según el SGBD que se use.
    private val jdbcURL = "jdbc:h2:mem:default"
    private val jdbcUsername = ""
    private val jdbcPassword = ""

    init {
        try {
            // Aqui construimos la conexión
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)
        } catch (e: SQLException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }
    // Si termina sin excepción, habrá creado la conexión.

}

/**
 * UserDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 *
 * @property c una conexión
 * @constructor Create empty UserDAO
 *
 * @author edu
 */

class UserDAO(private val c: Connection) {

    // En el companion object creamos todas las constantes.
    // Las constante definirán las plantillas de las sentencias que necesitamos para construir
    // los selects, inserts, deletes, updates.

    // En aquellos casos en donde necesitemos insertar un parametro, pondremos un ?
    // Luego lo sistituiremos llamando a métodos setX, donde X será (Int, String, ...)
    // dependiendo del tiempo de dato que corresponda.
    companion object {
        private const val SCHEMA = "default"
        private const val TABLE = "USERS"
        private const val TRUNCATE_TABLE_USERS_SQL = "TRUNCATE TABLE USERS"
        private const val CREATE_TABLE_USERS_SQL =
            "CREATE TABLE USERS (id  number(3) NOT NULL AUTO_INCREMENT,name varchar(120) NOT NULL,email varchar(220) NOT NULL,country varchar(120),PRIMARY KEY (id))"
        private const val INSERT_USERS_SQL = "INSERT INTO USERS" + "  (name, email, country) VALUES " + " (?, ?, ?);"
        private const val SELECT_USER_BY_ID = "select id,name,email,country from USERS where id =?"
        private const val SELECT_ALL_USERS = "select * from USERS"
        private const val DELETE_USERS_SQL = "delete from USERS where id = ?;"
        private const val UPDATE_USERS_SQL = "update USERS set name = ?,email= ?, country =? where id = ?;"
    }


    fun prepareTable() {
        val metaData = c.metaData

        // Consulto en el esquema (Catalogo) la existencia de la TABLE
        val rs = metaData.getTables(null, SCHEMA, TABLE, null)

        // Si en rs hay resultados, borra la tabla con truncate, sino la crea
        if (rs.next())  truncateTable() else createTable()
    }

    private fun truncateTable() {
        println(TRUNCATE_TABLE_USERS_SQL)
        // try-with-resource statement will auto close the connection.
        try {
            c.createStatement().use { st ->
                st.execute(TRUNCATE_TABLE_USERS_SQL)
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
    }

    private fun createTable() {
        println(CREATE_TABLE_USERS_SQL)
        // try-with-resource statement will auto close the connection.
        try {
            //Get and instance of statement from the connection and use
            //the execute() method to execute the sql
            c.createStatement().use { st ->
                //SQL statement to create a table
                st.execute(CREATE_TABLE_USERS_SQL)
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
    }

    /**
     * Insert Inserta un objeto MyUser en la base de datos.
     * El proceso siempre es el mismo:
     *      Haciendo uso de la conexión, prepara una Statement pasandole la sentencia que se va a ejecutar
     *      en este caso, INSERT_USERS_SQL
     *      A la Statement devuelta se le aplica use
     *          Establecemos los valores por cada ? que existan en la plantilla.
     *          En este caso son 3, pq en INSERT_USERS_SQL hay tres ?
     *          Los indices tienen que ir en el mismo orden en el que aparecen
     *
     *          Finalmente, se ejecuta la Statement
     *          Se llama a commit.
     *
     * @param user
     */
    fun insert(user: MyUser) {
        println(INSERT_USERS_SQL)
        // try-with-resource statement will auto close the connection.
        try {
            c.prepareStatement(INSERT_USERS_SQL).use { st ->
                st.setString(1, user.name)
                st.setString(2, user.email)
                st.setString(3, user.country)
                println(st)
                st.executeUpdate()
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
    }

    fun selectById(id: Int): MyUser? {
        var user: MyUser? = null
        // Step 1: Preparamos la Statement, asignado los valores a los indices
        //          en función de las ? que existen en la plantilla
        try {
            c.prepareStatement(SELECT_USER_BY_ID).use { st ->
                st.setInt(1, id)
                println(st)
                // Step 3: Ejecuta la Statement
                val rs = st.executeQuery()

                // Step 4: Procesamos el objeto ResultSet (rs), mientras tenga valores.
                //          En este caso, si hay valores, tendrá un unico valor, puesto
                //          que estamos buscando por el ID, que es la clave primaria.
                while (rs.next()) {
                    val name = rs.getString("name")
                    val email = rs.getString("email")
                    val country = rs.getString("country")
                    user = MyUser(id, name, email, country)
                }
            }

        } catch (e: SQLException) {
            printSQLException(e)
        }
        return user
    }

    fun selectAll(): List<MyUser> {

        // using try-with-resources to avoid closing resources (boiler plate code)
        val users: MutableList<MyUser> = ArrayList()
        // Step 1: Establishing a Connection
        try {
            c.prepareStatement(SELECT_ALL_USERS).use { st ->
                println(st)
                // Step 3: Execute the query or update query
                val rs = st.executeQuery()

                // Step 4: Process the ResultSet object.
                while (rs.next()) {
                    val id = rs.getInt("id")
                    val name = rs.getString("name")
                    val email = rs.getString("email")
                    val country = rs.getString("country")
                    users.add(MyUser(id, name, email, country))
                }
            }

        } catch (e: SQLException) {
            printSQLException(e)
        }
        return users
    }

    fun deleteById(id: Int): Boolean {
        var rowDeleted = false

        try {
            c.prepareStatement(DELETE_USERS_SQL).use { st ->
                st.setInt(1, id)
                rowDeleted = st.executeUpdate() > 0
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
        return rowDeleted
    }

    fun update(user: MyUser): Boolean {
        var rowUpdated = false

        try {
            c.prepareStatement(UPDATE_USERS_SQL).use { st ->
                st.setString(1, user.name)
                st.setString(2, user.email)
                st.setString(3, user.country)
                st.setInt(4, user.id)
                rowUpdated = st.executeUpdate() > 0
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
        return rowUpdated
    }

    private fun printSQLException(ex: SQLException) {
        for (e in ex) {
            if (e is SQLException) {
                e.printStackTrace(System.err)
                System.err.println("SQLState: " + e.sqlState)
                System.err.println("Error Code: " + e.errorCode)
                System.err.println("Message: " + e.message)
                var t = ex.cause
                while (t != null) {
                    println("Cause: $t")
                    t = t.cause
                }
            }
        }
    }


}

