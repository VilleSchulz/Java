package tuntiesimerkki;

public class Ihminen {
    private String nimi;
    private int pisteet;
    private int ikä;

    public Ihminen() {
        this.nimi = nimi;
        this.ikä = 0;
    }

    public String nimeni() {
        return nimi;

    }

    public void vanhene() {
        ikä++;
    }

    public int ikä() {
        return ikä;
    }
}