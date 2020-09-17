class StringDisplay(private var string: String): AbstractDisplay() {
    private var width: Int = string.length
    override fun open(): Unit {
        printLine()
    }

    override fun print(): Unit {
        println("|$string|")
    }

    override fun close(): Unit {
        printLine()
    }

    private fun printLine() {
        print("+")
        for ( i in 0 until width) {
            print("-")
        }
        println("+")
    }
}