package exo7;

import java.util.stream.IntStream;

public class Factorial {

    // Programmation normale

    /*
    public static void run(){
        System.out.println("Exo 7 : Factorielle d'un nombre");
    }

     */

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

    // Programmation fonctionnelle

    public static String run(){
        return "Exo 7 : Factorielle d'un nombre";
    }

    public static int Factorialfonct(int n){
        if (n < 0){
            throw new IllegalArgumentException("Le nombre doit être positif.");
        }
        return IntStream.rangeClosed(1, n)
                        .reduce(1, (acc,val) -> acc * val);

    }
}
