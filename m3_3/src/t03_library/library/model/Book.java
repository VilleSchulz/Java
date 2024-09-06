package t03_library.library.model;

public class Book {
    private final String TITLE;
    private final String AUTHOR;
    private final int ISBN;
    private int publicationYear;
    private boolean reserved = false;

    public Book(String title, String author, int ISBN) {
        this.TITLE = title;
        this.AUTHOR = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return TITLE;
    }

    public String getAuthor() {
        return AUTHOR;
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

