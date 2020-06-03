package database

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class Config {
    private var conn : Connection? = null
    private val connectionProps = Properties().apply {
        this["user"] = "root"
        this["password"] = ""
    }
    private val serverIP = "127.0.0.1"
    private val serverPort = "3306"
    private val serverName = "server_ibc"


    init {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection(
                    "jdbc:mysql://$serverIP:$serverPort/$serverName",
                    connectionProps)
        } catch (ex: SQLException) {
            ex.printStackTrace()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    fun getConnection()=conn

}