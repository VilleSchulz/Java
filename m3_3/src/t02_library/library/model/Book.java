package t02_library.library.model;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int publicationYear;
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getISBN() {
        return ISBN;
    }
public int getPublicationYear() {
        return publicationYear;
}

}
