package exo22;

public class LongestIncreasingArray {

    public static void run(){
        System.out.println("exo 22 : Plus longue séquence croissante dans un tableau");
    }

    public static int longestIncreasing(int[] arr) {
        int max = 1, current = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }
        return max;
    }

}
