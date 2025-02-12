//Task 3: Prime number generator
//Write a program that prompts the user to enter two positive integers,
// start and end (where start < end). The program should generate and display all
// the prime numbers between start and end, inclusive.
//A prime number is a positive integer greater than 1 that has no positive
// divisors other than 1 and itself.Your program should use control structures
// (such as loops and conditional statements) to implement the logic for generating and checking prime numbers.

import java.util.Scanner;

public class t03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[2];
        System.out.println("Give two positive integers, integer 1 is start point and integer 2 is the end point");


        for (int i = 0; i < 2; i++) {
            String numberLocation;
            if (i == 0) {
                numberLocation = "Start";
            } else {
                numberLocation = "End";
            }

            System.out.print("Integer " + (i + 1) + " (" + numberLocation + ") point:");
            number[i] = Integer.parseInt(in.nextLine());

            if (number[i] <= 1) {
                System.out.println("Number cannot be 1 or smaller");
                i--;
            }
        }
        for (int i = number[0]; i <= number[1]; i++) {
            boolean isPrime = true;
            if (i == 2) { //number 2 is prime
                isPrime = true;
            } else if (i % 2 == 0) { //even numbers exept 2 is not prime
                isPrime = false;
            } else {
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }
            if (isPrime) {
                System.out.println("Integer " + i + " is prime");
            }
        }


    }

}
