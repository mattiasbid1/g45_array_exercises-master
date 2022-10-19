package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {

    int multiTable[][] = new int[10][10];

    for (int i = 0; i < multiTable.length; i++) {
      multiTable[i][0] = i+1;
      multiTable[0][i] = i+1;

    }

    for (int i = 1; i < multiTable.length; i++) {
      for (int j = 1; j < multiTable.length; j++) {
        multiTable[i][j] = multiTable[0][j] * multiTable[i][0];

      }

    }

    for (int i = 0; i < multiTable.length; i++) {
      for (int j = 0; j < multiTable.length; j++) {
        if (multiTable[i][j] < 10) {
          System.out.print(" ");
        }
        if (multiTable[i][j] < 100) {
          System.out.print(" " + multiTable[i][j]);
        } else {
          System.out.print(multiTable[i][j]);
        }
      }
      System.out.println();

    }
    System.out.println();
  }

}
