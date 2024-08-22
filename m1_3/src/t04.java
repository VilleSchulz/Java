//Task 4: Multiplication table exam
//
//In primary school, students must memorize the multiplication tables
// for numbers 1 to 10. Create a program to assist primary school students
// that presents the user with ten randomly generated multiplication problems,
// where the factors are integers between one and ten. After each answer, the
// program indicates whether it was correct or not. The user receives one point
// for each correctly answered question. If the user scores ten points for the
// entire set of problems, the program congratulates them on mastering the
// multiplication tables and terminates. Otherwise, the program starts a new
// set of problems.

import java.util.Random;
import java.util.Scanner;

public class t04 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pointCounter = 0;
        Random rand = new Random();
        boolean end = false;
        while (!end) {
            for (int i = 0; i < 10; i++) {
                int num1 = rand.nextInt(10) + 1;
                int num2 = rand.nextInt(10) + 1;
                int product = num1 * num2;
                System.out.print("Give the answer for " + num1 + "*" + num2 + ": ");
                int answer = Integer.parseInt(in.nextLine());
                if (answer == product) {
                    pointCounter++;
                    if (pointCounter == 10) {
                        end = true;
                    }
                }
            }
                if (end){
                    System.out.println("Congratulations! You got " + pointCounter + " points! Test passed!");

                }
                else{
                    System.out.println("You got " + pointCounter + " points! Test Failed:(!");
                    System.out.println("Start again!!!");
                    pointCounter = 0;
                }



        }

    }
}
