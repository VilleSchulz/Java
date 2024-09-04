package tuntiesimerkki;

public interface Animal {
    void eat();
    void sleep();

}


class Koeluokka{
    public static void main(String[] args){
    /*   tämä vain kertakäyttöiseen luontiin
    ********************************
    Animal animal = new Animal() {
           public void eat() {

           }
           public void sleep() {

           }
    **********************************
       }*/

        Koira koira = new Koira();
       koira.eat();
       koira.sleep();


    }
}