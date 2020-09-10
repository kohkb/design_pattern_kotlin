import singleton.Singleton

fun main() {
    println("Start.")
    var obj1: Singleton = Singleton.getInstance()
    var obj2: Singleton = Singleton.getInstance()

    if ( obj1 == obj2 ) {
        println("obj1とobj2は同じインスタンスです。")
    } else {
        println("obj1とobj2は同じインスタンスではありません。")
    }

    println("End.")
}