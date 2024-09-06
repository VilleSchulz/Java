package t02_library.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibararyMember {
    private String name;
    private int ID;
    public List<Book> borrowedBooks = new ArrayList<>();

    public LibararyMember(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
}

