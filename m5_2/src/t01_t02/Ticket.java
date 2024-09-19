package t01_t02;

public class Ticket {
    private static int  count= 1;
    private int id;
    public Ticket(){
        id = count;
        count++;


    }
    public int getId(){
        return id;
    }
    public static int getCount(){
        return count;
    }

}
