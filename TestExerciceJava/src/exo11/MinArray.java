package exo11;

public class MinArray {

    public static void run(){
        System.out.println("exo 11 : Minimum d'un tableau");
    }

    public static int MinArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;

    }
}
