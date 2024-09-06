package t03_library;


import t03_library.library.model.Book;
import t03_library.library.model.LibraryMember;
import t03_library.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", 20003311);
        Book book2 = new Book("Book 2", "Author 2", 20002221);
        Book book3 = new Book("Book 3", "Author 3", 20003333);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        LibraryMember libaryMember1 = new LibraryMember("Jari", 1);
        LibraryMember libraryMember2 = new LibraryMember("Jari2", 2);
        LibraryMember libraryMember3 = new LibraryMember("Jari3", 3);
        library.addMember(libaryMember1);
        library.addMember(libraryMember2);
        library.addMember(libraryMember3);
        library.reserveBook(libaryMember1,book1);
        library.reserveBook(libaryMember1, book2);
        library.reserveBook(libraryMember2, book2);
        libaryMember1.displayReservedBooks();
        library.cancelReserverdBook(libaryMember1, book2);
        library.reserveBook(libraryMember2,book2);


    }
}
