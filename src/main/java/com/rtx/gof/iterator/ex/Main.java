package com.rtx.gof.iterator.ex;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("a","b"));
        Iterator<Book> iterator = bookShelf.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
