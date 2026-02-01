package exo39;

public class SmallestEven {

    public static void run(){
        System.out.println("exo 39");
    }

    public static int SmallestEven(int [] array){
        int min = Integer.MAX_VALUE;

        for (int i : array){
            if (i % 2 == 0 && i < min) {
                min = i;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
