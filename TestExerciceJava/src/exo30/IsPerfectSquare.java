package exo30;

public class IsPerfectSquare {

    public static void run(){
        System.out.println("Exo 30 : Vérification si c'est un carré parfait");
    }

    public static boolean IsPerfectSquare(int n){
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
