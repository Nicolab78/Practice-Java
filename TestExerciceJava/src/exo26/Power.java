package exo26;

public class Power {

    public static void run(){
        System.out.println("exo 26 : Calcul de la puissance d'un nombre");
    }

    public static long power(int base, int exponent){
        long result = 1;

        for(int i = 0; i< exponent; i++){
            result *= base;
        }

        return result;
    }
}
