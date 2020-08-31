package idcard
import framework.*

class IDCardFactory(): Factory() {
    private val owners = arrayListOf<String>()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).owner)
    }
}
