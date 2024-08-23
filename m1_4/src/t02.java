//Task 2: Finding the maximum subarray sum
//Write a program that takes an array of integers as input from the user and finds
// the subarray with the maximum sum. A subarray is a portion of an array, which consists of contiguous
// elements from the original array in the same order. The program should work as follows:
//Ask the user for the number of integers in the array.
//Prompt the user to enter the integers into the array.
//Find the subarray with the maximum sum using the following logic:
//Iterate through all possible subarrays in the array.
//Calculate the sum of each subarray.
//Keep track of the maximum sum found and the corresponding subarray indices.
//Print the maximum sum and the corresponding indices. (Use the indices shown to the user, i.e., starting from 1.)

import java.util.Scanner;

public class t02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give the size of the array and i will calculate maximum sum of two integers: ");
        int arraySize = Integer.parseInt(in.nextLine());
        int[][] array = new int[arraySize][1];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Give " + (i + 1) + " integer:");
            array[i][0] = Integer.parseInt(in.nextLine());
        }
        double sum = Double.NEGATIVE_INFINITY;
        String biggestSum = new String();
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < array.length; j++) {
                if (sum < array[i][0] + array[j][0]) {
                    sum = array[i][0] + array[j][0];
                    biggestSum = array[i][0] + " + " + array[j][0] + " = " + sum;
                }

            }

        }
        System.out.print("Biggest sum of two integers: " + biggestSum);
    }
}
