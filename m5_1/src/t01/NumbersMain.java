package t01;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to print?");
        int amount = Integer.parseInt(scanner.nextLine());
        Thread odd = new Thread(new NumbersOdd(amount));
        Thread even = new Thread(new NumbersEven(amount));
        odd.start();
        even.start();

    }
}

