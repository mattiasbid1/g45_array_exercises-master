package se.lexicon;

import java.util.Scanner;

public class Exercise11 {

    /**
     * 11.Write a program that ask the user for an integer and repeat that
     * question until user give you a specific value that user already has been
     * told about as a message in your program. Store these values in an array
     * and print that array. After that reverse the array elements so that the
     * first element becomes the last element, the second element becomes
     * the second to last element, etc. Do not just reverse the order in which
     * they are printed. You need to change the way they are stored in the
     * array.
     */
    public static void ex11() {


        boolean magic = false;
        int counter = 1;
        int startArray[] = new int[1];
        int theArray[] = {1};
        int tempArray[] = {1};
        Scanner scan = new Scanner(System.in);

        System.out.println("Number 222 is a magic number that will cause some magic!");

        while (!magic) {
            System.out.print("Enter number #" + counter + ": ");

            if (startArray[0] == 0) { ///////////////////// The first run
                startArray[0] = scan.nextInt();
                theArray = startArray.clone();
                tempArray = theArray.clone();
                magic = magicCheck(startArray[0]);
                counter++;
            } else { ////////////// runs after the first

                theArray = expander(tempArray, 1, scan.nextInt());
                tempArray = theArray.clone();
                magic = magicCheck(theArray[counter - 1]);
                counter++;

            }


        } // while
        System.out.print("The array before magic use: ");
        printArray(theArray, false);
        System.out.print("\nThe array after magic use: ");
        tempArray = reverser(theArray);
        printArray(tempArray, false);


        System.out.println();
    } // ex11

    public static int[] expander(int[] array, int sizeIncrement, int newValue) { ////// expands array, x times, with new value

        int[] expandedArray = new int[array.length + sizeIncrement];
        for (int i = 0; i < expandedArray.length; i++) {
            if (array.length - 1 >= i) {
                expandedArray[i] = array[i];
            } else {
                expandedArray[i] = (newValue);
            }

        }
        return expandedArray;
    } // expander

    public static int[] reverser(int[] arr) { /////// returns a revered array

        int revArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[arr.length - 1 - i] = arr[i];
        }
        return revArr;
    } // reverser

    public static void printArray(int[] ar, boolean newLine) { //////// Prints the array w/ or w/o new lines
        for (int i = 0; i < ar.length; i++) {
            if (newLine) {
                System.out.println(ar[i]);
            } else {
                System.out.print(ar[i] + " ");
            }
        }

    } // printArray

    public static boolean magicCheck(int checkValue) { //////// checks for magic number
        boolean magic = false;
        if (checkValue == 222) {
            magic = true;
        }
        return magic;
    } // magicCheck


} // Exercise11
