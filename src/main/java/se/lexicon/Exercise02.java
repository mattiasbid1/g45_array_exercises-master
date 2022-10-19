package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {

        int[] theArray = {2, 8, 5, 5, 14, 17, 20};

        System.out.print("Find index of number: ");
        Scanner scan = new Scanner(System.in);
        int findNumber = scan.nextInt();
        indexOf(theArray, findNumber);

    }

    public static void indexOf(int[] arr, int target) {
        int targetSpot = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetSpot = i;
            }

        }
        System.out.println("The number " + target + " has the index " + targetSpot);
    }


}
