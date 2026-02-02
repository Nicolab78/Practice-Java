package exo41;

public class SumOdd {

    public static void run(){
        System.out.println("Exo41 : Somme des nombres impairs");
    }

    public static int SumOdd(int [] array){
        int sum = 0;
        for (int i : array){
            if(!(i%2 == 0)){
                sum += i;
            }
        }
        return sum;
    }
}
