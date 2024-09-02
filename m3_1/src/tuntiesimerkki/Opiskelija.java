package tuntiesimerkki;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Opiskelija extends Ihminen{
    private int pisteet;


    public Opiskelija(String nimi) {
        super(nimi);
        this.pisteet = 0;
    }



    public int suorituksia() {
        return pisteet;
    }
    public String toString() {
        return "Opiskelija: " + super.toString()+ " Pisteet: " + pisteet;
    }
    public void suoritus(int pisteitä){
        pisteet=+ pisteitä;
    }

    public static void main(String[] args) {
        List <Ihminen> opiskelijaLista = new ArrayList<>();
        opiskelijaLista.add(new Opiskelija("Jari Peddedi"));
        opiskelijaLista.add(new Opiskelija("Juude Jööde"));
        opiskelijaLista.add(new Opettaja("Jarno Harno"));

      /* Opiskelija opiskelija1 = new Opiskelija("Jari Peddedi");
       Opiskelija opiskelija2 = new Opiskelija("Juude Jööde");
        Opettaja opettaja1 = new Opettaja("Jarno Harno");
        System.out.println(opiskelija1.nimeni());
        for(int i = 0; i<30;i++){
            opettaja1.vanhene();
        }*/

for (Ihminen ihminen:opiskelijaLista) {
    for (int i = 0; i < 4; i++) {
        ihminen.vanhene();

    }
}
        //opettaja1.palkanKorotus(1000);
        //while(opiskelija1.ikä()<30); ikuinen looppi koska jumittuu whileen koska(;) jos lause loopin
        // jälkeen niin ei välttämättä tarvitse{} mutta ei suositella

            //opiskelija1.vanhene();
       // System.out.println(opiskelija1);
        //System.out.println(opettaja1);
        for(Ihminen ihminen : opiskelijaLista) {
            System.out.println(ihminen);
        }

    }
}

