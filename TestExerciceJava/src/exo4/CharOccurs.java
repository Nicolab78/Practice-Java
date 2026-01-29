package exo4;

public class CharOccurs {

    public static void run(){
        System.out.println("Exo 4 : Nombre d'occurrences d'un caractère dans une chaîne");
    }

    public static int countChar(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }

        return count;
    }
}
