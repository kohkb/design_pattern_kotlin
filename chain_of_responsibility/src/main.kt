fun main() {
    var alice: Support = NoSupport("Alice")
    var bob: Support = LimitSupport("Bob", 100)
    var charlie: Support = SpecialSupport("Charlie", 429)
    var diana: Support = LimitSupport("Diana", 200)
    var elmo: Support = OddSupport("Elmo")
    var fred: Support = LimitSupport("Fred", 300)

    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)

    for ( i in 0..500) {
        alice.support(Trouble(i))
    }
}
