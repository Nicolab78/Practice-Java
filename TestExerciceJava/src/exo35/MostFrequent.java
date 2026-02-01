package exo35;

import java.util.HashMap;

public class MostFrequent {

    public static void run(){
        System.out.println("exo 35 : Element le plus fréquent (optimisé)");
    }

    public static int mostFrequent(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;
        int mode = arr[0];

        for (int n : arr) {
            int count = freq.getOrDefault(n, 0) + 1;
            freq.put(n, count);

            if (count > maxCount) {
                maxCount = count;
                mode = n;
            }
        }
        return mode;
    }
}
