package tuntiesimerkki;

public interface Animal {
    void eat();
    void sleep();

}


class Koeluokka{
    public static void main(String[] args){
       Koira koira = new Koira();
       koira.eat();
       koira.sleep();


    }
}