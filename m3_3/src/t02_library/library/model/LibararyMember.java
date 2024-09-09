package t02_library.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibararyMember {
    private final String NAME;
    private final int ID;
    public List<Book> borrowedBooks = new ArrayList<>();

    public LibararyMember(String name, int ID) {
        this.NAME = name;
        this.ID = ID;
    }
    public String getNAME() {
        return NAME;
    }
    public int getID() {
        return ID;
    }
}

