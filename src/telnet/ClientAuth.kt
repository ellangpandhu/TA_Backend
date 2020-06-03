package telnet

fun Client.startAuth(): Boolean {
    sendMassage("Connected to IBC Server")
    sendMassage("Username : ")
    val username = getMassage()
    sendMassage("Password : ")
    val password = getMassage()
    return if (database.auth(username, password)) {
        this.username = username
        sendMassage("$username Connected to System")
        true
    } else {
        sendMassage("Auth Failed")
        disconnect()
        false
    }
}