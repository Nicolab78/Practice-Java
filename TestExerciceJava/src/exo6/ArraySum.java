package exo6;

import java.util.Arrays;

public class ArraySum {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("exo 6 : Sommes d'un tableau");
    }
     */

    public static int ArraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    // Programmation fonctionnelle

    public static String run(){
        return "exo 6 : Sommes d'un tableau";
    }

    public static int ArraySumfonct(int[] array){
        return Arrays.stream(array).sum();
    }

}
