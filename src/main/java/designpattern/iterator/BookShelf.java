package designpattern.iterator;

/**
 * DATE  2019-08-18
 * 书架
 *
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    Book getBookAt(int index){
        return books[index];
    }

    void appendBook(Book book){
        this.books[last] = book;
        last ++;
    }

    int getLength(){
        return last;
    }


    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
