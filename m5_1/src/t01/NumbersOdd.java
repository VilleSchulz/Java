package t01;

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
        //print this when both the odd and even numbers are printed, this prevents the message from printing before all the numbers are printed
        if (NumbersEven.evenReady) {
            System.out.println("Printing compeleted");
        }

    }
}