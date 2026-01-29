package exo1;

public class ReverseString {
    public static void run(){
        System.out.println("exo 1: : Reverse String");
    }
    /*
    public static String reverse(String str){
        String reversed= "";
        for(int i=str.length()-1;i>0; i--){
            reversed= reversed+str.charAt(i);
        }
        return reversed;
    }
     */

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
