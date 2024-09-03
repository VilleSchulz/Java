package t06;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }
    public  static void addUser(User user) {
        users.add(user);
        System.out.println(user.getName()+ " has been added to the library");
    }

    public void borrowBook(String title,User user) {
        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                user.borrowedBooks.add(books.get(i));
                books.remove(books.get(i));
                System.out.println(user.getName()+  " borrowed "+title);
                bookFound = true;
            }

        }
        if (!bookFound) {
            System.out.println(title + "not available");
        }
    }


    public void returnBook(String title,User user) {
        for (int i = 0; i < user.borrowedBooks.size(); i++) {
            if (user.borrowedBooks.get(i).getTitle().equals(title)) {
                books.add(user.borrowedBooks.get(i));
                user.borrowedBooks.remove(user.borrowedBooks.get(i));
                System.out.println( user.getName() + " returned "+title);

            }
        }

    }
    public boolean isBookAvailable(String title) {
        System.out.print("Is "+title+" available: ");
        boolean bookFound = false;
        for (Book book : books) {
            if(book.getTitle().equals(title)){
             bookFound = true;
            }
        }
        return bookFound;
    }
    public void getAverageBookRating() {
        int i = 0;
        double averageRating = 0;
        for(Book book : books){
            book.getRating();
            i++;
            averageRating = averageRating + book.getRating();
        }
        averageRating = averageRating/i;
        System.out.printf("Average rating of books are %.2f \n",averageRating);
    }
    public void getMostReviewedBook() {
        double mostReviewedRating = 0;
        for(Book book : books){
            if(book.getRating() > mostReviewedRating){
                mostReviewedRating = book.getRating();
            }}
            for(Book book: books){
                if(book.getRating() == mostReviewedRating){
                    System.out.println("Most reviewed book is "+book.getTitle() +" "+ book.getRating());
                }

        }

        }



    public void displayBooks() {
        int counter = 0;
        System.out.println("****t04.Library Catalog****");
        for (Book book : books) {
            counter++;
            System.out.println(counter + ". " + "Title: " + '"' + book.getTitle() + '"' + " Author: " + '"' + book.getAuthor() + '"' +
                    ", Year: " +
                    book.getPublicationYear() +
                    "\n*******************");

        }


    }

    public void findBooksBYAuthor(String author) {
        System.out.println("Books by author " + '"' + author + '"' + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(
                        "Title: " + book.getTitle() + " , year: " +
                                book.getPublicationYear() +
                                "\n*******************");

            }
        }
    }
}

