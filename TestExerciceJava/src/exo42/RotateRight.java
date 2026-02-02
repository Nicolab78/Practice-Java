package exo42;

public class RotateRight {

    public static void run(){
        System.out.println("exo42 : Bouger tout les éléments d'un tableau vers la droite");
    }

    public static int[] RotateRight(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        return arr;
    }
}
