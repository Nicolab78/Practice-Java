package exo43;

public class PGCD {

    public static void run(){
        System.out.println("exo 43 : Trouver le pgcd");
    }

    public static int PGCD(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
