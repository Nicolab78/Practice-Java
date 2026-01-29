package exo7;

public class Factorial {

    public static void run(){
        System.out.println("Exo 7 : Factorielle d'un nombre");
    }

    public static int Factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Le nombre doit être positif.");
        }
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
