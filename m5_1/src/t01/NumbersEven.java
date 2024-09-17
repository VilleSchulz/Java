package t01;

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

        //print this when both the odd and even numbers are printed, this prevents the message from printing before all the numbers are printed
        if (NumbersOdd.oddReady) {
            System.out.println("Printing compeleted");
        }
    }
}