class File(private var name: String, private var size: Int): Entry() {
    override fun getName(): String {
        return this.name
    }

    override fun getSize(): Int {
        return this.size
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
    }
}