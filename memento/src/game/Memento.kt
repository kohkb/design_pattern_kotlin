package game
import java.util.*

class Memento (var money: Int) {
    var fruits : ArrayList<String> = arrayListOf()

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }
}