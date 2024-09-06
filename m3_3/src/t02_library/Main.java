package t02_library;


import t02_library.library.model.Book;
import t02_library.library.model.LibararyMember;
import t02_library.library.system.Library;

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
        library.addUser(libararyMember1);
        library.addUser(libararyMember2);
        library.addUser(libararyMember3);
        library.borrowBook("Book 1", libararyMember1);
        library.borrowBook("Book 2", libararyMember1);
        library.borrowBook("Book 2", libararyMember2);
        library.borrowBook("Book 3", libararyMember3);
        library.returnBook("Book 1", libararyMember1);
        library.returnBook("Book 2", libararyMember1);
        library.returnBook("Book 2", libararyMember2);//test if you can return book that is not borrowed by user
        library.returnBook("Book 3", libararyMember3);

    }
}
