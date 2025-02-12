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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give the size of the array: ");
        int arraySize = Integer.parseInt(in.nextLine());
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        // Ask array size
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Give " + (i + 1) + " integer:");
            array1[i] = Integer.parseInt(in.nextLine());
        }
        //set default check values
        boolean dublicate = false;
        int indexCount = 0;
        boolean zeroFound = false;
        for (int array1Int : array1) { //loops trought given numbers
            for (int array2Int : array2) {//check if number alleady in list 2
                if (array1Int == array2Int && array1Int != 0 || zeroFound && array1Int == 0) {
                    dublicate = true;
                    break;
                } else {
                    if (array1Int == 0) {
                        zeroFound = true;
                        array2[indexCount] = array1Int;// special case for 0
                        indexCount++;
                    }
                    dublicate = false;
                }
            }
            //if number not in a list add
            if (!dublicate) {
                array2[indexCount] = array1Int;
                indexCount++;
            }

        }


        for (int array1Int : array1) {
            System.out.println("Array 1 num: " + array1Int);
        }
        System.out.println("--------------");
        for (int i = 0; i < indexCount; i++) {
            System.out.println("Array 2 num: " + array2[i]);
        }


        in.close();
    }
}

