class SpecialSupport(name: String, var number: Int) :Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.getNumber() == number
    }
}