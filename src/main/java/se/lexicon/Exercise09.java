package se.lexicon;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {

    int initialArray[] = {1, 2, 4, 8, 16, 32};
    System.out.print("Testarray: ");

    for (int i = 0; i < initialArray.length; i++) {
      System.out.print(initialArray[i] + " ");

    }

    System.out.print("\nExpanded array: ");
    int array2[] = Expand(initialArray, 1); // expands initialArray by one

    for (int i = 0; i < array2.length; i++) {
      System.out.print(array2[i] + " ");

    }

    System.out.print("\nFurther expanded array: ");
    int array3[] = Expand(array2, 3); // expands array2 by three
    for (int i = 0; i < array3.length; i++) {
      System.out.print(array3[i] + " ");
    }
    System.out.println();

    } // ex9

  public static int[] Expand(int[] array, int sizeIncrement) {
    // takes an array and expands it by a given size increment
    // and also fills the new slots with *2 value of previous value
    int[] expandedArray = new int[array.length + sizeIncrement];
    for (int i = 0; i < expandedArray.length; i++) {
      if (array.length -1 >= i) {
        expandedArray[i] = array[i];
      } else {
        expandedArray[i] = (expandedArray[i-1] * 2);
      }

    }
    return expandedArray;
  } // Expand

}
