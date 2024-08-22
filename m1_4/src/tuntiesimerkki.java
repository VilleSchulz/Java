import java.util.Scanner;

public class tuntiesimerkki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // taulukon luonti
        System.out.print("Anna taulukon koko: ");
        int taulukonKoko = Integer.parseInt(in.nextLine());
        int taulukko[] = new int[taulukonKoko];
        // taulukkoon kirjoitus
        System.out.println("anna " + taulukonKoko + " kokonaislukua");
        for (int i = 0; i < taulukonKoko; i++)
            taulukko[i] = Integer.parseInt(in.nextLine());

        // taulukon luku
        System.out.println("Taulukko:");
        for (int i = 0; i < taulukonKoko; i++) {
            System.out.println(taulukko[i]);
        }
        //for each looppi
        for (int t : taulukko) {
            System.out.println(t);
        }

        char[][] chessboard = {
                { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { 'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r' }
        };

        for (char[] row : chessboard) {
            for (char piece : row) {
                System.out.print(piece);
            }
            System.out.println();
        }
        }
    }
