package se.lexicon;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {

    int numbers[] = {1, 15, 20};
    int copyNumbers[] = numbers.clone();

    System.out.print("Elements from first array: ");
    printArray(numbers, false);

    System.out.print("\nElements from second array: ");
    printArray(copyNumbers, false);


    System.out.println();

  } // ex4

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

} // Exercise04
