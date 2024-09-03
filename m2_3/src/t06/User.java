package t06;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;

    ArrayList<Book> borrowedBooks = new ArrayList<>();
    public User(String name, int age){
        this.name = name;
        this.age = age;
        Library.addUser(this);


    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getBorrowedBooks(){
        System.out.println(name+" has borrowed book(s):");
        for(Book b : borrowedBooks){
            System.out.println(b.getTitle());
        }
    }
}
