package exo27;

public class ArrayEven {

    public static void run(){
        System.out.println("exo 27 : Extraction des éléments pairs d'un tableau");
    }

    public static void ArrayEven(int[] array){
        for ( int i : array){
            if ( i % 2 == 0){
                System.out.println("Élément pair : " + i);
            }
        }
    }
}
