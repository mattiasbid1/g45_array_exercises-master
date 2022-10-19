package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {

    String[][] location = new String[2][2];
    location[0][0] = ("France");
    location[0][1] = ("Paris");
    location[1][0] = ("Sweden");
    location[1][1] = ("Stockholm");

    for (int i = 0; i < location.length; i++) {
      for (int j = 0; j < location[i].length; j++) {
        System.out.print(location[i][j] + " ");

      }
      System.out.println();
    }

  }

}
