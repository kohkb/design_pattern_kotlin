fun main(args: Array<String>) {
    var p = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()
}


open class Banner (var string: String) {
    fun showWithParen() {
        println("(" + string + ")")
    }

    fun showWithAster() {
        println("*" + string + "*")
    }
}

interface Print {
    fun printWeak()
    fun printStrong()
}

class PrintBanner(string: String): Banner(string), Print {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}

