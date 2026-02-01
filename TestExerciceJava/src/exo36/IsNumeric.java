package exo36;

public class IsNumeric {

    public static void run(){
        System.out.println("Exo 36 : Vérifier si une chaine ");
    }

    public static boolean IsNumeric(String str){
        for (char c: str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
