package exo32;

public class LargestPalindrome {

    public static void run(){
        System.out.println("exo 32: le plus grand palindrome");
    }

    public static boolean IsPalindrome(int n){
        String s =  String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static int LargestPalindrome(int [] array){
        int max = -1;
        for (int i: array){
            if (IsPalindrome(i) && i > max){
                max = i;
            }
        }
        return max;
    }
}
