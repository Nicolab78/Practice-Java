package exo13;

public class SumDigits {

    public static void run(){
        System.out.println("Exo 13 : Somme des chiffres d'un nombre");
    }

    public static int SumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;

    }
}
