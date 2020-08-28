fun main(args: Array<String>) {
    var p = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()
}


public open class Banner (var string: String) {
    public fun showWithParen() {
        println("(" + string + ")")
    }

    public fun showWithAster() {
        println("*" + string + "*")
    }
}

interface Print {
    abstract fun printWeak()
    abstract fun printStrong()
}

public class PrintBanner(string: String): Banner(string), Print {
    override public fun printWeak() {
        showWithParen()
    }

    override public fun printStrong() {
        showWithAster()
    }
}

