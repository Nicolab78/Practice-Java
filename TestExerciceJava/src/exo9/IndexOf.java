package exo9;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class IndexOf {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("exo 9 : Index Of");
    }

     */

    public static int IndexOf(String s, char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }

        return -1;

    }

    // Programmation fonctionnelle

    public static String run(){
        return "exo 9 : Index Of";
    }

    public static int indexOffonc(String s, char c) {
        return IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == c)
                .findFirst()
                .orElse(-1);
    }

}
