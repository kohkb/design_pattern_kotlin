fun main(args: Array<String>) {
    val bookShelf: BookShelf = BookShelf(4)
    bookShelf.appendBook(Book("hoge"))
    bookShelf.appendBook(Book("fuga"))
    bookShelf.appendBook(Book("piyo"))
    bookShelf.appendBook(Book("hage"))
    
    val it: Iterator = bookShelf.iterator()
    
    while (it.hasNext()) {
        val book = it.next()
        println(book)
    }
}

interface Aggregate {
    public fun iterator(): Iterator
}

interface Iterator {
    public fun hasNext(): Boolean
    public fun next(): Any?
}

class Book (val name: String)

class BookShelf (val maxsize: Int): Aggregate {
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

class BookShelfIterator(var bookShelf: BookShelf): Iterator {
    var index: Int = 0

    override fun hasNext(): Boolean {
        if (index < bookShelf.getLength()) {
            return true
        } else {
            return false
        }
    }

    override fun next(): Book? {
        var book: Book? = bookShelf.getBookAt(index)
        index++
        return book
    }
}