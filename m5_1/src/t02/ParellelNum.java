package t02;

import java.util.Random;

public class ParellelNum implements Runnable {
    private int[] numberArray;
    private int startIndex;
    private int endIndex;
    private int coreNumber;
    private double startTime;
    private double endTime;


    public ParellelNum(double startTime,int coreNumber,int[] numberArray, int startIndex, int endIndex) {
        this.startTime = startTime;
        this.coreNumber = coreNumber;
        this.numberArray = numberArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {//calculates the sum of the array
            sum += numberArray[i];
        }
        endTime = System.nanoTime();//set end time for calculation
        double time = (endTime - startTime);//calculate time taken
        System.out.println("Core " +coreNumber+" Sum of the array is: " + sum+ " Time taken: "+time+" ns");
    }

    public static void main(String[] args) {
        final int numberArray[] = new int[100000];//create array of 100000
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {//fill array with random numbers
            numberArray[i] = random.nextInt(10000);
        }
            int cores = Runtime.getRuntime().availableProcessors();//check how many cores the computer has
            int indexLenght = numberArray.length / cores;//calculate how many indexes each thread should process
            int startIndex = 0;
            int endIndex = indexLenght;//set end index for the first thread
            int coreNumber = 1;//start core number from 1
            double startTime = System.nanoTime();//set start time for calculation
            for (int j = 0; j < cores; j++) {
                if (j == cores - 1) {//check if it is the last thread
                    endIndex = numberArray.length; // Ensure the last thread processes until the end of the array
                }
                Thread t = new Thread(new ParellelNum(startTime,coreNumber,numberArray, startIndex, endIndex));
                startIndex += indexLenght;//set start index for the next thread
                endIndex += indexLenght;//set end index for the next thread
                coreNumber++;//add one to core number
                t.start();
            }

        }
    }

