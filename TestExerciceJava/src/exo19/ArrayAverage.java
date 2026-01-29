package exo19;

public class ArrayAverage {

    public static void run(){
        System.out.println("exo 19 : Moyenne d'un tableau");
    }

    public static double ArrayAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum/array.length;
    }
}
