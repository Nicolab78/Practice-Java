package exo10;

public class FusionArray {

    public static void run(){
        System.out.println("exo 10 : Fusion de tableaux");
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] fusionArray = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++){
            fusionArray[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++){
            fusionArray[i + array1.length] = array2[i];
        }

        return fusionArray;
    }
}
