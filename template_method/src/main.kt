fun main() {
    var d1 = CharDisplay('H')
    var d2 = StringDisplay("Hello, World")

    d1.display()
    d2.display()
}

abstract class AbstractDisplay {
    abstract fun open(): Unit
    abstract fun print(): Unit
    abstract fun close(): Unit
    fun display(): Unit {
        open()
        for (i in 0..4 ) {
            print()
        }
        close()
    }
}

class CharDisplay(private var ch: Char): AbstractDisplay() {
    override fun open(): Unit {
        print("<<")
    }

    override fun print(): Unit {
        print(ch)
    }

    override fun close(): Unit {
        println(">>")
    }
}

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