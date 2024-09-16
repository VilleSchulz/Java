package t01;

import java.util.Scanner;

class NumbersOdd implements Runnable {
    private int oddNumbers;
    private int amount;
    public static boolean oddReady = false;// to check if all the odd numbers are printed

    NumbersOdd(int amount) {
        this.amount = amount;
        oddNumbers = 1;

    }

    public void run() {
        try {
            while (oddNumbers <= amount) {// print as long as the number is less than the max amount
                System.out.println("Odd thread: " + oddNumbers);
                oddNumbers += 2;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
        oddReady = true;//change the boolean to true when the odd number printing is done
        if (NumbersEven.evenReady) {//print this when both the odd and even numbers are printed
            System.out.println("Printing compeleted");
        }

    }
}

class NumbersEven implements Runnable {
    public static boolean evenReady = false;// to check if all the even numbers are printed
    private int evenNumbers;
    private int maxAmount;

    NumbersEven(int maxAmount) {
        this.maxAmount = maxAmount;
        evenNumbers = 2;

    }

    public void run() {
        try {
            while (evenNumbers <= maxAmount) {// print as long as the number is less than the max amount
                System.out.println("Even thread: " + evenNumbers);
                evenNumbers += 2;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
        evenReady = true;//change the boolean to true when the even number printing is done
        if (NumbersOdd.oddReady) {//print this when both the odd and even numbers are printed
            System.out.println("Printing compeleted");
        }
    }
}

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

