package t04;

import java.util.HashMap;

public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private String review;
    private Double rating;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setRating(Double rating) {
        this.rating = rating;
        System.out.println("Rating added");


    }
    public void addReview(String review) {
       this.review = review;
        System.out.println("Review added");

    }

}
