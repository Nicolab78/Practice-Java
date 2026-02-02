package exo1;

public class ReverseString {

    //Programmation normale :

    /*
    public static void run(){

        System.out.println("exo 1: : Reverse String");
    }
    */


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

    //Programmation Fonctionnelle :

    public static String run(){
        return "exo 1: : Reverse String";
    }

    public static String reversefonct(String str){
        return str == null
                ? null
                : str.chars()
                    .mapToObj(c -> (char) c)
                    .reduce("",
                            (acc, c) -> c + acc,
                            (s1, s2) -> s2 + s1
                            );
    }


}
