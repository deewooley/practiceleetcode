package lamdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void usingAnonymousInlineCass(){
        List<Book> books = LambdasPract.all();
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
        for(Book book:books){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
       usingAnonymousInlineCass();
    }
}
