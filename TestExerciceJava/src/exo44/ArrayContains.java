package exo44;

public class ArrayContains {

    public static void run(){
        System.out.println("exo 44 : Vérifier si une tableau contient un élément");
    }

    public static boolean ArrayContains(int[] arr , int value ){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
