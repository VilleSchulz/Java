package t02_library.library.system;

import t02_library.library.model.LibararyMember;
import t02_library.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private static List<LibararyMember> libraryMembers = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public static void addUser(LibararyMember user) {
        libraryMembers.add(user);
        System.out.println(user.getName() + " has been added to the library");
    }

    public void borrowBook(String title, LibararyMember user) {
        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                user.borrowedBooks.add(books.get(i));
                books.remove(books.get(i));
                System.out.println(user.getName() + " borrowed " + title);
                bookFound = true;
            }

        }
        if (!bookFound) {
            System.out.println(title + "not available");
        }
    }


    public void returnBook(String title, LibararyMember user) {
        for (int i = 0; i < user.borrowedBooks.size(); i++) {
            if (user.borrowedBooks.get(i).getTitle().equals(title)) {
                books.add(user.borrowedBooks.get(i));
                user.borrowedBooks.remove(user.borrowedBooks.get(i));
                System.out.println(user.getName() + " returned " + title);

            }
        }

    }

    public boolean isBookAvailable(String title) {
        System.out.print("Is " + title + " available: ");
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookFound = true;
            }
        }
        return bookFound;
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
    public void findBooksByISBN(int isbn) {
        for (Book book : books) {
            if(book.getISBN() == isbn) {
                System.out.println(book.getTitle());
            }
        }
    }
}