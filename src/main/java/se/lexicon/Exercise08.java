package se.lexicon;

public class Exercise08 {

    /**
     * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
     * Expected output:
     * Array: 20 20 40 20 30 40 50 60 50
     * Array without duplicate values: 20 40 30 50 60
     */
    public static void ex8() {

        int[] initialArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] limitedArray = initialArray.clone();
        System.out.print("Array: ");
        for (int i = 0; i < limitedArray.length; i++) {
            System.out.print(initialArray[i] + " ");
            for (int j = 0; j < limitedArray.length; j++) {
                if (j != i) {
                    if (limitedArray[i] == limitedArray[j]) {
                        limitedArray[j] = 0;
                    }
                }
            }
        }

        System.out.print("\nArray without duplicate values: ");
        for (int i = 0; i < limitedArray.length; i++) {
            if (limitedArray[i] != 0) {
                System.out.print(limitedArray[i] + " ");

            }
        }
        System.out.println();

    }
}