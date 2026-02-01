package exo38;

import exo37.FindProduct;

public class CountGreaterThan {

    public static void run(){
        System.out.println("exo 38 : Trouver le nombre d'élément superieur à un valeur");
    }

    public static int CountGreaterThan(int[] arr, int value){
        int count = 0;
        for (int i : arr){
            if (i > value){
                count++;
            }
        }
        return count;

    }
}
