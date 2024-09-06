package t03_library.library.system;

import t03_library.library.model.Book;
import t03_library.library.model.LibararyMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private static final List<LibararyMember> libraryMembers = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public static void addMember(LibararyMember member) {
        libraryMembers.add(member);
        System.out.println(member.getName() + " has been added to the library");
    }

    public void borrowBook(String title, LibararyMember member) {
        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                member.getBorrowedBooks().add(books.get(i));
                books.remove(books.get(i));
                System.out.println(member.getName() + " borrowed " + title);
                bookFound = true;
            }

        }
        if (!bookFound) {
            System.out.println(title + "not available");
        }
    }

    public void reserveBook(LibararyMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(member.getName() +": "+ book.getTitle() + " succesfully reserved");

        } else {
            System.out.println(book.getTitle() + " is allready reserved");

        }
    }

    public void cancelReserverdBook(LibararyMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println(book.getTitle() + " reservation cancelled succesfully");


        } else {
            System.out.println(book.getTitle() + " is not reserved by this member");
        }


    }
    public void displayReservedBooks(LibararyMember member) {
        System.out.println("Reserved books of " + member.getName());
        for(Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());

        }

    }

    public void returnBook(String title, LibararyMember member) {
        for (int i = 0; i < member.getBorrowedBooks().size(); i++) {
            if (member.getBorrowedBooks().get(i).getTitle().equals(title)) {
                books.add(member.getBorrowedBooks().get(i));
                member.getBorrowedBooks().remove(member.getBorrowedBooks().get(i));
                System.out.println(member.getName() + " returned " + title);

            }
        }

    }

    public boolean isBookAvailable(String title) {
        System.out.print("Is " + title + " available: ");
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookFound = true;
                break;
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
            if (book.getISBN() == isbn) {
                System.out.println(book.getTitle());
            }
        }
    }
}