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