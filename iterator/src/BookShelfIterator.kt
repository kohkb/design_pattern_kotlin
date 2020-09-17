class BookShelfIterator(var bookShelf: BookShelf): Iterator {
    var index: Int = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book? {
        var book: Book? = bookShelf.getBookAt(index)
        index++
        return book
    }
}