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
        for (int i = startIndex; i < endIndex; i++) {
            sum += numberArray[i];
        }
        endTime = System.nanoTime();
        double time = (endTime - startTime);
        System.out.println("Core " +coreNumber+" Sum of the array is: " + sum+ " Time taken: "+time+" ns");
    }

    public static void main(String[] args) {
        final int numberArray[] = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(10000);
        }
            int cores = Runtime.getRuntime().availableProcessors();
            int indexLenght = numberArray.length / cores;
            int startIndex = 0;
            int endIndex = indexLenght;
            int coreNumber = 1;
            double startTime = System.nanoTime();
            for (int j = 0; j < cores; j++) {
                if (j == cores - 1) {
                    endIndex = numberArray.length; // Ensure the last thread processes until the end of the array
                }
                Thread t = new Thread(new ParellelNum(startTime,coreNumber,numberArray, startIndex, endIndex));
                startIndex += indexLenght;
                endIndex += indexLenght;
                coreNumber++;
                t.start();
            }

        }
    }

