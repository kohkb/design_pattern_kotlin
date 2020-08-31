import framework.*
import idcard.IDCardFactory

fun main() {
    var factory: Factory = IDCardFactory()
    var card1: Product = factory.create("hoge")
    var card2: Product = factory.create("fuga")
    var card3: Product = factory.create("foo")
    card1.use()
    card2.use()
    card3.use()
}