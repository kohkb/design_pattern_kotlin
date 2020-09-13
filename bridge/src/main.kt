fun main() {
    var d1 = Display(StringDisplayImpl("Hello, Japan."))
    var d2:Display = CountDisplay(StringDisplayImpl("Hello, World"))
    var d3 = CountDisplay(StringDisplayImpl("Hello, Universe"))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
}