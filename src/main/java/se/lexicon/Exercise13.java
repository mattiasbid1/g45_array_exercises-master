package se.lexicon;

import java.util.Scanner;

public class Exercise13 {

    /**
     * 13. Create two arrays with arbitrary size and fill one with random numbers.
     * Then copy over the numbers from the array with random numbers so
     * that the even numbers are located in the rear (the right side) part of the
     * array and the odd numbers are located in the front part (the left side).
     */
    public static void ex13() {

        int arrayLength = rng(5, 15);
        int randomArray[] = new int[arrayLength];
        int sortedArray[];
        Scanner scan = new Scanner(System.in);
        boolean toTheLeft = true;
        boolean correctInput;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rng(1, 99);
        }

        System.out.println("An array of size " + arrayLength + " has been created!");

        do {
            System.out.println("Do you want Odd numbers to the left or right?");
            correctInput = true;
            switch (scan.next().toLowerCase()) {
                case "l":
                case "left":
                    toTheLeft = true;
                    break;
                case "r":
                case "right":
                    toTheLeft = false;
                    break;
                default:
                    System.out.print("Be reasonable and type left or right please!");
                    correctInput = false;
            }
        } while (!correctInput);

        sortedArray = oddEvenSorter(randomArray, toTheLeft);

        System.out.print("The random array: ");
        printArray(randomArray, false);

        System.out.print("\nThe sorted array: ");
        printArray(sortedArray, false);

        System.out.println();

    } // ex13

        /** Returns an int with a random number between startValue and endValue. */
    public static int rng(int startValue, int endValue) {

        double randD = Math.random() * (endValue - startValue) + startValue;
        int randI = (int) Math.round(randD);
        return randI;
    }
    /** Sorts all odd numbers in the array to the left if true and to the right if false */
    public static int[] oddEvenSorter(int[] arr, boolean oddToLeft) {

        int sortedSpot = 0;
        int sorted[] = new int[arr.length];
        int leftOrRight;


        for (int i = 1; i >= 0; i--) {

            leftOrRight = (oddToLeft) ? i : 1-i;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == leftOrRight) {
                    sorted[sortedSpot] = arr[j];
                    sortedSpot++;
                }

            }
        }
        return sorted;

    } // OddEvenSorter

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

}// Exercise 13
