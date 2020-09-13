class StringDisplayImpl(var string: String) : DisplayImpl() {
    private var width = string.length

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 1..width) {
            print("-")
        }
        println("+")
    }
}