package singleton;

public class Singleton {
    //2.static instanssi
    private static Singleton instance;
    //1. private muodostin
     private Singleton() {

    }

// public metodi jolla instanssi saadaan ulos
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }{}

    public String teeJotain(){
    return "Jotain";}
}
