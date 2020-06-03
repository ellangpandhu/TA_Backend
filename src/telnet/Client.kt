package telnet

import GlobalVariable
import java.io.PrintStream
import java.net.Socket
import java.util.*

class Client(val socket: Socket) {
    private val output = PrintStream(socket.getOutputStream())
    private val input = Scanner(socket.getInputStream())

    var username = socket.localAddress.hostAddress

    fun sendMassage(msg: String) {
        output.println(msg)
        println("Server -> $username : $msg")
    }

    fun getMassage(): String {
        val msg = input.nextLine()
        println("$username : $msg")
        return msg
    }

    fun auth() {
        if (startAuth()) GlobalVariable.addClient(this)
    }

    fun disconnect() {
        println("Server : $username Disconnect")
        GlobalVariable.removeClient(username)
        socket.close()
    }
}