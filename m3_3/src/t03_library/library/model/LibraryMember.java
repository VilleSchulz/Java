package t03_library.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int ID;
    private List<Book> borrowedBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public List<Book> getBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            return null;
        } else {
            return borrowedBooks;
        }

    }

    public List<Book> getReservedBooks() {
        if (reservedBooks.isEmpty()) {
            return null;
        } else {
            return reservedBooks;
        }
    }
    public void displayReservedBooks(){
        System.out.println(this.name+ "´s reserved books:");
        for (Book book : reservedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }
}


