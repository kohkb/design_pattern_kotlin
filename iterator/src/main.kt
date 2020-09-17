fun main() {
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