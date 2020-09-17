class Trouble(private var number: Int) {
    fun getNumber(): Int{
        return number
    }

    override fun toString(): String{
        return "[Trouble$number]"
    }
}