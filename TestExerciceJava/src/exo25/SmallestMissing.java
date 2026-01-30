package exo25;

import java.util.HashSet;

public class SmallestMissing {

    public static void run(){
        System.out.println("exo 25 : Plus petit entier manquant dans un tableau");
    }

    public static int SmallestMissing(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for (int i : array){
            set.add(i);
        }

        int i = 1;
        while (set.contains(i)) {
            i++;
        }
        return i;

    }
}
