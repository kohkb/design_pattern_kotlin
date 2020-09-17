class BookShelf (maxsize: Int): Aggregate {
    var last: Int = 0
    var books: Array<Book?> = arrayOfNulls<Book>(maxsize)

    fun getBookAt(index: Int ): Book? {
        return books[index]
    }

    fun getLength(): Int {
        return last
    }

    fun appendBook(book: Book ) {
        books[last] = book
        last++
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}