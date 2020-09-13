class CountDisplay(impl: DisplayImpl): Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        for (i in 0..times) {
            print()
        }
        close()
    }
}