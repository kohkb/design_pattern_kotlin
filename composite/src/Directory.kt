import kotlin.collections.ArrayList

class Directory(private var name: String): Entry() {
    private var directory: ArrayList<Entry> = arrayListOf<Entry>()

    override fun getName(): String {
        return this.name
    }

    override fun getSize(): Int {
        var size = 0
        var it: MutableIterator<Entry> = directory.iterator()
        while (it.hasNext()) {
            var entry: Entry = it.next()
            size += entry.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry{
        directory.add(entry)
        return this
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        var it = directory.iterator()
        while (it.hasNext()) {
            var entry: Entry = it.next()
            entry.printList("$prefix/$name")
        }
    }
}