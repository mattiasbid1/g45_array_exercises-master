package se.lexicon;

public class Exercise01 {

    /**
     * 1. Write a program which will store elements in an array of type ‘int’ and
     * print it out.
     * Expected output: 11 23 39 etc.
     */
    public static void ex1() {

        int[] theArray = {12, 23, 39};
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");

        }
        System.out.println("");

    }


}
