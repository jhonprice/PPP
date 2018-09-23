package com.rtx.gof.iterator.ex;

public class BookShelf implements Aggregate<Book>{
    private Book[] books;
    private int last;

    public BookShelf(){
        books = new Book[100];
        last = 0;
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }

    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
