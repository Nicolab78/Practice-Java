package exo15;

public class IsArraySorted {

    public static void run(){
        System.out.println("Exo 15 : Tableau trié");
    }

    public static boolean isSorted(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i-1] > array[i]){
                return false;
            }
        }
        return true;
    }
}
