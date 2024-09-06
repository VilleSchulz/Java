package t03_library;


import t03_library.library.model.Book;
import t03_library.library.model.LibararyMember;
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

        LibararyMember libararyMember1 = new LibararyMember("Jari", 1);
        LibararyMember libararyMember2 = new LibararyMember("Jari2", 2);
        LibararyMember libararyMember3 = new LibararyMember("Jari3", 3);
        library.addMember(libararyMember1);
        library.addMember(libararyMember2);
        library.addMember(libararyMember3);
        library.reserveBook(libararyMember1,book1);
        library.reserveBook(libararyMember1, book2);
        library.reserveBook(libararyMember2, book2);
        library.cancelReserverdBook(libararyMember1, book2);
        library.reserveBook(libararyMember2,book2);


    }
}
