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