/*Task 2: Binary values

Write a program that prompts the user to enter a binary number (composed of 0s and 1s)
and converts it to decimal. Display the decimal equivalent on the console. Hint: use the
charAt method of the String class to retrieve the individual bits in the input string.*/

import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class t02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give number as a binary number and i will  convert it to decimal: ");
        String binary = in.nextLine();

        int exponent = 0;
        int sum = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char character = binary.charAt(i);
            if (character == '1') {
                double charDecimal = Math.pow(2, exponent);
                sum += charDecimal;
            }
            exponent++;

        }

        System.out.println("Here is decimal version of " + binary + ": " + sum);
    }
}
