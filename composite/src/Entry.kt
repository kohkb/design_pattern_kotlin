import java.lang.Exception

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Entry {
        throw Exception()
    }

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString(): String {
        return getName() + "(" + getSize() + ")"
    }
}