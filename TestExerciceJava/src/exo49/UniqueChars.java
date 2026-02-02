package exo49;

import java.util.HashSet;

public class UniqueChars {

    public static void run(){
        System.out.println("exo 49 : Trouver le nombre de caractère unique");
    }

    public static int UniqueChar(String string){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            set.add(string.charAt(i));
        }
        return set.size();
    }
}
