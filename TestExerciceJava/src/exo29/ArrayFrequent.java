package exo29;

import java.util.HashMap;

public class ArrayFrequent {

    public static void run(){
        System.out.println("exo 29 : Élément le plus fréquent dans un tableau");
    }

    public static int mode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0;
        int mode = arr[0];

        for (int n : freq.keySet()) {
            if (freq.get(n) > maxCount) {
                maxCount = freq.get(n);
                mode = n;
            }
        }

        return mode;
    }
}
