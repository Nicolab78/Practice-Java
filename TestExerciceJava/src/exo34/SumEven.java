package exo34;

public class SumEven {

    public static void run(){
        System.out.println("exo 34 : Somme des pairs");
    }

    public static int CountEven(int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
