package exo8;

public class Palindrome {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("exo 8 : Palindrome");
    }
     */
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Programmation fonctionnel

    public static String run(){
        return "exo 8 : Palindrome";
    }

    public static boolean isPalindromefonct(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }


}
