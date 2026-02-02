package exo45;

public class ReverseInt {

    public static void run(){
        System.out.println("exo45 : Inverser un entier");
    }

    public static int ReverseInt(int n){
        int reversed = 0;
        while(n>0){
            reversed = reversed*10+n%10;
            n = n/10;
        }
        return reversed;
    }
}
