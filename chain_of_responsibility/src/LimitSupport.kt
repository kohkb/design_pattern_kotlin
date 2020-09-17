class LimitSupport(name: String, var limit: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.getNumber() < limit
    }
}