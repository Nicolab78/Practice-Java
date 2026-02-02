package exo46;

public class IsPangram {

    public static void run(){
        System.out.println("exo46 : est ce que la chaine de caractères est une pangramme");
    }

    public static boolean IsPangram(String string){
        string = string.toLowerCase();
        for ( char c = 'a'; c <= 'z'; c++ ){
            if(string.indexOf(c) != -1){
                return false;
            }
        }
        return true;
    }
}
