package se.lexicon;


public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int twoDimArray[][] = {{1, 2, 3}, {4, 5, 6},  {7, 8, 9}};

    System.out.println("The raw array:");
    for (int i = 0; i < twoDimArray.length; i++) {
      for (int j = 0; j < twoDimArray.length; j++) {
        System.out.print(twoDimArray[i][j] + " ");
      }
      System.out.println();

    }

    System.out.print("The diagonal output: ");

    for (int i = 0; i < twoDimArray.length; i++) {
      System.out.print(twoDimArray[i][i] + " ");

    }
    System.out.println();
  }

} // ex12
