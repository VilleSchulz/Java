package t06;

public class Main_t06 {
    public static void main(String[] args){
        Library lib = new Library();
        Book Book1 = new Book("Kauna","Jari",1998);
        Book Book2 = new Book("Kauna2","Jari",1999);
        Book Book3 = new Book("Kauna3","Jari3",2000);
        Book Book4 = new Book("Kauna4","Jari2",2020);
        User user1 = new User("Jari",22);

        lib.addBook(Book1);
        lib.addBook(Book2);
        lib.addBook(Book3);
        lib.addBook(Book4);
        lib.findBooksBYAuthor("Jari");
        lib.findBooksBYAuthor("Jari2");
        lib.displayBooks();
        lib.borrowBook("Kauna2",user1);
        lib.borrowBook("Kauna3",user1);
        user1.getBorrowedBooks();
        lib.displayBooks();
        System.out.println(lib.isBookAvailable("Kauna2"));
        lib.returnBook("Kauna2",user1);
        System.out.println(lib.isBookAvailable("Kauna2"));
        lib.displayBooks();
        Book1.addReview("Best book");
        Book1.setRating(9.9);
        lib.getAverageBookRating();
        lib.getMostReviewedBook();

    }
}
