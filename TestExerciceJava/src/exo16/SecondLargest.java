package exo16;

public class SecondLargest {

    public static void run(){
        System.out.println("exo 16 : Second Largest");
    }

    public static int SecondLargest(int[] array){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for ( int i : array){
            if ( i > max){
                second = max;
                max = i;
            } else if ( i > second && i != max){
                second = i;
            }
        }
        return second;
    }
}
