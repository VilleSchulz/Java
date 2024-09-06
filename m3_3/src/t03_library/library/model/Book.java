package t03_library.library.model;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int publicationYear;
    private boolean reserved = false;

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

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }




public boolean isReserved() {
    return this.reserved;
}}

