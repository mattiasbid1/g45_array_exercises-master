package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     * String array: [Paris, London, New York, Stockholm]
     * Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {

        String cities[] = new String[4];
        cities[0] = ("Paris");
        cities[1] = ("London");
        cities[2] = ("New York");
        cities[3] = ("Stockholm");

        Arrays.sort(cities);
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]);
            if ((1 + i) < cities.length) {
                System.out.print(", ");
            } else {
                System.out.println("");

            }
        }
    }


}
