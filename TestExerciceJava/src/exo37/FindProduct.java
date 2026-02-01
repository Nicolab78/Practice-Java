package exo37;

public class FindProduct {

    public static void run(){
        System.out.println("exo 37 : Trouver le produit des élément d'un tableau");
    }

    public static int FindProduct(int[] array){
        int result = 1;
        for (int i : array){
            result *= i;
        }
        return result;
    }
}
