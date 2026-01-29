package exo18;

public class LongestWord {

    public static void run(){
        System.out.println("exo 18: mot le plus long");
    }

    public static String LongestWord(String str){
        String[] words = str.split(" ");
        String longest = "";

        for (String string : words){
            if (string.length() > longest.length()){
                longest = string;
            }
        }
        return longest;
    }
}
