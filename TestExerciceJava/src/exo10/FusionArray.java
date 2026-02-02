package exo10;

import java.util.stream.IntStream;

public class FusionArray {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("exo 10 : Fusion de tableaux");
    }

     */

    public static int[] merge(int[] array1, int[] array2){
        int[] fusionArray = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++){
            fusionArray[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++){
            fusionArray[i + array1.length] = array2[i];
        }

        return fusionArray;
    }

    // Programmation fonctionnelle

    public static String run(){
        return "exo 10 : Fusion de tableaux";
    }

    public static int[] mergefonc(int[] array1, int[] array2){
        return IntStream.concat(
                IntStream.of(array1),
                IntStream.of(array2)
        ).toArray();
    }
}
