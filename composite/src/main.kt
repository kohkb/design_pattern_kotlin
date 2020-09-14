import java.lang.Exception

fun main() {
    try {
        println("Making root entries...")
        var rootdir: Directory = Directory("root")
        var bindir: Directory = Directory("bin")
        var tmpdir: Directory = Directory("tmp")
        var usrdir: Directory = Directory("usr")
        rootdir.add(bindir)
        rootdir.add(tmpdir)
        rootdir.add(usrdir)

        bindir.add(File("vi", 10000))
        bindir.add(File("latex", 20000))

        rootdir.printList()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}