package exo23;

import java.util.Arrays;

public class IsAnagram {

    public static void run(){
        System.out.println("exo 23 : Vérification d'anagramme entre deux chaînes");
    }

    public static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }
}
