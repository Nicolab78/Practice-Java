package exo28;

import java.util.Arrays;

public class ArrayMedian {

    public static void run() {
        System.out.println("exo 28 : Calcul de la médiane d'un tableau");
    }

    public static double ArrayMedian(int[] array) {
        Arrays.sort(array);
        int mid = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[mid - 1] + array[mid]) / 2.0;
        } else {
            return array[mid];
        }
    }

}
