abstract class Support(private var name: String) {
    private var next: Support? = null

    fun setNext(next: Support): Support {
        this.next = next
        return next
    }

    fun support(trouble: Trouble) {
        if (resolve(trouble)) {
            done(trouble)
        } else if (next != null) {
            next!!.support(trouble)
        } else {
            fail(trouble)
        }
    }

    override fun toString(): String {
        return "[$name]"
    }

    protected abstract fun resolve(trouble: Trouble): Boolean
    private fun done(trouble: Trouble) {
        println("$trouble is already resolved by$this.")
    }

    private fun fail(trouble: Trouble) {
        println("$trouble cannot be resolved.")
    }
}