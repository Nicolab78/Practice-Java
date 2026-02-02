package exo2;

import java.util.Arrays;

public class MaxArray {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("exo 2 : Maximum d'un tableau");
    }
     */

    public static int MaxArray(int[] array){
        int max = array[0];
        for(int i = 0; i <array.length; i++){
            if(array[i] > max ){
                max = array[i];
            }
        }
        return max;

    }

    // Programmation fonctionnelle

    public static String run(){
        return "exo 2 : Maximum d'un tableau";
    }

    public static int MaxArrayfonct(int[] array){
        return Arrays.stream(array)
                .max()
                .orElseThrow( () -> new RuntimeException( "Le tableau ne peut pas être vide" ) );

    }

}
