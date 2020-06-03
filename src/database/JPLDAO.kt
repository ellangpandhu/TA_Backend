package database

class JPLDAO(val id: String) : DAO() {
    private val table = "jpl"

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

    fun setState(state: Int) {
        execUpdate("UPDATE $table SET state = $state WHERE id = '$id'")

    }

    fun setReport(report: String) {
        execUpdate("UPDATE $table SET report = '$report' WHERE id = '$id'")

    }

}