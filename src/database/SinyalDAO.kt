package database

import javax.net.ssl.HandshakeCompletedListener

class SinyalDAO(val id: String) : DAO() {
    private val table = "sinyal"

    fun getState(): Int {
        val query = execQuery("SELECT state FROM $table WHERE id = '$id'")
        while (query.next()) return query.getInt("state")
        return 0
    }

    fun getReport(): String {
        val query = execQuery("SELECT report FROM $table WHERE id = '$id'")
        while (query.next()) return query.getString("report")
        return ""
    }

    fun setState(state: Int) {
        execUpdate("UPDATE $table SET state = $state WHERE id = '$id'")

    }

    fun setReport(report: String) {
        execUpdate("UPDATE $table SET report = '$report' WHERE id = '$id'")

    }

}