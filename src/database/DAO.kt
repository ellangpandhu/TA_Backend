package database

open class DAO () {
    private val conn=Config().getConnection()
    fun execQuery(query:String)=conn!!.createStatement().executeQuery(query)
    fun execUpdate(query:String)=conn!!.createStatement().executeUpdate(query)

}