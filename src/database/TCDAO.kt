package database

import javax.net.ssl.HandshakeCompletedListener

class TCDAO(val id: String) : DAO() {
    private val table = "tc"

    fun auth(password: String): Boolean {
        val query = execQuery("SELECT * FROM $table WHERE username = '$id' AND password = '$password'")
        return query.next()
    }

    fun getState(): Boolean {
        val query = execQuery("SELECT state FROM $table WHERE username = '$id'")
        while (query.next()) return query.getBoolean("state")
        return false
    }

    fun getReport(): String {
        val query = execQuery("SELECT report FROM $table WHERE username = '$id'")
        while (query.next()) return query.getString("report")
        return ""
    }

    fun setState(state: Boolean) {
        execUpdate("UPDATE $table SET state = $state WHERE username = '$id'")
    }

    fun setReport(report: String) {
        execUpdate("UPDATE $table SET report = '$report' WHERE username = '$id'")
    }

}