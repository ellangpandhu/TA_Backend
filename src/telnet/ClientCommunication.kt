package telnet


fun Client.startCommunication() {
    while (!socket.isClosed){
        getMassage()
    }
}
