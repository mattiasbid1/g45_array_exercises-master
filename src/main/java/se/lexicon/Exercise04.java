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

    for (int i = 0; i < copyNumbers.length; i++) {
      System.out.print(copyNumbers[i] + " ");

    }
    System.out.println("");

  }

}
