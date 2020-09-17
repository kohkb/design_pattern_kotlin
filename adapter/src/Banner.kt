open class Banner (var string: String) {
    fun showWithParen() {
        println("(" + string + ")")
    }

    fun showWithAster() {
        println("*" + string + "*")
    }
}