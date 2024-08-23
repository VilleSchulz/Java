
//Task 1: A name generator
//Write a program that generates random names by combining first and
// last names from hard-coded name arrays. The program should work as follows:
//Create two arrays, firstNames and lastNames, which contain first and last names.
//Ask the user how many random names the program should generate.
//Generate random names using the following logic:
//Choose the index value for the first name randomly.
//Choose the index value for the last name randomly.
//Use the index values to create a random full name (i.e. first name and last name).
//Print the generated full name.
//Repeat these steps as many times as the user-specified number of names to generate.


import java.util.Scanner;
import java.util.Random;


public class t01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String[] firstNames = {"Jari", "Petteri", "Kari", "Siru", "Henna", "Mari", "Mira", "Sanna"};
        String[] lastNames = {"Kulttinen", "Könttinen", "Ripatti", "Rapatti", "Suilo", "Kananen"};

        System.out.print("Give number of names to generate: ");
        int amount = Integer.parseInt(in.nextLine());
        for (int i = 0; i < amount; i++) {
            String name = firstNames[rand.nextInt(firstNames.length - 1)] + " " +
                    lastNames[rand.nextInt(lastNames.length - 1)];
            System.out.println(name);
        }


        in.close();

    }
}
