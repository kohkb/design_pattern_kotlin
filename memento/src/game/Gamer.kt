package game
import java.util.*

class Gamer(private var money: Int) {
    private var fruits : ArrayList<String> = arrayListOf()
    private var random: Random = Random()
    private val fruitsName: List<String> = listOf("リンゴ","ぶどう", "バナナ","みかん")

    fun getMoney(): Int{
        return money
    }

    fun bet() {
        var dice: Int = random.nextInt(6) + 1

        when (dice) {
            1 -> {
                money += 100
                println("所持金が増えました")
            }
            2 -> {
                money /= 2
                println("所持金が半分になりました。")
            }

            6 -> {
                var f: String = getFruit()
                println("フルーツ（$f)をもらいました。")
                fruits.add(f)
            }

            else -> {
                println("何も起こりませんでした。")
            }
        }
    }

    fun createMemento(): Memento {
        var m = Memento(money)
        var it = fruits.iterator()
        while (it.hasNext()) {
            var f: String = it.next()
            if (f.startsWith("おいしい")) {
                m.addFruit(f)
            }
        }
        return m
    }

    fun restoreMemento(memento: Memento) {
        this.money = memento.money
        this.fruits = memento.fruits
    }

    override fun toString(): String {
        return "[money = $money, fruits = $fruits]"
    }

    private fun getFruit(): String{
        var prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい"
        }
        return prefix + fruitsName[random.nextInt(fruitsName.size)]
    }
}