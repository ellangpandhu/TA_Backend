import telnet.Client

object GlobalVariable {
    private val clients = HashMap<String, Client>()

    fun addClient(client: Client) {
        clients[client.username] = client
    }

    fun removeClient(username: String) {
        clients.remove(username)
    }
}