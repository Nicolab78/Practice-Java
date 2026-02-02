package exo48;

public class MergeString {

    public static void run(){
        System.out.println("exo48 : Fusionner des chaines de caractères par caractères");
    }

    public static String MergeString(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        int max = Math.max(str1.length(), str2.length());

        for (int i = 0; i < max; i++){
            if(i < str1.length()){
                sb.append(str1.charAt(i));
            }
            if(i < str2.length()){
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();

    }
}
