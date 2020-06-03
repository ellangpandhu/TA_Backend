package telnet

import database.TCDAO

class ClientDatabase {
    fun auth(username: String, password: String) = TCDAO(username).auth(password)
}

val database = ClientDatabase()