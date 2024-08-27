package singleton;


public class Main {
    public static void main(String[] args) {
        //Singleton luokka = Singleton.getInstance(); ei tarvii pakosti muuttujaan asentaa
        //voi tehdä näin:

        Singleton.getInstance();
        //System.out.println(luokka);
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance().teeJotain());
    }
}
