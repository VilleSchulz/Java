//Task 3: Removing duplicates
//Write a program that takes an array of integers as input from the user and removes all the duplicate numbers from it.
// The program should work as follows:
//Ask the user for the size of the array.
//Prompt the user to enter the integers into the array.
//Remove all the duplicate numbers from the array using the following logic:
//Create a new array that stores only one occurrence of each number.
//Keep only the first occurrence of each number and discard any subsequent occurrences.
//Print the resulting array without the duplicate numbers.
//In this assignment, you can make the new array as big as the original array, even though it may not be completely filled.

import java.util.Scanner;

public class t03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Give the width of the array: ");
        int arraySizeWidth = Integer.parseInt(in.nextLine());
        System.out.print("Give the height of the array: ");
        int arraySizeHeight = Integer.parseInt(in.nextLine());
        int[][] array = new int[arraySizeHeight][arraySizeWidth];
       /* for (int i = 0; i < arraySize; i++) {
            System.out.print("Give " + (i + 1) + " integer:");
            array[i][0] = Integer.parseInt(in.nextLine());*/
        }

    }
