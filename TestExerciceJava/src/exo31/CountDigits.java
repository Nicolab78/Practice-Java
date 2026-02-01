package exo31;

public class CountDigits {

    public static void run(){
        System.out.println("exo 31 : compteur de chiffres dans un nombre");
    }

    public static int CountDigits(int n){
        int count = 0;
        while (n > 0){
            n/=10;
            count++;
        }
        return count;
    }
}
