fun main(args: Array<String>) {
    var d1 = CharDisplay('H')
    var d2 = StringDisplay("Hello, World")

    d1.display()
    d2.display()
}

public abstract class AbstractDisplay {
    public abstract fun open(): Unit
    public abstract fun print(): Unit
    public abstract fun close(): Unit
    public fun display(): Unit {
        open()
        for (i in 0..4 ) {
            print()
        }
        close()
    }
}

public class CharDisplay(private var ch: Char): AbstractDisplay() {
    override public fun open(): Unit {
        print("<<")
    }

    override public fun print(): Unit {
        print(ch)
    }

    override public fun close(): Unit {
        println(">>")
    }
}

public class StringDisplay(private var string: String): AbstractDisplay() {
    private var width: Int = string.length
    override public fun open(): Unit {
        printLine()
    }

    override public fun print(): Unit {
        println("|" + string + "|")
    }

    override public fun close(): Unit {
        printLine()
    }

    private fun printLine() {
        print("+")
        for ( i in 0..(width-1) ) {
            print("-")
        }
        println("+")
    }
}