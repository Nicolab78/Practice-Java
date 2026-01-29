package exo14;

public class ArrayReverse {

    public static void run(){
        System.out.println("Exo 14 : Inversion d'un tableau");
    }

    public static int[] ArrayReverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}
