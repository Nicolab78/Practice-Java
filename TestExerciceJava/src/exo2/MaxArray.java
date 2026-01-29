package exo2;

public class MaxArray {

    public static void run(){
        System.out.println("exo 2 : Maximum d'un tableau");
    }

    public static int MaxArray(int[] array){
        int max = array[0];
        for(int i = 0; i <array.length; i++){
            if(array[i] > max ){
                max = array[i];
            }
        }
        return max;

    }
}
