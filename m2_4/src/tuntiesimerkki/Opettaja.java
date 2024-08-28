package tuntiesimerkki;

public class Opettaja extends Ihminen{
    private int palkka;
    public Opettaja(String nimi){
        super(nimi);
        palkka = 0;

    }
    public int palkka(){
        return palkka;
    }

    //jos haluaa korvata Ihminen- luokan vanhenemisen niin voidaan tehdä oma vanhenee
    public void vanhene(){
        super.vanhene();//viitataan Ihminen- luokan vanhenee
        System.out.println("ikä tuo kokemusta");

    }

    @Override
    public String toString() {

        return "Opettaja: " + super.toString() +" palkka: " + palkka ;
    }

    public void palkanKorotus(int uusipalkka){
        palkka= uusipalkka;

    }
}
