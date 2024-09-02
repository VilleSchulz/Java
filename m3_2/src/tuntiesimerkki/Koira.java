package tuntiesimerkki;

public class Koira implements Animal{
    @Override
    public void eat(){
        System.out.println("Dog eats");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleeps");
    }
    
}
