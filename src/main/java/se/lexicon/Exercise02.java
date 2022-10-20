package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {

        int[] theArray = {2, 8, 5, 1, 14, 17, 20};

        System.out.print("The array: ");
        printArray(theArray, false);

        System.out.print("\nFind index of number: ");
        Scanner scan = new Scanner(System.in);
        int findNumber = scan.nextInt();
        indexOf(theArray, findNumber);

    } // ex2
/** Scans the array and prints the index of the target or -1 if target is not within the array */
    public static void indexOf(int[] arr, int target) {
        int targetSpot = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetSpot = i;
            }

        }
        System.out.println("The number " + target + " has the index " + targetSpot);
    } // indexOf

    /** Prints an array vertically if true and horizontally if false */
    public static void printArray(int[] ar, boolean newLine) {
        for (int i = 0; i < ar.length; i++) {
            if (newLine) {
                System.out.println(ar[i]);
            } else {
                System.out.print(ar[i] + " ");
            }
        }
    } // printarray

} // exercise 2
