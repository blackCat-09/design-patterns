package designpattern.iterator;

/**
 * DATE  2019-08-18
 *  用于遍历书架
 *
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book bookAt = bookShelf.getBookAt(index);
        index ++;
        return bookAt;
    }
}
