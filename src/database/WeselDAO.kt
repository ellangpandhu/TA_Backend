package database

import javax.net.ssl.HandshakeCompletedListener

class WeselDAO(val id: String) : DAO() {
    private val table = "wesel"

    fun getState(): Boolean {
        val query = execQuery("SELECT state FROM $table WHERE id = '$id'")
        while (query.next()) return query.getBoolean("state")
        return false
    }

    fun getReport(): String {
        val query = execQuery("SELECT report FROM $table WHERE id = '$id'")
        while (query.next()) return query.getString("report")
        return ""
    }

    fun setState(state: Boolean) {
        execUpdate("UPDATE $table SET state = $state WHERE id = '$id'")

    }

    fun setReport(report: String) {
        execUpdate("UPDATE $table SET report = '$report' WHERE id = '$id'")

    }

}