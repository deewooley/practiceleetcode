package lamdas;

public class Book {
    private String Title;

    public Book(String title){
        Title = title;
    }
    public String getTitle(){return Title;}

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                '}';
    }
}
