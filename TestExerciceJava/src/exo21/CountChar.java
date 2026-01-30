package exo21;

import java.util.HashMap;

public class CountChar {

    public static void run(){
        System.out.println("exo 21 : Comptage de caractere dans une chaine");
    }

    public static int CountCharInString(String s, char c){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;

    }

    //Comptage de tous les caractères dans une chaîne

    public static void CountCharsInString(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("Comptage des caractères : " + map);
    }
}
