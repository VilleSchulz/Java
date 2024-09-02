package tuntiesimerkki;

public class Ihminen {
    public String nimi;
    public int ikä;

    public Ihminen(String nimi) {
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
    public String toString() {
        return nimi+ " "+ ikä;
    }
}