package t02;//Task 2: Generate number sequence and store it to a CSV file for spreadsheet application
//Generate a Fibonacci sequence of 100 numbers and write them to a CSV file.
// Then read the content of the file with a spreadsheet application.
import java.math.BigInteger;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Fibonachi {
    private final static String FILENAME = "fibonachi.csv";
    static FileWriter fileWriter = null;
    static PrintWriter printWriter = null;


    // Function to print N Fibonacci Number
    public static void calculateFibonaci(int N) {
        try {
            fileWriter = new FileWriter(FILENAME);
            printWriter = new PrintWriter(fileWriter);

            BigInteger num1 = BigInteger.ZERO;// use BigInteger because Long could show some of the last numbers(over 64-bit)
            BigInteger num2 = BigInteger.ONE;//(9,223,372,036,854,775,807)

            for (int i = 0; i < N; i++) {
                // Print the number
                printWriter.print(num1 + ";");
                System.out.println(num1 + " ");

                // Swap
               BigInteger num3 = num1.add(num2);// same as num 1+ num 2
                 num1 = num2;
                 num2 = num3;
            }
            System.out.println("Fibonachi end....");
            System.out.println("Output wrote to " + FILENAME);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    // Driver Code
    public static void main(String args[]) {
        // Given Number N
        int N = 100;

        calculateFibonaci(N);
    }
}
