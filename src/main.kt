import database.TCDAO
import database.WeselDAO
import database.JPLDAO
import database.SinyalDAO

fun testWesel() {
    WeselDAO("w11").apply {
        println("Wesel")
        // State
        setState(true)
        println(getState())
        setState(false)
        println(getState())

        //Reprt
        setReport("")
        println(getReport())
        setReport("Tessaasdsadsa")
        println(getReport())
    }
}

fun testTC() {
    TCDAO("10at").apply {
        println("TC")
        // State
        setState(true)
        println(getState())
        setState(false)
        println(getState())

        //Reprt
        setReport("")
        println(getReport())
        setReport("TCblabal")
        println(getReport())
    }
}

    fun testJPL() {
        JPLDAO("jpla").apply {
            println("JPL")
            // State
            setState(0)
            println(getState())
            setState(1)
            println(getState())

            //Reprt
            setReport("")
            println(getReport())
            setReport("JPLlabal")
            println(getReport())
        }
    }


fun testSinyal() {
    SinyalDAO("j10").apply {
        println("Sinyal")
        // State

        setState(1)
        println(getState())
        setState(2)
        println(getState())

        //Reprt
        setReport("")
        println(getReport())
        setReport("Sinyallabal")
        println(getReport())
    }
}


fun main() {
    testWesel()
    testSinyal()
    testTC()
    testJPL()


}

