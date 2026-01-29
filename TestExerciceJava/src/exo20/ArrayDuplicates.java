package exo20;

import java.util.HashSet;

public class ArrayDuplicates {

    public static void run(){
        System.out.println("exo 20 : Élements dupliqués dans un tableau");
    }

    public static void ArrayDuplicates(int[] array){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i : array){
            if (!seen.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println("Élements dupliqués : " + duplicates);
    }


}
