package idcard
import framework.*

class IDCard(var owner: String): Product() {
    override fun use() {
        println(owner + "のカードを使います")
    }
}