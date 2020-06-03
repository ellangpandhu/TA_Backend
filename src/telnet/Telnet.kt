package telnet

import java.net.DatagramSocket
import java.net.InetAddress
import java.net.ServerSocket

class Telnet {
    var server: ServerSocket = ServerSocket(23)
    fun startServer() {
        val socket = DatagramSocket().apply { connect(InetAddress.getByName("8.8.8.8"), 1002) }
        println("Server Started\n" +
                "IP4 ${socket.localAddress.hostAddress}\n" +
                "Port ${server.localPort}")
        while (true) onServerCycle()
    }

    private fun onServerCycle() {
        val socket = server.accept()
        Thread(Runnable {
            val client = Client(socket)
            client.auth()
            client.startCommunication()
        }).start()
    }
}

fun main() {
    val telnet = Telnet()
    telnet.startServer()
}

