package lamdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasPract {
    public static List<Book> all(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Functional Programming in Java"));
        books.add(new Book("Clean Code"));
        books.add(new Book("Java Generics and Collections"));
        books.add(new Book("Effectuve Java"));
        books.add(new Book("Pragmatic Unit Testing in Java 8 w JUnit"));
        books.add(new Book("JavaFX Essentials"));
return books;
    }
}
