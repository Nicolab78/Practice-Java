package exo17;

public class CountWords {

    public static void run(){
        System.out.println("exo 17 : Compter les mots dans une phrase");
    }

    public static int CountWords(String str){
        if (str.trim().isEmpty()){
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
}
