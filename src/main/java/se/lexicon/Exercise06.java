package se.lexicon;

import java.text.DecimalFormat;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */

  private static final DecimalFormat df = new DecimalFormat("0.0");
  public static void ex6() {

    int numebers[] = {43, 5, 23, 17, 2, 14};
    double sum = 0;
    double result;
    for (int i = 0; i < numebers.length; i++) {
      sum = sum + numebers[i];
    }
    result = sum / numebers.length;
    System.out.println("Average is: " + df.format(result));

  } // ex6

}
