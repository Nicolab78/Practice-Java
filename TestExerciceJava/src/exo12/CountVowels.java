package exo12;

public class CountVowels {

    public static void run(){
        System.out.println("Exo 12 : Compter les voyelles dans une chaîne");
    }

    public static int countVowels(String s){
        int count = 0;
        String Vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++ ) {
            if (Vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}
