package exo47;

public class IndexOfMax {

    public static void run() {
        System.out.println("exo 47 : index du plus grand élément du tableau");
    }

    public static int indexOfMax(int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
