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

    public static void usingLambdasLongForm(){
        List<Book> books = LambdasPract.all();
        Collections.sort(books, (Book b1, Book b2) -> {
            return b1.getTitle().compareTo(b2.getTitle());
        });
        for(Book book:books){
            System.out.println(book);
        }
    }
    public static void usingLambdasShortForm(){
        List<Book> books = LambdasPract.all();
        Collections.sort(books, (b1, b2) ->
             b1.getTitle().compareTo(b2.getTitle()));
        books.forEach(book -> System.out.println(book));
    }
    public static void usingMethodReferences(){
        List<Book> books = LambdasPract.all();
        //Below Book ::or use method ... method name
        Collections.sort(books,Comparator.comparing(Book::getTitle));
        books.forEach( System.out::println);
    }
    public static void main(String[] args) {
       usingAnonymousInlineCass();
       usingLambdasLongForm();
    }
}
