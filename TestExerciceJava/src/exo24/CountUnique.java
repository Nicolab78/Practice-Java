package exo24;

import java.util.HashSet;

public class CountUnique {

    public static void run(){
        System.out.println("exo 24 : Comptage des éléments uniques dans un tableau");
    }

    public static int CountUnique(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for (int i : array){
            set.add(i);
        }
        return set.size();
    }

}
