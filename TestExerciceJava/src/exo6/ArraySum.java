package exo6;

public class ArraySum {

    public static void run(){
        System.out.println("exo 6 : Sommes d'un tableau");
    }

    public static int ArraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
