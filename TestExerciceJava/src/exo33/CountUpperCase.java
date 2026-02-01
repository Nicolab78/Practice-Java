package exo33;

public class CountUpperCase {

    public static void run(){
        System.out.println("exo 33 : Compter les majuscules");
    }

    public static int CountUpperCase(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
}
