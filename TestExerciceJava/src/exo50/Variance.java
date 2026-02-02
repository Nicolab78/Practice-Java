package exo50;

public class Variance {

    public static void run(){
        System.out.println("exo50 : Calculer la variance d'un tableau");
    }

    public static double variance(int[] arr) {
        double mean = 0;
        for (int n : arr) {
            mean += n;
        }
        mean /= arr.length;

        double sum = 0;
        for (int n : arr) {
            sum += Math.pow(n - mean, 2);
        }

        return sum / arr.length;
    }
}
